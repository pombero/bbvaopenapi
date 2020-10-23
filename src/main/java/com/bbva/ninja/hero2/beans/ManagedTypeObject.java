
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "javaType",
    "persistenceType",
    "attributes",
    "declaredAttributes",
    "declaredPluralAttributes",
    "declaredSingularAttributes",
    "pluralAttributes",
    "singularAttributes"
})
public class ManagedTypeObject {

    @JsonProperty("javaType")
    private JavaType javaType;
    @JsonProperty("persistenceType")
    private PersistenceType persistenceType;
    @JsonProperty("attributes")
    private SetAttributeSuperObjectObject attributes;
    @JsonProperty("declaredAttributes")
    private SetAttributeObjectObject declaredAttributes;
    @JsonProperty("declaredPluralAttributes")
    private SetPluralAttributeObjectObjectObject declaredPluralAttributes;
    @JsonProperty("declaredSingularAttributes")
    private SetSingularAttributeObjectObject declaredSingularAttributes;
    @JsonProperty("pluralAttributes")
    private SetPluralAttributeSuperObjectObjectObject pluralAttributes;
    @JsonProperty("singularAttributes")
    private SetSingularAttributeSuperObjectObject singularAttributes;

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

    @JsonProperty("attributes")
    public SetAttributeSuperObjectObject getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(SetAttributeSuperObjectObject attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("declaredAttributes")
    public SetAttributeObjectObject getDeclaredAttributes() {
        return declaredAttributes;
    }

    @JsonProperty("declaredAttributes")
    public void setDeclaredAttributes(SetAttributeObjectObject declaredAttributes) {
        this.declaredAttributes = declaredAttributes;
    }

    @JsonProperty("declaredPluralAttributes")
    public SetPluralAttributeObjectObjectObject getDeclaredPluralAttributes() {
        return declaredPluralAttributes;
    }

    @JsonProperty("declaredPluralAttributes")
    public void setDeclaredPluralAttributes(SetPluralAttributeObjectObjectObject declaredPluralAttributes) {
        this.declaredPluralAttributes = declaredPluralAttributes;
    }

    @JsonProperty("declaredSingularAttributes")
    public SetSingularAttributeObjectObject getDeclaredSingularAttributes() {
        return declaredSingularAttributes;
    }

    @JsonProperty("declaredSingularAttributes")
    public void setDeclaredSingularAttributes(SetSingularAttributeObjectObject declaredSingularAttributes) {
        this.declaredSingularAttributes = declaredSingularAttributes;
    }

    @JsonProperty("pluralAttributes")
    public SetPluralAttributeSuperObjectObjectObject getPluralAttributes() {
        return pluralAttributes;
    }

    @JsonProperty("pluralAttributes")
    public void setPluralAttributes(SetPluralAttributeSuperObjectObjectObject pluralAttributes) {
        this.pluralAttributes = pluralAttributes;
    }

    @JsonProperty("singularAttributes")
    public SetSingularAttributeSuperObjectObject getSingularAttributes() {
        return singularAttributes;
    }

    @JsonProperty("singularAttributes")
    public void setSingularAttributes(SetSingularAttributeSuperObjectObject singularAttributes) {
        this.singularAttributes = singularAttributes;
    }

}
