package ru.otus.java.basic.exceptions;


public class AppArraySizeException extends Exception {

  public AppArraySizeException() {
    super(
        "Некорректный размер переданного массива, метод ожидает массив размерности 4x4");
  }
}
