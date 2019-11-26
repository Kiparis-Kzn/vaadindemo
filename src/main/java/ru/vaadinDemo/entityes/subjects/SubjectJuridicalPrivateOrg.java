package ru.vaadinDemo.entityes.subjects;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class SubjectJuridicalPrivateOrg extends SubjectJuridical {

    private String rtPart;
    private String moPart;
    private String rfPart;

    @Temporal(TemporalType.DATE)
    private Date fundUpdateDate;
    private String fund;

    public String getRtPart() {
        return rtPart;
    }

    public void setRtPart(String rtPart) {
        this.rtPart = rtPart;
    }

    public String getMoPart() {
        return moPart;
    }

    public void setMoPart(String moPart) {
        this.moPart = moPart;
    }

    public String getRfPart() {
        return rfPart;
    }

    public void setRfPart(String rfPart) {
        this.rfPart = rfPart;
    }

    public Date getFundUpdateDate() {
        return fundUpdateDate;
    }

    public void setFundUpdateDate(Date fundUpdateDate) {
        this.fundUpdateDate = fundUpdateDate;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }
}
