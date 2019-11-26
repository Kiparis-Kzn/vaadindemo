package ru.vaadinDemo.entityes.directoryes;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryAdminTerritoryType extends Directory {

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryAdminTerritoryType parentId;

    @ManyToOne
    @JoinColumn(name = "propertyTypeId")
    private DirectoryPropertyType propertyTypeId;

    @OneToMany(mappedBy = "adminTerritoryTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DirectoryAdminTerritory> directoryAdminTerritoryList;

    public DirectoryAdminTerritoryType getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryAdminTerritoryType parentId) {
        this.parentId = parentId;
    }

    public List<DirectoryAdminTerritory> getDirectoryAdminTerritoryList() {
        return directoryAdminTerritoryList;
    }

    public void setDirectoryAdminTerritoryList(List<DirectoryAdminTerritory> directoryAdminTerritoryList) {
        this.directoryAdminTerritoryList = directoryAdminTerritoryList;
    }

    public DirectoryPropertyType getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(DirectoryPropertyType propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }
}
