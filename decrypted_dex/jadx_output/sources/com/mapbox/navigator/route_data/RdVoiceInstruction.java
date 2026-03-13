package com.mapbox.navigator.route_data;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RdVoiceInstruction implements Serializable {
    private final String announcement;
    private final float distanceAlongGeometry;
    private final String ssmlAnnouncement;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdVoiceInstruction(float f10, String str, String str2) {
        this.distanceAlongGeometry = f10;
        this.announcement = str;
        this.ssmlAnnouncement = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdVoiceInstruction rdVoiceInstruction = (RdVoiceInstruction) obj;
        return PartialEq.compare(this.distanceAlongGeometry, rdVoiceInstruction.distanceAlongGeometry) && Objects.equals(this.announcement, rdVoiceInstruction.announcement) && Objects.equals(this.ssmlAnnouncement, rdVoiceInstruction.ssmlAnnouncement);
    }

    public String getAnnouncement() {
        return this.announcement;
    }

    public float getDistanceAlongGeometry() {
        return this.distanceAlongGeometry;
    }

    public String getSsmlAnnouncement() {
        return this.ssmlAnnouncement;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.distanceAlongGeometry), this.announcement, this.ssmlAnnouncement);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distanceAlongGeometry: ");
        b.n(this.distanceAlongGeometry, sb2, ", announcement: ");
        h.z(sb2, this.announcement, ", ssmlAnnouncement: ");
        return h.t(sb2, this.ssmlAnnouncement, "]");
    }
}
