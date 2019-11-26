package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class DirStruct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dirFieldId;

    private String dirFieldCode;

    @ManyToOne
    @JoinColumn(name = "dirCode")
    private Dir dirCode;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String type;

    @NotNull
    @Column(nullable = false)
    private String sort;

    @NotNull
    @Column(nullable = false)
    private Integer isHidden;

    private String roles;
    private String note;
    private String columnName;
    private Integer isRequared;

    public Long getDirFieldId() {
        return dirFieldId;
    }

    public void setDirFieldId(Long dirFieldId) {
        this.dirFieldId = dirFieldId;
    }

    public String getDirFieldCode() {
        return dirFieldCode;
    }

    public void setDirFieldCode(String dirFieldCode) {
        this.dirFieldCode = dirFieldCode;
    }

    public Dir getDirCode() {
        return dirCode;
    }

    public void setDirCode(Dir dirCode) {
        this.dirCode = dirCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getIsRequared() {
        return isRequared;
    }

    public void setIsRequared(Integer isRequared) {
        this.isRequared = isRequared;
    }
}
