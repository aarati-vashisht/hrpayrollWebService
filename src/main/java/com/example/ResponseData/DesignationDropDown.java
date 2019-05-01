package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "designationDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = DesignationDropDown.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DesignationName", type = String.class),


                })
        })
@Entity
public class DesignationDropDown {

    @Id
    int ID;
    String Name;

    public DesignationDropDown(int ID, String name) {
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
