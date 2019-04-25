package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "EducationalCertificateDataMapping",
        classes = {
                @ConstructorResult(targetClass = EducationalCertificateData.class, columns = {
                        @ColumnResult(name = "EducationalId", type = Integer.class),
                        @ColumnResult(name = "Degree", type = String.class),
                        @ColumnResult(name = "University", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class),
                        @ColumnResult(name = "UploadDocument", type = String.class)

                })
        })
@Entity
public class EducationalCertificateData {

    @Id
    int EducationalId;
    String Degree;
    String University;
    Date StartDate;
    Date EndDate;
    String UploadDocument;

    public EducationalCertificateData(int educationalId, String degree, String university, Date startDate, Date endDate, String uploadDocument) {
        EducationalId = educationalId;
        Degree = degree;
        University = university;
        StartDate = startDate;
        EndDate = endDate;
        UploadDocument = uploadDocument;
    }

    public int getEducationalId() {
        return EducationalId;
    }

    public void setEducationalId(int educationalId) {
        EducationalId = educationalId;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
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

    public String getUploadDocument() {
        return UploadDocument;
    }

    public void setUploadDocument(String uploadDocument) {
        UploadDocument = uploadDocument;
    }
}
