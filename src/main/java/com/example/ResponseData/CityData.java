package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "CityMapping",
        classes = {
                @ConstructorResult(targetClass = CityData.class, columns = {
                        @ColumnResult(name = "CountryID", type = Integer.class),
                        @ColumnResult(name = "CountryName", type = String.class),
                        @ColumnResult(name = "StateID", type = Integer.class),
                        @ColumnResult(name = "StateName", type = String.class),
                        @ColumnResult(name = "CityId", type = Integer.class),
                        @ColumnResult(name = "CityName", type = String.class),
                        @ColumnResult(name = "Description", type = String.class),

                })
        })
@Entity
public class CityData {

    @Id
    int CountryID;
    String CountryName;
    int StateID;
    String StateName;
    int CityID;
    String CityName;
    String Description;

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public int getStateID() {
        return StateID;
    }

    public void setStateID(int stateID) {
        StateID = stateID;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int cityID) {
        CityID = cityID;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public CityData(int countryID, String countryName, int stateID, String stateName, int cityID, String cityName, String description) {
        CountryID = countryID;
        CountryName = countryName;
        StateID = stateID;
        StateName = stateName;
        CityID = cityID;
        CityName = cityName;
        Description = description;
    }
}
