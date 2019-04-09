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
    @Column(name = "LocationID")
    int LocationID;

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int locationID) {
        LocationID = locationID;
    }

    public String getLocationDescription() {
        return LocationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        LocationDescription = locationDescription;
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

    @Column(name = "LocationDescription")
    String LocationDescription;

    @Column(name = "LocationCode")
    String LocationCode;
    @Column(name = "LocationName")
    String LocationName;

    public LocationData(int LocationID, String LocationDescription, String LocationCode, String LocationName) {
        this.LocationID = LocationID;
        this.LocationDescription = LocationDescription;
        this.LocationCode = LocationCode;
        this.LocationName = LocationName;
    }
}
