package com.mkul.game.ox;

class BoardDraw {

    private final int boardSize;

    BoardDraw(int boardSize) throws IncorrectBoardSizeException {
        if (boardSize < 3)
            throw new IncorrectBoardSizeException();
        this.boardSize = boardSize;
    }

    void show(BoardScore boardScore) {
        System.out.println(drawColumnsIndex());
        for (int x = 0; x < boardSize; x++) {
            System.out.printf("%-2s ", x);
            System.out.print(drawRawLineWithValue(boardScore, x));
            System.out.printf("%n");
        }
    }

    private String drawColumnsIndex() {
        StringBuilder columnIndex = new StringBuilder();
        columnIndex.append(String.format("%-3s", " "));
        for (int x = 0; x < boardSize; x++) {
            columnIndex.append(String.format("%-3s ", x));
        }
        return columnIndex.toString();
    }

    private String drawRawLineWithValue(BoardScore boardScore, int x) {
        StringBuilder allRawLine = new StringBuilder();
        for (int y = 0; y < boardSize; y++) {
            allRawLine.append(getFieldValueOrEmptyValue(boardScore, x, y));
        }
        return allRawLine.toString();
    }

    private String getFieldValueOrEmptyValue(BoardScore boardScore, int x, int y) {
        return boardScore.isFieldExist(x, y) ? String.format("%-4s", boardScore.getValue(x, y).toString()) : String.format("%-4s", "_");
    }
}
