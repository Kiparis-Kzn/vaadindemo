package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryOkvedType;
import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributeOkved {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeOkvedId;

    @ManyToOne
    @JoinColumn(name = "okvedTypeId")
    private DirectoryOkvedType okvedTypeId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Integer isMain;

    public Long getAttributeOkvedId() {
        return attributeOkvedId;
    }

    public void setAttributeOkvedId(Long attributeOkvedId) {
        this.attributeOkvedId = attributeOkvedId;
    }

    public DirectoryOkvedType getOkvedTypeId() {
        return okvedTypeId;
    }

    public void setOkvedTypeId(DirectoryOkvedType okvedTypeId) {
        this.okvedTypeId = okvedTypeId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
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
