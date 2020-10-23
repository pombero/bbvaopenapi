
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "declaringType",
    "javaMember",
    "javaType",
    "name",
    "persistentAttributeType",
    "association",
    "collection",
    "bindableJavaType",
    "bindableType",
    "type",
    "id",
    "optional",
    "version"
})
public class SingularAttributeObjectObject {

    /**
     * Cyclic reference to javax.persistence.metamodel.ManagedType
     * 
     */
    @JsonProperty("declaringType")
    @JsonPropertyDescription("Cyclic reference to javax.persistence.metamodel.ManagedType")
    private ManagedTypeObject1 declaringType;
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
    @JsonProperty("bindableJavaType")
    private BindableJavaType bindableJavaType;
    @JsonProperty("bindableType")
    private BindableType bindableType;
    @JsonProperty("type")
    private TypeObject type;
    @JsonProperty("id")
    private Boolean id;
    @JsonProperty("optional")
    private Boolean optional;
    @JsonProperty("version")
    private Boolean version;

    /**
     * Cyclic reference to javax.persistence.metamodel.ManagedType
     * 
     */
    @JsonProperty("declaringType")
    public ManagedTypeObject1 getDeclaringType() {
        return declaringType;
    }

    /**
     * Cyclic reference to javax.persistence.metamodel.ManagedType
     * 
     */
    @JsonProperty("declaringType")
    public void setDeclaringType(ManagedTypeObject1 declaringType) {
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

    @JsonProperty("type")
    public TypeObject getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(TypeObject type) {
        this.type = type;
    }

    @JsonProperty("id")
    public Boolean getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Boolean id) {
        this.id = id;
    }

    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @JsonProperty("version")
    public Boolean getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Boolean version) {
        this.version = version;
    }

}
