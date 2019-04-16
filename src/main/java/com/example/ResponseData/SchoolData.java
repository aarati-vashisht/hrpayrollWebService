package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "SchoolMapping",
        classes = {
                @ConstructorResult(targetClass = SchoolData.class, columns = {
                        @ColumnResult(name = "SchoolID", type = Integer.class),
                        @ColumnResult(name = "ClassName", type = String.class),
                        @ColumnResult(name = "BoardName", type = String.class),
                        @ColumnResult(name = "SchoolName", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "percentage", type = Float.class)

                })
        })
@Entity
public class SchoolData {

    @Id
    int SchoolID;
    String ClassName;
    String BoardName;
    String SchoolName;
    Date StartDate;
    Date EndDate;
    Float Percentage;

    public int getSchoolID() {
        return SchoolID;
    }

    public void setSchoolID(int schoolID) {
        SchoolID = schoolID;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getBoardName() {
        return BoardName;
    }

    public void setBoardName(String boardName) {
        BoardName = boardName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public Date getStartDate() {
        return (Date) StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public Float getPercentage() {
        return Percentage;
    }

    public void setPercentage(Float percentage) {
        Percentage = percentage;
    }

    public SchoolData(int schoolID, String className, String boardName, String schoolName, Date startDate, Date endDate, Float percentage) {
        SchoolID = schoolID;
        ClassName = className;
        BoardName = boardName;
        SchoolName = schoolName;
        StartDate = startDate;
        EndDate = endDate;
        Percentage = percentage;
    }

    public SchoolData() {
    }
}
