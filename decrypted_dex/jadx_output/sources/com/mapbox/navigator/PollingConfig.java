package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PollingConfig implements Serializable {
    private Double lookAhead;
    private Double unconditionalInterval;
    private Double unconditionalPatience;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PollingConfig(Double d8, Double d10, Double d11) {
        this.lookAhead = d8;
        this.unconditionalPatience = d10;
        this.unconditionalInterval = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollingConfig pollingConfig = (PollingConfig) obj;
        return Objects.equals(this.lookAhead, pollingConfig.lookAhead) && Objects.equals(this.unconditionalPatience, pollingConfig.unconditionalPatience) && Objects.equals(this.unconditionalInterval, pollingConfig.unconditionalInterval);
    }

    public Double getLookAhead() {
        return this.lookAhead;
    }

    public Double getUnconditionalInterval() {
        return this.unconditionalInterval;
    }

    public Double getUnconditionalPatience() {
        return this.unconditionalPatience;
    }

    public int hashCode() {
        return Objects.hash(this.lookAhead, this.unconditionalPatience, this.unconditionalInterval);
    }

    public void setLookAhead(Double d8) {
        this.lookAhead = d8;
    }

    public void setUnconditionalInterval(Double d8) {
        this.unconditionalInterval = d8;
    }

    public void setUnconditionalPatience(Double d8) {
        this.unconditionalPatience = d8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[lookAhead: ");
        b.r(this.lookAhead, sb2, ", unconditionalPatience: ");
        b.r(this.unconditionalPatience, sb2, ", unconditionalInterval: ");
        sb2.append(RecordUtils.fieldToString(this.unconditionalInterval));
        sb2.append("]");
        return sb2.toString();
    }
}
