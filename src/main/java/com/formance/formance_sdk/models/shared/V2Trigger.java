/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2Trigger {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("event")
    private String event;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<String> filter;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends Map<String, Object>> vars;

    @JsonProperty("workflowID")
    private String workflowID;

    @JsonCreator
    public V2Trigger(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("event") String event,
            @JsonProperty("filter") Optional<String> filter,
            @JsonProperty("id") String id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("vars") Optional<? extends Map<String, Object>> vars,
            @JsonProperty("workflowID") String workflowID) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(event, "event");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(vars, "vars");
        Utils.checkNotNull(workflowID, "workflowID");
        this.createdAt = createdAt;
        this.event = event;
        this.filter = filter;
        this.id = id;
        this.name = name;
        this.vars = vars;
        this.workflowID = workflowID;
    }
    
    public V2Trigger(
            OffsetDateTime createdAt,
            String event,
            String id,
            String workflowID) {
        this(createdAt, event, Optional.empty(), id, Optional.empty(), Optional.empty(), workflowID);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String event() {
        return event;
    }

    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> vars() {
        return (Optional<Map<String, Object>>) vars;
    }

    @JsonIgnore
    public String workflowID() {
        return workflowID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Trigger withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V2Trigger withEvent(String event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    public V2Trigger withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public V2Trigger withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public V2Trigger withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2Trigger withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public V2Trigger withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public V2Trigger withVars(Map<String, Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public V2Trigger withVars(Optional<? extends Map<String, Object>> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = vars;
        return this;
    }

    public V2Trigger withWorkflowID(String workflowID) {
        Utils.checkNotNull(workflowID, "workflowID");
        this.workflowID = workflowID;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2Trigger other = (V2Trigger) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.event, other.event) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.vars, other.vars) &&
            Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            event,
            filter,
            id,
            name,
            vars,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Trigger.class,
                "createdAt", createdAt,
                "event", event,
                "filter", filter,
                "id", id,
                "name", name,
                "vars", vars,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String event;
 
        private Optional<String> filter = Optional.empty();
 
        private String id;
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Map<String, Object>> vars = Optional.empty();
 
        private String workflowID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder event(String event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder vars(Map<String, Object> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends Map<String, Object>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }

        public Builder workflowID(String workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = workflowID;
            return this;
        }
        
        public V2Trigger build() {
            return new V2Trigger(
                createdAt,
                event,
                filter,
                id,
                name,
                vars,
                workflowID);
        }
    }
}

