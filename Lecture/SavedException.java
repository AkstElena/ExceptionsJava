package Lecture;

import java.io.IOException;

import javax.xml.crypto.Data;

// создаем свой тип исключения

public class SavedException extends IOException {
  private Data startDate;

  public SavedException(String message, Exception e, Data startDate) {
    super(message, e);
    this.startDate = startDate;
  }

  public Data getStartDate() {
    return startDate;
  }

}
