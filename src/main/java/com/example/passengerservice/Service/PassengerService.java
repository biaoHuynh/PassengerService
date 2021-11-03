package com.example.passengerservice.Service;

import com.example.passengerservice.Entity.Passenger;
import com.example.passengerservice.Repository.PassengerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;
    public Passenger savePassenger(Passenger passenger) {
        log.info("inside save passenger");
        return passengerRepository.save(passenger);
    }
    public Passenger findPassengerById(Long passengerId){
        log.info("inside find by id");
        return passengerRepository.findById(passengerId).get();
    }
}
