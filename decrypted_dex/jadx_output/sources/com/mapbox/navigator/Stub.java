package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Stub implements Serializable {
    private final AdasisConfigMessageOptions options;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Stub(AdasisConfigMessageOptions adasisConfigMessageOptions) {
        this.options = adasisConfigMessageOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.options, ((Stub) obj).options);
    }

    public AdasisConfigMessageOptions getOptions() {
        return this.options;
    }

    public int hashCode() {
        return Objects.hash(this.options);
    }

    public String toString() {
        return "[options: " + RecordUtils.fieldToString(this.options) + "]";
    }
}
