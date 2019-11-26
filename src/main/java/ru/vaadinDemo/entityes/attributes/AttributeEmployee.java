package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;
import ru.vaadinDemo.entityes.subjects.SubjectPhysical;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributeEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeEmployeeId;

    @ManyToOne
    @JoinColumn(name = "subjectPhysicalId")
    private SubjectPhysical subjectPhysicalId;

    @ManyToOne
    @JoinColumn(name = "subjectJuridicalId")
    private SubjectJuridical subjectJuridicalId;

    private String position;

    @NotNull
    @Column(nullable = false)
    private String approveDoc;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Integer isBoss;
    private String note;

    @ManyToOne
    @JoinColumn(name = "attributeStructureSubId")
    private AttributeStructureSub attributeStructureSubId;

    public Long getAttributeEmployeeId() {
        return attributeEmployeeId;
    }

    public void setAttributeEmployeeId(Long attributeEmployeeId) {
        this.attributeEmployeeId = attributeEmployeeId;
    }

    public SubjectPhysical getSubjectPhysicalId() {
        return subjectPhysicalId;
    }

    public void setSubjectPhysicalId(SubjectPhysical subjectPhysicalId) {
        this.subjectPhysicalId = subjectPhysicalId;
    }

    public SubjectJuridical getSubjectJuridicalId() {
        return subjectJuridicalId;
    }

    public void setSubjectJuridicalId(SubjectJuridical subjectJuridicalId) {
        this.subjectJuridicalId = subjectJuridicalId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Integer getIsBoss() {
        return isBoss;
    }

    public void setIsBoss(Integer isBoss) {
        this.isBoss = isBoss;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public AttributeStructureSub getAttributeStructureSubId() {
        return attributeStructureSubId;
    }

    public void setAttributeStructureSubId(AttributeStructureSub attributeStructureSubId) {
        this.attributeStructureSubId = attributeStructureSubId;
    }
}
