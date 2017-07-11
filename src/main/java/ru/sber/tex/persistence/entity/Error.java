package ru.sber.tex.persistence.entity;

/**
 * Created by Tpaktop on 7/10/2017.
 */
public class Error {
    private String description;

    public Error() {}

    public Error(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
