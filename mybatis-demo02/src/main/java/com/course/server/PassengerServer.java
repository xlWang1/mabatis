package com.course.server;

import com.course.entity.Passenger;
import com.course.mapper.PassengerImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class PassengerServer {
    public static SqlSession sqlSession;
    PassengerImpl mapper;
    public PassengerServer()
    {
        init();
    }
    private void init()
    {
        try{
            InputStream resourceAsStream = PassengerServer.class.getClassLoader().getResourceAsStream("mybatis-config2.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession();
            mapper = sqlSession.getMapper(PassengerImpl.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Passenger> getPassengerList()
    {
        return mapper.getPassengerList();
    }
    public int addPassenger(Passenger passenger)
    {
        int i = mapper.addPassenger(passenger);
        sqlSession.commit();
        return i;
    }
    public List<Passenger> findPassengerAndFlight()
    {
        return mapper.findPassengerAndFlight();
    }

}
