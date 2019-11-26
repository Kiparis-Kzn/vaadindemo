package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class FiasDirAdminTerritoryState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long actionStateId;

    @OneToMany(mappedBy = "actionStateId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FiasDirAddress> fiasDirAddressList;

    @NotNull
    @Column(nullable = false)
    private String code;

    @NotNull
    @Column(nullable = false)
    private String name;

    private String note;

    public Long getActionStateId() {
        return actionStateId;
    }

    public void setActionStateId(Long actionStateId) {
        this.actionStateId = actionStateId;
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
