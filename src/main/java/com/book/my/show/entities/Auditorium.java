package com.book.my.show.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.book.my.show.enums.Feature;

import lombok.Data;

@Entity
@Data
@Table(name = "auditoriums")
public class Auditorium extends BaseModel {

  private String name;

  // 1 Auditorium : 1 Show
  // 1 Auditorium : M Shows
  @OneToMany(mappedBy = "auditorium")
  private List<Show> shows;

  @ElementCollection
  @Enumerated(EnumType.ORDINAL)
  private List<Feature> features;

  // 1 Auditorium : 1 Seat
  // 1 Auditorium : M Seats
  @OneToMany
  private List<Seat> seats;

}
