package com.course.mapper;

import com.course.entity.Passenger;

import java.util.List;

public interface PassengerImpl {
    List<Passenger> getPassengerList();
    int addPassenger(Passenger passenger);
    List<Passenger> findPassengerAndFlight();
}
