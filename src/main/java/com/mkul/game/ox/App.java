package com.mkul.game.ox;

import com.mkul.game.ox.boardcheck.BoardChecker;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Class starts the ox game.
 */
public class App {

  /**
   * Only used to show demo.
   *
   * @param args size of board
   */
  public static void main(String[] args) {
    run(args);
  }

  private static void run(String[] args) {
    BoardScore boardScore = new BoardScore();

    int size = 3; //default size
    if (isInputCorrect(args)) {
      size = Integer.parseInt(args[0]);
    }

    Players players = new Players.Builder()
        .playerWithSignO("Maciek")
        .playerWithSignX("Marek")
        .setBeginSignO(true)
        .build();

    BoardDraw boardDraw = new BoardDraw(size);
    boardDraw.show(boardScore);
    while (true) {
      System.out.println(String.format("Ruch gracza:%s", players.getCurrent()));
      Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
      int x;
      int y;
      try {
        x = Integer.parseInt(scanner.next());
        y = Integer.parseInt(scanner.next());
      } catch (NumberFormatException e) {
        System.out.println("Nie poprawne dane wejście spróbuj ponownie");
        continue;
      }
      boardScore.addFieldToBoard(new Field(x, y), players.getPlayerSign());
      boardDraw.show(boardScore);
      BoardChecker boardChecker = new BoardChecker(boardScore, 3);
      if (boardChecker.check()) {
        System.out.println(String.format("Gratulacje wygrałeś :) !%s",players.getCurrent()));
        break;
      } else if (boardChecker.isDraw()) {
        System.out.println("Nie było zwycięzcy :(");
        break;
      }
      players.getNext();
    }
  }

  private static boolean isInputCorrect(String[] args) {
    try {
      Integer.parseInt(args[0]);
      return true;
    } catch (NumberFormatException
        | ArrayIndexOutOfBoundsException
        | IncorrectBoardSizeException e) {
      System.out.println("Niepoprawne argumenty rysuję podstawową planszę");
      return false;
    }
  }
}
