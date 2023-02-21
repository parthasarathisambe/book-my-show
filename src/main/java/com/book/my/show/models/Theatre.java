package com.book.my.show.models;

import com.book.my.show.enums.Company;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "theatres")
public class Theatre extends BaseModel {

  private String name;

  @OneToOne
  private Address address;

  @OneToMany(mappedBy = "theatre")
  private List<Auditorium> auditoriums;

  @Enumerated(EnumType.STRING)
  private Company company;

}
