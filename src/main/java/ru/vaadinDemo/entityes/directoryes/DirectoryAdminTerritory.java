package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryAdminTerritory extends Directory {

    @OneToMany(mappedBy = "adminTerritoryId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @ManyToOne
    @JoinColumn(name = "adminTerritoryTypeId")
    private DirectoryAdminTerritoryType adminTerritoryTypeId;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryAdminTerritory parentId;

    private Integer controlNum;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public DirectoryAdminTerritory getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryAdminTerritory parentId) {
        this.parentId = parentId;
    }

    public DirectoryAdminTerritoryType getAdminTerritoryTypeId() {
        return adminTerritoryTypeId;
    }

    public void setAdminTerritoryTypeId(DirectoryAdminTerritoryType adminTerritoryTypeId) {
        this.adminTerritoryTypeId = adminTerritoryTypeId;
    }

    public Integer getControlNum() {
        return controlNum;
    }

    public void setControlNum(Integer controlNum) {
        this.controlNum = controlNum;
    }
}
