package Lecture.Lecture1;

import java.io.File;

/**
 * Application
 */
public class Application {

  public static void main(String[] args) {
    // System.out.println(getFileSize(new File("123")));
    System.out.println(divide(5, 0));
    // System.out.println(divide(10, -10));

  }

  public static int divide(int a1, int a2) {
    if (a2 == 0) {
      throw new RuntimeException("Деление на ноль невозможно");
    }
    return a1 / a2;
  }

  public static long getFileSize(File file) {
    if (!file.exists()) {
      return -1;
    }
    return file.length();

  }

}