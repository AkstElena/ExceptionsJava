package Seminar;

public class Seminar12 {

  // Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
  // целочисленный одномерный массив.
  // Метод должен пройтись по каждому элементу и проверить что он не равен null.
  // А теперь реализуйте следующую логику:
  // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
  // пользователя
  // Если null’ы встретились в нескольких ячейках, то идеально было бы все их
  // “подсветить”

  public static void main(String[] args) {
    Integer[] mass = { null, 1, 3, 5, null };
    checkArray(mass);
  }

  public static void checkArray(Integer[] arr) {
    StringBuilder out = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == null) {
        out.append(i).append(" ");
      }
    }
    if (out.length() > 0) {
      throw new RuntimeException("В массиве присутствуют пустые значения на позициях: " + out);
    }

  }
}
