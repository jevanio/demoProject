package com.example.demo.entity;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;

@Entity(name = "demo-entity")
public class DemoEntity {

    private transient Pojo pojo;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
