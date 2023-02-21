package com.book.my.show.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.book.my.show.enums.Feature;
import com.book.my.show.enums.Language;

import lombok.Data;

@Entity
@Data
@Table(name = "shows")
public class Show extends BaseModel {

  // 1 Show : 1 Auditorium
  // M Shows : 1 Auditorium
  @ManyToOne
  private Auditorium auditorium;

  private Date startTime;

  private Date endTime;

  // 1 Show : 1 Movie
  // M Shows : 1 Movie
  @ManyToOne
  private Movie movie;

  @Enumerated(EnumType.ORDINAL)
  private Language language;

  @ElementCollection
  @Enumerated(EnumType.ORDINAL)
  private List<Feature> features;

}
