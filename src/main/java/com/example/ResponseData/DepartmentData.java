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
    @Column(name = "DepartmentID")
    int DepartmentID;

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int locationID) {
        LocationID = locationID;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Column(name = "LocationID")
    int LocationID;
    @Column(name = "DepartmentCode")
    String DepartmentCode;
    @Column(name = "DepartmentName")
    String DepartmentName;

    public DepartmentData(int DepartmentID, int LocationID, String DepartmentCode, String DepartmentName) {
        this.DepartmentID = DepartmentID;
        this.LocationID = LocationID;
        this.DepartmentCode = DepartmentCode;
        this.DepartmentName = DepartmentName;
    }
}
