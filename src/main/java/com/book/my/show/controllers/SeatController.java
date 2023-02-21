package com.book.my.show.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.my.show.services.SeatService;

@RestController
@RequestMapping("/bookmyshow/seat/")
public class SeatController {
  
  SeatService seatService;
  
  @Autowired
  public SeatController(SeatService seatService) {
    this.seatService = seatService;
  }

}
