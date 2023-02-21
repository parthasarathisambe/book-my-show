package com.book.my.show.services;

import java.util.List;
import java.util.UUID;

import com.book.my.show.exceptions.SeatNotFoundException;
import com.book.my.show.models.SeatRequest;
import com.book.my.show.models.SeatResponse;

public interface SeatService {

  SeatResponse createSeat(SeatRequest seatRequest);

  SeatResponse fetchSeatById(UUID id) throws SeatNotFoundException;

  List<SeatResponse> fetchAllSeatsByAuditorium(UUID audiId);

}
