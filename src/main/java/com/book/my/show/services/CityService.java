package com.book.my.show.services;

import java.util.List;
import java.util.UUID;

import com.book.my.show.exceptions.CityNotFoundException;
import com.book.my.show.models.CityRequest;
import com.book.my.show.models.CityResponse;

public interface CityService {

  CityResponse createCity(CityRequest cityRequest);
  
  CityResponse fetchCityById(UUID id) throws CityNotFoundException;

  List<CityResponse> fetchAllCities();

}
