package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "StateMapping",
        classes = {
                @ConstructorResult(targetClass = StateData.class, columns = {
                        @ColumnResult(name = "CountryID", type = Integer.class),
                        @ColumnResult(name = "StateID", type = Integer.class),
                        @ColumnResult(name = "StateName", type = String.class),
                        @ColumnResult(name = "Description", type = String.class)
                })
        })

public class StateData {

    @Id
    @Column(name = "CountryID")
    int CountryID;
    @Column(name = "StateID")
    int StateID;
    @Column(name = "StateName")
    String StateName;
    @Column(name = "Description")
    String Description;

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }

    public int getStateID() {
        return StateID;
    }

    public void setStateID(int stateID) {
        StateID = stateID;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public StateData(int CountryID, int StateID, String StateName, String Description) {
        this.CountryID = CountryID;
        this.StateID = StateID;
        this.StateName = StateName;
        this.Description = Description;
    }
}
