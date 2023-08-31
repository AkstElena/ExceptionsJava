package Homework;

import java.util.Arrays;

/**
 * Homework1
 */

public class Homework1 {

  public static void main(String[] args) {
    // arrayOutOfBoundsException();
    // divisionByZero();
    // numberFormatException();
    // int[] a = new int[] { 4, 5, 6 };
    // int[] b = new int[] { 1, 2, 3 };
    // System.out.println(Arrays.toString(subArrays(a, b)));

    // int[] c = new int[] { 4, 5, 6 };
    // int[] d = new int[] { 1, 2, 3, 5 };
    // System.out.println(Arrays.toString(subArrays(c, d)));

    int[] a = new int[] { 12, 8, 16 };
    int[] b = new int[] { 4, 2, 4 };
    System.out.println(Arrays.toString(divArrays(a, b)));

    int[] c = new int[] { 12, 8, 16, 25 };
    int[] d = new int[] { 4, 2, 4 };
    System.out.println(Arrays.toString(divArrays(c, d)));

  }

  // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
  // Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы
  // массива
  // Метод divisionByZero - Деление на 0
  // Метод numberFormatException - Ошибка преобразования строки в число
  // Важно: они не должны принимать никаких аргументов

  public static void arrayOutOfBoundsException() {
    Integer[] array = { 1, 5, 8, 41, 33 };
    System.out.println(array[9]);

  }

  public static void divisionByZero() {
    int a = 5;
    int b = 0;
    System.out.println(a / b);
  }

  public static void numberFormatException() {
    String string = "123Число";
    int number = Integer.parseInt(string);
    System.out.println(number);
  }

  // Реализуйте метод subArrays, принимающий в качестве аргументов два
  // целочисленных массива a и b, и возвращающий новый массив c, каждый элемент
  // которого равен разности элементов двух входящих массивов в той же ячейке.
  // Если длины массивов не равны - верните нулевой массив длины 1.
  // Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает
  // на вход два параметра:
  // int[] a - первый массив
  // int[] b - второй массив

  public static int[] subArrays(int[] a, int[] b) {
    int[] c;
    if (a.length != b.length) {
      c = new int[] { 0 };
    } else {
      c = new int[a.length];
      for (int i = 0; i < a.length; i++) {
        c[i] = a[i] - b[i];
      }
    }
    return c;
  }

  // Реализуйте метод divArrays, принимающий в качестве аргументов два
  // целочисленных массива a и b, и возвращающий новый массив с, каждый элемент
  // которого равен частному элементов двух входящих массивов в той же ячейке.
  // Если длины массивов не равны - верните нулевой массив длины 1.
  // Важно: При выполнении метода единственное исключение, которое пользователь
  // может увидеть - RuntimeException, т.е. ваше.
  // Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает
  // на вход два параметра:
  // int[] a - первый массив
  // int[] b - второй массив

  public static int[] divArrays(int[] a, int[] b) {
    int[] c;
    if (a.length != b.length) {
      c = new int[] { 0 };
    } else {
      c = new int[a.length];
      for (int i = 0; i < a.length; i++) {
        if (b[i] == 0) {
          throw new RuntimeException("В массиве делителя присутствует элемент 0. На 0 делить нельзя");
        } else {
          c[i] = a[i] / b[i];
        }
      }
    }
    return c;

  }
}