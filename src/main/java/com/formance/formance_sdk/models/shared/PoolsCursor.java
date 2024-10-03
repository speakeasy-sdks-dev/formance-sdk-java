/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * PoolsCursor - OK
 */

public class PoolsCursor {

    @JsonProperty("cursor")
    private PoolsCursorCursor cursor;

    @JsonCreator
    public PoolsCursor(
            @JsonProperty("cursor") PoolsCursorCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public PoolsCursorCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PoolsCursor withCursor(PoolsCursorCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
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
        PoolsCursor other = (PoolsCursor) o;
        return 
            Objects.deepEquals(this.cursor, other.cursor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cursor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PoolsCursor.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private PoolsCursorCursor cursor;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(PoolsCursorCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public PoolsCursor build() {
            return new PoolsCursor(
                cursor);
        }
    }
}

