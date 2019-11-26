package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class FiasDirCenterState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long centerStateId;

    @OneToMany(mappedBy = "centerStateId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FiasDirAddress> fiasDirAddressList;

    @NotNull
    @Column(nullable = false)
    private String code;

    @NotNull
    @Column(nullable = false)
    private String name;

    private String note;

    public Long getCenterStateId() {
        return centerStateId;
    }

    public void setCenterStateId(Long centerStateId) {
        this.centerStateId = centerStateId;
    }

    public List<FiasDirAddress> getFiasDirAddressList() {
        return fiasDirAddressList;
    }

    public void setFiasDirAddressList(List<FiasDirAddress> fiasDirAddressList) {
        this.fiasDirAddressList = fiasDirAddressList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
