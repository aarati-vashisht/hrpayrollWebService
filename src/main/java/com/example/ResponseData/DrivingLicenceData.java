package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name ="DLDataMapping",
        classes = {
                @ConstructorResult(targetClass = DrivingLicenceData.class,columns = {
                        @ColumnResult(name="DLID",type = Integer.class),
                        @ColumnResult(name = "DLNumber",type = String.class),
                        @ColumnResult(name = "ExpiryDate",type = Date.class),
                        @ColumnResult(name="UploadDocument",type = String.class),
                        @ColumnResult(name = "TimeDuration",type = String.class)
                })
        })
@Entity
public class DrivingLicenceData {
    @Id
    Integer DLID;
    String DLNumber;
    Date ExpiryDate;
    String UploadDocument;
    String TimeDuration;

    public DrivingLicenceData(Integer DLID, String DLNumber, Date expiryDate, String uploadDocument, String timeDuration) {
        this.DLID = DLID;
        this.DLNumber = DLNumber;
        ExpiryDate = expiryDate;
        UploadDocument = uploadDocument;
        TimeDuration = timeDuration;
    }

    public Integer getDLID() {
        return DLID;
    }

    public void setDLID(Integer DLID) {
        this.DLID = DLID;
    }

    public String getDLNumber() {
        return DLNumber;
    }

    public void setDLNumber(String DLNumber) {
        this.DLNumber = DLNumber;
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
