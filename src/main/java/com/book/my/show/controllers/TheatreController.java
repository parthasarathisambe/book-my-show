package com.book.my.show.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.my.show.models.TheatreRequest;
import com.book.my.show.models.TheatreResponse;
import com.book.my.show.services.TheatreService;

@RestController
@RequestMapping("/bookmyshow/theatre/")
public class TheatreController {

  TheatreService theatreService;

  public TheatreController(TheatreService theatreService) {
    this.theatreService = theatreService;
  }

  @PostMapping()
  public ResponseEntity<TheatreResponse> createTheatre(@RequestBody TheatreRequest theatreRequest) {
    TheatreResponse theatreResponse = theatreService.createTheatre(theatreRequest);
    return new ResponseEntity<>(theatreResponse, HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<TheatreResponse> fetchTheatre(@PathVariable UUID id) {
    TheatreResponse theatreResponse = theatreService.fetchTheatreById(id);
    return new ResponseEntity<>(theatreResponse, HttpStatus.OK);
  }

  @GetMapping("city/{id}")
  public ResponseEntity<List<TheatreResponse>> fetchTheatresByCity(@PathVariable UUID cityId) {
    List<TheatreResponse> theatres = theatreService.fetchTheatreByCity(cityId);
    return new ResponseEntity<>(theatres, HttpStatus.OK);
  }

}
