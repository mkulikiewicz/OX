package com.mkul.game.ox;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayersTest {

    Players multiplePlayers;
    Players singlePlayers;

    @BeforeMethod
    public void initPlayers() throws TooManyPlayers {
        multiplePlayers = new Players();
        multiplePlayers.addPlayer("Marek");
        multiplePlayers.addPlayer("Maciek");

        singlePlayers = new Players();
        singlePlayers.addPlayer("Konrad");
    }

    @Test
    public void testGetCurrentPlayerReturnRandomPlayer() throws NotEnoughPlayers {
        //Given

        //When
        multiplePlayers.getCurrent();
        //Then
        assertThat(multiplePlayers.getCurrent().toString()).contains(" posiada znak ");
        assertThat(multiplePlayers.getCurrent().toString())
                .withFailMessage("Brak informacji o znaku przypisanym do gracza")
                .containsPattern("[XO]");
    }

    @Test
    public void testGetNextPlayerReturnOtherPlayers() throws NotEnoughPlayers {
        //Given
        Player firstPlayer = multiplePlayers.getCurrent();

        //When
        Player secondPlayer = multiplePlayers.getNext();

        //Then
        assertThat(firstPlayer.toString()).isNotEqualTo(secondPlayer.toString());
    }

    @Test
    public void testGetNextPlayerChangeCurrentPlayer() throws NotEnoughPlayers {
        //Given

        //When
        Player secondPlayer = multiplePlayers.getNext();

        //Then
        assertThat(secondPlayer.toString()).isEqualTo(multiplePlayers.getCurrent().toString());
    }

    @Test
    public void testGetFieldValueForCurrentPlayerReturnFieldValueInstance() throws NotEnoughPlayers {
        //Given
        Player current = multiplePlayers.getCurrent();

        //When
        var currentPlayerField = multiplePlayers.getFieldValueForCurrentPlayer();

        //Then
        assertThat(currentPlayerField).isEqualTo(current.getFieldValue());
    }

    @Test
    public void testGetCurrentPlayerReturnFirstPlayer() throws NotEnoughPlayers, TooManyPlayers {
        //When
        Player firstPlayer = singlePlayers.getCurrent();

        //Then
        assertThat(firstPlayer.toString()).contains("Konrad");
    }

    @Test(expectedExceptions = NotEnoughPlayers.class)
    public void testGetNextPlayerThrowNotEnoughtPlayersException() throws NotEnoughPlayers, TooManyPlayers {
        //When
        Player firstPlayer = singlePlayers.getCurrent();
        singlePlayers.getNext();

        //Then throw exception
    }

    @Test(expectedExceptions = TooManyPlayers.class)
    public void testAddTooManyPlayers() throws TooManyPlayers {
        //Given
        Players players = new Players();

        //when
        players.addPlayer("Marek");
        players.addPlayer("Maciek");
        players.addPlayer("Konrad");

        //Then throw exception
    }

}
