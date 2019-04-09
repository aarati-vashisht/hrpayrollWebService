package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "resultMapping",
        classes = {
                @ConstructorResult(targetClass = EmployeeBasicDetails.class, columns = {
                        @ColumnResult(name = "E_ID", type = Integer.class),
                        @ColumnResult(name = "E_Code", type = Integer.class),
                        @ColumnResult(name = "E_FristName", type = String.class),
                        @ColumnResult(name = "E_MiddleName", type = String.class),
                        @ColumnResult(name = "E_LastName", type = String.class),
                        @ColumnResult(name = "E_Designaton", type = Integer.class),
                        @ColumnResult(name = "E_Gender", type = String.class),
                        @ColumnResult(name = "E_Title", type = String.class),
                        @ColumnResult(name = "E_DOB", type = Date.class),
                        @ColumnResult(name = "E_Dept", type = String.class),
                        @ColumnResult(name = "E_MaritalStatus", type = String.class),
                        @ColumnResult(name = "Anniversary", type = String.class),
                        @ColumnResult(name = "E_Image", type = String.class),
                        @ColumnResult(name = "E_EmployementType", type = String.class),
                        @ColumnResult(name = "CreatedOn", type = Date.class),
                        @ColumnResult(name = "CreatedBy", type = String.class),
                        @ColumnResult(name = "UpdatedOn", type = Date.class),
                        @ColumnResult(name = "UpdatedBy", type = String.class),
                        @ColumnResult(name = "EmployeeIsActive", type = Boolean.class),
                        @ColumnResult(name = "EmployeeIsDeleted", type = Boolean.class)})
        })

@Entity
public class EmployeeBasicDetails {

        @Id
        @Column(name = "E_ID")
        int E_ID;
        @Column(name = "E_Code")
        int E_Code;
        @Column(name = "E_FristName")
        String E_FristName;
        @Column(name = "E_MiddleName")
        String E_MiddleName;
        @Column(name = "E_LastName")
        String E_LastName;
        @Column(name = "E_Designaton")
        int E_Designaton;
        @Column(name = "E_Gender")
        String E_Gender;
        @Column(name = "E_Title")
        String E_Title;
        @Column(name = "E_DOB")
        Date E_DOB;
        @Column(name = "E_Dept")
        String E_Dept;
        @Column(name = "E_MaritalStatus")
        String E_MaritalStatus;
        @Column(name = "Anniversary")
        String Anniversary;
        @Column(name = "E_Image")
        String E_Image;
        @Column(name = "E_EmployementType")
        String E_EmployementType;
        @Column(name = "CreatedOn")
        @Temporal(TemporalType.DATE)
        Date CreatedOn;
        @Column(name = "CreatedBy")
        String CreatedBy;
        @Column(name = "UpdatedOn")
        @Temporal(TemporalType.DATE)
        Date UpdatedOn;
        @Column(name = "UpdatedBy")
        String UpdatedBy;
        @Column(name = "EmployeeIsActive")
        Boolean EmployeeIsActive;
        @Column(name = "EmployeeIsDeleted")
        Boolean EmployeeIsDeleted;


    public EmployeeBasicDetails(Integer E_ID, Integer E_Code, String E_FristName, String E_MiddleName, String E_LastName, Integer E_Designaton, String E_Gender, String E_Title, Date E_DOB, String E_Dept, String E_MaritalStatus, String Anniversary, String E_Image, String E_EmployementType, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy, Boolean EmployeeIsActive, Boolean EmployeeIsDeleted)
    {
        this.E_ID = E_ID;
        this.E_Code = E_Code;
        this.E_FristName = E_FristName;
        this.E_MiddleName = E_MiddleName;
        this.E_LastName = E_LastName;
        this.E_Designaton = E_Designaton;
        this.E_Gender = E_Gender;
        this.E_Title = E_Title;
        this.E_DOB = E_DOB;
        this.E_Dept = E_Dept;
        this.E_MaritalStatus = E_MaritalStatus;
        this.Anniversary = Anniversary;
        this.E_Image = E_Image;
        this.E_EmployementType = E_EmployementType;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
        this.EmployeeIsActive = EmployeeIsActive;
        this.EmployeeIsDeleted = EmployeeIsDeleted;
    }

        public int getE_ID() {
            return E_ID;
        }

        public void setE_ID(int e_ID) {
            E_ID = e_ID;
        }

        public int getE_Code() {
            return E_Code;
        }

        public void setE_Code(int e_Code) {
            E_Code = e_Code;
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

        public int getE_Designaton() {
            return E_Designaton;
        }

        public void setE_Designaton(int e_Designaton) {
            E_Designaton = e_Designaton;
        }

        public String getE_Gender() {
            return E_Gender;
        }

        public void setE_Gender(String e_Gender) {
            E_Gender = e_Gender;
        }

        public String getE_Title() {
            return E_Title;
        }

        public void setE_Title(String e_Title) {
            E_Title = e_Title;
        }

    public Date getE_DOB() {
        return E_DOB;
    }

    public void setE_DOB(Date e_DOB) {
        E_DOB = e_DOB;
    }

    public String getE_Dept() {
            return E_Dept;
        }

        public void setE_Dept(String e_Dept) {
            E_Dept = e_Dept;
        }

        public String getE_MaritalStatus() {
            return E_MaritalStatus;
        }

        public void setE_MaritalStatus(String e_MaritalStatus) {
            E_MaritalStatus = e_MaritalStatus;
        }

        public String getAnniversary() {
            return Anniversary;
        }

        public void setAnniversary(String anniversary) {
            Anniversary = anniversary;
        }

        public String getE_Image() {
            return E_Image;
        }

        public void setE_Image(String e_Image) {
            E_Image = e_Image;
        }

        public String getE_EmployementType() {
            return E_EmployementType;
        }

        public void setE_EmployementType(String e_EmployementType) {
            E_EmployementType = e_EmployementType;
        }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date createdOn) {
        CreatedOn = createdOn;
    }

    public String getCreatedBy() {
            return CreatedBy;
        }

        public void setCreatedBy(String createdBy) {
            CreatedBy = createdBy;
        }

    public Date getUpdatedOn() {
        return UpdatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        UpdatedOn = updatedOn;
    }

    public String getUpdatedBy() {
            return UpdatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            UpdatedBy = updatedBy;
        }

    public Boolean getEmployeeIsActive() {
        return EmployeeIsActive;
    }

    public void setEmployeeIsActive(Boolean employeeIsActive) {
        EmployeeIsActive = employeeIsActive;
    }

    public Boolean getEmployeeIsDeleted() {
        return EmployeeIsDeleted;
    }

    public void setEmployeeIsDeleted(Boolean employeeIsDeleted) {
        EmployeeIsDeleted = employeeIsDeleted;
    }

}
