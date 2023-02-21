package com.book.my.show.models;

import java.util.List;
import java.util.UUID;

import com.book.my.show.entities.Address;
import com.book.my.show.enums.Company;

import lombok.Data;

@Data
public class TheatreRequest {

  private String name;

  private Address address;

  private List<AuditoriumRequest> auditoriums;

  private Company company;

  private UUID cityId;

}
