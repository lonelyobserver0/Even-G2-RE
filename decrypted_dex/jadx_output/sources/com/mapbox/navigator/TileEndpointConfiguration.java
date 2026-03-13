package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TileEndpointConfiguration implements Serializable {
    private final String dataset;
    private final String host;
    private final boolean isFallback;
    private final Integer minDiffInDaysToConsiderServerVersion;
    private final String version;
    private final String versionBeforeFallback;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TileEndpointConfiguration(String str, String str2, String str3, boolean z2, String str4, Integer num) {
        this.host = str;
        this.dataset = str2;
        this.version = str3;
        this.isFallback = z2;
        this.versionBeforeFallback = str4;
        this.minDiffInDaysToConsiderServerVersion = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileEndpointConfiguration tileEndpointConfiguration = (TileEndpointConfiguration) obj;
        return Objects.equals(this.host, tileEndpointConfiguration.host) && Objects.equals(this.dataset, tileEndpointConfiguration.dataset) && Objects.equals(this.version, tileEndpointConfiguration.version) && this.isFallback == tileEndpointConfiguration.isFallback && Objects.equals(this.versionBeforeFallback, tileEndpointConfiguration.versionBeforeFallback) && Objects.equals(this.minDiffInDaysToConsiderServerVersion, tileEndpointConfiguration.minDiffInDaysToConsiderServerVersion);
    }

    public String getDataset() {
        return this.dataset;
    }

    public String getHost() {
        return this.host;
    }

    public boolean getIsFallback() {
        return this.isFallback;
    }

    public Integer getMinDiffInDaysToConsiderServerVersion() {
        return this.minDiffInDaysToConsiderServerVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionBeforeFallback() {
        return this.versionBeforeFallback;
    }

    public int hashCode() {
        return Objects.hash(this.host, this.dataset, this.version, Boolean.valueOf(this.isFallback), this.versionBeforeFallback, this.minDiffInDaysToConsiderServerVersion);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[host: ");
        h.z(sb2, this.host, ", dataset: ");
        h.z(sb2, this.dataset, ", version: ");
        h.z(sb2, this.version, ", isFallback: ");
        h.A(this.isFallback, sb2, ", versionBeforeFallback: ");
        h.z(sb2, this.versionBeforeFallback, ", minDiffInDaysToConsiderServerVersion: ");
        sb2.append(RecordUtils.fieldToString(this.minDiffInDaysToConsiderServerVersion));
        sb2.append("]");
        return sb2.toString();
    }
}
