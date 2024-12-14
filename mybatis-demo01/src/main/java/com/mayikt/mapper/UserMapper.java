package com.mayikt.mapper;

import com.mayikt.entity.MayiktUserEntity;

import java.util.List;

public interface UserMapper {
    //调用到UserMapper.getByUserId()方法是，会自动查找userMapper.xml文件中getByUserId语句
    //sql语句的id与方法名称保持一致，否则会报错；namespace与mapper接口的全类名保持一致（包名+接口名）
    List<MayiktUserEntity> getByUserId();
    List<MayiktUserEntity> getByUserAll();
}
