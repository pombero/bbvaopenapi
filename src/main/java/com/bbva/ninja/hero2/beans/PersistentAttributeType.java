
package com.bbva.ninja.hero2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PersistentAttributeType {

    BASIC("BASIC"),
    ELEMENT_COLLECTION("ELEMENT_COLLECTION"),
    EMBEDDED("EMBEDDED"),
    MANY_TO_MANY("MANY_TO_MANY"),
    MANY_TO_ONE("MANY_TO_ONE"),
    ONE_TO_MANY("ONE_TO_MANY"),
    ONE_TO_ONE("ONE_TO_ONE");
    private final String value;
    private final static Map<String, PersistentAttributeType> CONSTANTS = new HashMap<String, PersistentAttributeType>();

    static {
        for (PersistentAttributeType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PersistentAttributeType(String value) {
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
    public static PersistentAttributeType fromValue(String value) {
        PersistentAttributeType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
