package ru.vaadinDemo.entityes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PRobject")
public class PrObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @XmlElement(name = "CPASO_ID")
    private Long cpasoId;
    @XmlElement(name = "CPPRT_ID")
    private Long cprtId;
    private String cpasoName;
    private String cpasoInventoryNumber;
    private String cpasoUsage;
    private String cpasoPassNum;
    private Date cpasoPassDate;
    private Long cpsitId;
    private String cpasoSquare;
    private Long ormsuIdSquare;
    private Long oradrAdressId;
    private String cpasoStartDate;
    private String cpasoNote;
    private String cpcstAmount1;
    private Long ormsuIdAmount1;
    private Date cpcstDateAmount1;
    private String cpcsAmount2;
    private Long ormsuIdAmount2;
    private Date cpcstDateAmount2;
    private String cpoefValueEt;
    private String cpoefValueF;
    private String cpoefValueIz;
    private String cpoefValueN;
    private String cpoefValueK;
    private String cpoefValueM;
    private String cpoefValuePr;
    private String cpoefValueOb;
    private Long ormsuIdSquareP;
    private Long ormsuIdSquareV;
    private String cpasoKolvo;
    private Long cpautId;
    private Long cpinfSvId;
    private Long cpobsId;
    private String cpascSeries;
    private String cpascCode;
    private Date cpascDate;
    private String cpascSub;
    private Long cpinfPassId;
    private String cpasoPassSub;
    private Long cpinfCadId;
    private Date cpacaCadDate;
    private String cpacaCadSub;
    private Long cpinfRtId;
    private Long cpobsRtId;
    private String cpascRtSeries;
    private String cpascRtCode;
    private Date cpascRtDate;
    private String cpascRtSub;
    private String cpasoCadastreCode;
    private String ieGuide;
    private Long ormsuIdAmCadastre;
    private Long ormsuIdSquareBuilding;
    private Long ormsuIdSquareH;
    private String cpasoSquareH;
    private String fullAdress;
    private String cpprtName;
    private String ormsuCode;
    private String code1;
    private String code2;
    private String cpobsName;
    private String cpautCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpasoId() {
        return cpasoId;
    }

    public void setCpasoId(Long cpasoId) {
        this.cpasoId = cpasoId;
    }

    public Long getCprtId() {
        return cprtId;
    }

    public void setCprtId(Long cprtId) {
        this.cprtId = cprtId;
    }

    public String getCpasoName() {
        return cpasoName;
    }

    public void setCpasoName(String cpasoName) {
        this.cpasoName = cpasoName;
    }

    public String getCpasoInventoryNumber() {
        return cpasoInventoryNumber;
    }

    public void setCpasoInventoryNumber(String cpasoInventoryNumber) {
        this.cpasoInventoryNumber = cpasoInventoryNumber;
    }

    public String getCpasoUsage() {
        return cpasoUsage;
    }

    public void setCpasoUsage(String cpasoUsage) {
        this.cpasoUsage = cpasoUsage;
    }

    public String getCpasoPassNum() {
        return cpasoPassNum;
    }

    public void setCpasoPassNum(String cpasoPassNum) {
        this.cpasoPassNum = cpasoPassNum;
    }

    public Date getCpasoPassDate() {
        return cpasoPassDate;
    }

    public void setCpasoPassDate(Date cpasoPassDate) {
        this.cpasoPassDate = cpasoPassDate;
    }

    public Long getCpsitId() {
        return cpsitId;
    }

    public void setCpsitId(Long cpsitId) {
        this.cpsitId = cpsitId;
    }

    public String getCpasoSquare() {
        return cpasoSquare;
    }

    public void setCpasoSquare(String cpasoSquare) {
        this.cpasoSquare = cpasoSquare;
    }

    public Long getOrmsuIdSquare() {
        return ormsuIdSquare;
    }

    public void setOrmsuIdSquare(Long ormsuIdSquare) {
        this.ormsuIdSquare = ormsuIdSquare;
    }

    public Long getOradrAdressId() {
        return oradrAdressId;
    }

    public void setOradrAdressId(Long oradrAdressId) {
        this.oradrAdressId = oradrAdressId;
    }

    public String getCpasoStartDate() {
        return cpasoStartDate;
    }

    public void setCpasoStartDate(String cpasoStartDate) {
        this.cpasoStartDate = cpasoStartDate;
    }

    public String getCpasoNote() {
        return cpasoNote;
    }

    public void setCpasoNote(String cpasoNote) {
        this.cpasoNote = cpasoNote;
    }

    public String getCpcstAmount1() {
        return cpcstAmount1;
    }

    public void setCpcstAmount1(String cpcstAmount1) {
        this.cpcstAmount1 = cpcstAmount1;
    }

    public Long getOrmsuIdAmount1() {
        return ormsuIdAmount1;
    }

    public void setOrmsuIdAmount1(Long ormsuIdAmount1) {
        this.ormsuIdAmount1 = ormsuIdAmount1;
    }

    public Date getCpcstDateAmount1() {
        return cpcstDateAmount1;
    }

    public void setCpcstDateAmount1(Date cpcstDateAmount1) {
        this.cpcstDateAmount1 = cpcstDateAmount1;
    }

    public String getCpcsAmount2() {
        return cpcsAmount2;
    }

    public void setCpcsAmount2(String cpcsAmount2) {
        this.cpcsAmount2 = cpcsAmount2;
    }

    public Long getOrmsuIdAmount2() {
        return ormsuIdAmount2;
    }

    public void setOrmsuIdAmount2(Long ormsuIdAmount2) {
        this.ormsuIdAmount2 = ormsuIdAmount2;
    }

    public Date getCpcstDateAmount2() {
        return cpcstDateAmount2;
    }

    public void setCpcstDateAmount2(Date cpcstDateAmount2) {
        this.cpcstDateAmount2 = cpcstDateAmount2;
    }

    public String getCpoefValueEt() {
        return cpoefValueEt;
    }

    public void setCpoefValueEt(String cpoefValueEt) {
        this.cpoefValueEt = cpoefValueEt;
    }

    public String getCpoefValueF() {
        return cpoefValueF;
    }

    public void setCpoefValueF(String cpoefValueF) {
        this.cpoefValueF = cpoefValueF;
    }

    public String getCpoefValueIz() {
        return cpoefValueIz;
    }

    public void setCpoefValueIz(String cpoefValueIz) {
        this.cpoefValueIz = cpoefValueIz;
    }

    public String getCpoefValueN() {
        return cpoefValueN;
    }

    public void setCpoefValueN(String cpoefValueN) {
        this.cpoefValueN = cpoefValueN;
    }

    public String getCpoefValueK() {
        return cpoefValueK;
    }

    public void setCpoefValueK(String cpoefValueK) {
        this.cpoefValueK = cpoefValueK;
    }

    public String getCpoefValueM() {
        return cpoefValueM;
    }

    public void setCpoefValueM(String cpoefValueM) {
        this.cpoefValueM = cpoefValueM;
    }

    public String getCpoefValuePr() {
        return cpoefValuePr;
    }

    public void setCpoefValuePr(String cpoefValuePr) {
        this.cpoefValuePr = cpoefValuePr;
    }

    public String getCpoefValueOb() {
        return cpoefValueOb;
    }

    public void setCpoefValueOb(String cpoefValueOb) {
        this.cpoefValueOb = cpoefValueOb;
    }

    public Long getOrmsuIdSquareP() {
        return ormsuIdSquareP;
    }

    public void setOrmsuIdSquareP(Long ormsuIdSquareP) {
        this.ormsuIdSquareP = ormsuIdSquareP;
    }

    public Long getOrmsuIdSquareV() {
        return ormsuIdSquareV;
    }

    public void setOrmsuIdSquareV(Long ormsuIdSquareV) {
        this.ormsuIdSquareV = ormsuIdSquareV;
    }

    public String getCpasoKolvo() {
        return cpasoKolvo;
    }

    public void setCpasoKolvo(String cpasoKolvo) {
        this.cpasoKolvo = cpasoKolvo;
    }

    public Long getCpautId() {
        return cpautId;
    }

    public void setCpautId(Long cpautId) {
        this.cpautId = cpautId;
    }

    public Long getCpinfSvId() {
        return cpinfSvId;
    }

    public void setCpinfSvId(Long cpinfSvId) {
        this.cpinfSvId = cpinfSvId;
    }

    public Long getCpobsId() {
        return cpobsId;
    }

    public void setCpobsId(Long cpobsId) {
        this.cpobsId = cpobsId;
    }

    public String getCpascSeries() {
        return cpascSeries;
    }

    public void setCpascSeries(String cpascSeries) {
        this.cpascSeries = cpascSeries;
    }

    public String getCpascCode() {
        return cpascCode;
    }

    public void setCpascCode(String cpascCode) {
        this.cpascCode = cpascCode;
    }

    public Date getCpascDate() {
        return cpascDate;
    }

    public void setCpascDate(Date cpascDate) {
        this.cpascDate = cpascDate;
    }

    public String getCpascSub() {
        return cpascSub;
    }

    public void setCpascSub(String cpascSub) {
        this.cpascSub = cpascSub;
    }

    public Long getCpinfPassId() {
        return cpinfPassId;
    }

    public void setCpinfPassId(Long cpinfPassId) {
        this.cpinfPassId = cpinfPassId;
    }

    public String getCpasoPassSub() {
        return cpasoPassSub;
    }

    public void setCpasoPassSub(String cpasoPassSub) {
        this.cpasoPassSub = cpasoPassSub;
    }

    public Long getCpinfCadId() {
        return cpinfCadId;
    }

    public void setCpinfCadId(Long cpinfCadId) {
        this.cpinfCadId = cpinfCadId;
    }

    public Date getCpacaCadDate() {
        return cpacaCadDate;
    }

    public void setCpacaCadDate(Date cpacaCadDate) {
        this.cpacaCadDate = cpacaCadDate;
    }

    public String getCpacaCadSub() {
        return cpacaCadSub;
    }

    public void setCpacaCadSub(String cpacaCadSub) {
        this.cpacaCadSub = cpacaCadSub;
    }

    public Long getCpinfRtId() {
        return cpinfRtId;
    }

    public void setCpinfRtId(Long cpinfRtId) {
        this.cpinfRtId = cpinfRtId;
    }

    public Long getCpobsRtId() {
        return cpobsRtId;
    }

    public void setCpobsRtId(Long cpobsRtId) {
        this.cpobsRtId = cpobsRtId;
    }

    public String getCpascRtSeries() {
        return cpascRtSeries;
    }

    public void setCpascRtSeries(String cpascRtSeries) {
        this.cpascRtSeries = cpascRtSeries;
    }

    public String getCpascRtCode() {
        return cpascRtCode;
    }

    public void setCpascRtCode(String cpascRtCode) {
        this.cpascRtCode = cpascRtCode;
    }

    public Date getCpascRtDate() {
        return cpascRtDate;
    }

    public void setCpascRtDate(Date cpascRtDate) {
        this.cpascRtDate = cpascRtDate;
    }

    public String getCpascRtSub() {
        return cpascRtSub;
    }

    public void setCpascRtSub(String cpascRtSub) {
        this.cpascRtSub = cpascRtSub;
    }

    public String getCpasoCadastreCode() {
        return cpasoCadastreCode;
    }

    public void setCpasoCadastreCode(String cpasoCadastreCode) {
        this.cpasoCadastreCode = cpasoCadastreCode;
    }

    public String getIeGuide() {
        return ieGuide;
    }

    public void setIeGuide(String ieGuide) {
        this.ieGuide = ieGuide;
    }

    public Long getOrmsuIdAmCadastre() {
        return ormsuIdAmCadastre;
    }

    public void setOrmsuIdAmCadastre(Long ormsuIdAmCadastre) {
        this.ormsuIdAmCadastre = ormsuIdAmCadastre;
    }

    public Long getOrmsuIdSquareBuilding() {
        return ormsuIdSquareBuilding;
    }

    public void setOrmsuIdSquareBuilding(Long ormsuIdSquareBuilding) {
        this.ormsuIdSquareBuilding = ormsuIdSquareBuilding;
    }

    public Long getOrmsuIdSquareH() {
        return ormsuIdSquareH;
    }

    public void setOrmsuIdSquareH(Long ormsuIdSquareH) {
        this.ormsuIdSquareH = ormsuIdSquareH;
    }

    public String getCpasoSquareH() {
        return cpasoSquareH;
    }

    public void setCpasoSquareH(String cpasoSquareH) {
        this.cpasoSquareH = cpasoSquareH;
    }

    public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public String getCpprtName() {
        return cpprtName;
    }

    public void setCpprtName(String cpprtName) {
        this.cpprtName = cpprtName;
    }

    public String getOrmsuCode() {
        return ormsuCode;
    }

    public void setOrmsuCode(String ormsuCode) {
        this.ormsuCode = ormsuCode;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCpobsName() {
        return cpobsName;
    }

    public void setCpobsName(String cpobsName) {
        this.cpobsName = cpobsName;
    }

    public String getCpautCode() {
        return cpautCode;
    }

    public void setCpautCode(String cpautCode) {
        this.cpautCode = cpautCode;
    }

    @Override
    public String toString() {
        return "PrObject{" +
                "cpasoId=" + cpasoId +
                ", cprtId=" + cprtId +
                ", cpasoName='" + cpasoName + '\'' +
                ", cpasoInventoryNumber='" + cpasoInventoryNumber + '\'' +
                ", cpasoUsage='" + cpasoUsage + '\'' +
                ", cpasoPassNum='" + cpasoPassNum + '\'' +
                ", cpasoPassDate=" + cpasoPassDate +
                ", cpsitId=" + cpsitId +
                ", cpasoSquare='" + cpasoSquare + '\'' +
                ", ormsuIdSquare=" + ormsuIdSquare +
                ", oradrAdressId=" + oradrAdressId +
                ", cpasoStartDate='" + cpasoStartDate + '\'' +
                ", cpasoNote='" + cpasoNote + '\'' +
                ", cpcstAmount1='" + cpcstAmount1 + '\'' +
                ", ormsuIdAmount1=" + ormsuIdAmount1 +
                ", cpcstDateAmount1=" + cpcstDateAmount1 +
                ", cpcsAmount2='" + cpcsAmount2 + '\'' +
                ", ormsuIdAmount2=" + ormsuIdAmount2 +
                ", cpcstDateAmount2=" + cpcstDateAmount2 +
                ", cpoefValueEt='" + cpoefValueEt + '\'' +
                ", cpoefValueF='" + cpoefValueF + '\'' +
                ", cpoefValueIz='" + cpoefValueIz + '\'' +
                ", cpoefValueN='" + cpoefValueN + '\'' +
                ", cpoefValueK='" + cpoefValueK + '\'' +
                ", cpoefValueM='" + cpoefValueM + '\'' +
                ", cpoefValuePr='" + cpoefValuePr + '\'' +
                ", cpoefValueOb='" + cpoefValueOb + '\'' +
                ", ormsuIdSquareP=" + ormsuIdSquareP +
                ", ormsuIdSquareV=" + ormsuIdSquareV +
                ", cpasoKolvo='" + cpasoKolvo + '\'' +
                ", cpautId=" + cpautId +
                ", cpinfSvId=" + cpinfSvId +
                ", cpobsId=" + cpobsId +
                ", cpascSeries='" + cpascSeries + '\'' +
                ", cpascCode='" + cpascCode + '\'' +
                ", cpascDate=" + cpascDate +
                ", cpascSub='" + cpascSub + '\'' +
                ", cpinfPassId=" + cpinfPassId +
                ", cpasoPassSub='" + cpasoPassSub + '\'' +
                ", cpinfCadId=" + cpinfCadId +
                ", cpacaCadDate=" + cpacaCadDate +
                ", cpacaCadSub='" + cpacaCadSub + '\'' +
                ", cpinfRtId=" + cpinfRtId +
                ", cpobsRtId=" + cpobsRtId +
                ", cpascRtSeries='" + cpascRtSeries + '\'' +
                ", cpascRtCode='" + cpascRtCode + '\'' +
                ", cpascRtDate=" + cpascRtDate +
                ", cpascRtSub='" + cpascRtSub + '\'' +
                ", cpasoCadastreCode='" + cpasoCadastreCode + '\'' +
                ", ieGuide='" + ieGuide + '\'' +
                ", ormsuIdAmCadastre=" + ormsuIdAmCadastre +
                ", ormsuIdSquareBuilding=" + ormsuIdSquareBuilding +
                ", ormsuIdSquareH=" + ormsuIdSquareH +
                ", cpasoSquareH='" + cpasoSquareH + '\'' +
                ", fullAdress='" + fullAdress + '\'' +
                ", cpprtName='" + cpprtName + '\'' +
                ", ormsuCode='" + ormsuCode + '\'' +
                ", code1='" + code1 + '\'' +
                ", code2='" + code2 + '\'' +
                ", cpobsName='" + cpobsName + '\'' +
                ", cpautCode='" + cpautCode + '\'' +
                '}';
    }
}
