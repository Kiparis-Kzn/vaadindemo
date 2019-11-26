package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class FiasDirAddressObjectLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressObjectLevelId;

    @OneToMany(mappedBy = "addressObjectLevelId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FiasDirAddress> fiasDirAddressList;

    @OneToMany(mappedBy = "addressObjectLevelId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FiasDirAddressObjectType> fiasDirAddressObjectTypeList;

    @NotNull
    @Column(nullable = false)
    private String code;

    @NotNull
    @Column(nullable = false)
    private String name;

    private String note;

    public Long getAddressObjectLevelId() {
        return addressObjectLevelId;
    }

    public void setAddressObjectLevelId(Long addressObjectLevelId) {
        this.addressObjectLevelId = addressObjectLevelId;
    }

    public List<FiasDirAddress> getFiasDirAddressList() {
        return fiasDirAddressList;
    }

    public void setFiasDirAddressList(List<FiasDirAddress> fiasDirAddressList) {
        this.fiasDirAddressList = fiasDirAddressList;
    }

    public List<FiasDirAddressObjectType> getFiasDirAddressObjectTypeList() {
        return fiasDirAddressObjectTypeList;
    }

    public void setFiasDirAddressObjectTypeList(List<FiasDirAddressObjectType> fiasDirAddressObjectTypeList) {
        this.fiasDirAddressObjectTypeList = fiasDirAddressObjectTypeList;
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
