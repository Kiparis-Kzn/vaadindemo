package ru.vaadinDemo.entityes.subjects;

import ru.vaadinDemo.entityes.attributes.AttributeEmployee;
import ru.vaadinDemo.entityes.attributes.AttributeStructureSub;
import ru.vaadinDemo.entityes.directoryes.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SubjectJuridical extends Subject {

    @OneToMany(mappedBy = "subjectId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeStructureSub> attributeStructureSubList;

    @OneToMany(mappedBy = "subjectJuridicalId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeEmployee> attributeEmployeeList;

    private String shortName;
    private String ogrn;

    @NotNull
    @Column(nullable = false)
    private String kpp;

    @NotNull
    @Column(nullable = false)
    private String okpo;

    @ManyToOne
    @JoinColumn(name = "okogyId")
    private DirectoryOkogy okogyId;

    @ManyToOne
    @JoinColumn(name = "okatoId")
    private DirectoryOkato okatoId;

    @ManyToOne
    @JoinColumn(name = "okopfId")
    private DirectoryOkopf okopfId;

    @ManyToOne
    @JoinColumn(name = "okfsId")
    private DirectoryOkfs okfsId;

    @ManyToOne
    @JoinColumn(name = "oktmoId")
    private DirectoryOktmo oktmoId;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private SubjectJuridical parentId;

    @ManyToOne
    @JoinColumn(name = "mainOrgId")
    private Subject mainOrgId;

    @ManyToOne
    @JoinColumn(name = "adminTerritoryId")
    private DirectoryAdminTerritory adminTerritoryId;

    @ManyToOne
    @JoinColumn(name = "ownershipTypeId")
    private DirectoryOwnerShipType ownershipTypeId;

    public List<AttributeStructureSub> getAttributeStructureSubList() {
        return attributeStructureSubList;
    }

    public void setAttributeStructureSubList(List<AttributeStructureSub> attributeStructureSubList) {
        this.attributeStructureSubList = attributeStructureSubList;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public DirectoryOkogy getOkogyId() {
        return okogyId;
    }

    public void setOkogyId(DirectoryOkogy okogyId) {
        this.okogyId = okogyId;
    }

    public DirectoryOkato getOkatoId() {
        return okatoId;
    }

    public void setOkatoId(DirectoryOkato okatoId) {
        this.okatoId = okatoId;
    }

    public DirectoryOkopf getOkopfId() {
        return okopfId;
    }

    public void setOkopfId(DirectoryOkopf okopfId) {
        this.okopfId = okopfId;
    }

    public DirectoryOkfs getOkfsId() {
        return okfsId;
    }

    public void setOkfsId(DirectoryOkfs okfsId) {
        this.okfsId = okfsId;
    }

    public DirectoryOktmo getOktmoId() {
        return oktmoId;
    }

    public void setOktmoId(DirectoryOktmo oktmoId) {
        this.oktmoId = oktmoId;
    }

    public SubjectJuridical getParentId() {
        return parentId;
    }

    public void setParentId(SubjectJuridical parentId) {
        this.parentId = parentId;
    }

    public Subject getMainOrgId() {
        return mainOrgId;
    }

    public void setMainOrgId(Subject mainOrgId) {
        this.mainOrgId = mainOrgId;
    }

    public DirectoryAdminTerritory getAdminTerritoryId() {
        return adminTerritoryId;
    }

    public void setAdminTerritoryId(DirectoryAdminTerritory adminTerritoryId) {
        this.adminTerritoryId = adminTerritoryId;
    }

    public DirectoryOwnerShipType getOwnershipTypeId() {
        return ownershipTypeId;
    }

    public void setOwnershipTypeId(DirectoryOwnerShipType ownershipTypeId) {
        this.ownershipTypeId = ownershipTypeId;
    }
}
