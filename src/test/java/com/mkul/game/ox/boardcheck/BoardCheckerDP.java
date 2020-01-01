package com.mkul.game.ox.boardcheck;

import com.mkul.game.ox.BoardScore;
import com.mkul.game.ox.Field;
import com.mkul.game.ox.Sign;
import org.testng.annotations.DataProvider;

public class BoardCheckerDP {
    @DataProvider
    Object[][] getWinningMoveInBoard3x3() {
        return new Object[][]
                {
                        //Horizontal
                        {new Field(0, 0), new Field(0, 1), new Field(0, 2), Sign.X},
                        {new Field(0, 0), new Field(0, 1), new Field(0, 2), Sign.O},
                        {new Field(0, 2), new Field(0, 1), new Field(0, 0), Sign.X},
                        {new Field(0, 2), new Field(0, 1), new Field(0, 0), Sign.O},
                        {new Field(0, 0), new Field(0, 2), new Field(0, 1), Sign.X},
                        {new Field(0, 0), new Field(0, 2), new Field(0, 1), Sign.O},

                        {new Field(1, 0), new Field(1, 1), new Field(1, 2), Sign.X},
                        {new Field(1, 0), new Field(1, 1), new Field(1, 2), Sign.O},
                        {new Field(1, 2), new Field(1, 1), new Field(1, 0), Sign.X},
                        {new Field(1, 2), new Field(1, 1), new Field(1, 0), Sign.O},
                        {new Field(1, 0), new Field(1, 2), new Field(1, 1), Sign.X},
                        {new Field(1, 0), new Field(1, 2), new Field(1, 1), Sign.O},

                        {new Field(2, 0), new Field(2, 1), new Field(2, 2), Sign.X},
                        {new Field(2, 0), new Field(2, 1), new Field(2, 2), Sign.O},
                        {new Field(2, 2), new Field(2, 1), new Field(2, 0), Sign.X},
                        {new Field(2, 2), new Field(2, 1), new Field(2, 0), Sign.O},
                        {new Field(2, 0), new Field(2, 2), new Field(2, 1), Sign.X},
                        {new Field(2, 0), new Field(2, 2), new Field(2, 1), Sign.O},

                        //Vertical
                        {new Field(0, 0), new Field(1, 0), new Field(2, 0), Sign.X},
                        {new Field(0, 0), new Field(1, 0), new Field(2, 0), Sign.O},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 0), Sign.X},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 0), Sign.O},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 0), Sign.X},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 0), Sign.O},

                        {new Field(0, 1), new Field(1, 1), new Field(2, 1), Sign.X},
                        {new Field(0, 1), new Field(1, 1), new Field(2, 1), Sign.O},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 1), Sign.X},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 1), Sign.O},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 1), Sign.X},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 1), Sign.O},

                        {new Field(0, 2), new Field(1, 2), new Field(2, 2), Sign.X},
                        {new Field(0, 2), new Field(1, 2), new Field(2, 2), Sign.O},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 2), Sign.X},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 2), Sign.O},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 2), Sign.X},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 2), Sign.O},

                        //Diagonal
                        {new Field(0, 2), new Field(1, 1), new Field(2, 0), Sign.X},
                        {new Field(0, 2), new Field(1, 1), new Field(2, 0), Sign.O},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 1), Sign.X},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 1), Sign.O},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 2), Sign.X},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 2), Sign.O},

                        //AntiDiagonal
                        {new Field(0, 0), new Field(1, 1), new Field(2, 2), Sign.X},
                        {new Field(0, 0), new Field(1, 1), new Field(2, 2), Sign.O},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 1), Sign.X},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 1), Sign.O},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 0), Sign.X},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 0), Sign.O},
                };
    }

    @DataProvider
    Object[][] getNotWinningMoveInBoard3x3() {
        return new Object[][]
                {
                        //Horizontal
                        {new Field(0, 0), new Field(0, 1), new Field(1, 2), Sign.X},
                        {new Field(0, 0), new Field(0, 1), new Field(1, 2), Sign.O},
                        {new Field(0, 2), new Field(0, 1), new Field(1, 0), Sign.X},
                        {new Field(0, 2), new Field(0, 1), new Field(1, 0), Sign.O},
                        {new Field(0, 0), new Field(0, 2), new Field(1, 1), Sign.X},
                        {new Field(0, 0), new Field(0, 2), new Field(1, 1), Sign.O},

                        {new Field(1, 0), new Field(1, 1), new Field(0, 2), Sign.X},
                        {new Field(1, 0), new Field(1, 1), new Field(0, 2), Sign.O},
                        {new Field(1, 2), new Field(1, 1), new Field(0, 0), Sign.X},
                        {new Field(1, 2), new Field(1, 1), new Field(0, 0), Sign.O},
                        {new Field(1, 0), new Field(1, 2), new Field(0, 1), Sign.X},
                        {new Field(1, 0), new Field(1, 2), new Field(0, 1), Sign.O},

                        {new Field(2, 0), new Field(2, 1), new Field(1, 2), Sign.X},
                        {new Field(2, 0), new Field(2, 1), new Field(1, 2), Sign.O},
                        {new Field(2, 2), new Field(2, 1), new Field(1, 0), Sign.X},
                        {new Field(2, 2), new Field(2, 1), new Field(1, 0), Sign.O},
                        {new Field(2, 0), new Field(2, 2), new Field(1, 1), Sign.X},
                        {new Field(2, 0), new Field(2, 2), new Field(1, 1), Sign.O},

                        //Vertical
                        {new Field(0, 0), new Field(1, 0), new Field(2, 1), Sign.X},
                        {new Field(0, 0), new Field(1, 0), new Field(2, 1), Sign.O},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 1), Sign.X},
                        {new Field(2, 0), new Field(1, 0), new Field(0, 1), Sign.O},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 1), Sign.X},
                        {new Field(0, 0), new Field(2, 0), new Field(1, 1), Sign.O},

                        {new Field(0, 1), new Field(1, 1), new Field(2, 2), Sign.X},
                        {new Field(0, 1), new Field(1, 1), new Field(2, 2), Sign.O},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 2), Sign.X},
                        {new Field(2, 1), new Field(1, 1), new Field(0, 2), Sign.O},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 2), Sign.X},
                        {new Field(0, 1), new Field(2, 1), new Field(1, 2), Sign.O},

                        {new Field(0, 2), new Field(1, 2), new Field(2, 0), Sign.X},
                        {new Field(0, 2), new Field(1, 2), new Field(2, 0), Sign.O},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 0), Sign.X},
                        {new Field(2, 2), new Field(1, 2), new Field(0, 0), Sign.O},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 0), Sign.X},
                        {new Field(0, 2), new Field(2, 2), new Field(1, 0), Sign.O},

                        //FirstDiagonal
                        {new Field(0, 2), new Field(1, 1), new Field(2, 2), Sign.X},
                        {new Field(0, 2), new Field(1, 1), new Field(2, 2), Sign.O},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 2), Sign.X},
                        {new Field(2, 0), new Field(0, 2), new Field(1, 2), Sign.O},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 1), Sign.X},
                        {new Field(1, 1), new Field(2, 0), new Field(0, 1), Sign.O},

                        //SecondDiagonal
                        {new Field(0, 0), new Field(1, 1), new Field(2, 0), Sign.X},
                        {new Field(0, 0), new Field(1, 1), new Field(2, 0), Sign.O},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 0), Sign.X},
                        {new Field(2, 2), new Field(0, 0), new Field(1, 0), Sign.O},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 1), Sign.X},
                        {new Field(1, 1), new Field(2, 2), new Field(0, 1), Sign.O},
                };
    }

    @DataProvider
    public static Object[][] getSingleMoveWithOneFieldIn3x3Board() {
        return new Object[][]{
                {new Field(0, 0), new Field(0, 1), Sign.X},
                {new Field(0, 1), new Field(0, 0), Sign.X},
                {new Field(1, 0), new Field(0, 0), Sign.X},
                {new Field(1, 1), new Field(0, 0), Sign.X},
                {new Field(2, 0), new Field(0, 0), Sign.X},
                {new Field(2, 1), new Field(0, 0), Sign.X},
                {new Field(2, 2), new Field(0, 0), Sign.X},
                {new Field(0, 0), new Field(1, 0), Sign.O},
                {new Field(0, 1), new Field(1, 0), Sign.O},
                {new Field(1, 0), new Field(1, 2), Sign.O},
                {new Field(1, 1), new Field(1, 0), Sign.O},
                {new Field(2, 0), new Field(1, 0), Sign.O},
                {new Field(2, 1), new Field(1, 0), Sign.O},
                {new Field(2, 2), new Field(1, 0), Sign.O},
        };
    }


    @DataProvider
    public Object[][] getBoardScoreWithOneMoveToDraw() {
        BoardScore firstBoardScoreWithOneMoveToDraw = new BoardScore();

        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 0), Sign.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 1), Sign.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 2), Sign.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 0), Sign.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 1), Sign.X);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 2), Sign.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 0), Sign.O);
        firstBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 1), Sign.X);

        BoardScore secondBoardScoreWithOneMoveToDraw = new BoardScore();

        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 0), Sign.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 1), Sign.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(0, 2), Sign.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 0), Sign.O);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 1), Sign.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(1, 2), Sign.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 0), Sign.X);
        secondBoardScoreWithOneMoveToDraw.addFieldToBoard(new Field(2, 1), Sign.O);

        return new Object[][]{
                {firstBoardScoreWithOneMoveToDraw, new Field(2, 2), Sign.O},
                {secondBoardScoreWithOneMoveToDraw, new Field(2, 2), Sign.O}
        };
    }
}
