package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "BankDetailsMapping",
        classes = {
                @ConstructorResult(targetClass = BanksDetailsData.class, columns = {
                        @ColumnResult(name = "BId", type = Integer.class),
                        @ColumnResult(name = "AccountType", type = String.class),
                        @ColumnResult(name = "AccountHolderName", type = String.class),
                        @ColumnResult(name = "AccNumber", type = String.class),
                        @ColumnResult(name = "IFSC", type = String.class),
                        @ColumnResult(name = "BranchName", type = String.class),
                        @ColumnResult(name = "PrimaryType", type = String.class)
                })
        })
@Entity
public class BanksDetailsData {
    @Id
    int BId;
    String AccountType;
    String AccountHolderName;
    String AccountNumber;
    String IFSC;
    String BranchName;
    String PrimaryType;

    public BanksDetailsData(int BId, String accountType, String accountHolderName, String accountNumber, String IFSC, String branchName, String primaryType) {
        this.BId = BId;
        AccountType = accountType;
        AccountHolderName = accountHolderName;
        AccountNumber = accountNumber;
        this.IFSC = IFSC;
        BranchName = branchName;
        PrimaryType = primaryType;
    }

    public int getBId() {
        return BId;
    }

    public void setBId(int BId) {
        this.BId = BId;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getPrimaryType() {
        return PrimaryType;
    }

    public void setPrimaryType(String primaryType) {
        PrimaryType = primaryType;
    }
}
