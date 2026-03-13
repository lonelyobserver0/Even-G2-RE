package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeaturesetDescriptor implements Serializable {
    private final String featuresetId;
    private final String importId;
    private final String layerId;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FeaturesetDescriptor(String str, String str2, String str3) {
        this.featuresetId = str;
        this.importId = str2;
        this.layerId = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetDescriptor.class != obj.getClass()) {
            return false;
        }
        FeaturesetDescriptor featuresetDescriptor = (FeaturesetDescriptor) obj;
        return Objects.equals(this.featuresetId, featuresetDescriptor.featuresetId) && Objects.equals(this.importId, featuresetDescriptor.importId) && Objects.equals(this.layerId, featuresetDescriptor.layerId);
    }

    public String getFeaturesetId() {
        return this.featuresetId;
    }

    public String getImportId() {
        return this.importId;
    }

    public String getLayerId() {
        return this.layerId;
    }

    public int hashCode() {
        return Objects.hash(this.featuresetId, this.importId, this.layerId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[featuresetId: ");
        Xa.h.z(sb2, this.featuresetId, ", importId: ");
        Xa.h.z(sb2, this.importId, ", layerId: ");
        return Xa.h.t(sb2, this.layerId, "]");
    }
}
