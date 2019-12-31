package com.mkul.game.ox;

import com.mkul.game.ox.boardcheck.BoardChecker;

import java.util.Scanner;

/**
 * Class starts the ox game.
 */
public class App {

  /**
   * Only used to show demo.
   * @param args size of board
   */
  public static void main(String[] args) {
    try {
      run(args);
    } catch (NotEnoughPlayers | TooManyPlayers e) {
      System.out.println("Nie wystarczająca ilość użytkowników");
      e.printStackTrace();
    }
  }

  private static void run(String[] args) throws NotEnoughPlayers, TooManyPlayers {

    Players players = new Players();
    players.addPlayer("Maciek");
    players.addPlayer("Michał");


    BoardDraw boardDraw;
    try {
      int size = Integer.parseInt(args[0]);
      boardDraw = new BoardDraw(size);
      boardDraw.show(new BoardScore());
    } catch (NumberFormatException
        | ArrayIndexOutOfBoundsException
        | IncorrectBoardSizeException e) {
      System.out.println("Niepoprawne argumenty rysuję podstawową planszę");
      boardDraw = new BoardDraw(3);
      boardDraw.show(new BoardScore());
    }

    BoardScore boardScore = new BoardScore();

    while (true) {
      System.out.println(String.format("Ruch gracza:%s", players.getCurrent()));
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
      boardScore.addFieldToBoard(new Field(x, y), players.getFieldValueForCurrentPlayer());
      boardDraw.show(boardScore);
      BoardChecker boardChecker = new BoardChecker(boardScore, 3);
      if (boardChecker.check()) {
        System.out.println("Gratulacje wygrałeś :) !");
        break;
      } else if (boardChecker.isDraw()) {
        System.out.println("Nie było zwycięzcy :(");
        break;
      }
      players.getNext();
    }
  }
}
