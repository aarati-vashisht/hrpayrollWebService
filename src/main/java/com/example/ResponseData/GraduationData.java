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
    String degree;
    String specialization;
    String university;
    Date startdate;
    Date enddate;
    Float percentage;

    public GraduationData(int graduationId, String degree, String specialization, String university, Date startdate, Date enddate, Float percentage) {
        GraduationId = graduationId;
        this.degree = degree;
        this.specialization = specialization;
        this.university = university;
        this.startdate = startdate;
        this.enddate = enddate;
        this.percentage = percentage;
    }

    public int getGraduationId() {
        return GraduationId;
    }

    public void setGraduationId(int graduationId) {
        GraduationId = graduationId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
