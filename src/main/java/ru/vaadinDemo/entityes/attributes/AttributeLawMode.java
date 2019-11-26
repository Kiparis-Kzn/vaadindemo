package ru.vaadinDemo.entityes.attributes;

import ru.vaadinDemo.entityes.directoryes.DirectoryLawModeType;
import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class AttributeLawMode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attributeLawModeId;

    @ManyToOne
    @JoinColumn(name = "lawModeTypeId")
    private DirectoryLawModeType lawModeTypeId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subjectId;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    private String note;
    private String scanCopyLink;

    public Long getAttributeLawModeId() {
        return attributeLawModeId;
    }

    public void setAttributeLawModeId(Long attributeLawModeId) {
        this.attributeLawModeId = attributeLawModeId;
    }

    public DirectoryLawModeType getLawModeTypeId() {
        return lawModeTypeId;
    }

    public void setLawModeTypeId(DirectoryLawModeType lawModeTypeId) {
        this.lawModeTypeId = lawModeTypeId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getScanCopyLink() {
        return scanCopyLink;
    }

    public void setScanCopyLink(String scanCopyLink) {
        this.scanCopyLink = scanCopyLink;
    }
}
