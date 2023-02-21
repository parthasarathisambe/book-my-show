package com.book.my.show.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.my.show.models.TheatreRequest;
import com.book.my.show.models.TheatreResponse;
import com.book.my.show.repositories.TheatreRepository;
import com.book.my.show.services.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService {

  TheatreRepository theatreRepository;

  @Autowired
  public TheatreServiceImpl(TheatreRepository theatreRepository) {
    this.theatreRepository = theatreRepository;
  }

  @Override
  public TheatreResponse createTheatre(TheatreRequest theatreRequest) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TheatreResponse fetchTheatreById(UUID id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<TheatreResponse> fetchTheatreByCity(UUID cityId) {
    // TODO Auto-generated method stub
    return null;
  }

}
