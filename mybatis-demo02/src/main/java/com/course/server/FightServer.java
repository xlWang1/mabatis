package com.course.server;
import com.course.entity.Flight;
import com.course.entity.Passenger;
import com.course.mapper.FlightImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;


public class FightServer {
    private SqlSession sqlSession;
    FlightImpl mapper;
    public FightServer() {
        initFlightList();
    }
    private void initFlightList(){
        try(InputStream resourceAsStream = FightServer.class.getClassLoader().getResourceAsStream("mybatis-config2.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            try{
                sqlSession = sqlSessionFactory.openSession();
                mapper = sqlSession.getMapper(FlightImpl.class);

            }catch (Exception e){
                sqlSession.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Flight> getFlightList() {
        return mapper.getAllFlightList();
    }
    public Flight getFlightById(Integer findId) {
        return mapper.getFlightById(findId);
    }
    public int insertFlignt(Flight flight) {
        int i = mapper.insertFlignt(flight);
        sqlSession.commit();
        return i;
    }
    public int updateFlight(Flight flight) {
        int i = mapper.updateFlight(flight);
        sqlSession.commit();
        return i;
    }
    public int deleteFlight(Integer id) {
        int i = mapper.deleteFlight(id);
        sqlSession.commit();
        return i;
    }
    public List<Flight> getFlightWithSomeParameter(Flight flight) {
        return mapper.getFlightWithSomeParameter(flight);
    }
    public List<Flight> getFlightWithSomeParameter2(Flight flight) {
        return mapper.getFlightWithSomeParameter2(flight);
    }
    public List<Flight> findFlightAllPassenger() {
        return mapper.findFlightAllPassenger();
    }
}
