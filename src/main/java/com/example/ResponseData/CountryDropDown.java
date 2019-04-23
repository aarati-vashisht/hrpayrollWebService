package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "countryDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = CountryDropDown.class, columns = {
                        @ColumnResult(name = "CountryID", type = Integer.class),
                        @ColumnResult(name = "CountryName", type = String.class),
                        @ColumnResult(name = "CountryCode", type = String.class)

                })
        })
@Entity
public class CountryDropDown {
    @Id
    int ID;
    String Name;
    String Code;

    public CountryDropDown(int ID, String name, String code) {
        this.ID = ID;
        Name = name;
        Code = code;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
