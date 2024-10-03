/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class BankingCircleConfig {

    @JsonProperty("authorizationEndpoint")
    private String authorizationEndpoint;

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("name")
    private String name;

    @JsonProperty("password")
    private String password;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonProperty("userCertificate")
    private String userCertificate;

    @JsonProperty("userCertificateKey")
    private String userCertificateKey;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public BankingCircleConfig(
            @JsonProperty("authorizationEndpoint") String authorizationEndpoint,
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("name") String name,
            @JsonProperty("password") String password,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod,
            @JsonProperty("userCertificate") String userCertificate,
            @JsonProperty("userCertificateKey") String userCertificateKey,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        Utils.checkNotNull(userCertificate, "userCertificate");
        Utils.checkNotNull(userCertificateKey, "userCertificateKey");
        Utils.checkNotNull(username, "username");
        this.authorizationEndpoint = authorizationEndpoint;
        this.endpoint = endpoint;
        this.name = name;
        this.password = password;
        this.pollingPeriod = pollingPeriod;
        this.userCertificate = userCertificate;
        this.userCertificateKey = userCertificateKey;
        this.username = username;
    }
    
    public BankingCircleConfig(
            String authorizationEndpoint,
            String endpoint,
            String name,
            String password,
            String userCertificate,
            String userCertificateKey,
            String username) {
        this(authorizationEndpoint, endpoint, name, password, Optional.empty(), userCertificate, userCertificateKey, username);
    }

    @JsonIgnore
    public String authorizationEndpoint() {
        return authorizationEndpoint;
    }

    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
     * 
     */
    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return pollingPeriod;
    }

    @JsonIgnore
    public String userCertificate() {
        return userCertificate;
    }

    @JsonIgnore
    public String userCertificateKey() {
        return userCertificateKey;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BankingCircleConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public BankingCircleConfig withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public BankingCircleConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public BankingCircleConfig withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
     * 
     */
    public BankingCircleConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
     * 
     */
    public BankingCircleConfig withPollingPeriod(Optional<String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }

    public BankingCircleConfig withUserCertificate(String userCertificate) {
        Utils.checkNotNull(userCertificate, "userCertificate");
        this.userCertificate = userCertificate;
        return this;
    }

    public BankingCircleConfig withUserCertificateKey(String userCertificateKey) {
        Utils.checkNotNull(userCertificateKey, "userCertificateKey");
        this.userCertificateKey = userCertificateKey;
        return this;
    }

    public BankingCircleConfig withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        BankingCircleConfig other = (BankingCircleConfig) o;
        return 
            Objects.deepEquals(this.authorizationEndpoint, other.authorizationEndpoint) &&
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod) &&
            Objects.deepEquals(this.userCertificate, other.userCertificate) &&
            Objects.deepEquals(this.userCertificateKey, other.userCertificateKey) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authorizationEndpoint,
            endpoint,
            name,
            password,
            pollingPeriod,
            userCertificate,
            userCertificateKey,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankingCircleConfig.class,
                "authorizationEndpoint", authorizationEndpoint,
                "endpoint", endpoint,
                "name", name,
                "password", password,
                "pollingPeriod", pollingPeriod,
                "userCertificate", userCertificate,
                "userCertificateKey", userCertificateKey,
                "username", username);
    }
    
    public final static class Builder {
 
        private String authorizationEndpoint;
 
        private String endpoint;
 
        private String name;
 
        private String password;
 
        private Optional<String> pollingPeriod;
 
        private String userCertificate;
 
        private String userCertificateKey;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Banking Circle API.
         * 
         */
        public Builder pollingPeriod(Optional<String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }

        public Builder userCertificate(String userCertificate) {
            Utils.checkNotNull(userCertificate, "userCertificate");
            this.userCertificate = userCertificate;
            return this;
        }

        public Builder userCertificateKey(String userCertificateKey) {
            Utils.checkNotNull(userCertificateKey, "userCertificateKey");
            this.userCertificateKey = userCertificateKey;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public BankingCircleConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }            return new BankingCircleConfig(
                authorizationEndpoint,
                endpoint,
                name,
                password,
                pollingPeriod,
                userCertificate,
                userCertificateKey,
                username);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<String>>() {});
    }
}

