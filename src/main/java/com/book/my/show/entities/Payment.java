package com.book.my.show.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.book.my.show.enums.PaymentStatus;

import lombok.Data;

@Entity
@Data
@Table(name = "payments")
public class Payment extends BaseModel {

  @Enumerated(EnumType.ORDINAL)
  private PaymentStatus status;

  private UUID thirdPartyReferenceId;

}
