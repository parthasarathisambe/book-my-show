package com.book.my.show.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.book.my.show.enums.SeatType;

import lombok.Data;

@Entity
@Data
@Table(name = "show_seat_types")
public class ShowSeatType extends BaseModel {

  @Enumerated(EnumType.ORDINAL)
  private SeatType seatType;

  // 1 ShowSeatType : 1 Show
  // M ShowSeatTypes : 1 Show
  @ManyToOne
  private Show show;

  private Double price;

}
