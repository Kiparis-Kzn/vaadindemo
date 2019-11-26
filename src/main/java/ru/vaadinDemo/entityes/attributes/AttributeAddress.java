package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryAddressType;
import ru.vaadinDemo.entityes.dirs.FiasDirAddress;
import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;

@Entity
public class AttributeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeAddressId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @ManyToOne
    @JoinColumn(name = "addressTypeId")
    private DirectoryAddressType addressTypeId;

    @ManyToOne
    @JoinColumn(name = "addressId")
    private FiasDirAddress addressId;

    private String flatNum;
    private String building;
    private String note;

    public Long getAttributeAddressId() {
        return attributeAddressId;
    }

    public void setAttributeAddressId(Long attributeAddressId) {
        this.attributeAddressId = attributeAddressId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public DirectoryAddressType getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(DirectoryAddressType addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public FiasDirAddress getAddressId() {
        return addressId;
    }

    public void setAddressId(FiasDirAddress addressId) {
        this.addressId = addressId;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
