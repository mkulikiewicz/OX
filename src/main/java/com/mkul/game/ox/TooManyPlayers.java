package com.mkul.game.ox;

class TooManyPlayers extends Exception {
  TooManyPlayers() {
    super("Too many players added to game");
  }
}
