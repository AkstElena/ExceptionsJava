package Homework;

import java.util.Scanner;

public class Homework2 {

  public static void main(String[] args) {
    floatNumber();
  }

  // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
  // (типа float), и возвращает введенное значение. Ввод текста вместо числа не
  // должно приводить к падению приложения, вместо этого, необходимо повторно
  // запросить у пользователя ввод данных.
  public static void floatNumber() {
    System.out.println("Введите дробное число: ");
    Scanner sc = new Scanner(System.in);
    try {
      String name = sc.nextLine();
      float number = Float.valueOf(name);
      System.out.println(number);
    } catch (Exception e) {
      System.out.println("Введено не дробное число. Необходимо ввести дробное число!");
      floatNumber();
    }
    sc.close();
  }
}
