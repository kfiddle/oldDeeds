package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;

    private String residence;

    public Person() {
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, String residence) {
        this.fullName = fullName;
        this.residence = residence;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getResidence() {
        return residence;
    }
}
