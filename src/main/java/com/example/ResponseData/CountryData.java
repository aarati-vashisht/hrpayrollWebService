package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "countryMapping",
        classes = {
                @ConstructorResult(targetClass = CountryData.class, columns = {
                        @ColumnResult(name = "CountryID", type = Integer.class),
                        @ColumnResult(name = "CountryName", type = String.class),
                        @ColumnResult(name = "CountryCode", type = String.class)

                })
                        })
@Entity
public class CountryData {

    @Id
    int CountryID;
    String  CountryName;
    String CountryCode;

    public CountryData(int CountryID, String CountryName, String CountryCode) {
        this .CountryID = CountryID;
        this.CountryName = CountryName;
        this.CountryCode = CountryCode;
    }

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

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }
}
