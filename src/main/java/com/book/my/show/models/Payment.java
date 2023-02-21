package com.book.my.show.models;

import com.book.my.show.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "payments")
public class Payment extends BaseModel {

  @Enumerated(EnumType.STRING)
  private PaymentStatus status;

  private UUID thirdPartyReferenceId;

}
