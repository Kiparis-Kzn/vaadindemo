package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Dir {

    @Id
    private String dirCode;

    @OneToMany(mappedBy = "dirCode", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DirStruct> dirStructList;

    @NotNull
    @Column(nullable = false)
    private String dirName;

    private String note;

    @NotNull
    @Column(nullable = false)
    private String tableName;

    public String getId() {
        return dirCode;
    }

    public void setId(String dirCode) {
        this.dirCode = dirCode;
    }

    public List<DirStruct> getDirStructList() {
        return dirStructList;
    }

    public void setDirStructList(List<DirStruct> dirStructList) {
        this.dirStructList = dirStructList;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
