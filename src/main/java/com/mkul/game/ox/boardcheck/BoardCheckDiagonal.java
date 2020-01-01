package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;

class BoardCheckDiagonal implements BoardCheck {

  /**
   * {@inheritDoc}
   * check wining on Diagonal.
   */
  @Override
  public boolean check(BoardScore boardScore, int winingSize,
                       Field fieldToCheck, Sign sign) {
    int steps = 1;
    int score = 1;
    while (winingSize != steps) {
      if (boardScore.isFieldExist(fieldToCheck.nextRight(steps).nextUp(steps))
          && boardScore.getValue(fieldToCheck.nextRight(steps).nextUp(steps)) == sign) {
        score++;
      }

      if (boardScore.isFieldExist(fieldToCheck.nextLeft(steps).nextDown(steps))
          && boardScore.getValue(fieldToCheck.nextLeft(steps).nextDown(steps)) == sign) {
        score++;
      }
      steps++;
    }
    return score == winingSize;
  }
}