
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "javaType",
    "persistenceType"
})
public class TypeObject {

    @JsonProperty("javaType")
    private JavaType javaType;
    @JsonProperty("persistenceType")
    private PersistenceType persistenceType;

    @JsonProperty("javaType")
    public JavaType getJavaType() {
        return javaType;
    }

    @JsonProperty("javaType")
    public void setJavaType(JavaType javaType) {
        this.javaType = javaType;
    }

    @JsonProperty("persistenceType")
    public PersistenceType getPersistenceType() {
        return persistenceType;
    }

    @JsonProperty("persistenceType")
    public void setPersistenceType(PersistenceType persistenceType) {
        this.persistenceType = persistenceType;
    }

}
