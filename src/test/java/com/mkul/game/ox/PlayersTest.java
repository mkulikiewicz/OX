package com.mkul.game.ox;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayersTest {

  Players players;

  @BeforeMethod
  public void initPlayers() {
    players = new Players.Builder()
        .playerWithSignO("Maciek")
        .playerWithSignX("Konrad")
        .build();
  }

  @Test
  public void testGetCurrentPlayerReturnRandomPlayer() {
    //Given

    //When
    players.getCurrent();
    //Then
    assertThat(players.getCurrent().toString()).contains(" posiada znak ");
    assertThat(players.getCurrent().toString())
        .withFailMessage("Brak informacji o znaku przypisanym do gracza")
        .containsPattern("[XO]");
  }

  @Test
  public void testGetNextPlayerReturnOtherPlayers() {
    //Given
    Player firstPlayer = players.getCurrent();

    //When
    Player secondPlayer = players.getNext();

    //Then
    assertThat(firstPlayer.toString()).isNotEqualTo(secondPlayer.toString());
  }

  @Test
  public void testGetNextPlayerChangeCurrentPlayer() {
    //Given

    //When
    Player secondPlayer = players.getNext();

    //Then
    assertThat(secondPlayer.toString()).isEqualTo(players.getCurrent().toString());
  }

  @Test
  public void testGetSignForCurrentPlayerReturnSignInstance() {
    //Given
    Player current = players.getCurrent();

    //When
    var currentPlayerField = players.getPlayerSign();

    //Then
    assertThat(currentPlayerField).isEqualTo(current.getSign());
  }

  @Test
  public void testStartsWithSignOBeginGameWithSignO() {
    //Given
    players = new Players.Builder()
        .playerWithSignO("Maciek")
        .playerWithSignX("Konrad")
        .setBeginSignO(true)
        .build();
    //When
    Sign playerSign = players.getPlayerSign();
    //Then
    assertThat(playerSign).isEqualTo(Sign.O);
  }

  @Test
  public void testStartsWithSignOBeginGameWithSignX() {
    //Given
    players = new Players.Builder()
        .playerWithSignO("Maciek")
        .playerWithSignX("Konrad")
        .setBeginSignO(false)
        .build();
    //When
    Sign playerSign = players.getPlayerSign();
    //Then
    assertThat(playerSign).isEqualTo(Sign.X);
  }

}
