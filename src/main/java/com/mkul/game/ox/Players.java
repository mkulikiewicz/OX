package com.mkul.game.ox;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Players {
  final Queue<Player> players;

  private Players(Player player1, Player player2) {
    players = new LinkedList<>(List.of(player1, player2));
  }

  Player getCurrent() {
    return players.peek();
  }

  Player getNext() {
    Player player = players.poll();
    players.add(player);
    return players.peek();
  }

  Sign getPlayerSign() {
    assert players.peek() != null;
    return players.peek().getSign();
  }

  static final class Builder {
    private Player playerWithSignO;
    private Player playerWithSignX;
    private boolean startWithOSign = false;

    Builder playerWithSignO(String name) {
      this.playerWithSignO = new Player(name, Sign.O);
      return this;
    }

    Builder playerWithSignX(String name) {
      this.playerWithSignX = new Player(name, Sign.X);
      return this;
    }

    Builder setBeginSignO(boolean isSignOStart) {
      startWithOSign = isSignOStart;
      return this;
    }

    Players build() {
      if (startWithOSign) {
        return new Players(playerWithSignO, playerWithSignX);
      }
      return new Players(playerWithSignX, playerWithSignO);
    }
  }
}