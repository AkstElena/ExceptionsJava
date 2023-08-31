package Lecture;

import java.io.FileReader;
import java.io.IOException;

public class Lecture2 {

  public static void main(String[] args) {
    FileReader test = null;
    try {
      test = new FileReader("C:/Elena/GeekBrains/Exceptions/Seminar/Seminar2/file.txt");
      // test.read();
    } catch (RuntimeException | IOException e) {
      System.out.println("catch exception: " + e.getClass().getSimpleName());
    } finally {
      System.out.println("finally start");
      if (test != null) {
        try {
          test.close();
        } catch (IOException e) {
          System.out.println("exception while close");
        }
      }
      System.out.println("finally finished");
    }

  }
}
