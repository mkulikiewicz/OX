package com.mkul.game.ox;

import com.mkul.game.ox.boardcheck.BoardChecker;

import java.util.Scanner;

public class OXApp {

    // is only used to show demo
    public static void main(String[] args) {
        BoardDraw boardDraw;
        try {
            int size = Integer.parseInt(args[0]);
            boardDraw = new BoardDraw(size);
            boardDraw.show(new BoardScore());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | IncorrectBoardSizeException e) {
            System.out.println("Niepoprawne argumenty rysuję podstawową planszę");
            boardDraw = new BoardDraw(3);
            boardDraw.show(new BoardScore());
        }

        BoardScore boardScore = new BoardScore();
        FieldValue fieldValue = FieldValue.X;
        System.out.println("Ruch gracza X");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            try {
                x = Integer.parseInt(scanner.next());
                y = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Nie poprawne dane wejście spróbuj ponownie");
                continue;
            }
            boardScore.addFieldToBoard(new Field(x, y), fieldValue);
            boardDraw.show(boardScore);
            BoardChecker boardChecker = new BoardChecker(boardScore, 3);
            if (boardChecker.check()) {
                System.out.println("Gratulacje wygrałeś :) !");
                break;
            } else if (boardChecker.isDraw()) {
                System.out.println("Nie było zwycięzcy :(");
                break;
            }
            if (fieldValue == FieldValue.X) {
                System.out.println("Ruch gracza 0");
                fieldValue = FieldValue.O;
            } else {
                System.out.println("Ruch gracza X");
                fieldValue = FieldValue.X;
            }
        }
    }
}
