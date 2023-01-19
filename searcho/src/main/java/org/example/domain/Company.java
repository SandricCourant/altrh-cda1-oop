package org.example.domain;

public class Company extends Entity {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean match(String s) {
        return name.toLowerCase().contains(s.toLowerCase());
    }

}
