package com.genshinimpact;
import com.genshinimpact.service.CountryService;
public class Application {

    public static void main(String[] args) {
        CountryService countryService = new CountryService();
        System.out.println(countryService.getCountryByCountryId(6));
//        System.out.println(countryService.getCountryAllHero(3));

    }
}
