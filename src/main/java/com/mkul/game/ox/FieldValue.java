package com.mkul.game.ox;

enum FieldValue {
    X("X"),
    Y("Y"),
    EMPTY("_");

    private String field;

    FieldValue(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }
}
