package com.mkul.game.ox;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

class Players {
    private LinkedList<Player> playerList = new LinkedList<>();
    private Player currentPlayer;

    public void addPlayer(String name) throws TooManyPlayers {
        new CreatePlayer().withName(name).withRandomFieldValue().addToList();
    }

    Player getCurrent() throws NotEnoughPlayers {
        if (playerList.size() < 1)
            throw new NotEnoughPlayers();
        if (Objects.isNull(currentPlayer))
            setRandomCurrentPlayer();
        return currentPlayer;
    }

    private void setRandomCurrentPlayer() {
        if (playerList.size() > 1) {
            currentPlayer = playerList.get(ThreadLocalRandom.current().nextInt(0, 2));
        } else {
            currentPlayer = playerList.peekFirst();
        }
    }

    public FieldValue getFieldValueForCurrentPlayer() throws NotEnoughPlayers {
        final Player currentPlayer = getCurrent();
        return currentPlayer.getFieldValue();
    }

    public Player getNext() throws NotEnoughPlayers {
        final Player currentPlayer = getCurrent();
        Optional<Player> expectedNextPlayer = playerList.stream().filter(player -> player.getFieldValue() != currentPlayer.getFieldValue()).findFirst();
        if (expectedNextPlayer.isPresent()) {
            this.currentPlayer = expectedNextPlayer.get();
            return this.currentPlayer;
        }
        throw new NotEnoughPlayers();
    }

    private class CreatePlayer {
        private String name;
        private FieldValue fieldValue;

        CreatePlayer withName(String name) {
            this.name = name;
            return this;
        }

        CreatePlayer withRandomFieldValue() {
            if (playerList.size() < 1) {
                fieldValue = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? FieldValue.X : FieldValue.O;
            } else {
                fieldValue = playerList.peekLast().getFieldValue() == FieldValue.X ? FieldValue.O : FieldValue.X;
            }
            return this;
        }

        Player addToList() throws TooManyPlayers {
            if (playerList.size() > 1) {
                throw new TooManyPlayers();
            }
            playerList.add(new Player(name, fieldValue));
            return playerList.peekLast();
        }
    }
}
