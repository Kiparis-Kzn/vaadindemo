package ru.vaadinDemo.entityes.directoryes;

import ru.vaadinDemo.entityes.subjects.SubjectJuridical;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class DirectoryOkato extends Directory {

    @OneToMany(mappedBy = "okatoId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubjectJuridical> subjectJuridicalList;

    @NotNull
    @Column(nullable = false)
    private Integer controlNum;

    public List<SubjectJuridical> getSubjectJuridicalList() {
        return subjectJuridicalList;
    }

    public void setSubjectJuridicalList(List<SubjectJuridical> subjectJuridicalList) {
        this.subjectJuridicalList = subjectJuridicalList;
    }

    public Integer getControlNum() {
        return controlNum;
    }

    public void setControlNum(Integer controlNum) {
        this.controlNum = controlNum;
    }
}
