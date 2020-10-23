
package com.bbva.ninja.hero2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BindableType {

    ENTITY_TYPE("ENTITY_TYPE"),
    PLURAL_ATTRIBUTE("PLURAL_ATTRIBUTE"),
    SINGULAR_ATTRIBUTE("SINGULAR_ATTRIBUTE");
    private final String value;
    private final static Map<String, BindableType> CONSTANTS = new HashMap<String, BindableType>();

    static {
        for (BindableType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BindableType(String value) {
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
    public static BindableType fromValue(String value) {
        BindableType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
