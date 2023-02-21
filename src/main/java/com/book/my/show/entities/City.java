package com.book.my.show.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cities")
public class City extends BaseModel {

  private String name;

  // 1 City : 1 Theatre
  // 1 City : M Theatres
  @OneToMany
  private List<Theatre> theatres;

}
