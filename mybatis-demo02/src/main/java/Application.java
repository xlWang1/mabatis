import com.course.entity.Flight;
import com.course.server.FightServer;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        FightServer fightServer = new FightServer();
//        System.out.println(fightServer.getFlightList());
//        System.out.println(fightServer.getFlightById(18));
//        fightServer.insertFlignt(new Flight(null, "BJ-123", "中国南方航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.insertFlignt(new Flight(null, "BJ-124", "中国南方航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.updateFlight(new Flight(1, "DBJ-123", "四川航空公司", "北京", "上海", new Date(), new Date(), "B737", 0));
//        fightServer.deleteFlight(18);
//        System.out.println(fightServer.getFlightById(18));
        Flight flightTarget = new Flight();
        flightTarget.setIsDelete(1);
        System.out.println(fightServer.getFlightWithSomeParameter2(flightTarget));
    }
}
