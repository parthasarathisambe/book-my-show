package com.book.my.show.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.book.my.show.enums.SeatType;

import lombok.Data;

@Entity
@Data
@Table(name = "seats")
public class Seat extends BaseModel {

  private String name;

  @Enumerated(EnumType.ORDINAL)
  private SeatType seatType;

  private int row;

  private int col;

}
