package com.mkul.game.ox;

import org.testng.annotations.DataProvider;

public class FieldDP {

    @DataProvider
    public Object[][] getSameField() {
        return new Object[][]{
                {new Field(1, 2), new Field(1, 2)},
                {new Field(5, 7), new Field(5, 7)},
                {new Field(12, 14), new Field(12, 14)},
                {new Field(11, 21), new Field(11, 21)},
                {new Field(111, 2), new Field(111, 2)},
                {new Field(1, 256), new Field(1, 256)},
                {new Field(11024, 22), new Field(11024, 22)},
                {new Field(0, 1234), new Field(0, 1234)},
                {new Field(27, 25), new Field(27, 25)},
                {new Field(41, 26), new Field(41, 26)},
        };
    }

    @DataProvider
    public Object[][] getDifferentField() {
        return new Object[][]{
                {new Field(10, 20), new Field(1, 2)},
                {new Field(51, 7), new Field(5, 7)},
                {new Field(12, 134), new Field(12, 14)},
                {new Field(11, 214), new Field(11, 21)},
                {new Field(1511, 2), new Field(111, 2)},
                {new Field(1, 2656), new Field(1, 256)},
                {new Field(110724, 22), new Field(11024, 22)},
                {new Field(0, 12234), new Field(0, 1234)},
                {new Field(7, 25), new Field(27, 25)},
                {new Field(41, 216), new Field(41, 26)},
        };
    }
}
