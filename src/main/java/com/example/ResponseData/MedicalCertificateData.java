package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name ="MedicalDataMapping",
        classes = {
                @ConstructorResult(targetClass = MedicalCertificateData.class,columns = {
                        @ColumnResult(name="MedicalID",type = Integer.class),
                        @ColumnResult(name = "MCertificateNumber",type = String.class),
                        @ColumnResult(name = "ExpiryDate",type = Date.class),
                        @ColumnResult(name="UploadDocument",type = String.class),
                        @ColumnResult(name = "TimeDuration",type = String.class)
                })
        })
@Entity
public class MedicalCertificateData {
    @Id
    Integer MedicalID;
    String MCertificateNumber;
    Date ExpiryDate;
    String UploadDocument;
    String TimeDuration;

    public MedicalCertificateData(Integer medicalID, String MCertificateNumber, Date expiryDate, String uploadDocument, String timeDuration) {
        MedicalID = medicalID;
        this.MCertificateNumber = MCertificateNumber;
        ExpiryDate = expiryDate;
        UploadDocument = uploadDocument;
        TimeDuration = timeDuration;
    }

    public Integer getMedicalID() {
        return MedicalID;
    }

    public void setMedicalID(Integer medicalID) {
        MedicalID = medicalID;
    }

    public String getMCertificateNumber() {
        return MCertificateNumber;
    }

    public void setMCertificateNumber(String MCertificateNumber) {
        this.MCertificateNumber = MCertificateNumber;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getUploadDocument() {
        return UploadDocument;
    }

    public void setUploadDocument(String uploadDocument) {
        UploadDocument = uploadDocument;
    }

    public String getTimeDuration() {
        return TimeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        TimeDuration = timeDuration;
    }
}
