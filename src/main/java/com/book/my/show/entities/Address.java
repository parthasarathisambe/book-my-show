package com.book.my.show.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "addresses")
public class Address extends BaseModel {

  private String street1;

  private String street2;

  private String city;

  private String state;

  private String country;

}
