package com.book.my.show.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.my.show.assemblers.CityAssembler;
import com.book.my.show.entities.City;
import com.book.my.show.exceptions.CityNotFoundException;
import com.book.my.show.models.CityRequest;
import com.book.my.show.models.CityResponse;
import com.book.my.show.repositories.CityRepository;
import com.book.my.show.services.CityService;

@Service
public class CityServiceImpl implements CityService {

  CityRepository cityRepository;

  CityAssembler cityAssembler;

  @Autowired
  public CityServiceImpl(CityRepository cityRepository, CityAssembler cityAssembler) {
    this.cityRepository = cityRepository;
    this.cityAssembler = cityAssembler;
  }

  @Override
  public CityResponse createCity(CityRequest cityRequest) {
    City city = new City();
    city.setName(cityRequest.getName());
    City savedCity = cityRepository.save(city);
    return cityAssembler.convertEntityToResponse(savedCity);
  }

  @Override
  public CityResponse fetchCityById(UUID id) throws CityNotFoundException {
    City city = cityRepository.findById(id)
        .orElseThrow(() -> new CityNotFoundException("No city exists with given Id"));
    return cityAssembler.convertEntityToResponse(city);
  }

  @Override
  public List<CityResponse> fetchAllCities() {
    List<City> cities = cityRepository.findAll();
    return cityAssembler.convertEntityToResponse(cities);
  }

}
