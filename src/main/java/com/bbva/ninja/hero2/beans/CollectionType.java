
package com.bbva.ninja.hero2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CollectionType {

    COLLECTION("COLLECTION"),
    LIST("LIST"),
    MAP("MAP"),
    SET("SET");
    private final String value;
    private final static Map<String, CollectionType> CONSTANTS = new HashMap<String, CollectionType>();

    static {
        for (CollectionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CollectionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollectionType fromValue(String value) {
        CollectionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
