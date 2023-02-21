package com.book.my.show.exceptions;

public class SeatNotFoundException extends Exception {

  private static final long serialVersionUID = 811160233638840829L;

  public SeatNotFoundException(String message) {
    super(message);
  }

}
