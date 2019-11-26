package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributeContacts;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DirectoryContactType extends Directory {

    @OneToMany(mappedBy = "contactTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeContacts> attributeContactsList;

    public List<AttributeContacts> getAttributeContactsList() {
        return attributeContactsList;
    }

    public void setAttributeContactsList(List<AttributeContacts> attributeContactsList) {
        this.attributeContactsList = attributeContactsList;
    }
}
