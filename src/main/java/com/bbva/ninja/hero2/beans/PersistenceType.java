
package com.bbva.ninja.hero2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PersistenceType {

    BASIC("BASIC"),
    EMBEDDABLE("EMBEDDABLE"),
    ENTITY("ENTITY"),
    MAPPED_SUPERCLASS("MAPPED_SUPERCLASS");
    private final String value;
    private final static Map<String, PersistenceType> CONSTANTS = new HashMap<String, PersistenceType>();

    static {
        for (PersistenceType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PersistenceType(String value) {
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
    public static PersistenceType fromValue(String value) {
        PersistenceType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
