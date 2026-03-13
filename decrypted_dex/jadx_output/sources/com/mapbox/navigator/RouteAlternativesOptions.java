package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteAlternativesOptions implements Serializable {
    private final float minTimeBeforeManeuverSeconds;
    private final short requestIntervalSeconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteAlternativesOptions(short s10, float f10) {
        this.requestIntervalSeconds = s10;
        this.minTimeBeforeManeuverSeconds = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteAlternativesOptions routeAlternativesOptions = (RouteAlternativesOptions) obj;
        return this.requestIntervalSeconds == routeAlternativesOptions.requestIntervalSeconds && PartialEq.compare(this.minTimeBeforeManeuverSeconds, routeAlternativesOptions.minTimeBeforeManeuverSeconds);
    }

    public float getMinTimeBeforeManeuverSeconds() {
        return this.minTimeBeforeManeuverSeconds;
    }

    public short getRequestIntervalSeconds() {
        return this.requestIntervalSeconds;
    }

    public int hashCode() {
        return Objects.hash(Short.valueOf(this.requestIntervalSeconds), Float.valueOf(this.minTimeBeforeManeuverSeconds));
    }

    public String toString() {
        return "[requestIntervalSeconds: " + RecordUtils.fieldToString(Short.valueOf(this.requestIntervalSeconds)) + ", minTimeBeforeManeuverSeconds: " + RecordUtils.fieldToString(Float.valueOf(this.minTimeBeforeManeuverSeconds)) + "]";
    }
}
