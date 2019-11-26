package ru.vaadinDemo.entityes.subjects;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class SubjectJuridicalUnitaryOrg extends SubjectJuridical {

    private String fund;

    @Temporal(TemporalType.DATE)
    private Date fundUpdateDate;

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public Date getFundUpdateDate() {
        return fundUpdateDate;
    }

    public void setFundUpdateDate(Date fundUpdateDate) {
        this.fundUpdateDate = fundUpdateDate;
    }
}
