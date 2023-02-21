package com.book.my.show.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class Movie extends BaseModel {

  private String name;

  @ManyToMany
  private List<Actor> actors;

}
