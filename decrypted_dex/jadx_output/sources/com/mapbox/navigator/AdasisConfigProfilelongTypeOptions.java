package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigProfilelongTypeOptions implements Serializable {
    private final AdasisConfigCustomTrafficEvents customEvents;
    private final AdasisConfigLonLat lonLat;
    private final AdasisConfigProfilelongTrafficSigns trafficSigns;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfilelongTypeOptions(AdasisConfigLonLat adasisConfigLonLat, AdasisConfigProfilelongTrafficSigns adasisConfigProfilelongTrafficSigns, AdasisConfigCustomTrafficEvents adasisConfigCustomTrafficEvents) {
        this.lonLat = adasisConfigLonLat;
        this.trafficSigns = adasisConfigProfilelongTrafficSigns;
        this.customEvents = adasisConfigCustomTrafficEvents;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTypeOptions adasisConfigProfilelongTypeOptions = (AdasisConfigProfilelongTypeOptions) obj;
        return Objects.equals(this.lonLat, adasisConfigProfilelongTypeOptions.lonLat) && Objects.equals(this.trafficSigns, adasisConfigProfilelongTypeOptions.trafficSigns) && Objects.equals(this.customEvents, adasisConfigProfilelongTypeOptions.customEvents);
    }

    public AdasisConfigCustomTrafficEvents getCustomEvents() {
        return this.customEvents;
    }

    public AdasisConfigLonLat getLonLat() {
        return this.lonLat;
    }

    public AdasisConfigProfilelongTrafficSigns getTrafficSigns() {
        return this.trafficSigns;
    }

    public int hashCode() {
        return Objects.hash(this.lonLat, this.trafficSigns, this.customEvents);
    }

    public String toString() {
        return "[lonLat: " + RecordUtils.fieldToString(this.lonLat) + ", trafficSigns: " + RecordUtils.fieldToString(this.trafficSigns) + ", customEvents: " + RecordUtils.fieldToString(this.customEvents) + "]";
    }
}
