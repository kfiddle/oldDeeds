package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Deed {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate recordedDate;

    private String description;

    private double acres;

    private String notes;

    public Deed() {
    }

    public Deed(LocalDate recordedDate, double acres) {
        this.recordedDate = recordedDate;
        this.acres = acres;
    }

    public void setRecordedDate(LocalDate recordedDate) {
        this.recordedDate = recordedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getRecordedDate() {
        return recordedDate;
    }

    public String getDescription() {
        return description;
    }

    public double getAcres() {
        return acres;
    }

    public String getNotes() {
        return notes;
    }
}
