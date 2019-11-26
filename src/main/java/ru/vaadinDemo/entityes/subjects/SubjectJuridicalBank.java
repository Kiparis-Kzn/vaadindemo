package ru.vaadinDemo.entityes.subjects;

import ru.vaadinDemo.entityes.attributes.AttributeBankDetail;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SubjectJuridicalBank extends SubjectJuridical {

    @OneToMany(mappedBy = "bankId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeBankDetail> attributeBankDetailList;

    @NotNull
    @Column(nullable = false)
    private String bik;

    private String korDeposit;

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public String getKorDeposit() {
        return korDeposit;
    }

    public void setKorDeposit(String korDeposit) {
        this.korDeposit = korDeposit;
    }

    public List<AttributeBankDetail> getAttributeBankDetailList() {
        return attributeBankDetailList;
    }

    public void setAttributeBankDetailList(List<AttributeBankDetail> attributeBankDetailList) {
        this.attributeBankDetailList = attributeBankDetailList;
    }
}
