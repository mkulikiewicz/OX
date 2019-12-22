package com.mkul.game.ox;

import java.util.Objects;

public class Field implements Comparable<Field>, BoardNavigable {

    private final int x;
    private final int y;

    public Field(int x, int y) {
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
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }

    @Override
    public Field nextLeft(int steps) {
        return new Field(x, y - steps);
    }

    @Override
    public Field nextRight(int steps) {
        return new Field(x, y + steps);
    }

    @Override
    public Field nextUp(int steps) {
        return new Field(x - steps, y);
    }

    @Override
    public Field nextDown(int steps) {
        return new Field(x + steps, y);
    }
}
