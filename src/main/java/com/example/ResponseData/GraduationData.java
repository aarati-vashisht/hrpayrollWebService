package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "graduationDataMapping",
        classes = {
                @ConstructorResult(targetClass = GraduationData.class, columns = {
                        @ColumnResult(name = "GraduationId", type = Integer.class),
                        @ColumnResult(name = "Degree", type = String.class),
                        @ColumnResult(name = "Specialization", type = String.class),
                        @ColumnResult(name = "University", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "percentage", type = Float.class)

                })
        })
@Entity
public class GraduationData {

    @Id
    int GraduationId;
    String Degree;
    String Specialization;
    String University;
    Date StartDate;
    Date EndDate;
    Float percentage;

    public GraduationData(int graduationId, String degree, String specialization, String university, Date startDate, Date endDate, Float percentage) {
        GraduationId = graduationId;
        Degree = degree;
        Specialization = specialization;
        University = university;
        StartDate = startDate;
        EndDate = endDate;
        this.percentage = percentage;
    }

    public int getGraduationId() {
        return GraduationId;
    }

    public void setGraduationId(int graduationId) {
        GraduationId = graduationId;
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
