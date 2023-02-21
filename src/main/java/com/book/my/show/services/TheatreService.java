package com.book.my.show.services;

import java.util.List;
import java.util.UUID;

import com.book.my.show.models.TheatreRequest;
import com.book.my.show.models.TheatreResponse;

public interface TheatreService {

  TheatreResponse createTheatre(TheatreRequest theatreRequest);
  
  TheatreResponse fetchTheatreById(UUID id);
  
  List<TheatreResponse> fetchTheatreByCity(UUID cityId);
  
}
