package ru.vaadinDemo.entityes.subjects;

import ru.vaadinDemo.entityes.attributes.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subjectId;

    @OneToMany(mappedBy = "mainOrgId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeBankDetail> attributeBankDetailList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeAddress> attributeAddressList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeJuridicDocument> attributeJuridicDocumentList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeOkved> attributeOkvedList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeContacts> attributeContactsList;

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeLawMode> attributeLawModeList;

    @NotNull
    @Column(nullable = false)
    private String fullName;
    private String inn;

    @ManyToOne
    @JoinColumn(name = "subjectTypeId")
    private Subject subjectTypeId;

    @NotNull
    @Column(nullable = false)
    private String registryNum;

    private String note;

    @NotNull
    @Column(nullable = false)
    private Date startDate;

    @NotNull
    @Column(nullable = false)
    private Date endDate;

    private Integer isActive;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public List<AttributeBankDetail> getAttributeBankDetailList() {
        return attributeBankDetailList;
    }

    public void setAttributeBankDetailList(List<AttributeBankDetail> attributeBankDetailList) {
        this.attributeBankDetailList = attributeBankDetailList;
    }

    public List<AttributeAddress> getAttributeAddressList() {
        return attributeAddressList;
    }

    public void setAttributeAddressList(List<AttributeAddress> attributeAddressList) {
        this.attributeAddressList = attributeAddressList;
    }

    public List<AttributeJuridicDocument> getAttributeJuridicDocumentList() {
        return attributeJuridicDocumentList;
    }

    public void setAttributeJuridicDocumentList(List<AttributeJuridicDocument> attributeJuridicDocumentList) {
        this.attributeJuridicDocumentList = attributeJuridicDocumentList;
    }

    public List<AttributeOkved> getAttributeOkvedList() {
        return attributeOkvedList;
    }

    public void setAttributeOkvedList(List<AttributeOkved> attributeOkvedList) {
        this.attributeOkvedList = attributeOkvedList;
    }

    public List<AttributeContacts> getAttributeContactsList() {
        return attributeContactsList;
    }

    public void setAttributeContactsList(List<AttributeContacts> attributeContactsList) {
        this.attributeContactsList = attributeContactsList;
    }

    public List<AttributeLawMode> getAttributeLawModeList() {
        return attributeLawModeList;
    }

    public void setAttributeLawModeList(List<AttributeLawMode> attributeLawModeList) {
        this.attributeLawModeList = attributeLawModeList;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Subject getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Subject subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public String getRegistryNum() {
        return registryNum;
    }

    public void setRegistryNum(String registryNum) {
        this.registryNum = registryNum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
