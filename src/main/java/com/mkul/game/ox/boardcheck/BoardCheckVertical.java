package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;

class BoardCheckVertical implements BoardCheck {

  /**
   * {@inheritDoc}
   * check wining on vertical.
   */
  @Override
  public boolean check(BoardScore boardScore, int winingSize,
                       Field fieldToCheck, Sign sign) {
    int steps = 1;
    int score = 1;
    while (winingSize != steps) {
      if (boardScore.isFieldExist(fieldToCheck.nextUp(steps))
          && boardScore.getValue(fieldToCheck.nextUp(steps)) == sign) {
        score++;
      }

      if (boardScore.isFieldExist(fieldToCheck.nextDown(steps))
          && boardScore.getValue(fieldToCheck.nextDown(steps)) == sign) {
        score++;
      }
      steps++;
    }
    return score == winingSize;
  }
}
