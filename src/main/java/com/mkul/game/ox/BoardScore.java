package com.mkul.game.ox;

import java.util.Map;
import java.util.TreeMap;

class BoardScore {
    private Map<Field, FieldValue> board = new TreeMap<>();

    void addFieldToBoard(Field field, FieldValue fieldValue) {
        board.put(field, fieldValue);
    }

    boolean isFieldExist(int x, int y) {
        return board.containsKey(new Field(x, y));
    }

    FieldValue getValue(int x, int y) {
        return board.get(new Field(x, y));
    }
}
