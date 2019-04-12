package com.example.ResponseData;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@SqlResultSetMapping(
        name = "PostalCodeMapping",
        classes = {
                @ConstructorResult(targetClass = PostalCodeData.class, columns = {
                        @ColumnResult(name = "CountryID", type = Integer.class),
                        @ColumnResult(name = "CountryName", type = String.class),
                        @ColumnResult(name = "StateID", type = Integer.class),
                        @ColumnResult(name = "StateName", type = String.class),
                        @ColumnResult(name = "CityId", type = Integer.class),
                        @ColumnResult(name = "CityName", type = String.class),
                        @ColumnResult(name = "pID", type = Integer.class),
                        @ColumnResult(name = "postalCode", type = Integer.class),
                        @ColumnResult(name = "Description", type = String.class),

                })
        })
@Entity
public class PostalCodeData {


    @Id
    @Column(name = "CountryID")
    int CountryID;
    @Column(name = "CountryName")
    String CountryName;
    @Column(name = "StateID")
    int StateID;
    @Column(name = "StateName")
    String StateName;
    @Column(name = "CityID")
    int CityID;
    @Column(name = "CityName")
    String CityName;
    @Column(name = "pID")
    int pID;
    @Column(name = "postalCode")
    int postalCode;
    @Column(name = "Description")
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

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public PostalCodeData(int countryID, String countryName, int stateID, String stateName, int cityID, String cityName, int pID, int postalCode, String description) {
        CountryID = countryID;
        CountryName = countryName;
        StateID = stateID;
        StateName = stateName;
        CityID = cityID;
        CityName = cityName;
        this.pID = pID;
        this.postalCode = postalCode;
        Description = description;
    }
}
