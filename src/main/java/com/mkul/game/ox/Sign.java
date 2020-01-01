package com.mkul.game.ox;

/**
 * Represent value of field in board.
 */
public enum Sign {
  X("X"),
  O("O");

  private String sign;

  Sign(String sign) {
    this.sign = sign;
  }

  @Override
  public String toString() {
    return sign;
  }
}
