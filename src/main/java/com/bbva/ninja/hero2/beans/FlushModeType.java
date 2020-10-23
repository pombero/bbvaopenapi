
package com.bbva.ninja.hero2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FlushModeType {

    AUTO("AUTO"),
    COMMIT("COMMIT");
    private final String value;
    private final static Map<String, FlushModeType> CONSTANTS = new HashMap<String, FlushModeType>();

    static {
        for (FlushModeType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private FlushModeType(String value) {
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
    public static FlushModeType fromValue(String value) {
        FlushModeType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
