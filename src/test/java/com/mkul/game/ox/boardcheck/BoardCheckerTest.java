package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.FieldValue;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardCheckerTest {

    @Test(dataProvider = "getWinningMoveInBoard3x3", dataProviderClass = BoardCheckerDP.class)
    public void testCheckWinningMoveOn3x3Board(Field firstMove, Field secondMove, Field winingMove, FieldValue winningValue) {
        //Given
        BoardScore boardScore = new BoardScore();
        boardScore.addFieldToBoard(firstMove, winningValue);
        boardScore.addFieldToBoard(secondMove, winningValue);

        int winingSize = 3;

        //When
        boardScore.addFieldToBoard(winingMove, winningValue);
        boolean check = new BoardChecker(boardScore, winingSize).check();

        //Then
        assertThat(check).isTrue();
    }


    @Test(dataProvider = "getNotWinningMoveInBoard3x3", dataProviderClass = BoardCheckerDP.class)
    public void testCheckNotWinningMoveOn3x3Board(Field firstMove, Field secondMove, Field winingMove, FieldValue winningValue) {
        //Given
        BoardScore boardScore = new BoardScore();
        boardScore.addFieldToBoard(firstMove, winningValue);
        boardScore.addFieldToBoard(secondMove, winningValue);

        int winingSize = 3;

        //When
        boardScore.addFieldToBoard(winingMove, winningValue);
        boolean check = new BoardChecker(boardScore, winingSize).check();
        //Then
        assertThat(check).isFalse();
    }

    @Test
    public void testIsDrawReturnTrueOn3x3Board(){
        //Given
        BoardScore boardScore = new BoardScore();
        boardScore.addFieldToBoard(new Field(0,0), FieldValue.X);
        boardScore.addFieldToBoard(new Field(0,1), FieldValue.O);
        boardScore.addFieldToBoard(new Field(0,2), FieldValue.X);

        boardScore.addFieldToBoard(new Field(1,0), FieldValue.O);
        boardScore.addFieldToBoard(new Field(1,1), FieldValue.X);
        boardScore.addFieldToBoard(new Field(1,2), FieldValue.O);

        boardScore.addFieldToBoard(new Field(2,0), FieldValue.O);
        boardScore.addFieldToBoard(new Field(2,1), FieldValue.X);

        int winingSize = 3;

        //When
        boardScore.addFieldToBoard(new Field(2,2), FieldValue.O);
        boolean IsDraw = new BoardChecker(boardScore, winingSize).isDraw();
        //Then
        assertThat(IsDraw).isTrue();
    }

    @Test
    public void testIsDrawReturnFalseOn3x3Board(){
        //Given
        BoardScore boardScore = new BoardScore();
        boardScore.addFieldToBoard(new Field(0,0), FieldValue.X);
        boardScore.addFieldToBoard(new Field(0,1), FieldValue.O);
        boardScore.addFieldToBoard(new Field(0,2), FieldValue.X);


        int winingSize = 3;

        //When
        boardScore.addFieldToBoard(new Field(2,2), FieldValue.O);
        boolean IsDraw = new BoardChecker(boardScore, winingSize).isDraw();
        //Then
        assertThat(IsDraw).isFalse();
    }


}
