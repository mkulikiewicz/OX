package com.mkul.game.ox;

class Player {

  private final String name;
  private final Sign sign;

  Player(String name, Sign sign) {
    this.name = name;
    this.sign = sign;
  }

  Sign getSign() {
    return sign;
  }

  @Override
  public String toString() {
    return String.format("%s posiada znak %s", name, sign.toString());
  }
}