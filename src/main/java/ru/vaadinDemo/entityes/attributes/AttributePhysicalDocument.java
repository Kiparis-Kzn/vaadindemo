package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryPhysicalDocType;
import ru.vaadinDemo.entityes.subjects.SubjectPhysical;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributePhysicalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributePhysicalDocumentId;

    @ManyToOne
    @JoinColumn(name = "physicalDocumentTypeId")
    private DirectoryPhysicalDocType physicalDocumentTypeId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private SubjectPhysical subjectId;

    private String docSeries;

    @NotNull
    @Column(nullable = false)
    private String docNumber;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private String note;
    private String docCreator;

    public Long getAttributePhysicalDocumentId() {
        return attributePhysicalDocumentId;
    }

    public void setAttributePhysicalDocumentId(Long attributePhysicalDocumentId) {
        this.attributePhysicalDocumentId = attributePhysicalDocumentId;
    }

    public DirectoryPhysicalDocType getPhysicalDocumentTypeId() {
        return physicalDocumentTypeId;
    }

    public void setPhysicalDocumentTypeId(DirectoryPhysicalDocType physicalDocumentTypeId) {
        this.physicalDocumentTypeId = physicalDocumentTypeId;
    }

    public SubjectPhysical getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(SubjectPhysical subjectId) {
        this.subjectId = subjectId;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
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

    public String getDocCreator() {
        return docCreator;
    }

    public void setDocCreator(String docCreator) {
        this.docCreator = docCreator;
    }
}
