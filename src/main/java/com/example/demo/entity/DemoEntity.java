package com.example.demo.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;

@Entity
public class DemoEntity {

    private JsonNode node;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonNode getNode() {
        return node;
    }

    public void setNode(JsonNode node) {
        this.node = node;
    }
}
