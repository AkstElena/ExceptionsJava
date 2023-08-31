package Lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lecture3 {

  public static void main(String[] args) {
    // try (FileReader test = new
    // FileReader("C:/Elena/GeekBrains/Exceptions/Seminar/Seminar2/file.txt")) {
    // test.read();
    // } catch (RuntimeException | IOException e) {
    // System.out.println("catch exception: " + e.getClass().getSimpleName());
    // }

    try (FileReader reader = new FileReader("C:/Elena/GeekBrains/Exceptions/Seminar/Seminar2/file.txt");
        FileWriter writer = new FileWriter("test")) {
      while (reader.ready()) {
        writer.write(reader.read());
      }
    } catch (RuntimeException | IOException e) {
      System.out.println("catch exception: " + e.getClass().getSimpleName());
    }

    System.out.println("Скопировалось успешно");

  }
}
