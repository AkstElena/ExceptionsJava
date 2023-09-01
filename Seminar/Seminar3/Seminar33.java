package Seminar.Seminar3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Seminar33 {

  public static void main(String[] args) {
    try {
      nullArray();
    } catch (EmptyArrayElemException e) {
      System.out.println("err");
    }
  }

  public static void nullArray() throws EmptyArrayElemException {
    Integer[] arr = { 1, 2, null };
    try {
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        arr[i]++;
      }
    } catch (NullPointerException e) {
      throw new EmptyArrayElemException("null element");
    }
  }

  public static void tryFile() throws CantFindExeption {
    try (FileReader fr = new FileReader("123")) {
      fr.read();
    } catch (FileNotFoundException e) {
      throw new CantFindExeption("Ошибка");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
