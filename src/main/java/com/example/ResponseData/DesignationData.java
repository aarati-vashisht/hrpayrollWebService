package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "designationMapping",
        classes = {
                @ConstructorResult(targetClass = DesignationData.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DesignationCode", type = String.class),
                        @ColumnResult(name = "DesignationName", type = String.class)

                })
        })
@Entity
public class DesignationData {

    @Id
    int ID;
    int DepartmentID;
    String Code;
    String Name;

    public DesignationData(int ID, int departmentID, String code, String name) {
        this.ID = ID;
        DepartmentID = departmentID;
        Code = code;
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
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
