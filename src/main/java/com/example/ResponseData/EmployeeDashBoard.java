package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "EmployeeDashBoardMapping",
        classes = {
                @ConstructorResult(targetClass = EmployeeDashBoard.class, columns = {
                        @ColumnResult(name = "E_ID", type = Integer.class),
                        @ColumnResult(name = "E_FristName", type = Integer.class),
                        @ColumnResult(name = "E_MiddleName", type = String.class),
                        @ColumnResult(name = "E_LastName", type = String.class),
                        @ColumnResult(name = "E_Image", type = String.class),
                        @ColumnResult(name = "LocationName", type = Integer.class),
                        @ColumnResult(name = "DepartmentName", type = String.class),
                        @ColumnResult(name = "DesignationName", type = String.class),
                        @ColumnResult(name = "Contact_No", type = Date.class),
                        @ColumnResult(name = "Email_ID", type = String.class)})
        })

@Entity
public class EmployeeDashBoard {

    @Id
    int E_ID;
    String E_FristName;
    String E_MiddleName;
    String E_LastName;
    String E_Image;
    String LocationName;
    String DepartmentName;
    String DesignationName;
    String Contact_No;
    String Email_ID;

    public EmployeeDashBoard(int e_ID, String e_FristName, String e_MiddleName, String e_LastName, String e_Image, String locationName, String departmentName, String designationName, String contact_No, String email_ID) {
        E_ID = e_ID;
        E_FristName = e_FristName;
        E_MiddleName = e_MiddleName;
        E_LastName = e_LastName;
        E_Image = e_Image;
        LocationName = locationName;
        DepartmentName = departmentName;
        DesignationName = designationName;
        Contact_No = contact_No;
        Email_ID = email_ID;
    }

    public int getE_ID() {
        return E_ID;
    }

    public void setE_ID(int e_ID) {
        E_ID = e_ID;
    }

    public String getE_FristName() {
        return E_FristName;
    }

    public void setE_FristName(String e_FristName) {
        E_FristName = e_FristName;
    }

    public String getE_MiddleName() {
        return E_MiddleName;
    }

    public void setE_MiddleName(String e_MiddleName) {
        E_MiddleName = e_MiddleName;
    }

    public String getE_LastName() {
        return E_LastName;
    }

    public void setE_LastName(String e_LastName) {
        E_LastName = e_LastName;
    }

    public String getE_Image() {
        return E_Image;
    }

    public void setE_Image(String e_Image) {
        E_Image = e_Image;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
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
}
