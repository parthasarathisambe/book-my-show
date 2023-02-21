package com.book.my.show.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "users")
public class User extends BaseModel {

  private String name;

  private String username;

  private String password;

  private String phone;

}
