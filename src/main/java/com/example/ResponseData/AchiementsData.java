package com.example.ResponseData;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "AchiementsDataMapping",
        classes = {
                @ConstructorResult(targetClass = AchiementsData.class, columns = {
                        @ColumnResult(name = "CId", type = Integer.class),
                        @ColumnResult(name = "CertificateName", type = String.class),
                        @ColumnResult(name = "StartDate", type = Date.class),
                        @ColumnResult(name = "EndDate", type = Date.class)
                })
        })
@Entity
public class AchiementsData {

    @Id
    int CId;
    String CertificateName;
    Date StartDate;
    Date EndDate;

    public AchiementsData(int CId, String certificateName, Date startDate, Date endDate) {
        this.CId = CId;
        CertificateName = certificateName;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
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
