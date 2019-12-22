package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.FieldValue;

class BoardCheckVertical implements BoardCheck {

    /**
     * {@inheritDoc}
     * check wining on vertical
     */
    @Override
    public boolean check(BoardScore boardScore, int winingSize, Field fieldToCheck, FieldValue fieldValue) {
        int steps = 1;
        int score = 1;
        while (winingSize != steps) {
            if (boardScore.isFieldExist(fieldToCheck.nextUp(steps)) && boardScore.getValue(fieldToCheck.nextUp(steps)) == fieldValue) {
                score++;
            }

            if (boardScore.isFieldExist(fieldToCheck.nextDown(steps)) && boardScore.getValue(fieldToCheck.nextDown(steps)) == fieldValue) {
                score++;
            }
            steps++;
        }
        return score == winingSize;
    }
}
