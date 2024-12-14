package com.genshinimpact.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.genshinimpact.entity.CountryEntity;
import com.genshinimpact.mapperImpl.CountryImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountryService {
    private static SqlSession sqlSession;
    CountryImpl mapper;
    public CountryService() {
        init();
    }

    private void init() {
        try(InputStream resourceAsStream = CountryService.class.getClassLoader().getResourceAsStream("mybatis.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession();
            mapper = sqlSession.getMapper(CountryImpl.class);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public JSONObject getCountryByCountryId(int id){
        return assembleObject(mapper.getCountryByCountryId(id));
    }
    public JSONObject getCountryAllHero(int id){
        return assembleObject(mapper.getCountryAllHero(id));
    }
    private JSONObject assembleObject(List<CountryEntity> countryEntityList){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","success");
        jsonObject.put("total",countryEntityList.size());
        List<JSONObject> countries = new ArrayList<>();
        for (CountryEntity countryEntity : countryEntityList){
            JSONObject country = new JSONObject();
            country.put("countryId",countryEntity.getCountryId());
            country.put("countryName",countryEntity.getCountryName());
            if (countryEntity.getHeroEntityList()!= null) {
                if (countryEntity.getHeroEntityList().get(0).getHeroId() != null){
                    country.put("heroes",countryEntity.getHeroEntityList());
                }else {
                    country.put("heroes",new JSONArray());
                }
            }
            countries.add(country);
        }
        jsonObject.put("countries",countries);
        return jsonObject;
    }

}
