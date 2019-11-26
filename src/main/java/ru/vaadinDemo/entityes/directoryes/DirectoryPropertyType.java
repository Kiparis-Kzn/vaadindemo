package ru.vaadinDemo.entityes.directoryes;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class DirectoryPropertyType extends Directory {

    @NotNull
    @Column(nullable = false)
    private Integer isOwnerNeed;

    @OneToMany(mappedBy = "propertyTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DirectoryAdminTerritoryType> directoryAdminTerritoryTypeList;

    public Integer getIsOwnerNeed() {
        return isOwnerNeed;
    }

    public void setIsOwnerNeed(Integer isOwnerNeed) {
        this.isOwnerNeed = isOwnerNeed;
    }

    public List<DirectoryAdminTerritoryType> getDirectoryAdminTerritoryTypeList() {
        return directoryAdminTerritoryTypeList;
    }

    public void setDirectoryAdminTerritoryTypeList(List<DirectoryAdminTerritoryType> directoryAdminTerritoryTypeList) {
        this.directoryAdminTerritoryTypeList = directoryAdminTerritoryTypeList;
    }
}
