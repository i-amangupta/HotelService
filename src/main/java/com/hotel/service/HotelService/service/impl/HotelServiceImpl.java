package com.hotel.service.HotelService.service.impl;

import com.hotel.service.HotelService.entiry.Hotel;
import com.hotel.service.HotelService.exception.ResourceNotFoundException;
import com.hotel.service.HotelService.repository.HotelRepository;
import com.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found: " + hotelId));
    }
}
