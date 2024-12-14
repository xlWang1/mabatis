package com.mayikt.test;
import com.mayikt.entity.MayiktUserEntity;
import com.mayikt.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //mybatis 配置文件
        String resource = "mybatis-config.xml";
        //1.解析mybatis.xml，得到数据库相关配置信息
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.创建SqlSession
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
//            List<Object> UserAll = sqlSession.selectList("getByUserAll", MayiktUserEntity.class);
//            System.out.println(UserAll);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<MayiktUserEntity> userId = userMapper.getByUserId();
            List<MayiktUserEntity> byUserAll = userMapper.getByUserAll();
            System.out.println(userId);
            System.out.println(byUserAll);

        }

    }
}
