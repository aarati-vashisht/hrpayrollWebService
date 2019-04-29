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
    int Id;
    String Description;
    String LocationCode;
    String LocationName;

    public LocationData(int id, String description, String code, String name) {
        Id = id;
        Description = description;
        LocationCode = locationCode;
        LocationName = locationName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocationCode() {
        return LocationCode;
    }

    public void setLocationCode(String locationCode) {
        LocationCode = locationCode;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
