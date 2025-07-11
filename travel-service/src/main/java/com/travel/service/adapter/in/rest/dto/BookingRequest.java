package com.travel.service.adapter.in.rest.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BookingRequest {
    private Integer tripId;
    private String userName;
    private String userEmail;
    private BigDecimal totalPrice;

    // Getters and Setters
}
