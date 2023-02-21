package com.book.my.show.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.book.my.show.enums.ShowSeatStatus;

import lombok.Data;

@Entity
@Data
@Table(name = "show_seats")
public class ShowSeat extends BaseModel {

  // 1 ShowSeat : 1 Show
  // M ShowSeats : 1 Show
  @ManyToOne
  private Show show;

  // 1 ShowSeat : 1 Seat
  // M ShowSeats : 1 Seat
  @ManyToOne
  private Seat seat;

  @Enumerated(EnumType.ORDINAL)
  private ShowSeatStatus status;

}
