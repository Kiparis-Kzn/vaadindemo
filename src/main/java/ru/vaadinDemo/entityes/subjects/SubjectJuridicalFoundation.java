package ru.vaadinDemo.entityes.subjects;

import javax.persistence.Entity;

@Entity
public class SubjectJuridicalFoundation extends SubjectJuridical {

    private String customProperty;

    public String getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(String customProperty) {
        this.customProperty = customProperty;
    }
}
