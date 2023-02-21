package com.book.my.show.exceptions;

public class CityNotFoundException extends Exception {

  private static final long serialVersionUID = 666941180893286806L;

  public CityNotFoundException(String message) {
    super(message);
  }

}
