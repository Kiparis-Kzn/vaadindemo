package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import java.util.List;

@Entity
public class DirectoryOktmo extends Directory {

    @OneToMany(mappedBy = "oktmoId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private DirectoryOktmo parentId;

    private Integer controlNum;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public DirectoryOktmo getParentId() {
        return parentId;
    }

    public void setParentId(DirectoryOktmo parentId) {
        this.parentId = parentId;
    }

    public Integer getControlNum() {
        return controlNum;
    }

    public void setControlNum(Integer controlNum) {
        this.controlNum = controlNum;
    }
}
