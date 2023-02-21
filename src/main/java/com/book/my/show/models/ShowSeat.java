package com.book.my.show.models;

import com.book.my.show.enums.SeatStatus;
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
@Table(name = "show_seats")
public class ShowSeat extends BaseModel {

  @ManyToOne
  private Show show;

  @ManyToOne
  private Seat seat;

  private ShowSeatType seatType;

  @Enumerated(EnumType.STRING)
  private SeatStatus status;

}
