package com.example;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "designationMapping",
        classes = {
                @ConstructorResult(targetClass = com.example.DesignationData.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DepartmentID", type = Integer.class),
                        @ColumnResult(name = "DesignationCode", type = String.class),
                        @ColumnResult(name = "DesignationName", type = String.class)

                })
        })
@Entity
public class DesignationData {


    @Id
    @Column(name = "DesignationID")
    int DesignationID;
    @Column(name = "DepartmentID")
    int DepartmentID;

    public int getDesignationID() {
        return DesignationID;
    }

    public void setDesignationID(int designationID) {
        DesignationID = designationID;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public String getDesignationCode() {
        return DesignationCode;
    }

    public void setDesignationCode(String designationCode) {
        DesignationCode = designationCode;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
    }

    @Column(name = "DesignationCode")
    String DesignationCode;
    @Column(name = "DesignationName")
    String DesignationName;

    public DesignationData(int DesignationID, int DepartmentID, String DesignationCode, String DesignationName) {
        this.DesignationID = DesignationID;
        this.DepartmentID = DepartmentID;
        this.DesignationCode = DesignationCode;
        this.DesignationName = DesignationName;
    }
}
