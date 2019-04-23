package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "DesignationDataByMapping",
        classes = {
                @ConstructorResult(targetClass = DesignationDataByUser.class, columns = {
                        @ColumnResult(name = "DesignationID", type = Integer.class),
                        @ColumnResult(name = "DesignationName", type = String.class),
                        @ColumnResult(name = "DesignationCode", type = String.class),
                        @ColumnResult(name = "Description", type = String.class),
                        })
        })
@Entity
public class DesignationDataByUser {

    @Id
    int DesignationID;
    String DesignationName;
    String DesignationCode;
    String Description;

    public DesignationDataByUser(int designationID, String designationName, String designationCode, String description) {
        DesignationID = designationID;
        DesignationName = designationName;
        DesignationCode = designationCode;
        Description = description;
    }


    public int getDesignationID() {
        return DesignationID;
    }

    public void setDesignationID(int designationID) {
        DesignationID = designationID;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
    }

    public String getDesignationCode() {
        return DesignationCode;
    }

    public void setDesignationCode(String designationCode) {
        DesignationCode = designationCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
