package com.mapbox.navigator.match.openlr;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class DecodingError implements Serializable {
    private final String description;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DecodingError(String str) {
        this.description = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.description, ((DecodingError) obj).description);
    }

    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return Objects.hash(this.description);
    }

    public String toString() {
        return h.t(new StringBuilder("[description: "), this.description, "]");
    }
}
