package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryContactType;
import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class AttributeContacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeContactId;

    @ManyToOne
    @JoinColumn(name = "contactTypeId")
    private DirectoryContactType contactTypeId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @NotNull
    @Column(nullable = false)
    private String value;

    private String note;

    public Long getAttributeContactId() {
        return attributeContactId;
    }

    public void setAttributeContactId(Long attributeContactId) {
        this.attributeContactId = attributeContactId;
    }

    public DirectoryContactType getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(DirectoryContactType contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
