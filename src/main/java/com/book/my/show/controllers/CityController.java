package com.book.my.show.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.my.show.exceptions.CityNotFoundException;
import com.book.my.show.models.CityRequest;
import com.book.my.show.models.CityResponse;
import com.book.my.show.services.CityService;

@RestController
@RequestMapping("/bookmyshow/city/")
public class CityController {

  CityService cityService;

  @Autowired
  public CityController(CityService cityService) {
    this.cityService = cityService;
  }

  @PostMapping()
  public ResponseEntity<CityResponse> createCity(@RequestBody CityRequest cityRequest) {
    CityResponse response = cityService.createCity(cityRequest);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<CityResponse> fetchCity(@PathVariable UUID id) throws CityNotFoundException {
    CityResponse response = cityService.fetchCityById(id);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping()
  public ResponseEntity<List<CityResponse>> fetchAllCities() {
    List<CityResponse> cities = cityService.fetchAllCities();
    return new ResponseEntity<>(cities, HttpStatus.OK);
  }
  
}
