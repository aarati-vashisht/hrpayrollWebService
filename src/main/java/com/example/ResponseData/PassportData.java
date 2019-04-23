package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "PassportDataMapping",
        classes = {
                @ConstructorResult(targetClass = PassportData.class, columns = {
                        @ColumnResult(name = "PassportId", type = Integer.class),
                        @ColumnResult(name = "PassportNumber", type = String.class),
                        @ColumnResult(name = "ExpiryDate", type = Date.class),
                        @ColumnResult(name = "UploadDocument", type = String.class),
                        @ColumnResult(name = "TimeDuration", type = Date.class)
                })
        })
@Entity

public class PassportData {
    @Id
    int PassportId;
    String PassportNumber;
    Date ExpiryDate;
    String UploadDocument;
    String TimeDuration;

    public PassportData(int passportId, String passportNumber, Date expiryDate, String uploadDocument, String timeDuration) {
        PassportId = passportId;
        PassportNumber = passportNumber;
        ExpiryDate = expiryDate;
        UploadDocument = uploadDocument;
        TimeDuration = timeDuration;
    }

    public int getPassportId() {
        return PassportId;
    }

    public void setPassportId(int passportId) {
        PassportId = passportId;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        PassportNumber = passportNumber;
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
