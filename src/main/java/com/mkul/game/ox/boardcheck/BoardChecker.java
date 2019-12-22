package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.FieldValue;

import java.util.List;
import java.util.Objects;

/**
 * Used to check if a win occurred
 *
 * @author Maciej Kulikiewicz
 */
public class BoardChecker {

    private final List<BoardCheck> boardCheckList;
    private final BoardScore boardScore;
    private final int winingSize;

    public BoardChecker(BoardScore boardScore, int winingSize) {
        this.boardScore = boardScore;
        this.winingSize = winingSize;
        boardCheckList = List.of(new BoardCheckHorizontal(),
                new BoardCheckVertical(),
                new BoardCheckDiagonal(),
                new BoardCheckAntidiagonal());
    }

    /**
     * Used to check if is wining
     *
     * @return true if is wining
     */
    public boolean check() {
        if (Objects.isNull(boardScore))
            return false;
        Field field = boardScore.getLastAddedField().getKey();
        FieldValue fieldValue = boardScore.getLastAddedField().getValue();
        if (Objects.isNull(field) || Objects.isNull(fieldValue))
            return false;
        return boardCheckList.stream().anyMatch(e -> e.check(boardScore, winingSize, field, fieldValue));
    }


    /**
     * Check if on board is a draw.
     *
     * @return true if on board is a draw.
     */
    public boolean isDraw() {
        return boardScore.getBoardScoreSize() >= Math.pow(winingSize, 2);
    }
}
