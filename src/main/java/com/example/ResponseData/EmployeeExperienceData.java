package com.example.ResponseData;

import org.hibernate.exception.DataException;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "EmployeeExperienceMapping",
        classes = {
                @ConstructorResult(targetClass = EmployeeExperienceData.class, columns = {
                        @ColumnResult(name = "id", type = Integer.class),
                        @ColumnResult(name = "CompanyName", type = String.class),
                        @ColumnResult(name = "Designation", type = String.class),
                        @ColumnResult(name = "Department", type = String.class),
                        @ColumnResult(name = "JoiningDate", type = Date.class),
                        @ColumnResult(name = "ExitDate", type = Date.class),
                        @ColumnResult(name = "Experience", type = Float.class),
                        @ColumnResult(name = "Location", type = String.class),
                })
        })
@Entity
public class EmployeeExperienceData {

    @Id
    int id;
    String CompanyName;
    String Designation;
    String Department;
    Date JoiningDate;
    Date ExitDate;
    Float Experience;
    String Location;

    public EmployeeExperienceData(int id, String companyName, String designation, String department, Date joiningDate, Date exitDate, Float experience, String location) {
        this.id = id;
        CompanyName = companyName;
        Designation = designation;
        Department = department;
        JoiningDate = joiningDate;
        ExitDate = exitDate;
        Experience = experience;
        Location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Date getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        JoiningDate = joiningDate;
    }

    public Date getExitDate() {
        return ExitDate;
    }

    public void setExitDate(Date exitDate) {
        ExitDate = exitDate;
    }

    public Float getExperience() {
        return Experience;
    }

    public void setExperience(Float experience) {
        Experience = experience;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
