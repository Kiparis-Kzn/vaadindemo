package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryOkogy extends Directory {

    @OneToMany(mappedBy = "okogyId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryOkogy parentId;

    private String shortName;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public DirectoryOkogy getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryOkogy parentId) {
        this.parentId = parentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
