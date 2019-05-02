package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "DesignationDataByMapping",
        classes = {
                @ConstructorResult(targetClass = DesignationDataByUser.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DesignationName", type = String.class),
                        @ColumnResult(name = "DesignationCode", type = String.class),
                        @ColumnResult(name = "Description", type = String.class),
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DepartmentName", type = String.class),
                        @ColumnResult(name = "LocationId", type = Integer.class),
                        @ColumnResult(name = "LocationName", type = String.class),


                })
        })
@Entity
public class DesignationDataByUser {

    @Id
    int DesignationId;
    String DesignationName;
    int DepartmentID;
    String DepartmentName;
    String DesignationCode;
    String Description;
    int LocationId;
    String LocationName;


    public DesignationDataByUser(int designationId, String designationName, int departmentID, String departmentName, String designationCode, String description, int locationId, String locationName) {
        DesignationId = designationId;
        DesignationName = designationName;
        DepartmentID = departmentID;
        DepartmentName = departmentName;
        DesignationCode = designationCode;
        Description = description;
        LocationId = locationId;
        LocationName = locationName;
    }

    public int getDesignationId() {
        return DesignationId;
    }

    public void setDesignationId(int designationId) {
        DesignationId = designationId;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDesignationCode() {
        return DesignationCode;
    }

    public void setDesignationCode(String designationCode) {
        DesignationCode = designationCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
