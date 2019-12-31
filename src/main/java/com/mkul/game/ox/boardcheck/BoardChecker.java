package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;

import java.util.List;
import java.util.Objects;

/**
 * Used to check if a win occurred.
 *
 * @author Maciej Kulikiewicz
 */
public class BoardChecker {

  private final List<BoardCheck> boardCheckList;
  private final BoardScore boardScore;
  private final int winingSize;

  /**
   * Responsible for checking the winnings on the board.
   *
   * @param boardScore score to processing
   * @param winingSize how much is nedded to win
   */
  public BoardChecker(BoardScore boardScore, int winingSize) {
    this.boardScore = boardScore;
    this.winingSize = winingSize;
    boardCheckList = List.of(new BoardCheckHorizontal(),
        new BoardCheckVertical(),
        new BoardCheckDiagonal(),
        new BoardCheckAntidiagonal());
  }

  /**
   * Used to check if is wining.
   *
   * @return true if is wining
   */
  public boolean check() {
    if (Objects.isNull(boardScore)) {
      return false;
    }
    Field field = boardScore.getLastAddedField().getKey();
    Sign sign = boardScore.getLastAddedField().getValue();
    if (Objects.isNull(field) || Objects.isNull(sign)) {
      return false;
    }
    return boardCheckList.stream()
        .anyMatch(e -> e.check(boardScore, winingSize, field, sign));
  }


  /**
   * Check if on board is a draw.
   *
   * @return true if on board is a draw.
   */
  //TODO: this is a bug when board size is greater then winingSize^2
  public boolean isDraw() {
    return boardScore.getBoardScoreSize() >= Math.pow(winingSize, 2);
  }
}
