package com.mkul.game.ox;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Players {
    final Player player1;
    final Player player2;
    final Queue<Player> players;

    private Players(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        players = new LinkedList<>(List.of(player1, player2));
    }

    Player getCurrent() {
       return players.peek();
    }

    Player getNext() {
        Player player = players.poll();
        players.add(player);
        return player;
    }

    static final class Builder {
        Player player1;
        Player player2;

        Builder player1(String name){
            this.player1 = new Player(name, FieldValue.O);
            return this;
        }

        Builder player2(String name){
            this.player2 = new Player(name, FieldValue.X);
            return this;
        }

        Players build(){
            return new Players(player1, player2);
        }
    }
}
