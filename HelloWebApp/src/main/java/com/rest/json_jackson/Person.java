package com.rest.json_jackson;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
    private int id;
    private String name;
    private String surname;

    public Person() {}

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getSurname() {
        return surname;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
}

