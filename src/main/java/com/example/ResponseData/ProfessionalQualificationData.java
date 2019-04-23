package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "ProQualificationMapping",
        classes = {
                @ConstructorResult(targetClass = ProfessionalQualificationData.class, columns = {
                        @ColumnResult(name = "qId", type = Integer.class),
                        @ColumnResult(name = "Institute", type = String.class),
                        @ColumnResult(name = "Course", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class)
                })
        })
@Entity
public class ProfessionalQualificationData {

    @Id
    int qId;
    String Institute;
    String Course;
    Date StartDate;
    Date EndDate;

    public ProfessionalQualificationData(int qId, String institute, String course, Date startDate, Date endDate) {
        this.qId = qId;
        Institute = institute;
        Course = course;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getInstitute() {
        return Institute;
    }

    public void setInstitute(String institute) {
        Institute = institute;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
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
}
