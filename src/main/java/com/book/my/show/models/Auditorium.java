package com.book.my.show.models;

import com.book.my.show.enums.Feature;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "auditoriums")
public class Auditorium extends BaseModel {

  private String name;

  @OneToMany(fetch = FetchType.EAGER)
  private List<Show> shows;

  @ElementCollection
  @Enumerated(EnumType.STRING)
  private List<Feature> features;

  @OneToMany(fetch = FetchType.EAGER)
  private List<Seat> seats;

  @ManyToOne
  private Theatre theatre;

}
