package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "CityDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = CityDropDown.class, columns = {
                        @ColumnResult(name = "CityId", type = Integer.class),
                        @ColumnResult(name = "CityName", type = String.class),
                })
        })
@Entity
public class CityDropDown {
    @Id
    int ID;
    String Name;

    public CityDropDown(int ID, String name) {
        this.ID = ID;
        Name = name;
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
}
