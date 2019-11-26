package ru.vaadinDemo.entityes.dirs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class FiasDirAddressObjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressObjectTypeId;

    @OneToMany(mappedBy = "addressObjectTypeId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FiasDirAddress> fiasDirAddressList;

    @NotNull
    @Column(nullable = false)
    private String code;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String shortName;

    @ManyToOne
    @JoinColumn(name = "addressObjectLevelId")
    private FiasDirAddressObjectLevel addressObjectLevelId;

    private String note;

    public Long getAddressObjectTypeId() {
        return addressObjectTypeId;
    }

    public void setAddressObjectTypeId(Long addressObjectTypeId) {
        this.addressObjectTypeId = addressObjectTypeId;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public FiasDirAddressObjectLevel getAddressObjectLevelId() {
        return addressObjectLevelId;
    }

    public void setAddressObjectLevelId(FiasDirAddressObjectLevel addressObjectLevelId) {
        this.addressObjectLevelId = addressObjectLevelId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
