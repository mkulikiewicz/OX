package com.mkul.game.ox;

import java.util.Objects;

class Field implements Comparable<Field> {

    private int x;
    private int y;

    Field(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return x == field.x && y == field.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Field o) {
        return x == o.x && y == o.y ? 0 : 1;
    }
}
