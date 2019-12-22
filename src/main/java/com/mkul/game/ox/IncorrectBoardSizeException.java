package com.mkul.game.ox;

class IncorrectBoardSizeException extends RuntimeException {
    IncorrectBoardSizeException() {
        super("Board size was smaller then 3");
    }
}
