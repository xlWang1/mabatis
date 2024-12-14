package com.course.mapper;

import com.course.entity.Flight;
import com.course.entity.Passenger;

import java.util.List;

public interface FlightImpl {
    List<Flight> getAllFlightList();
    Flight getFlightById(int id);
    int insertFlignt(Flight flight);
    int updateFlight(Flight flight);
    int deleteFlight(int id);
    List<Flight> getFlightWithSomeParameter(Flight flight);
    List<Flight> getFlightWithSomeParameter2(Flight flight);
    List<Flight> findFlightAllPassenger();
}
