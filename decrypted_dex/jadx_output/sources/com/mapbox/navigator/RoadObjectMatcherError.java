package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectMatcherError implements Serializable {
    private final String description;
    private final String roadObjectId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectMatcherError(String str, String str2) {
        this.description = str;
        this.roadObjectId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectMatcherError roadObjectMatcherError = (RoadObjectMatcherError) obj;
        return Objects.equals(this.description, roadObjectMatcherError.description) && Objects.equals(this.roadObjectId, roadObjectMatcherError.roadObjectId);
    }

    public String getDescription() {
        return this.description;
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public int hashCode() {
        return Objects.hash(this.description, this.roadObjectId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[description: ");
        h.z(sb2, this.description, ", roadObjectId: ");
        return h.t(sb2, this.roadObjectId, "]");
    }
}
