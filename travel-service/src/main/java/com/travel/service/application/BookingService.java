package com.travel.service.application;

import com.travel.service.adapter.out.persistence.BookingRepository;
import com.travel.service.domain.model.Booking;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository repo;

    public BookingService(BookingRepository repo) {
        this.repo = repo;
    }

    public void createBooking(Integer tripId, String name, String email, BigDecimal price) {
        repo.insertBooking(tripId, name, email, price);
    }

    public List<Booking> getAllBookings() {
        return repo.findAll();
    }
}
