package com.book.my.show.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.book.my.show.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tickets")
public class Ticket extends BaseModel {

  // 1 Ticket : 1 Show
  // M Tickets : 1 Show
  @ManyToOne
  private Show show;

  // 1 Ticket : 1 Payment
  // 1 Ticket : M Payments
  @OneToMany
  private List<Payment> payments;

  private Double amount;

  // 1 Ticket : 1 ShowSeat
  // 1 Ticket : M ShowSeats
  @OneToMany
  private List<ShowSeat> showSeats;

  // 1 Ticket : 1 BookedBy
  // M Tickets : 1 BookedBy
  @ManyToOne
  private User bookedBy;

  private Date bookingTime;

  @Enumerated(EnumType.ORDINAL)
  private TicketStatus status;

}
