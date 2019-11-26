package ru.vaadinDemo.entityes.subjects;

import ru.vaadinDemo.entityes.attributes.AttributeEmployee;
import ru.vaadinDemo.entityes.attributes.AttributePhysicalDocument;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class SubjectPhysical extends Subject {

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributePhysicalDocument> attributePhysicalDocumentList;

    @OneToMany(mappedBy = "subjectPhysicalId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeEmployee> attributeEmployeeList;

    @NotNull
    @Column(nullable = false)
    private String personName;

    @NotNull
    @Column(nullable = false)
    private String personLastname;

    private String personPatronymic;

    @Temporal(TemporalType.DATE)
    private Date personBirthdate;

    public List<AttributePhysicalDocument> getAttributePhysicalDocumentList() {
        return attributePhysicalDocumentList;
    }

    public void setAttributePhysicalDocumentList(List<AttributePhysicalDocument> attributePhysicalDocumentList) {
        this.attributePhysicalDocumentList = attributePhysicalDocumentList;
    }

    public List<AttributeEmployee> getAttributeEmployeeList() {
        return attributeEmployeeList;
    }

    public void setAttributeEmployeeList(List<AttributeEmployee> attributeEmployeeList) {
        this.attributeEmployeeList = attributeEmployeeList;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastname() {
        return personLastname;
    }

    public void setPersonLastname(String personLastname) {
        this.personLastname = personLastname;
    }

    public String getPersonPatronymic() {
        return personPatronymic;
    }

    public void setPersonPatronymic(String personPatronymic) {
        this.personPatronymic = personPatronymic;
    }

    public Date getPersonBirthdate() {
        return personBirthdate;
    }

    public void setPersonBirthdate(Date personBirthdate) {
        this.personBirthdate = personBirthdate;
    }
}
