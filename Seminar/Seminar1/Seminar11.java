package Seminar.Seminar1;

public class Seminar11 {

  // Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный
  // массив.
  // Необходимо посчитать и вернуть сумму элементов этого массива.
  // При этом накладываем на метод 2 ограничения: метод может работать только с
  // квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке
  // может лежать только значение 0 или 1.
  // Если нарушается одно из условий, метод должен бросить RuntimeException с
  // сообщением об ошибке.

  public static void main(String[] args) {
    int[][] mass = { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } };
    System.out.println(summElements(mass));

  }

  public static int summElements(int[][] arr) {
    if (arr.length != arr[0].length) {
      throw new RuntimeException("Массив не является квадратным" + arr.length + "x" + arr[0].length);
    }
    int sum = 0;
    for (int[] is : arr) {
      for (int is2 : is) {
        if (is2 != 1 && is2 != 0) {
          throw new RuntimeException("Элемент на равен 0 или 1");
        }
        sum += is2;
      }
    }
    return sum;
  }
}