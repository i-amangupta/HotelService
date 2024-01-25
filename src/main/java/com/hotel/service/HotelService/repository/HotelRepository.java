package com.hotel.service.HotelService.repository;

import com.hotel.service.HotelService.entiry.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
}
