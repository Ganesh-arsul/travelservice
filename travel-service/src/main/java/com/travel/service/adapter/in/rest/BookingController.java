package com.travel.service.adapter.in.rest;

import com.travel.service.application.BookingService;
import com.travel.service.domain.model.Booking;
import com.travel.service.adapter.in.rest.dto.BookingRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    public String createBooking(@RequestBody BookingRequest request) {
        bookingService.createBooking(
            request.getTripId(),
            request.getUserName(),
            request.getUserEmail(),
            request.getTotalPrice()
        );
        return "Booking saved via stored procedure!";
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}
