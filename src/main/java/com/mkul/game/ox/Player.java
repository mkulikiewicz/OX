package com.mkul.game.ox;

class Player {

    private String name;
    private FieldValue fieldValue;

    Player(String name, FieldValue fieldValue) {
        this.name = name;
        this.fieldValue = fieldValue;
    }

    FieldValue getFieldValue() {
        return fieldValue;
    }

    @Override
    public String toString() {
        return String.format("%s posiada znak %s", name, fieldValue.toString());
    }
}