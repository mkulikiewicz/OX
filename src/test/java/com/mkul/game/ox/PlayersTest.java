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
  public void testGetCurrentPlayerReturnDefaultPlayerX() {
    //Given exist in beforeMethod

    //When
    Player currentPlayer = players.getCurrent();
    //Then
    assertThat(currentPlayer.getSign()).isEqualTo(Sign.X);
    assertThat(currentPlayer.toString()).isEqualTo("Konrad posiada znak X");
  }

  @Test
  public void testGetNextPlayerReturnOtherPlayers() {
    //Given exist in beforeMethod
    Player firstPlayer = players.getCurrent();

    //When
    Player secondPlayer = players.getNext();

    //Then
    assertThat(firstPlayer.toString()).isNotEqualTo(secondPlayer.toString());
  }

  @Test
  public void testGetNextPlayerChangeCurrentPlayer() {
    //Given exist in beforeMethod

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
