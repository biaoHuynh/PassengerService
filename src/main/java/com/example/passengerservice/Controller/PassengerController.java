package com.example.passengerservice.Controller;

import com.example.passengerservice.Entity.Passenger;
import com.example.passengerservice.Service.PassengerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
@Slf4j
public class PassengerController {
    @Autowired
    private PassengerService passengerService;


    @PostMapping("/")
    public Passenger savePassenger(@RequestBody Passenger passenger){
        log.info("inside savePassenger method if Passenger controller!");
        return passengerService.savePassenger(passenger);
    }

    @GetMapping("/{id}")
    public Passenger findPassengerById(@PathVariable("id") Long passengerId){
        log.info("inside findPassengerById method if Passenger controller!");
        return passengerService.findPassengerById(passengerId);
    }
}
