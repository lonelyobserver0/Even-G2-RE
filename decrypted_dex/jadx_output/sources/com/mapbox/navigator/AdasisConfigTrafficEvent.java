package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigTrafficEvent implements Serializable {
    private final byte profileType;
    private final int radius;
    private final AdasisConfigProfilelongTrafficEventIds trafficEventIds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigTrafficEvent(byte b2, AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds, int i3) {
        this.profileType = b2;
        this.trafficEventIds = adasisConfigProfilelongTrafficEventIds;
        this.radius = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigTrafficEvent adasisConfigTrafficEvent = (AdasisConfigTrafficEvent) obj;
        return this.profileType == adasisConfigTrafficEvent.profileType && Objects.equals(this.trafficEventIds, adasisConfigTrafficEvent.trafficEventIds) && this.radius == adasisConfigTrafficEvent.radius;
    }

    public byte getProfileType() {
        return this.profileType;
    }

    public int getRadius() {
        return this.radius;
    }

    public AdasisConfigProfilelongTrafficEventIds getTrafficEventIds() {
        return this.trafficEventIds;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.profileType), this.trafficEventIds, Integer.valueOf(this.radius));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[profileType: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.profileType)));
        sb2.append(", trafficEventIds: ");
        sb2.append(RecordUtils.fieldToString(this.trafficEventIds));
        sb2.append(", radius: ");
        return b.g(this.radius, "]", sb2);
    }

    public AdasisConfigTrafficEvent(AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds) {
        this.trafficEventIds = adasisConfigProfilelongTrafficEventIds;
        this.profileType = (byte) 19;
        this.radius = 1000;
    }
}
