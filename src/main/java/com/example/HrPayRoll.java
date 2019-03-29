package com.example;

import javax.persistence.*;
import java.time.DateTimeException;

@Entity
@Table(name = "statetable")
public class HrPayRoll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StateID")
    private int StateID;
    @Column(name = "StateName")
    private String StateName;
    @Column(name = "CreatedBy")
    private String CreatedBy;
    @Column(name = "UpdatedBy")
    private  String UpdatedBy;
    @Column(name = "CountryID")
    private int CountryID;

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

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        UpdatedBy = updatedBy;
    }

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }


}
