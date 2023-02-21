package com.book.my.show.models;

import com.book.my.show.enums.Feature;
import com.book.my.show.enums.Language;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "shows")
public class Show extends BaseModel {

  @ManyToOne
  private Auditorium auditorium;

  private Date startTime;

  private Date endTime;

  @ManyToOne
  private Movie movie;

  @Enumerated(EnumType.STRING)
  private Language language;

  @ElementCollection
  @Enumerated(EnumType.STRING)
  private List<Feature> features;

  @OneToMany(mappedBy = "show")
  private List<ShowSeat> showSeats;

}
