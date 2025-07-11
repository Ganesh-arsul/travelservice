package com.travel.service.adapter.out.persistence;

import com.travel.service.domain.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Procedure(procedureName = "insert_booking")
    void insertBooking(
        @Param("p_trip_id") Integer tripId,
        @Param("p_user_name") String userName,
        @Param("p_user_email") String userEmail,
        @Param("p_total_price") java.math.BigDecimal totalPrice
    );
}
