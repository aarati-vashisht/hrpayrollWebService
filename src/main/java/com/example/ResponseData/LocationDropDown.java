package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "locationDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = LocationDropDown.class, columns = {
                        @ColumnResult(name = "LocationID", type = Integer.class),
                        @ColumnResult(name = "LocationName", type = String.class),


                })
        })
@Entity
public class LocationDropDown {

    @Id
    int ID;
    String Name;

    public LocationDropDown(int ID, String name) {
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
