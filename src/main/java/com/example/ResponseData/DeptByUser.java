package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "getDeptByUserMapping",
        classes = {
                @ConstructorResult(targetClass = DeptByUser.class, columns = {
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DepartmentName", type = String.class),
                        @ColumnResult(name = "DepartmentCode", type = String.class),
                        @ColumnResult(name = "Description", type = String.class),
                        })
        })
@Entity
public class DeptByUser {

    @Id
    int DepartmentID;
    String DepartmentName;
    String DepartmentCode;
    String Description;

    public DeptByUser(int departmentID, String departmentName, String departmentCode, String description) {
        DepartmentID = departmentID;
        DepartmentName = departmentName;
        DepartmentCode = departmentCode;
        Description = description;
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

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
