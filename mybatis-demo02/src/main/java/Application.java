import com.course.entity.Flight;
import com.course.entity.Passenger;
import com.course.server.FightServer;
import com.course.server.PassengerServer;

import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FightServer fightServer = new FightServer();
        List<Flight> allPassenger = fightServer.findFlightAllPassenger();
        for (Flight flight : allPassenger) {
            System.out.println(flight);
        }

//        System.out.println(fightServer.getFlightList());
//        System.out.println(fightServer.getFlightById(18));
//        fightServer.insertFlignt(new Flight(null, "BJ-123", "中国南方航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.insertFlignt(new Flight(null, "BJ-124", "中国南方航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.updateFlight(new Flight(1, "DBJ-123", "四川航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.deleteFlight(18);
//        System.out.println(fightServer.getFlightById(18));
//        Flight flightTarget = new Flight();
//        flightTarget.setIsDelete(1);
//        System.out.println(fightServer.getFlightWithSomeParameter2(flightTarget));
//        PassengerServer passengerServer = new PassengerServer();
//        System.out.println(passengerServer.getPassengerList());
//        创建10个乘客
//        for (int i = 0; i < 2; i++) {
//            Passenger passenger = new Passenger(null, "王小红" + i, "女", "123456789", "123456789", i, null);
//            passengerServer.addPassenger(passenger);
//        }
//        List<Passenger> passengerAndFlight = passengerServer.findPassengerAndFlight();
//        for (Passenger passenger : passengerAndFlight){
//            System.out.println(passenger);
//        }
    }
}
