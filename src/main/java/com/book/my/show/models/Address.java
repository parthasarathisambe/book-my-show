package com.book.my.show.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "addresses")
public class Address extends BaseModel{

  private String street1;

  private String street2;

  private String city;

  private String state;

  private String country;

}
