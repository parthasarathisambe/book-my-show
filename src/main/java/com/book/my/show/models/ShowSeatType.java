package com.book.my.show.models;

import com.book.my.show.enums.SeatType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "show_seat_types")
public class ShowSeatType extends BaseModel {

  @Enumerated(EnumType.STRING)
  private SeatType seatType;

  @ManyToOne
  private Show show;

  private Double price;

}
