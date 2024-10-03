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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TransferInitiation {

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("description")
    private String description;

    @JsonProperty("destinationAccountID")
    private String destinationAccountID;

    @JsonProperty("error")
    private String error;

    @JsonProperty("id")
    private String id;

    @JsonProperty("initialAmount")
    private BigInteger initialAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, String>> metadata;

    @JsonProperty("reference")
    private String reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relatedAdjustments")
    private Optional<? extends List<TransferInitiationAdjusments>> relatedAdjustments;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relatedPayments")
    private Optional<? extends List<TransferInitiationPayments>> relatedPayments;

    @JsonProperty("scheduledAt")
    private OffsetDateTime scheduledAt;

    @JsonProperty("sourceAccountID")
    private String sourceAccountID;

    @JsonProperty("status")
    private TransferInitiationStatus status;

    @JsonProperty("type")
    private TransferInitiationType type;

    @JsonCreator
    public TransferInitiation(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("description") String description,
            @JsonProperty("destinationAccountID") String destinationAccountID,
            @JsonProperty("error") String error,
            @JsonProperty("id") String id,
            @JsonProperty("initialAmount") BigInteger initialAmount,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, String>> metadata,
            @JsonProperty("reference") String reference,
            @JsonProperty("relatedAdjustments") Optional<? extends List<TransferInitiationAdjusments>> relatedAdjustments,
            @JsonProperty("relatedPayments") Optional<? extends List<TransferInitiationPayments>> relatedPayments,
            @JsonProperty("scheduledAt") OffsetDateTime scheduledAt,
            @JsonProperty("sourceAccountID") String sourceAccountID,
            @JsonProperty("status") TransferInitiationStatus status,
            @JsonProperty("type") TransferInitiationType type) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(initialAmount, "initialAmount");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(relatedAdjustments, "relatedAdjustments");
        Utils.checkNotNull(relatedPayments, "relatedPayments");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.amount = amount;
        this.asset = asset;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.description = description;
        this.destinationAccountID = destinationAccountID;
        this.error = error;
        this.id = id;
        this.initialAmount = initialAmount;
        this.metadata = metadata;
        this.reference = reference;
        this.relatedAdjustments = relatedAdjustments;
        this.relatedPayments = relatedPayments;
        this.scheduledAt = scheduledAt;
        this.sourceAccountID = sourceAccountID;
        this.status = status;
        this.type = type;
    }
    
    public TransferInitiation(
            BigInteger amount,
            String asset,
            String connectorID,
            OffsetDateTime createdAt,
            String description,
            String destinationAccountID,
            String error,
            String id,
            BigInteger initialAmount,
            String reference,
            OffsetDateTime scheduledAt,
            String sourceAccountID,
            TransferInitiationStatus status,
            TransferInitiationType type) {
        this(amount, asset, connectorID, createdAt, description, destinationAccountID, error, id, initialAmount, JsonNullable.undefined(), reference, Optional.empty(), Optional.empty(), scheduledAt, sourceAccountID, status, type);
    }

    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    @JsonIgnore
    public String asset() {
        return asset;
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @JsonIgnore
    public String destinationAccountID() {
        return destinationAccountID;
    }

    @JsonIgnore
    public String error() {
        return error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public BigInteger initialAmount() {
        return initialAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> metadata() {
        return (JsonNullable<Map<String, String>>) metadata;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TransferInitiationAdjusments>> relatedAdjustments() {
        return (Optional<List<TransferInitiationAdjusments>>) relatedAdjustments;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TransferInitiationPayments>> relatedPayments() {
        return (Optional<List<TransferInitiationPayments>>) relatedPayments;
    }

    @JsonIgnore
    public OffsetDateTime scheduledAt() {
        return scheduledAt;
    }

    @JsonIgnore
    public String sourceAccountID() {
        return sourceAccountID;
    }

    @JsonIgnore
    public TransferInitiationStatus status() {
        return status;
    }

    @JsonIgnore
    public TransferInitiationType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TransferInitiation withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public TransferInitiation withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public TransferInitiation withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public TransferInitiation withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public TransferInitiation withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TransferInitiation withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public TransferInitiation withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    public TransferInitiation withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TransferInitiation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TransferInitiation withInitialAmount(long initialAmount) {
        this.initialAmount = BigInteger.valueOf(initialAmount);
        return this;
    }

    public TransferInitiation withInitialAmount(BigInteger initialAmount) {
        Utils.checkNotNull(initialAmount, "initialAmount");
        this.initialAmount = initialAmount;
        return this;
    }

    public TransferInitiation withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public TransferInitiation withMetadata(JsonNullable<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public TransferInitiation withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public TransferInitiation withRelatedAdjustments(List<TransferInitiationAdjusments> relatedAdjustments) {
        Utils.checkNotNull(relatedAdjustments, "relatedAdjustments");
        this.relatedAdjustments = Optional.ofNullable(relatedAdjustments);
        return this;
    }

    public TransferInitiation withRelatedAdjustments(Optional<? extends List<TransferInitiationAdjusments>> relatedAdjustments) {
        Utils.checkNotNull(relatedAdjustments, "relatedAdjustments");
        this.relatedAdjustments = relatedAdjustments;
        return this;
    }

    public TransferInitiation withRelatedPayments(List<TransferInitiationPayments> relatedPayments) {
        Utils.checkNotNull(relatedPayments, "relatedPayments");
        this.relatedPayments = Optional.ofNullable(relatedPayments);
        return this;
    }

    public TransferInitiation withRelatedPayments(Optional<? extends List<TransferInitiationPayments>> relatedPayments) {
        Utils.checkNotNull(relatedPayments, "relatedPayments");
        this.relatedPayments = relatedPayments;
        return this;
    }

    public TransferInitiation withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    public TransferInitiation withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public TransferInitiation withStatus(TransferInitiationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public TransferInitiation withType(TransferInitiationType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        TransferInitiation other = (TransferInitiation) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.asset, other.asset) &&
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.initialAmount, other.initialAmount) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.relatedAdjustments, other.relatedAdjustments) &&
            Objects.deepEquals(this.relatedPayments, other.relatedPayments) &&
            Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            asset,
            connectorID,
            createdAt,
            description,
            destinationAccountID,
            error,
            id,
            initialAmount,
            metadata,
            reference,
            relatedAdjustments,
            relatedPayments,
            scheduledAt,
            sourceAccountID,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferInitiation.class,
                "amount", amount,
                "asset", asset,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "description", description,
                "destinationAccountID", destinationAccountID,
                "error", error,
                "id", id,
                "initialAmount", initialAmount,
                "metadata", metadata,
                "reference", reference,
                "relatedAdjustments", relatedAdjustments,
                "relatedPayments", relatedPayments,
                "scheduledAt", scheduledAt,
                "sourceAccountID", sourceAccountID,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private String description;
 
        private String destinationAccountID;
 
        private String error;
 
        private String id;
 
        private BigInteger initialAmount;
 
        private JsonNullable<? extends Map<String, String>> metadata = JsonNullable.undefined();
 
        private String reference;
 
        private Optional<? extends List<TransferInitiationAdjusments>> relatedAdjustments = Optional.empty();
 
        private Optional<? extends List<TransferInitiationPayments>> relatedPayments = Optional.empty();
 
        private OffsetDateTime scheduledAt;
 
        private String sourceAccountID;
 
        private TransferInitiationStatus status;
 
        private TransferInitiationType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(long amount) {
            this.amount = BigInteger.valueOf(amount);
            return this;
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder destinationAccountID(String destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = destinationAccountID;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder initialAmount(long initialAmount) {
            this.initialAmount = BigInteger.valueOf(initialAmount);
            return this;
        }

        public Builder initialAmount(BigInteger initialAmount) {
            Utils.checkNotNull(initialAmount, "initialAmount");
            this.initialAmount = initialAmount;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder relatedAdjustments(List<TransferInitiationAdjusments> relatedAdjustments) {
            Utils.checkNotNull(relatedAdjustments, "relatedAdjustments");
            this.relatedAdjustments = Optional.ofNullable(relatedAdjustments);
            return this;
        }

        public Builder relatedAdjustments(Optional<? extends List<TransferInitiationAdjusments>> relatedAdjustments) {
            Utils.checkNotNull(relatedAdjustments, "relatedAdjustments");
            this.relatedAdjustments = relatedAdjustments;
            return this;
        }

        public Builder relatedPayments(List<TransferInitiationPayments> relatedPayments) {
            Utils.checkNotNull(relatedPayments, "relatedPayments");
            this.relatedPayments = Optional.ofNullable(relatedPayments);
            return this;
        }

        public Builder relatedPayments(Optional<? extends List<TransferInitiationPayments>> relatedPayments) {
            Utils.checkNotNull(relatedPayments, "relatedPayments");
            this.relatedPayments = relatedPayments;
            return this;
        }

        public Builder scheduledAt(OffsetDateTime scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }

        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }

        public Builder status(TransferInitiationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder type(TransferInitiationType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public TransferInitiation build() {
            return new TransferInitiation(
                amount,
                asset,
                connectorID,
                createdAt,
                description,
                destinationAccountID,
                error,
                id,
                initialAmount,
                metadata,
                reference,
                relatedAdjustments,
                relatedPayments,
                scheduledAt,
                sourceAccountID,
                status,
                type);
        }
    }
}

