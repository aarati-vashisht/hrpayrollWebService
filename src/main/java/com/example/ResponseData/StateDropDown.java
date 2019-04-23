package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "StateDropDownMapping",
        classes = {
                @ConstructorResult(targetClass = StateDropDown.class, columns = {
                        @ColumnResult(name = "StateID", type = Integer.class),
                        @ColumnResult(name = "StateName", type = String.class),
                        })
        })
@Entity
public class StateDropDown {

    @Id
    int ID;
    String Name;

    public StateDropDown(int ID, String name) {
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
