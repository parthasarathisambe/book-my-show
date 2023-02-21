package com.book.my.show.exceptions;

public class UserNotFoundException extends Exception {

  private static final long serialVersionUID = 5151969860351965833L;

  public UserNotFoundException(String message) {
    super(message);
  }
}
