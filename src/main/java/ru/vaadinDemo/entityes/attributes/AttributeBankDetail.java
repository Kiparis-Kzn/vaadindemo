package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.subjects.Subject;
import ru.vaadinDemo.entityes.subjects.SubjectJuridicalBank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributeBankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attriduteBankDetailId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @ManyToOne
    @JoinColumn(name = "bankId")
    private SubjectJuridicalBank bankId;

    @NotNull
    @Column(nullable = false)
    private String raschDeposit;

    private String ItsDepositNum;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Integer isMain;

    public Long getAttriduteBankDetailId() {
        return attriduteBankDetailId;
    }

    public void setAttriduteBankDetailId(Long attriduteBankDetailId) {
        this.attriduteBankDetailId = attriduteBankDetailId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public SubjectJuridicalBank getBankId() {
        return bankId;
    }

    public void setBankId(SubjectJuridicalBank bankId) {
        this.bankId = bankId;
    }

    public String getRaschDeposit() {
        return raschDeposit;
    }

    public void setRaschDeposit(String raschDeposit) {
        this.raschDeposit = raschDeposit;
    }

    public String getItsDepositNum() {
        return ItsDepositNum;
    }

    public void setItsDepositNum(String itsDepositNum) {
        ItsDepositNum = itsDepositNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }
}
