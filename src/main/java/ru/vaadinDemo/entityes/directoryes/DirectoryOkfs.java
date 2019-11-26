package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryOkfs extends Directory {

    @OneToMany(mappedBy = "okfsId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryOkfs parentId;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public DirectoryOkfs getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryOkfs parentId) {
        this.parentId = parentId;
    }
}
