package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigLonLat implements Serializable {
    private final boolean enabled;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigLonLat(boolean z2) {
        this.enabled = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((AdasisConfigLonLat) obj).enabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled));
    }

    public String toString() {
        return b.k(this.enabled, new StringBuilder("[enabled: "), "]");
    }

    public AdasisConfigLonLat() {
        this.enabled = false;
    }
}
