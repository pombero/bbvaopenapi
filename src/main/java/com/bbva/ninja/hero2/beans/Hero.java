
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityManager",
    "persistent",
    "id",
    "level",
    "name",
    "otherName",
    "picture",
    "powers"
})
public class Hero {

    @JsonProperty("entityManager")
    private EntityManager entityManager;
    @JsonProperty("persistent")
    private Boolean persistent;
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    private Integer level;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("otherName")
    private String otherName;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("powers")
    private String powers;

    @JsonProperty("entityManager")
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @JsonProperty("entityManager")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @JsonProperty("persistent")
    public Boolean getPersistent() {
        return persistent;
    }

    @JsonProperty("persistent")
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("otherName")
    public String getOtherName() {
        return otherName;
    }

    @JsonProperty("otherName")
    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @JsonProperty("powers")
    public String getPowers() {
        return powers;
    }

    @JsonProperty("powers")
    public void setPowers(String powers) {
        this.powers = powers;
    }

}
