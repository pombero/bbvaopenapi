
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "declaringType",
    "javaMember",
    "javaType",
    "name",
    "persistentAttributeType",
    "association",
    "collection"
})
public class AttributeSuperObjectObject {

    @JsonProperty("declaringType")
    private ManagedTypeSuperObject declaringType;
    @JsonProperty("javaMember")
    private JavaMember javaMember;
    @JsonProperty("javaType")
    private JavaType javaType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("persistentAttributeType")
    private PersistentAttributeType persistentAttributeType;
    @JsonProperty("association")
    private Boolean association;
    @JsonProperty("collection")
    private Boolean collection;

    @JsonProperty("declaringType")
    public ManagedTypeSuperObject getDeclaringType() {
        return declaringType;
    }

    @JsonProperty("declaringType")
    public void setDeclaringType(ManagedTypeSuperObject declaringType) {
        this.declaringType = declaringType;
    }

    @JsonProperty("javaMember")
    public JavaMember getJavaMember() {
        return javaMember;
    }

    @JsonProperty("javaMember")
    public void setJavaMember(JavaMember javaMember) {
        this.javaMember = javaMember;
    }

    @JsonProperty("javaType")
    public JavaType getJavaType() {
        return javaType;
    }

    @JsonProperty("javaType")
    public void setJavaType(JavaType javaType) {
        this.javaType = javaType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("persistentAttributeType")
    public PersistentAttributeType getPersistentAttributeType() {
        return persistentAttributeType;
    }

    @JsonProperty("persistentAttributeType")
    public void setPersistentAttributeType(PersistentAttributeType persistentAttributeType) {
        this.persistentAttributeType = persistentAttributeType;
    }

    @JsonProperty("association")
    public Boolean getAssociation() {
        return association;
    }

    @JsonProperty("association")
    public void setAssociation(Boolean association) {
        this.association = association;
    }

    @JsonProperty("collection")
    public Boolean getCollection() {
        return collection;
    }

    @JsonProperty("collection")
    public void setCollection(Boolean collection) {
        this.collection = collection;
    }

}
