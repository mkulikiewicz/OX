package com.mkul.game.ox;

public class NotEnoughPlayers extends Exception {
  NotEnoughPlayers() {
    super("Not enough players in game");
  }
}
