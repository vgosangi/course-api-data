package com.AshvFinance.practice.courseapidata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String desciption;

    public Topic(String id, String name, String desciption) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
    }

    public Topic() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }
}
