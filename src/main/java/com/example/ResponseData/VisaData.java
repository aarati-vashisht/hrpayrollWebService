package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name ="VisaDataMapping",
        classes = {
                @ConstructorResult(targetClass = VisaData.class,columns = {
                        @ColumnResult(name="VisaID",type = Integer.class),
                        @ColumnResult(name = "Country",type = String.class),
                        @ColumnResult(name = "ExpiryDate",type = Date.class),
                        @ColumnResult(name="UploadDocument",type = String.class),
                        @ColumnResult(name = "TimeDuration",type = String.class)
                })
        })
@Entity
public class VisaData {

    @Id
    Integer VisaID;
    String Country;
    Date ExpiryDate;
    String UploadDocument;
    String TimeDuration;

    public VisaData(Integer visaID, String country, Date expiryDate, String uploadDocument, String timeDuration) {
        VisaID = visaID;
        Country = country;
        ExpiryDate = expiryDate;
        UploadDocument = uploadDocument;
        TimeDuration = timeDuration;
    }

    public Integer getVisaID() {
        return VisaID;
    }

    public void setVisaID(Integer visaID) {
        VisaID = visaID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
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
