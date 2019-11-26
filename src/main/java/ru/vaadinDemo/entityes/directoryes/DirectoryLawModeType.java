package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributeLawMode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DirectoryLawModeType extends Directory {

    @OneToMany(mappedBy = "lawModeTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeLawMode> attributeModeList;

    public List<AttributeLawMode> getAttributeModeList() {
        return attributeModeList;
    }

    public void setAttributeModeList(List<AttributeLawMode> attributeModeList) {
        this.attributeModeList = attributeModeList;
    }
}
