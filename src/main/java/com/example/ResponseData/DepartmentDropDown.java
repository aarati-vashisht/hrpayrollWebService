package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "departmentDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = DepartmentDropDown.class, columns = {
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DepartmentName", type = String.class),


                })
        })
@Entity
public class DepartmentDropDown {

    @Id
    int ID;
    String Name;

    public DepartmentDropDown(int ID, String name) {
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
