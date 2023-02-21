package com.book.my.show.models;

import java.util.UUID;

import lombok.Data;

@Data
public class SeatResponse extends SeatRequest {

  private UUID id;

}
