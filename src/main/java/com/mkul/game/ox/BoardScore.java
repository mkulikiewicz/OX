package com.mkul.game.ox;

import java.util.Map;
import java.util.TreeMap;

/**
 * Represents board with score.
 *
 * @author Maciej Kulikiewicz
 */
public class BoardScore {
  private TreeMap<Field, Sign> board = new TreeMap<>();

  /**
   * Used to add field to board score.
   *
   * @param field field to add
   * @param sign  sign to add with field
   */
  public void addFieldToBoard(Field field, Sign sign) {
    board.put(field, sign);
  }

  boolean isFieldExist(int x, int y) {
    return board.containsKey(new Field(x, y));
  }

  /**
   * Check that field is in board score.
   *
   * @param field checked field
   * @return true if field exist in boards score
   */
  public boolean isFieldExist(Field field) {
    return board.containsKey(field);
  }

  Sign getValue(int x, int y) {
    return board.get(new Field(x, y));
  }

  /**
   * Return value from board.
   *
   * @param field single field in board
   * @return value from board
   */
  public Sign getValue(Field field) {
    return board.get(field);
  }

  /**
   * Return last added entry to board score.
   *
   * @return last added entry to board score
   */
  public Map.Entry<Field, Sign> getLastAddedField() {
    return board.lastEntry();
  }

  /**
   * Return size of board score.
   *
   * @return size of board score
   */
  public int getBoardScoreSize() {
    return board.size();
  }
}
