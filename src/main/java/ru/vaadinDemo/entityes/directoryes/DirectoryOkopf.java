package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryOkopf extends Directory {

    @OneToMany(mappedBy = "okopfId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryOkopf parentId;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public DirectoryOkopf getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryOkopf parentId) {
        this.parentId = parentId;
    }
}
