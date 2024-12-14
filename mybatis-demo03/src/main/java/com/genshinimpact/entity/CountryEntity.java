package com.genshinimpact.entity;

import java.util.Collection;
import java.util.List;

public class CountryEntity {
    private Integer countryId;
    private String countryName;
    private List<HeroEntity> heroEntityList;

    public CountryEntity() {
    }

    public CountryEntity(Integer id, String countryName) {
        this.countryId = id;
        this.countryName = countryName;
    }



    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
                "id=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", heroList=" + heroEntityList +
                '}';
    }

    public int getHeroListSize() {
        return heroEntityList.size();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public List<HeroEntity> getHeroEntityList() {
        return heroEntityList;
    }

    public void setHeroEntityList(List<HeroEntity> heroEntityList) {
        this.heroEntityList = heroEntityList;
    }
}
