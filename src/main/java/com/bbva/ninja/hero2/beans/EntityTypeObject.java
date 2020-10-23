
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idClassAttributes",
    "idType",
    "supertype",
    "attributes",
    "declaredAttributes",
    "declaredPluralAttributes",
    "declaredSingularAttributes",
    "pluralAttributes",
    "singularAttributes",
    "javaType",
    "persistenceType",
    "bindableJavaType",
    "bindableType",
    "name"
})
public class EntityTypeObject {

    @JsonProperty("idClassAttributes")
    private com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject idClassAttributes;
    @JsonProperty("idType")
    private TypeObject idType;
    @JsonProperty("supertype")
    private IdentifiableTypeSuperObject supertype;
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
    private com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject singularAttributes;
    @JsonProperty("javaType")
    private JavaType javaType;
    @JsonProperty("persistenceType")
    private PersistenceType persistenceType;
    @JsonProperty("bindableJavaType")
    private BindableJavaType bindableJavaType;
    @JsonProperty("bindableType")
    private BindableType bindableType;
    @JsonProperty("name")
    private String name;

    @JsonProperty("idClassAttributes")
    public com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject getIdClassAttributes() {
        return idClassAttributes;
    }

    @JsonProperty("idClassAttributes")
    public void setIdClassAttributes(com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject idClassAttributes) {
        this.idClassAttributes = idClassAttributes;
    }

    @JsonProperty("idType")
    public TypeObject getIdType() {
        return idType;
    }

    @JsonProperty("idType")
    public void setIdType(TypeObject idType) {
        this.idType = idType;
    }

    @JsonProperty("supertype")
    public IdentifiableTypeSuperObject getSupertype() {
        return supertype;
    }

    @JsonProperty("supertype")
    public void setSupertype(IdentifiableTypeSuperObject supertype) {
        this.supertype = supertype;
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
    public com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject getSingularAttributes() {
        return singularAttributes;
    }

    @JsonProperty("singularAttributes")
    public void setSingularAttributes(com.bbva.ninja.hero2.beans.SetSingularAttributeSuperObjectObject singularAttributes) {
        this.singularAttributes = singularAttributes;
    }

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

    @JsonProperty("bindableJavaType")
    public BindableJavaType getBindableJavaType() {
        return bindableJavaType;
    }

    @JsonProperty("bindableJavaType")
    public void setBindableJavaType(BindableJavaType bindableJavaType) {
        this.bindableJavaType = bindableJavaType;
    }

    @JsonProperty("bindableType")
    public BindableType getBindableType() {
        return bindableType;
    }

    @JsonProperty("bindableType")
    public void setBindableType(BindableType bindableType) {
        this.bindableType = bindableType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
