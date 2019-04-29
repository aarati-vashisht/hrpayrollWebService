package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "designationMapping",
        classes = {
                @ConstructorResult(targetClass = DesignationData.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DesignationCode", type = String.class),
                        @ColumnResult(name = "DesignationName", type = String.class),
                        @ColumnResult(name = "Description", type = String.class),

                })
        })
@Entity
public class DesignationData {

    @Id
    int ID;
    String Code;
    String Name;
    String Description;

    public DesignationData(int ID, String code, String name, String description) {
        this.ID = ID;
        Code = code;
        Name = name;
        Description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
