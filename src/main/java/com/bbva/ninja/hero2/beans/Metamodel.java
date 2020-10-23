
package com.bbva.ninja.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "embeddables",
    "entities",
    "managedTypes"
})
public class Metamodel {

    @JsonProperty("embeddables")
    private SetEmbeddableTypeObject embeddables;
    @JsonProperty("entities")
    private SetEntityTypeObject entities;
    @JsonProperty("managedTypes")
    private SetManagedTypeObject managedTypes;

    @JsonProperty("embeddables")
    public SetEmbeddableTypeObject getEmbeddables() {
        return embeddables;
    }

    @JsonProperty("embeddables")
    public void setEmbeddables(SetEmbeddableTypeObject embeddables) {
        this.embeddables = embeddables;
    }

    @JsonProperty("entities")
    public SetEntityTypeObject getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(SetEntityTypeObject entities) {
        this.entities = entities;
    }

    @JsonProperty("managedTypes")
    public SetManagedTypeObject getManagedTypes() {
        return managedTypes;
    }

    @JsonProperty("managedTypes")
    public void setManagedTypes(SetManagedTypeObject managedTypes) {
        this.managedTypes = managedTypes;
    }

}
