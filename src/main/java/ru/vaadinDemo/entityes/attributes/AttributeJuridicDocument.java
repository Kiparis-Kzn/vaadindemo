package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryJuridicDocType;
import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributeJuridicDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attriduteDocumentId;

    @ManyToOne
    @JoinColumn(name = "juridicDocumentTypeId")
    private DirectoryJuridicDocType juridicDocumentTypeId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @NotNull
    @Column(nullable = false)
    private String approveDoc;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private String note;

    public Long getAttriduteDocumentId() {
        return attriduteDocumentId;
    }

    public void setAttriduteDocumentId(Long attriduteDocumentId) {
        this.attriduteDocumentId = attriduteDocumentId;
    }

    public DirectoryJuridicDocType getJuridicDocumentTypeId() {
        return juridicDocumentTypeId;
    }

    public void setJuridicDocumentTypeId(DirectoryJuridicDocType juridicDocumentTypeId) {
        this.juridicDocumentTypeId = juridicDocumentTypeId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public String getApproveDoc() {
        return approveDoc;
    }

    public void setApproveDoc(String approveDoc) {
        this.approveDoc = approveDoc;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
