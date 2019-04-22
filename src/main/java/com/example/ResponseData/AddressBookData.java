package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "AddressBookMapping",
        classes = {
                @ConstructorResult(targetClass = AddressBookData.class, columns = {
                        @ColumnResult(name = "id", type = Integer.class),
                        @ColumnResult(name = "Address", type = String.class),
                        @ColumnResult(name = "City", type = String.class),
                        @ColumnResult(name = "State", type = String.class),
                        @ColumnResult(name = "Country", type = String.class),
                        @ColumnResult(name = "Pin_code", type = String.class),
                        @ColumnResult(name = "Address_Status", type = String.class),
                        @ColumnResult(name = "Contact_No", type = String.class),
                        @ColumnResult(name = "Email_ID", type = String.class),
                        @ColumnResult(name = "Emergency_contact_person", type = String.class),
                        @ColumnResult(name = "Emergency_contact_number", type = String.class),
                        @ColumnResult(name = "eid", type = Integer.class),
                       })
        })
@Entity
public class AddressBookData {

    @Id
    int id;
    String Addresss;
    String City;
    String State;
    String Country;
    String Pin_code;
    String Address_Status;
    String Contact_No;
    String Email_ID;
    String Emergency_contact_person;
    String Emergency_contact_number;
    int eid;

    public AddressBookData(int id, String address, String city, String state, String country, String pin_code, String address_Status, String contact_No, String email_ID, String emergency_contact_person, String emergency_contact_number, int eid) {
        this.id = id;
        Addresss = address;
        City = city;
        State = state;
        Country = country;
        Pin_code = pin_code;
        Address_Status = address_Status;
        Contact_No = contact_No;
        Email_ID = email_ID;
        Emergency_contact_person = emergency_contact_person;
        Emergency_contact_number = emergency_contact_number;
        this.eid = eid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return Addresss;
    }

    public void setAddress(String address) {
        Addresss = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPin_code() {
        return Pin_code;
    }

    public void setPin_code(String pin_code) {
        Pin_code = pin_code;
    }

    public String getAddress_Status() {
        return Address_Status;
    }

    public void setAddress_Status(String address_Status) {
        Address_Status = address_Status;
    }

    public String getContact_No() {
        return Contact_No;
    }

    public void setContact_No(String contact_No) {
        Contact_No = contact_No;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String email_ID) {
        Email_ID = email_ID;
    }

    public String getEmergency_contact_person() {
        return Emergency_contact_person;
    }

    public void setEmergency_contact_person(String emergency_contact_person) {
        Emergency_contact_person = emergency_contact_person;
    }

    public String getEmergency_contact_number() {
        return Emergency_contact_number;
    }

    public void setEmergency_contact_number(String emergency_contact_number) {
        Emergency_contact_number = emergency_contact_number;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
}
