package com.course.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private Integer id;
    private String flightId;
    private String company;
    private String departureAirport;
    private String arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    private String model;
    private Integer isDelete;
    private List<Passenger> passengerList;
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightId='" + flightId + '\'' +
                ", company='" + company + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", model='" + model + '\'' +
                ",isDelete=" + isDelete  +
                '}'+ passengerList.toString()+
                '}';
    }
}
