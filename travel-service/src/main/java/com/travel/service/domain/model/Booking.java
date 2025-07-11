package com.travel.service.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity // ✅ Required for JPA
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tripId;
    private String userName;
    private String userEmail;
    private BigDecimal totalPrice;
    private LocalDateTime bookingDate;
}
