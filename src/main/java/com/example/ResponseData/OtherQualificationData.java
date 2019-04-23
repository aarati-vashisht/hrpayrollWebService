package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "OtherQualificationMapping",
        classes = {
                @ConstructorResult(targetClass = OtherQualificationData.class, columns = {
                        @ColumnResult(name = "otherEduQualificationTableID", type = Integer.class),
                        @ColumnResult(name = "Degree", type = String.class),
                        @ColumnResult(name = "Specialization", type = String.class),
                        @ColumnResult(name = "University", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "percentage", type = Float.class)

                })
        })
@Entity
public class OtherQualificationData {

    @Id
    int otherEduQualificationTableID;
    String Degree;
    String Specialization;
    String University;
    Date StartDate;
    Date EndDate;
    Float percentage;

    public OtherQualificationData(int otherEduQualificationTableID, String degree, String specialization, String university, Date startDate, Date endDate, Float percentage) {
        this.otherEduQualificationTableID = otherEduQualificationTableID;
        Degree = degree;
        Specialization = specialization;
        University = university;
        StartDate = startDate;
        EndDate = endDate;
        this.percentage = percentage;
    }

    public int getOtherEduQualificationTableID() {
        return otherEduQualificationTableID;
    }

    public void setOtherEduQualificationTableID(int otherEduQualificationTableID) {
        this.otherEduQualificationTableID = otherEduQualificationTableID;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public Date getStartDate() {
        return StartDate;
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
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
