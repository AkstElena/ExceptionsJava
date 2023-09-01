package Seminar.Seminar3;

public class Seminar32 {
  public static void main(String[] args) {
    try (Counter count = new Counter()) {
      count.add();
      // count.close();
      count.printCount();
    } catch (Exception e) {
      System.err.println("error");
    }
  }

}
