package ru.otus.java.basic.exceptions;

public class AppArrayDataException extends Exception {

  int[] cell;

  public AppArrayDataException(int x, int y) {
    super("Некорректный формат данных в ячейке: [" + x + ", " + y + "]");
    this.cell = new int[]{x, y};
  }
}
