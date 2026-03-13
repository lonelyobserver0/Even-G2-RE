package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeatureExtensionValue implements Serializable {
    private final List<Feature> featureCollection;
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FeatureExtensionValue(Value value, List<Feature> list) {
        this.value = value;
        this.featureCollection = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeatureExtensionValue.class != obj.getClass()) {
            return false;
        }
        FeatureExtensionValue featureExtensionValue = (FeatureExtensionValue) obj;
        return Objects.equals(this.value, featureExtensionValue.value) && Objects.equals(this.featureCollection, featureExtensionValue.featureCollection);
    }

    public List<Feature> getFeatureCollection() {
        return this.featureCollection;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value, this.featureCollection);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[value: ");
        sb2.append(RecordUtils.fieldToString(this.value));
        sb2.append(", featureCollection: ");
        return com.mapbox.common.b.i("]", sb2, this.featureCollection);
    }
}
