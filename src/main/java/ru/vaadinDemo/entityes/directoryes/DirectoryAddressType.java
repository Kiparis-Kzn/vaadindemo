package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributeAddress;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DirectoryAddressType extends Directory {

    @OneToMany(mappedBy = "addressTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeAddress> attributeAddressList;

    public List<AttributeAddress> getAttributeAddressList() {
        return attributeAddressList;
    }

    public void setAttributeAddressList(List<AttributeAddress> attributeAddressList) {
        this.attributeAddressList = attributeAddressList;
    }
}
