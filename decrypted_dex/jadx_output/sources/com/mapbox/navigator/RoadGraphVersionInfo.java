package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadGraphVersionInfo implements Serializable {
    private final String dataset;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadGraphVersionInfo(String str, String str2) {
        this.dataset = str;
        this.version = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadGraphVersionInfo roadGraphVersionInfo = (RoadGraphVersionInfo) obj;
        return Objects.equals(this.dataset, roadGraphVersionInfo.dataset) && Objects.equals(this.version, roadGraphVersionInfo.version);
    }

    public String getDataset() {
        return this.dataset;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.dataset, this.version);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[dataset: ");
        h.z(sb2, this.dataset, ", version: ");
        return h.t(sb2, this.version, "]");
    }
}
