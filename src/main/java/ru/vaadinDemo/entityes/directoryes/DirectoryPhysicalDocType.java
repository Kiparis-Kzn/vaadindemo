package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributePhysicalDocument;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class DirectoryPhysicalDocType extends Directory {

    @OneToMany(mappedBy = "physicalDocumentTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributePhysicalDocument> attributePhysicalDocumentList;

    @NotNull
    @Column(nullable = false)
    private String docNumber;

    private String pattern;

    public List<AttributePhysicalDocument> getAttributePhysicalDocumentList() {
        return attributePhysicalDocumentList;
    }

    public void setAttributePhysicalDocumentList(List<AttributePhysicalDocument> attributePhysicalDocumentList) {
        this.attributePhysicalDocumentList = attributePhysicalDocumentList;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
