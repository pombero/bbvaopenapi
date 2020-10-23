
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cache",
    "criteriaBuilder",
    "metamodel",
    "persistenceUnitUtil",
    "properties",
    "open"
})
public class EntityManagerFactory {

    @JsonProperty("cache")
    private Cache cache;
    @JsonProperty("criteriaBuilder")
    private CriteriaBuilder criteriaBuilder;
    @JsonProperty("metamodel")
    private Metamodel metamodel;
    @JsonProperty("persistenceUnitUtil")
    private PersistenceUnitUtil persistenceUnitUtil;
    @JsonProperty("properties")
    private MapStringObject properties;
    @JsonProperty("open")
    private Boolean open;

    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    @JsonProperty("cache")
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    @JsonProperty("criteriaBuilder")
    public CriteriaBuilder getCriteriaBuilder() {
        return criteriaBuilder;
    }

    @JsonProperty("criteriaBuilder")
    public void setCriteriaBuilder(CriteriaBuilder criteriaBuilder) {
        this.criteriaBuilder = criteriaBuilder;
    }

    @JsonProperty("metamodel")
    public Metamodel getMetamodel() {
        return metamodel;
    }

    @JsonProperty("metamodel")
    public void setMetamodel(Metamodel metamodel) {
        this.metamodel = metamodel;
    }

    @JsonProperty("persistenceUnitUtil")
    public PersistenceUnitUtil getPersistenceUnitUtil() {
        return persistenceUnitUtil;
    }

    @JsonProperty("persistenceUnitUtil")
    public void setPersistenceUnitUtil(PersistenceUnitUtil persistenceUnitUtil) {
        this.persistenceUnitUtil = persistenceUnitUtil;
    }

    @JsonProperty("properties")
    public MapStringObject getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(MapStringObject properties) {
        this.properties = properties;
    }

    @JsonProperty("open")
    public Boolean getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

}
