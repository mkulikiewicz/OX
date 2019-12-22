package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.FieldValue;
import org.testng.annotations.DataProvider;

public class BoardCheckerDP {
    @DataProvider
    Object[][] getWinningMoveInBoard3x3() {
        return new Object[][]
                {
                        //Horizontal
                        {new Field(0, 0), new Field(0, 1), new Field(0, 2), FieldValue.X},
                        {new Field(0, 0), new Field(0, 1), new Field(0, 2), FieldValue.O},
                        {new Field(0, 2), new Field(0, 1), new Field(0, 0), FieldValue.X},
                        {new Field(0, 2), new Field(0, 1), new Field(0, 0), FieldValue.O},
                        {new Field(0, 0), new Field(0, 2), new Field(0, 1), FieldValue.X},
                        {new Field(0, 0), new Field(0, 2), new Field(0, 1), FieldValue.O},

                        {new Field(1, 0), new Field(1, 1), new Field(1, 2), FieldValue.X},
                        {new Field(1, 0), new Field(1, 1), new Field(1, 2), FieldValue.O},
                        {new Field(1, 2), new Field(1, 1), new Field(1, 0), FieldValue.X},
                        {new Field(1, 2), new Field(1, 1), new Field(1, 0), FieldValue.O},
                        {new Field(1, 0), new Field(1, 2), new Field(1, 1), FieldValue.X},
                        {new Field(1, 0), new Field(1, 2), new Field(1, 1), FieldValue.O},

                        {new Field(2, 0), new Field(2, 1), new Field(2, 2), FieldValue.X},
                        {new Field(2, 0), new Field(2, 1), new Field(2, 2), FieldValue.O},
                        {new Field(2, 2), new Field(2, 1), new Field(2, 0), FieldValue.X},
                        {new Field(2, 2), new Field(2, 1), new Field(2, 0), FieldValue.O},
                        {new Field(2, 0), new Field(2, 2), new Field(2, 1), FieldValue.X},
                        {new Field(2, 0), new Field(2, 2), new Field(2, 1), FieldValue.O},

                        //Vertical
                        {new Field(0, 0), new Field(1, 0), new Field(2, 0), FieldValue.X},
                        {new Field(0, 0), new Field(1, 0), new Field(2, 0), FieldValue.O},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 0), FieldValue.X},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 0), FieldValue.O},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 0), FieldValue.X},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 0), FieldValue.O},

                        {new Field(0, 1), new Field(1, 1), new Field(2, 1), FieldValue.X},
                        {new Field(0, 1), new Field(1, 1), new Field(2, 1), FieldValue.O},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 1), FieldValue.X},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 1), FieldValue.O},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 1), FieldValue.X},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 1), FieldValue.O},

                        {new Field(0, 2), new Field(1, 2), new Field(2, 2), FieldValue.X},
                        {new Field(0, 2), new Field(1, 2), new Field(2, 2), FieldValue.O},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 2), FieldValue.X},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 2), FieldValue.O},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 2), FieldValue.X},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 2), FieldValue.O},

                        //Diagonal
                        {new Field(0, 2), new Field(1, 1), new Field(2, 0), FieldValue.X},
                        {new Field(0, 2), new Field(1, 1), new Field(2, 0), FieldValue.O},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 1), FieldValue.X},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 1), FieldValue.O},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 2), FieldValue.X},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 2), FieldValue.O},

                        //AntiDiagonal
                        {new Field(0, 0), new Field(1, 1), new Field(2, 2), FieldValue.X},
                        {new Field(0, 0), new Field(1, 1), new Field(2, 2), FieldValue.O},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 1), FieldValue.X},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 1), FieldValue.O},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 0), FieldValue.X},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 0), FieldValue.O},
                };
    }

    @DataProvider
    Object[][] getNotWinningMoveInBoard3x3() {
        return new Object[][]
                {
                        //Horizontal
                        {new Field(0, 0), new Field(0, 1), new Field(1, 2), FieldValue.X},
                        {new Field(0, 0), new Field(0, 1), new Field(1, 2), FieldValue.O},
                        {new Field(0, 2), new Field(0, 1), new Field(1, 0), FieldValue.X},
                        {new Field(0, 2), new Field(0, 1), new Field(1, 0), FieldValue.O},
                        {new Field(0, 0), new Field(0, 2), new Field(1, 1), FieldValue.X},
                        {new Field(0, 0), new Field(0, 2), new Field(1, 1), FieldValue.O},

                        {new Field(1, 0), new Field(1, 1), new Field(0, 2), FieldValue.X},
                        {new Field(1, 0), new Field(1, 1), new Field(0, 2), FieldValue.O},
                        {new Field(1, 2), new Field(1, 1), new Field(0, 0), FieldValue.X},
                        {new Field(1, 2), new Field(1, 1), new Field(0, 0), FieldValue.O},
                        {new Field(1, 0), new Field(1, 2), new Field(0, 1), FieldValue.X},
                        {new Field(1, 0), new Field(1, 2), new Field(0, 1), FieldValue.O},

                        {new Field(2, 0), new Field(2, 1), new Field(1, 2), FieldValue.X},
                        {new Field(2, 0), new Field(2, 1), new Field(1, 2), FieldValue.O},
                        {new Field(2, 2), new Field(2, 1), new Field(1, 0), FieldValue.X},
                        {new Field(2, 2), new Field(2, 1), new Field(1, 0), FieldValue.O},
                        {new Field(2, 0), new Field(2, 2), new Field(1, 1), FieldValue.X},
                        {new Field(2, 0), new Field(2, 2), new Field(1, 1), FieldValue.O},

                        //Vertical
                        {new Field(0, 0), new Field(1, 0), new Field(2, 1), FieldValue.X},
                        {new Field(0, 0), new Field(1, 0), new Field(2, 1), FieldValue.O},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 1), FieldValue.X},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 1), FieldValue.O},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 1), FieldValue.X},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 1), FieldValue.O},

                        {new Field(0, 1), new Field(1, 1), new Field(2, 2), FieldValue.X},
                        {new Field(0, 1), new Field(1, 1), new Field(2, 2), FieldValue.O},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 2), FieldValue.X},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 2), FieldValue.O},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 2), FieldValue.X},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 2), FieldValue.O},

                        {new Field(0, 2), new Field(1, 2), new Field(2, 0), FieldValue.X},
                        {new Field(0, 2), new Field(1, 2), new Field(2, 0), FieldValue.O},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 0), FieldValue.X},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 0), FieldValue.O},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 0), FieldValue.X},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 0), FieldValue.O},

                        //FirstDiagonal
                        {new Field(0, 2), new Field(1, 1), new Field(2, 2), FieldValue.X},
                        {new Field(0, 2), new Field(1, 1), new Field(2, 2), FieldValue.O},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 2), FieldValue.X},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 2), FieldValue.O},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 1), FieldValue.X},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 1), FieldValue.O},

                        //SecondDiagonal
                        {new Field(0, 0), new Field(1, 1), new Field(2, 0), FieldValue.X},
                        {new Field(0, 0), new Field(1, 1), new Field(2, 0), FieldValue.O},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 0), FieldValue.X},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 0), FieldValue.O},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 1), FieldValue.X},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 1), FieldValue.O},
                };
    }

    @DataProvider
    public static Object[][] getSingleMoveWithOneFieldIn3x3Board() {
        return new Object[][]{
                {new Field(0, 0), new Field(0, 1), FieldValue.X},
                {new Field(0, 1), new Field(0, 0), FieldValue.X},
                {new Field(1, 0), new Field(0, 0), FieldValue.X},
                {new Field(1, 1), new Field(0, 0), FieldValue.X},
                {new Field(2, 0), new Field(0, 0), FieldValue.X},
                {new Field(2, 1), new Field(0, 0), FieldValue.X},
                {new Field(2, 2), new Field(0, 0), FieldValue.X},
                {new Field(0, 0), new Field(1, 0), FieldValue.O},
                {new Field(0, 1), new Field(1, 0), FieldValue.O},
                {new Field(1, 0), new Field(1, 2), FieldValue.O},
                {new Field(1, 1), new Field(1, 0), FieldValue.O},
                {new Field(2, 0), new Field(1, 0), FieldValue.O},
                {new Field(2, 1), new Field(1, 0), FieldValue.O},
                {new Field(2, 2), new Field(1, 0), FieldValue.O},
        };
    }


    @DataProvider
    public Object[][] getBoardScoreWithOneMoveToDraw() {
        BoardScore firstBoardScoreWithOneMoveToDraw = new BoardScore();

        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 0), FieldValue.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 1), FieldValue.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 2), FieldValue.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 0), FieldValue.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 1), FieldValue.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 2), FieldValue.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 0), FieldValue.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 1), FieldValue.X);

        BoardScore secondBoardScoreWithOneMoveToDraw = new BoardScore();

        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 0), FieldValue.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 1), FieldValue.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 2), FieldValue.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 0), FieldValue.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 1), FieldValue.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 2), FieldValue.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 0), FieldValue.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 1), FieldValue.O);

        return new Object[][]{
                {firstBoardScoreWithOneMoveToDraw, new Field(2, 2), FieldValue.O},
                {secondBoardScoreWithOneMoveToDraw, new Field(2, 2), FieldValue.O}
        };
    }
}
