package com.genshinimpact.mapperImpl;

import com.genshinimpact.entity.CountryEntity;

import java.util.List;

public interface CountryImpl {
    List<CountryEntity> getCountryByCountryId(int id);
    List<CountryEntity> getCountryAllHero(int id);
}
