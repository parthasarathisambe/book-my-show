package com.book.my.show.models;

import com.book.my.show.enums.TicketStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "tickets")
public class Ticket extends BaseModel {

  private Show show;

  @OneToMany
  private List<Payment> payments;

  private Double amount;

  @OneToMany
  private List<ShowSeat> showSeats;

  private User bookedBy;

  private Date bookingTime;

  @Enumerated(EnumType.STRING)
  private TicketStatus status;

}
