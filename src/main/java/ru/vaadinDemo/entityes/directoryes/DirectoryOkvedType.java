package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributeOkved;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryOkvedType extends Directory {

    @OneToMany(mappedBy = "okvedTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeOkved> attributeOkvedList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryOkvedType parentId;

    public List<AttributeOkved> getAttributeOkvedList() {
        return attributeOkvedList;
    }

    public void setAttributeOkvedList(List<AttributeOkved> attributeOkvedList) {
        this.attributeOkvedList = attributeOkvedList;
    }

    public DirectoryOkvedType getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryOkvedType parentId) {
        this.parentId = parentId;
    }
}
