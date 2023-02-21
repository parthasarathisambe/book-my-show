package com.book.my.show.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.book.my.show.enums.Company;

import lombok.Data;

@Entity
@Data
@Table(name = "theatres")
public class Theatre extends BaseModel {

  private String name;

  @OneToOne
  private Address address;

  // 1 Theatre : 1 Auditorium
  // 1 Theatre : M Auditoriums
  @OneToMany
  private List<Auditorium> auditoriums;

  @Enumerated(EnumType.ORDINAL)
  private Company company;
  
  // 1 Theatre : 1 City
  // M Theaters : 1 City
  @ManyToOne
  private City city;

}
