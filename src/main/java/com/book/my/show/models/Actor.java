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
@Table(name = "actors")
public class Actor extends BaseModel {

  private String name;

  // one actor multiple movies
  // one movie multiple actors
  // its many-to-many relationship
  @ManyToMany(mappedBy = "actors")
  private List<Movie> movies;

}
