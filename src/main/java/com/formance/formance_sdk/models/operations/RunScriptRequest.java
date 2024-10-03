/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.Script;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class RunScriptRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Script script;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=preview")
    private Optional<Boolean> preview;

    @JsonCreator
    public RunScriptRequest(
            Script script,
            String ledger,
            Optional<Boolean> preview) {
        Utils.checkNotNull(script, "script");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(preview, "preview");
        this.script = script;
        this.ledger = ledger;
        this.preview = preview;
    }
    
    public RunScriptRequest(
            Script script,
            String ledger) {
        this(script, ledger, Optional.empty());
    }

    @JsonIgnore
    public Script script() {
        return script;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @JsonIgnore
    public Optional<Boolean> preview() {
        return preview;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RunScriptRequest withScript(Script script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public RunScriptRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public RunScriptRequest withPreview(boolean preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = Optional.ofNullable(preview);
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public RunScriptRequest withPreview(Optional<Boolean> preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = preview;
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
        RunScriptRequest other = (RunScriptRequest) o;
        return 
            Objects.deepEquals(this.script, other.script) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.preview, other.preview);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            script,
            ledger,
            preview);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunScriptRequest.class,
                "script", script,
                "ledger", ledger,
                "preview", preview);
    }
    
    public final static class Builder {
 
        private Script script;
 
        private String ledger;
 
        private Optional<Boolean> preview = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder script(Script script) {
            Utils.checkNotNull(script, "script");
            this.script = script;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(boolean preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = Optional.ofNullable(preview);
            return this;
        }

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(Optional<Boolean> preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = preview;
            return this;
        }
        
        public RunScriptRequest build() {
            return new RunScriptRequest(
                script,
                ledger,
                preview);
        }
    }
}

