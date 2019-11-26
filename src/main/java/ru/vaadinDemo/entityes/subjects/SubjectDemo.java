package ru.vaadinDemo.entityes.subjects;

public class SubjectDemo {

    private String nameSubject;
    private String okpo;
    private String fullName;
    private String shortName;
    private String inn;
    private String kpp;
    private String ogrn;

    public SubjectDemo() {
    }

    public SubjectDemo(String nameSubject, String okpo, String fullName, String shortName, String inn, String kpp, String ogrn) {
        this.nameSubject = nameSubject;
        this.okpo = okpo;
        this.fullName = fullName;
        this.shortName = shortName;
        this.inn = inn;
        this.kpp = kpp;
        this.ogrn = ogrn;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }
}
