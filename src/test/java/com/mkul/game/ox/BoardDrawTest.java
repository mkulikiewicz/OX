package com.mkul.game.ox;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BoardDrawTest extends OutputBaseTest {

    @Test(dataProvider = "getBoardWithOneXValue", dataProviderClass = BoardDrawDP.class)
    public void testShowBoardWithOneX(int boardSize, String expectedResult) {
        //Given
        BoardDraw boardDraw = new BoardDraw(boardSize);
        BoardScore boardScore = new BoardScore();
        boardScore.addFieldToBoard(new Field(boardSize - 1, boardSize - 1), FieldValue.X);

        //When
        boardDraw.show(boardScore);

        //Then
        assertEquals(outputStream.toString(), expectedResult);
    }

    @Test(expectedExceptions = IncorrectBoardSizeException.class)
    public void testShowBoardWithEmptySize() {
        //Given
        BoardDraw boardDraw = new BoardDraw(0);
        BoardScore boardScore = new BoardScore();

        //When
        boardDraw.show(boardScore);

        //Then should throw exception
    }
}
