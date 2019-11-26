package ru.vaadinDemo.entityes.subjects;

import javax.persistence.Entity;

@Entity
public class SubjectJuridicalPublicOrg extends SubjectJuridical {

    private String customProperty;

    public String getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(String customProperty) {
        this.customProperty = customProperty;
    }
}
