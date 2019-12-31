package com.mkul.game.ox;

interface BoardNavigable {

  Field nextLeft(int steps);

  Field nextRight(int steps);

  Field nextUp(int steps);

  Field nextDown(int steps);
}
