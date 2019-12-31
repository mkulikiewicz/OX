package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class BoardCheckerTest {

    private static BoardScore boardScore;
    private static final int WINING_SIZE = 3;

    @BeforeMethod
    public void initBoardScore() {
        boardScore = new BoardScore();
    }

    @Test(dataProvider = "getWinningMoveInBoard3x3", dataProviderClass = BoardCheckerDP.class)
    public void testCheckWinningMoveOn3x3Board(Field firstMove, Field secondMove, Field winingMove, Sign winningValue) {
        //Given
        boardScore.addFieldToBoard(firstMove, winningValue);
        boardScore.addFieldToBoard(secondMove, winningValue);

        //When
        boardScore.addFieldToBoard(winingMove, winningValue);
        boolean check = new BoardChecker(boardScore, WINING_SIZE).check();

        //Then
        assertThat(check).isTrue();
    }


    @Test(dataProvider = "getNotWinningMoveInBoard3x3", dataProviderClass = BoardCheckerDP.class)
    public void testCheckNotWinningMoveOn3x3Board(Field firstMove, Field secondMove, Field winingMove, Sign winningValue) {
        //Given
        boardScore.addFieldToBoard(firstMove, winningValue);
        boardScore.addFieldToBoard(secondMove, winningValue);

        //When
        boardScore.addFieldToBoard(winingMove, winningValue);
        boolean check = new BoardChecker(boardScore, WINING_SIZE).check();
        //Then
        assertThat(check).isFalse();
    }

    @Test(dataProvider = "getBoardScoreWithOneMoveToDraw", dataProviderClass = BoardCheckerDP.class)
    public void testIsDrawReturnTrueOn3x3Board(BoardScore boardScore, Field field, Sign fieldValue) {
        //When
        boardScore.addFieldToBoard(field, fieldValue);
        boolean IsDraw = new BoardChecker(boardScore, WINING_SIZE).isDraw();
        //Then
        assertThat(IsDraw).isTrue();
    }

    @Test(dataProvider = "getSingleMoveWithOneFieldIn3x3Board", dataProviderClass = BoardCheckerDP.class)
    public void testIsDrawReturnFalseOn3x3Board(Field field, Field singleMove, Sign fieldValue) {
        //Given
        boardScore.addFieldToBoard(field, fieldValue);

        //When
        boardScore.addFieldToBoard(singleMove, fieldValue);
        boolean IsDraw = new BoardChecker(boardScore, WINING_SIZE).isDraw();
        //Then
        assertThat(IsDraw).isFalse();
    }


}
