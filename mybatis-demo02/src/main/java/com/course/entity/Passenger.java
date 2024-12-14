package com.course.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    private Integer id;
    private String name;
    private String gender;
    private String phoneNumber;
    private String idCard;
    private Integer flightId;
    private Flight flight;
    @Override
    public String toString(){
        if (flight==null){
            return "Passenger{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", idCard='" + idCard + '\'' +
                    ", flightId=" + flightId +
                    ", flight=" + "{null}" +
                    '}';
        }
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", idCard='" + idCard + '\'' +
                ", flightId=" + flightId +
                ", flight=" + flight.toString() +
                '}';
    }
}
