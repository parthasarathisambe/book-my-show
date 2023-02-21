package com.book.my.show.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "movies")
public class Movie extends BaseModel {

  private String name;

  // 1 Movie : M Actors
  // M Movies : 1 Actor
  @ManyToMany
  private List<Actor> actors;

}
