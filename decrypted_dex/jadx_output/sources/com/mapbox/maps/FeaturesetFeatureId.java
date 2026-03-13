package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeaturesetFeatureId implements Serializable {
    private final String featureId;
    private final String featureNamespace;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FeaturesetFeatureId(String str, String str2) {
        this.featureId = str;
        this.featureNamespace = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetFeatureId.class != obj.getClass()) {
            return false;
        }
        FeaturesetFeatureId featuresetFeatureId = (FeaturesetFeatureId) obj;
        return Objects.equals(this.featureId, featuresetFeatureId.featureId) && Objects.equals(this.featureNamespace, featuresetFeatureId.featureNamespace);
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public String getFeatureNamespace() {
        return this.featureNamespace;
    }

    public int hashCode() {
        return Objects.hash(this.featureId, this.featureNamespace);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[featureId: ");
        Xa.h.z(sb2, this.featureId, ", featureNamespace: ");
        return Xa.h.t(sb2, this.featureNamespace, "]");
    }
}
