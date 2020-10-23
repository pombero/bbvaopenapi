
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "criteriaBuilder",
    "delegate",
    "entityManagerFactory",
    "flushMode",
    "metamodel",
    "properties",
    "transaction",
    "joinedToTransaction",
    "open"
})
public class EntityManager {

    @JsonProperty("criteriaBuilder")
    private CriteriaBuilder criteriaBuilder;
    @JsonProperty("delegate")
    private Delegate delegate;
    @JsonProperty("entityManagerFactory")
    private EntityManagerFactory entityManagerFactory;
    @JsonProperty("flushMode")
    private FlushModeType flushMode;
    @JsonProperty("metamodel")
    private Metamodel metamodel;
    @JsonProperty("properties")
    private MapStringObject properties;
    @JsonProperty("transaction")
    private EntityTransaction transaction;
    @JsonProperty("joinedToTransaction")
    private Boolean joinedToTransaction;
    @JsonProperty("open")
    private Boolean open;

    @JsonProperty("criteriaBuilder")
    public CriteriaBuilder getCriteriaBuilder() {
        return criteriaBuilder;
    }

    @JsonProperty("criteriaBuilder")
    public void setCriteriaBuilder(CriteriaBuilder criteriaBuilder) {
        this.criteriaBuilder = criteriaBuilder;
    }

    @JsonProperty("delegate")
    public Delegate getDelegate() {
        return delegate;
    }

    @JsonProperty("delegate")
    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    @JsonProperty("entityManagerFactory")
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @JsonProperty("entityManagerFactory")
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @JsonProperty("flushMode")
    public FlushModeType getFlushMode() {
        return flushMode;
    }

    @JsonProperty("flushMode")
    public void setFlushMode(FlushModeType flushMode) {
        this.flushMode = flushMode;
    }

    @JsonProperty("metamodel")
    public Metamodel getMetamodel() {
        return metamodel;
    }

    @JsonProperty("metamodel")
    public void setMetamodel(Metamodel metamodel) {
        this.metamodel = metamodel;
    }

    @JsonProperty("properties")
    public MapStringObject getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(MapStringObject properties) {
        this.properties = properties;
    }

    @JsonProperty("transaction")
    public EntityTransaction getTransaction() {
        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(EntityTransaction transaction) {
        this.transaction = transaction;
    }

    @JsonProperty("joinedToTransaction")
    public Boolean getJoinedToTransaction() {
        return joinedToTransaction;
    }

    @JsonProperty("joinedToTransaction")
    public void setJoinedToTransaction(Boolean joinedToTransaction) {
        this.joinedToTransaction = joinedToTransaction;
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
