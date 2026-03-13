package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigCustomTrafficEvents implements Serializable {
    private final AdasisConfigTrafficEvent trafficEvent;
    private final AdasisConfigWeather weather;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigCustomTrafficEvents(AdasisConfigTrafficEvent adasisConfigTrafficEvent, AdasisConfigWeather adasisConfigWeather) {
        this.trafficEvent = adasisConfigTrafficEvent;
        this.weather = adasisConfigWeather;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigCustomTrafficEvents adasisConfigCustomTrafficEvents = (AdasisConfigCustomTrafficEvents) obj;
        return Objects.equals(this.trafficEvent, adasisConfigCustomTrafficEvents.trafficEvent) && Objects.equals(this.weather, adasisConfigCustomTrafficEvents.weather);
    }

    public AdasisConfigTrafficEvent getTrafficEvent() {
        return this.trafficEvent;
    }

    public AdasisConfigWeather getWeather() {
        return this.weather;
    }

    public int hashCode() {
        return Objects.hash(this.trafficEvent, this.weather);
    }

    public String toString() {
        return "[trafficEvent: " + RecordUtils.fieldToString(this.trafficEvent) + ", weather: " + RecordUtils.fieldToString(this.weather) + "]";
    }
}
