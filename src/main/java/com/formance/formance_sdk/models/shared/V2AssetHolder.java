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
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;


public class V2AssetHolder {

    @JsonProperty("assets")
    private Map<String, BigInteger> assets;

    @JsonCreator
    public V2AssetHolder(
            @JsonProperty("assets") Map<String, BigInteger> assets) {
        assets = Utils.emptyMapIfNull(assets);
        this.assets = assets;
    }

    @JsonIgnore
    public Map<String, BigInteger> assets() {
        return assets;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2AssetHolder withAssets(Map<String, BigInteger> assets) {
        Utils.checkNotNull(assets, "assets");
        this.assets = assets;
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
        V2AssetHolder other = (V2AssetHolder) o;
        return 
            Objects.deepEquals(this.assets, other.assets);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            assets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2AssetHolder.class,
                "assets", assets);
    }
    
    public final static class Builder {
 
        private Map<String, BigInteger> assets;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder assets(Map<String, BigInteger> assets) {
            Utils.checkNotNull(assets, "assets");
            this.assets = assets;
            return this;
        }
        
        public V2AssetHolder build() {
            return new V2AssetHolder(
                assets);
        }
    }
}

