package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class QueriedSourceFeature implements Serializable {
    private final QueriedFeature queriedFeature;
    private final FeaturesetQueryTarget target;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedSourceFeature(QueriedFeature queriedFeature, FeaturesetQueryTarget featuresetQueryTarget) {
        this.queriedFeature = queriedFeature;
        this.target = featuresetQueryTarget;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedSourceFeature.class != obj.getClass()) {
            return false;
        }
        QueriedSourceFeature queriedSourceFeature = (QueriedSourceFeature) obj;
        return Objects.equals(this.queriedFeature, queriedSourceFeature.queriedFeature) && Objects.equals(this.target, queriedSourceFeature.target);
    }

    public QueriedFeature getQueriedFeature() {
        return this.queriedFeature;
    }

    public FeaturesetQueryTarget getTarget() {
        return this.target;
    }

    public int hashCode() {
        return Objects.hash(this.queriedFeature, this.target);
    }

    public String toString() {
        return "[queriedFeature: " + RecordUtils.fieldToString(this.queriedFeature) + ", target: " + RecordUtils.fieldToString(this.target) + "]";
    }
}
