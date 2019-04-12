package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "PostGraduationDataMapping",
        classes = {
                @ConstructorResult(targetClass = PostGraduationData.class, columns = {
                        @ColumnResult(name = "PostGraduationID", type = Integer.class),
                        @ColumnResult(name = "Degree", type = String.class),
                        @ColumnResult(name = "Specialization", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "percentage", type = Float.class)
                })
        })
@Entity
public class PostGraduationData {

    @Id
    int PostGraduationID;
    String Degree;
    String Specialization;
    Date StartDate;
    Date EndDate;
    Float percentage;

    public PostGraduationData(int postGraduationID, String degree, String specialization, Date startDate, Date endDate, Float percentage) {
        PostGraduationID = postGraduationID;
        Degree = degree;
        Specialization = specialization;
        StartDate = startDate;
        EndDate = endDate;
        this.percentage = percentage;
    }

    public int getPostGraduationID() {
        return PostGraduationID;
    }

    public void setPostGraduationID(int postGraduationID) {
        PostGraduationID = postGraduationID;
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
