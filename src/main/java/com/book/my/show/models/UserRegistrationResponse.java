package com.book.my.show.models;

import java.util.UUID;

import lombok.Data;

@Data
public class UserRegistrationResponse {

  private UUID id;
  
  private String name;

  private String username;

  private String status;

}
