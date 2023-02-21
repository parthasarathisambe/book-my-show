package com.book.my.show.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRegistrationRequest {

  @NotBlank
  private String name;

  @NotBlank
  private String username;

  @NotBlank
  private String password;

  @NotBlank
  @Size(max = 10)
  private String phone;

}
