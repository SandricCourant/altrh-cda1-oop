package org.example.domain;

public class Person extends Entity {

    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    @Override
    public boolean match(String s) {
        return (firstname + " " + lastname).toLowerCase().contains(s.toLowerCase());
    }
}