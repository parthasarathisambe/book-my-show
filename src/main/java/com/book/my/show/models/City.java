package com.book.my.show.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "cities")
public class City extends BaseModel {

  private String name;

  @OneToMany(fetch = FetchType.EAGER)
  private List<Theatre> theatres;

}
