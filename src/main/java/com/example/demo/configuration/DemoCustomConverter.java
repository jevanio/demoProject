package com.example.demo.configuration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

public class DemoCustomConverter {

    public static final Converter<JsonNode, String> JSON_NODE_STRING_CONVERTER =
            new Converter<JsonNode, String>() {
                @Override
                public String convert(JsonNode node) {
                    return node.asText();
                }

            };

    public static final Converter<String, JsonNode> STRING_JSON_NODE_CONVERTER =
            new Converter<String, JsonNode>() {
                @Override
                public JsonNode convert(String source) {
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        return mapper.readTree(source);
                    } catch (Exception e) {
                        return null;
                    }
                }
            };
}
