package Seminar.Seminar3;

public class Counter implements AutoCloseable {

  private static int count;
  private static boolean isOpen = false;

  Counter() {
    isOpen = true;
    count = 0;
  }

  public void add() {
    if (!isOpen)
      throw new RuntimeException("Instance is closed, cant reach");
    count++;

  }

  public void printCount() {
    if (!isOpen)
      throw new RuntimeException("Instance is closed, cant reach");
    System.out.println("count = " + count);
  }

  @Override
  public void close() throws Exception {
    isOpen = false;
  }
}
