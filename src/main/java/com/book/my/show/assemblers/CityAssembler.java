package com.book.my.show.assemblers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.book.my.show.entities.City;
import com.book.my.show.models.CityRequest;
import com.book.my.show.models.CityResponse;

@Component
public class CityAssembler {

  public City convertRequestToEntity(CityRequest request) {
    City city = new City();
    city.setName(request.getName());
    return city;
  }

  public CityResponse convertEntityToResponse(City city) {
    CityResponse response = new CityResponse();
    response.setId(city.getId());
    response.setName(city.getName());
    return response;
  }

  public List<CityResponse> convertEntityToResponse(List<City> cities) {
    return cities.stream().map(city -> convertEntityToResponse(city)).collect(Collectors.toList());
  }

}
