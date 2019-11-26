package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.attributes.AttributeJuridicDocument;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class DirectoryJuridicDocType extends Directory {

    @OneToMany(mappedBy = "juridicDocumentTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeJuridicDocument> attributeJuridicDocumentList;

    @NotNull
    @Column(nullable = false)
    private String docNumber;

    public List<AttributeJuridicDocument> getAttributeJuridicDocumentList() {
        return attributeJuridicDocumentList;
    }

    public void setAttributeJuridicDocumentList(List<AttributeJuridicDocument> attributeJuridicDocumentList) {
        this.attributeJuridicDocumentList = attributeJuridicDocumentList;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}
