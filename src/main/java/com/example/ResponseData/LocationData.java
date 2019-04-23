package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "locationMapping",
        classes = {
                @ConstructorResult(targetClass = LocationData.class, columns = {
                        @ColumnResult(name = "LocationID", type = Integer.class),
                        @ColumnResult(name = "LocationDescription", type = String.class),
                        @ColumnResult(name = "LocationCode", type = String.class),
                        @ColumnResult(name = "LocationName", type = String.class)
                })
        })
@Entity
public class LocationData {


    @Id
    int ID;
    String Description;
    String Code;
    String Name;

    public LocationData(int ID, String description, String code, String name) {
        this.ID = ID;
        Description = description;
        Code = code;
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
