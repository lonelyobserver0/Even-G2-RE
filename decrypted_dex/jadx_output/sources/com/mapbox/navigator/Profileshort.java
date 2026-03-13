package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Profileshort implements Serializable {
    private final boolean bandwidthEnabled;
    private final short minDistanceBetweenCurvatures;
    private final AdasisConfigMessageOptions options;
    private final AdasisConfigProfileshortTypeOptions types;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Profileshort(AdasisConfigMessageOptions adasisConfigMessageOptions, AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions, short s10, boolean z2) {
        this.options = adasisConfigMessageOptions;
        this.types = adasisConfigProfileshortTypeOptions;
        this.minDistanceBetweenCurvatures = s10;
        this.bandwidthEnabled = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Profileshort profileshort = (Profileshort) obj;
        return Objects.equals(this.options, profileshort.options) && Objects.equals(this.types, profileshort.types) && this.minDistanceBetweenCurvatures == profileshort.minDistanceBetweenCurvatures && this.bandwidthEnabled == profileshort.bandwidthEnabled;
    }

    public boolean getBandwidthEnabled() {
        return this.bandwidthEnabled;
    }

    public short getMinDistanceBetweenCurvatures() {
        return this.minDistanceBetweenCurvatures;
    }

    public AdasisConfigMessageOptions getOptions() {
        return this.options;
    }

    public AdasisConfigProfileshortTypeOptions getTypes() {
        return this.types;
    }

    public int hashCode() {
        return Objects.hash(this.options, this.types, Short.valueOf(this.minDistanceBetweenCurvatures), Boolean.valueOf(this.bandwidthEnabled));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[options: ");
        sb2.append(RecordUtils.fieldToString(this.options));
        sb2.append(", types: ");
        sb2.append(RecordUtils.fieldToString(this.types));
        sb2.append(", minDistanceBetweenCurvatures: ");
        sb2.append(RecordUtils.fieldToString(Short.valueOf(this.minDistanceBetweenCurvatures)));
        sb2.append(", bandwidthEnabled: ");
        return b.k(this.bandwidthEnabled, sb2, "]");
    }

    public Profileshort(AdasisConfigMessageOptions adasisConfigMessageOptions, AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions) {
        this.options = adasisConfigMessageOptions;
        this.types = adasisConfigProfileshortTypeOptions;
        this.minDistanceBetweenCurvatures = (short) 0;
        this.bandwidthEnabled = true;
    }
}
