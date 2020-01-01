package com.mkul.game.ox;

import java.util.Objects;

/**
 * Represent single field in board.
 *
 * @author Maciej Kulikiewicz
 */
public class Field implements Comparable<Field>, BoardNavigable {

  private final int coordinateX;
  private final int coordinateY;

  public Field(int x, int y) {
    this.coordinateX = x;
    this.coordinateY = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return coordinateX == field.coordinateX && coordinateY == field.coordinateY;
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinateX, coordinateY);
  }

  @Override
  public int compareTo(Field o) {
    return coordinateX == o.coordinateX
        ? Integer.compare(coordinateY, o.coordinateY) : Integer.compare(coordinateX, o.coordinateX);
  }

  @Override
  public Field nextLeft(int steps) {
    return new Field(coordinateX, coordinateY - steps);
  }

  @Override
  public Field nextRight(int steps) {
    return new Field(coordinateX, coordinateY + steps);
  }

  @Override
  public Field nextUp(int steps) {
    return new Field(coordinateX - steps, coordinateY);
  }

  @Override
  public Field nextDown(int steps) {
    return new Field(coordinateX + steps, coordinateY);
  }
}
