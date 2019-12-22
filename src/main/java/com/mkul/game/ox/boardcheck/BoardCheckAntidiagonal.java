package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.FieldValue;

class BoardCheckAntidiagonal implements BoardCheck {

    /**
     * {@inheritDoc}
     * check wining on Antidiagonal
     */
    @Override
    public boolean check(BoardScore boardScore, int winingSize, Field fieldToCheck, FieldValue fieldValue) {
        int steps = 1;
        int score = 1;
        while (winingSize != steps) {
            if (boardScore.isFieldExist(fieldToCheck.nextLeft(steps).nextUp(steps)) && boardScore.getValue(fieldToCheck.nextLeft(steps).nextUp(steps)) == fieldValue) {
                score++;
            }

            if (boardScore.isFieldExist(fieldToCheck.nextRight(steps).nextDown(steps)) && boardScore.getValue(fieldToCheck.nextRight(steps).nextDown(steps)) == fieldValue) {
                score++;
            }
            steps++;
        }
        return score == winingSize;
    }
}
