package com.book.my.show.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "actors")
public class Actor extends BaseModel {

  private String name;

  // 1 Actor : M Movies
  // M Actors : 1 Movie
  @ManyToMany(mappedBy = "actors")
  private List<Movie> movies;

}
