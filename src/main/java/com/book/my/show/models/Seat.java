package com.book.my.show.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "seats")
public class Seat extends BaseModel {

  private String name;

}
