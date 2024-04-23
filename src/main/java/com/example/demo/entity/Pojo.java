package com.example.demo.entity;

import com.fasterxml.jackson.databind.JsonNode;

public class Pojo {

    private JsonNode node;

    public JsonNode getNode() {
        return node;
    }

    public void setNode(JsonNode node) {
        this.node = node;
    }
}
