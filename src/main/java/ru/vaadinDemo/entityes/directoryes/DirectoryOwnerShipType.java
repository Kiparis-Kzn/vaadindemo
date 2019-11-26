package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DirectoryOwnerShipType extends Directory {

    @OneToMany(mappedBy = "ownershipTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }
}
