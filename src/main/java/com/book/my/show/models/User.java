package com.book.my.show.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseModel {

  private String name;

  private String username;

  private String password;

  private String phone;

}
