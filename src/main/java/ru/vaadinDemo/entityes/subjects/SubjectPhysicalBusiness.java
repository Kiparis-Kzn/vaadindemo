package ru.vaadinDemo.entityes.subjects;

import javax.persistence.Entity;

@Entity
public class SubjectPhysicalBusiness extends SubjectPhysical {

    private String bussinesName;

    public String getBussinesName() {
        return bussinesName;
    }

    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }
}
