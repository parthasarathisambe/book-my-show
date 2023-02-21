package com.book.my.show.exceptions;

public class UserAlreadyRegisteredException extends Exception {

  private static final long serialVersionUID = 8902892193849012436L;

  public UserAlreadyRegisteredException(String message) {
    super(message);
  }

}
