package com.book.my.show.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import com.book.my.show.entities.Seat;
import com.book.my.show.entities.Show;
import com.book.my.show.enums.Feature;

import lombok.Data;

@Data
public class AuditoriumRequest {

  private String name;

  private List<Feature> features;

  private List<SeatRequest> seats;

}
