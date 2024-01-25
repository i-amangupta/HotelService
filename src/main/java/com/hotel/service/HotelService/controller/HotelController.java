package com.hotel.service.HotelService.controller;

import com.hotel.service.HotelService.entiry.Hotel;
import com.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/saveHotel")
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllUsers() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    @GetMapping("/getHotelById")
    public ResponseEntity<Hotel> getUser(@RequestParam String hotelId) {
        return ResponseEntity.ok(hotelService.getHotelById(hotelId));
    }
}
