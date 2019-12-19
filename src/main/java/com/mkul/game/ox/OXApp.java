package com.mkul.game.ox;

public class OXApp {

    // is only used to show demo
    public static void main(String[] args) {
        try {
            int size = Integer.parseInt(args[0]);
            new BoardDraw(size).show(new BoardScore());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException |IncorrectBoardSizeException e) {
            System.out.println("Niepoprawne argumenty rysuję podstawową planszę");
            new BoardDraw(3).show(new BoardScore());
        }
    }
}
