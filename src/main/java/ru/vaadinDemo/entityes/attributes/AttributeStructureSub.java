package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class AttributeStructureSub {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeStructureSubId;

    @OneToMany(mappedBy = "attributeStructureSubId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeStructureSub> attributeStructureSubList;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private SubjectJuridical subjectId;

    @NotNull
    @Column(nullable = false)
    private String structureName;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private AttributeStructureSub parentId;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Long getAttributeStructureSubId() {
        return attributeStructureSubId;
    }

    public void setAttributeStructureSubId(Long attributeStructureSubId) {
        this.attributeStructureSubId = attributeStructureSubId;
    }

    public List<AttributeStructureSub> getAttributeStructureSubList() {
        return attributeStructureSubList;
    }

    public void setAttributeStructureSubList(List<AttributeStructureSub> attributeStructureSubList) {
        this.attributeStructureSubList = attributeStructureSubList;
    }

    public SubjectJuridical getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(SubjectJuridical subjectId) {
        this.subjectId = subjectId;
    }

    public String getStructureName() {
        return structureName;
    }

    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }

    public AttributeStructureSub getParentId() {
        return parentId;
    }

    public void setParentId(AttributeStructureSub parentId) {
        this.parentId = parentId;
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
}
