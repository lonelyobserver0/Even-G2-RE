package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class QueriedRenderedFeature implements Serializable {
    private final List<String> layers;
    private final QueriedFeature queriedFeature;
    private final List<FeaturesetQueryTarget> targets;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedRenderedFeature(QueriedFeature queriedFeature, List<String> list, List<FeaturesetQueryTarget> list2) {
        this.queriedFeature = queriedFeature;
        this.layers = list;
        this.targets = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedRenderedFeature.class != obj.getClass()) {
            return false;
        }
        QueriedRenderedFeature queriedRenderedFeature = (QueriedRenderedFeature) obj;
        return Objects.equals(this.queriedFeature, queriedRenderedFeature.queriedFeature) && Objects.equals(this.layers, queriedRenderedFeature.layers) && Objects.equals(this.targets, queriedRenderedFeature.targets);
    }

    public List<String> getLayers() {
        return this.layers;
    }

    public QueriedFeature getQueriedFeature() {
        return this.queriedFeature;
    }

    public List<FeaturesetQueryTarget> getTargets() {
        return this.targets;
    }

    public int hashCode() {
        return Objects.hash(this.queriedFeature, this.layers, this.targets);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[queriedFeature: ");
        sb2.append(RecordUtils.fieldToString(this.queriedFeature));
        sb2.append(", layers: ");
        com.mapbox.common.b.v(", targets: ", sb2, this.layers);
        return com.mapbox.common.b.i("]", sb2, this.targets);
    }
}
