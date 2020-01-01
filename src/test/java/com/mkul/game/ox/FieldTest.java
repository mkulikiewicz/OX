package com.mkul.game.ox;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FieldTest {

  @Test(dataProvider = "getSameField", dataProviderClass = FieldDP.class)
  public void testEqualsSameObject(Field first, Field second) {
    //Then
    assertThat(first).isEqualTo(second);
  }

  @Test(dataProvider = "getDifferentField", dataProviderClass = FieldDP.class)
  public void testEqualsDifferentObject(Field first, Field second) {
    //Then
    assertThat(first).isNotEqualTo(second);
  }
}
