package com.mkul.game.ox;

/**
 * Represent value of field in board
 */
public enum FieldValue {
    X("X"),
    O("O");

    private String field;

    FieldValue(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }
}
