package com.mkul.game.ox;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@Test
public class OutputBaseTest {

  ByteArrayOutputStream outputStream;

  @BeforeMethod
  public void initOutput() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }
}
