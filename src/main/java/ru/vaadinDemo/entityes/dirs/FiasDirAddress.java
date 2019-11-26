package ru.vaadinDemo.entityes.dirs;

import ru.vaadinDemo.entityes.attributes.AttributeAddress;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class FiasDirAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    @OneToMany(mappedBy = "addressId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttributeAddress> attributeAddressList;

    @NotNull
    @Column(nullable = false)
    private String globalAddressId;

    @NotNull
    @Column(nullable = false)
    private String formalName;

    @NotNull
    @Column(nullable = false)
    private short regionCode;

    @NotNull
    @Column(nullable = false)
    private String autonomyCode;

    @NotNull
    @Column(nullable = false)
    private String districtCode;

    @NotNull
    @Column(nullable = false)
    private short cityCode;

    @NotNull
    @Column(nullable = false)
    private String incityDistrictCode;

    @NotNull
    @Column(nullable = false)
    private String localityCode;

    @NotNull
    @Column(nullable = false)
    private String planStructureElementCode;

    @NotNull
    @Column(nullable = false)
    private String streetCode;

    @NotNull
    @Column(nullable = false)
    private String streetCustomElementCode;

    @NotNull
    @Column(nullable = false)
    private String streetChildCustomElementCode;

    private String officialName;
    private String postalIndex;
    private String ifnsPhysicalCode;
    private String ifnsPhysicalTerritoryCode;
    private String ifnsJuridicalCode;
    private String ifnsJuridicalTerritoryCode;
    private String okatoCode;
    private String oktmoCode;

    @NotNull
    @Column(nullable = false)
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "addressObjectTypeId")
    private FiasDirAddressObjectType addressObjectTypeId;

    @ManyToOne
    @JoinColumn(name = "addressObjectLevelId")
    private FiasDirAddressObjectLevel addressObjectLevelId;

    private Integer parentId;

    @NotNull
    @Column(nullable = false)
    private Integer recordId;

    private Integer beforeRecordId;

    private Integer futureRecordId;

    private String kladrCodeWithActuality;
    private String kladrCode;
    private Integer isLast;
    private Integer isActual;

    @ManyToOne
    @JoinColumn(name = "centerStateId")
    private FiasDirCenterState centerStateId;

    @ManyToOne
    @JoinColumn(name = "actionStateId")
    private FiasDirAdminTerritoryState actionStateId;

    @NotNull
    @Column(nullable = false)
    private Date recordStartDate;

    @NotNull
    @Column(nullable = false)
    private Date endDate;

    @NotNull
    @Column(nullable = false)
    private Integer isActive;

    @ManyToOne
    @JoinColumn(name = "dividingTypeId")
    private FiasDirDividingType dividingTypeId;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public List<AttributeAddress> getAttributeAddressList() {
        return attributeAddressList;
    }

    public void setAttributeAddressList(List<AttributeAddress> attributeAddressList) {
        this.attributeAddressList = attributeAddressList;
    }

    public String getGlobalAddressId() {
        return globalAddressId;
    }

    public void setGlobalAddressId(String globalAddressId) {
        this.globalAddressId = globalAddressId;
    }

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public short getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(short regionCode) {
        this.regionCode = regionCode;
    }

    public String getAutonomyCode() {
        return autonomyCode;
    }

    public void setAutonomyCode(String autonomyCode) {
        this.autonomyCode = autonomyCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public short getCityCode() {
        return cityCode;
    }

    public void setCityCode(short cityCode) {
        this.cityCode = cityCode;
    }

    public String getIncityDistrictCode() {
        return incityDistrictCode;
    }

    public void setIncityDistrictCode(String incityDistrictCode) {
        this.incityDistrictCode = incityDistrictCode;
    }

    public String getLocalityCode() {
        return localityCode;
    }

    public void setLocalityCode(String localityCode) {
        this.localityCode = localityCode;
    }

    public String getPlanStructureElementCode() {
        return planStructureElementCode;
    }

    public void setPlanStructureElementCode(String planStructureElementCode) {
        this.planStructureElementCode = planStructureElementCode;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetCustomElementCode() {
        return streetCustomElementCode;
    }

    public void setStreetCustomElementCode(String streetCustomElementCode) {
        this.streetCustomElementCode = streetCustomElementCode;
    }

    public String getStreetChildCustomElementCode() {
        return streetChildCustomElementCode;
    }

    public void setStreetChildCustomElementCode(String streetChildCustomElementCode) {
        this.streetChildCustomElementCode = streetChildCustomElementCode;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getPostalIndex() {
        return postalIndex;
    }

    public void setPostalIndex(String postalIndex) {
        this.postalIndex = postalIndex;
    }

    public String getIfnsPhysicalCode() {
        return ifnsPhysicalCode;
    }

    public void setIfnsPhysicalCode(String ifnsPhysicalCode) {
        this.ifnsPhysicalCode = ifnsPhysicalCode;
    }

    public String getIfnsPhysicalTerritoryCode() {
        return ifnsPhysicalTerritoryCode;
    }

    public void setIfnsPhysicalTerritoryCode(String ifnsPhysicalTerritoryCode) {
        this.ifnsPhysicalTerritoryCode = ifnsPhysicalTerritoryCode;
    }

    public String getIfnsJuridicalCode() {
        return ifnsJuridicalCode;
    }

    public void setIfnsJuridicalCode(String ifnsJuridicalCode) {
        this.ifnsJuridicalCode = ifnsJuridicalCode;
    }

    public String getIfnsJuridicalTerritoryCode() {
        return ifnsJuridicalTerritoryCode;
    }

    public void setIfnsJuridicalTerritoryCode(String ifnsJuridicalTerritoryCode) {
        this.ifnsJuridicalTerritoryCode = ifnsJuridicalTerritoryCode;
    }

    public String getOkatoCode() {
        return okatoCode;
    }

    public void setOkatoCode(String okatoCode) {
        this.okatoCode = okatoCode;
    }

    public String getOktmoCode() {
        return oktmoCode;
    }

    public void setOktmoCode(String oktmoCode) {
        this.oktmoCode = oktmoCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public FiasDirAddressObjectType getAddressObjectTypeId() {
        return addressObjectTypeId;
    }

    public void setAddressObjectTypeId(FiasDirAddressObjectType addressObjectTypeId) {
        this.addressObjectTypeId = addressObjectTypeId;
    }

    public FiasDirAddressObjectLevel getAddressObjectLevelId() {
        return addressObjectLevelId;
    }

    public void setAddressObjectLevelId(FiasDirAddressObjectLevel addressObjectLevelId) {
        this.addressObjectLevelId = addressObjectLevelId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getBeforeRecordId() {
        return beforeRecordId;
    }

    public void setBeforeRecordId(Integer beforeRecordId) {
        this.beforeRecordId = beforeRecordId;
    }

    public Integer getFutureRecordId() {
        return futureRecordId;
    }

    public void setFutureRecordId(Integer futureRecordId) {
        this.futureRecordId = futureRecordId;
    }

    public String getKladrCodeWithActuality() {
        return kladrCodeWithActuality;
    }

    public void setKladrCodeWithActuality(String kladrCodeWithActuality) {
        this.kladrCodeWithActuality = kladrCodeWithActuality;
    }

    public String getKladrCode() {
        return kladrCode;
    }

    public void setKladrCode(String kladrCode) {
        this.kladrCode = kladrCode;
    }

    public Integer getIsLast() {
        return isLast;
    }

    public void setIsLast(Integer isLast) {
        this.isLast = isLast;
    }

    public Integer getIsActual() {
        return isActual;
    }

    public void setIsActual(Integer isActual) {
        this.isActual = isActual;
    }

    public FiasDirCenterState getCenterStateId() {
        return centerStateId;
    }

    public void setCenterStateId(FiasDirCenterState centerStateId) {
        this.centerStateId = centerStateId;
    }

    public FiasDirAdminTerritoryState getActionStateId() {
        return actionStateId;
    }

    public void setActionStateId(FiasDirAdminTerritoryState actionStateId) {
        this.actionStateId = actionStateId;
    }

    public Date getRecordStartDate() {
        return recordStartDate;
    }

    public void setRecordStartDate(Date recordStartDate) {
        this.recordStartDate = recordStartDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public FiasDirDividingType getDividingTypeId() {
        return dividingTypeId;
    }

    public void setDividingTypeId(FiasDirDividingType dividingTypeId) {
        this.dividingTypeId = dividingTypeId;
    }
}
