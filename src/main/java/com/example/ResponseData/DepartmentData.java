package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "DepartmentMapping",
        classes = {
                @ConstructorResult(targetClass = DepartmentData.class, columns = {
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "LocationID", type = Integer.class),
                        @ColumnResult(name = "DepartmentCode", type = String.class),
                        @ColumnResult(name = "DepartmentName", type = String.class)

                })
        })
@Entity
public class DepartmentData {


    @Id
    int ID;
    int LocationID;
    String Code;
    String Name;

    public DepartmentData(int ID, int locationID, String code, String name) {
        this.ID = ID;
        LocationID = locationID;
        Code = code;
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int locationID) {
        LocationID = locationID;
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
