
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rollbackOnly",
    "active"
})
public class EntityTransaction {

    @JsonProperty("rollbackOnly")
    private Boolean rollbackOnly;
    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("rollbackOnly")
    public Boolean getRollbackOnly() {
        return rollbackOnly;
    }

    @JsonProperty("rollbackOnly")
    public void setRollbackOnly(Boolean rollbackOnly) {
        this.rollbackOnly = rollbackOnly;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

}
