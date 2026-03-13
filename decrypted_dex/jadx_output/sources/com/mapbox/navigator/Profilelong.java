package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Profilelong implements Serializable {
    private final AdasisConfigMessageOptions options;
    private final AdasisConfigProfilelongTypeOptions types;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Profilelong(AdasisConfigMessageOptions adasisConfigMessageOptions, AdasisConfigProfilelongTypeOptions adasisConfigProfilelongTypeOptions) {
        this.options = adasisConfigMessageOptions;
        this.types = adasisConfigProfilelongTypeOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Profilelong profilelong = (Profilelong) obj;
        return Objects.equals(this.options, profilelong.options) && Objects.equals(this.types, profilelong.types);
    }

    public AdasisConfigMessageOptions getOptions() {
        return this.options;
    }

    public AdasisConfigProfilelongTypeOptions getTypes() {
        return this.types;
    }

    public int hashCode() {
        return Objects.hash(this.options, this.types);
    }

    public String toString() {
        return "[options: " + RecordUtils.fieldToString(this.options) + ", types: " + RecordUtils.fieldToString(this.types) + "]";
    }
}
