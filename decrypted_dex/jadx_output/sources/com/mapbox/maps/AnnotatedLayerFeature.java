package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AnnotatedLayerFeature implements Serializable {
    private final String featureId;
    private final String layerId;

    /* renamed from: com.mapbox.maps.AnnotatedLayerFeature$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private String featureId;
        private String layerId;

        public AnnotatedLayerFeature build() {
            if (this.layerId != null) {
                return new AnnotatedLayerFeature(this.layerId, this.featureId, null);
            }
            throw new NullPointerException(StubApp.getString2(13885));
        }

        public Builder featureId(String str) {
            this.featureId = str;
            return this;
        }

        public Builder layerId(String str) {
            this.layerId = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ AnnotatedLayerFeature(String str, String str2, AnonymousClass1 anonymousClass1) {
        this(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnnotatedLayerFeature.class != obj.getClass()) {
            return false;
        }
        AnnotatedLayerFeature annotatedLayerFeature = (AnnotatedLayerFeature) obj;
        return Objects.equals(this.layerId, annotatedLayerFeature.layerId) && Objects.equals(this.featureId, annotatedLayerFeature.featureId);
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public String getLayerId() {
        return this.layerId;
    }

    public int hashCode() {
        return Objects.hash(this.layerId, this.featureId);
    }

    public Builder toBuilder() {
        return new Builder().layerId(this.layerId).featureId(this.featureId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[layerId: ");
        Xa.h.z(sb2, this.layerId, ", featureId: ");
        return Xa.h.t(sb2, this.featureId, "]");
    }

    private AnnotatedLayerFeature(String str, String str2) {
        this.layerId = str;
        this.featureId = str2;
    }
}
