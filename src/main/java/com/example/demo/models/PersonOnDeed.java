package com.example.demo.models;


import com.example.demo.enums.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PersonOnDeed {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Deed deed;

    private Role role;

    public PersonOnDeed() {
    }

    public PersonOnDeed(Deed deed, Person person, Role role) {
        this.deed = deed;
        this.person = person;
        this.role = role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDeed(Deed deed) {
        this.deed = deed;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Deed getDeed() {
        return deed;
    }

    public Role getRole() {
        return role;
    }
}
