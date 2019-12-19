package com.mkul.game.ox;

class BoardDraw {

    private final int boardSize;

    BoardDraw(int boardSize) throws IncorrectBoardSizeException {
        if (boardSize < 1)
            throw new IncorrectBoardSizeException();
        this.boardSize = boardSize;
    }

    void show(BoardScore boardScore) {
        System.out.printf("%-3s", " ");
        for (int x = 0; x < boardSize; x++) {
            System.out.printf("%-3s ", x);
        }
        System.out.print("\n");

        for (int x = 0; x < boardSize; x++) {
            System.out.printf("%-2s ", x);
            for (int y = 0; y < boardSize; y++) {
                if (boardScore.isFieldExist(x, y)) {
                    System.out.printf("%-4s", boardScore.getValue(x, y).toString());
                } else {
                    System.out.printf("%-4s", "_");
                }
            }
            System.out.print("\n");
        }
    }
}
