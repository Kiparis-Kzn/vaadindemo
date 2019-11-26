package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.Subject;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectorySubjectType extends Directory {

    @OneToMany(mappedBy = "subjectTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Subject> subjectList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectorySubjectType parentId;

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public DirectorySubjectType getParentId() {
        return parentId;
    }

    public void setParentId(DirectorySubjectType parentId) {
        this.parentId = parentId;
    }
}
