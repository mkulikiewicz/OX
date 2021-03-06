package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;

interface BoardCheck {

  /**
   * Checks if there is a win on the board.
   *
   * @param boardScore   board with score
   * @param winingSize   size of win
   * @param fieldToCheck field with we want to check
   * @param fieldValue   value for checked field
   * @return true if this move was winning move
   */
  boolean check(BoardScore boardScore, int winingSize, Field fieldToCheck, Sign fieldValue);

}