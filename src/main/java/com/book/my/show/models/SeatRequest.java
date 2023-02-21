package com.book.my.show.models;

import com.book.my.show.enums.SeatType;

import lombok.Data;

@Data
public class SeatRequest {

  private String name;

  private SeatType seatType;

  private int row;

  private int col;

}
