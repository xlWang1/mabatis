package com.genshinimpact.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeroEntity {
    private Integer heroId;
    //name
    private String heroName;
    //gender
    private String gender;
    //weapon
    private String weapon;
    //age
    private Integer age;
    //skillE
    private String skillE;
    //skillQ
    private String skillQ;
    //countryId
    private Integer countryId;
    private CountryEntity country;
    @Override
    public String toString()
    {
        if (country!=null){
            return "HeroEntity{" +
                    "heroId=" + heroId +
                    ", heroName='" + heroName + '\'' +
                    ", gender='" + gender + '\'' +
                    ", weapon='" + weapon + '\'' +
                    ", age=" + age +
                    ", skillE='" + skillE + '\'' +
                    ", skillQ='" + skillQ + '\'' +
                    ", countryId=" + countryId +
                    ", country=" + country.getCountryName() +
                    '}';
        }
        return "HeroEntity{" +
                "heroId=" + heroId +
                ", heroName='" + heroName + '\'' +
                ", gender='" + gender + '\'' +
                ", weapon='" + weapon + '\'' +
                ", age=" + age +
                ", skillE='" + skillE + '\'' +
                ", skillQ='" + skillQ + '\'' +
                ", countryId=" + countryId +
                '}';
    }

}
