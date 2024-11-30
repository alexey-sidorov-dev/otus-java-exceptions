package ru.otus.java.basic;

import java.util.Arrays;
import ru.otus.java.basic.exceptions.AppArrayDataException;
import ru.otus.java.basic.exceptions.AppArraySizeException;

public class App {

  public static void main(String[] args) {
    String[][][] arrays = getArrays();

    for (String[][] array : arrays
    ) {
      try {
        {
          System.out.println("Переданный массив: " + Arrays.deepToString(array));
          System.out.println("Сумма всех элементов массива: " + sumArrayElements(array));
        }
      } catch (AppArraySizeException | AppArrayDataException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  private static String[][][] getArrays() {
    String[][] arr1 = new String[][]{{"12", "23", "34", "45"}, {"56", "67", "78"},
        {"90", "81"}, {"54"}};
    String[][] arr2 = new String[][]{{"56", "67", "78", "89"},
        {"90", "81", "72", "63"}, {"54", "45", "36", "27"}};
    String[][] arr3 = new String[][]{{"12", "23", "34", "45"}, {"56", "67", "78", "89"},
        {"90", "81", "abc", "63"}, {"54", "45", "36", "27"}};
    String[][] arr4 = new String[][]{{"12", "23", "34", "45"}, {"56", "67", "78", "89"},
        {"90", "81", "72", "63"}, {"54", "45", "36", "27"}};

    return new String[][][]{arr1, arr2, arr3, arr4};
  }

  public static int sumArrayElements(String[][] array)
      throws AppArraySizeException, AppArrayDataException {
    int sum = 0;

    if (array == null || array.length != 4) {
      throw new AppArraySizeException();
    }
    for (int i = 0; i < array.length; i++
    ) {
      if (array[i].length != 4) {
        throw new AppArraySizeException();
      }
      for (int j = 0; j < array[i].length; j++
      ) {
        try {
          sum += Integer.parseInt(array[i][j]);

        } catch (NumberFormatException e) {
          throw new AppArrayDataException(i, j);
        }
      }
    }

    return sum;
  }
}