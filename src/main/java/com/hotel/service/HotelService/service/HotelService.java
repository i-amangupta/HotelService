package com.hotel.service.HotelService.service;

import com.hotel.service.HotelService.entiry.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotelById(String hotelId);
}
