package com.kilfat.web.model.deserializer;

import com.fasterxml.jackson.databind.JsonNode;

public class DeserializerHelper {

    public static JsonNode getFieldNode(JsonNode node, String field) {
        if (node.get(field) != null) {
            return node.get(field);
        }
        return null;
    }

    public static String getField(JsonNode node, String field) {
        if (node.get(field) != null) {
            return node.get(field).textValue();
        }
        return "";
    }
}