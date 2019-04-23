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
                        @ColumnResult(name = "University", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "percentage", type = Float.class)
                })
        })
@Entity
public class PostGraduationData {

    @Id
    int postGraduationID;
    String Degree;
    String Specialization;
    String University;
    Date startDate;
    Date endDate;
    Float Percentage;

    public PostGraduationData(int postGraduationID, String degree, String specialization, String university, Date startDate, Date endDate, Float percentage) {
        this.postGraduationID = postGraduationID;
        Degree = degree;
        Specialization = specialization;
        University = university;
        this.startDate = startDate;
        this.endDate = endDate;
        Percentage = percentage;
    }

    public int getPostGraduationID() {
        return postGraduationID;
    }

    public void setPostGraduationID(int postGraduationID) {
        this.postGraduationID = postGraduationID;
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
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getPercentage() {
        return Percentage;
    }

    public void setPercentage(Float percentage) {
        Percentage = percentage;
    }
}
