package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UpcomingRouteAlertUpdate implements Serializable {
    private final double distanceToStart;
    private final String id;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UpcomingRouteAlertUpdate(String str, double d8) {
        this.id = str;
        this.distanceToStart = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpcomingRouteAlertUpdate upcomingRouteAlertUpdate = (UpcomingRouteAlertUpdate) obj;
        return Objects.equals(this.id, upcomingRouteAlertUpdate.id) && PartialEq.compare(this.distanceToStart, upcomingRouteAlertUpdate.distanceToStart);
    }

    public double getDistanceToStart() {
        return this.distanceToStart;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(this.id, Double.valueOf(this.distanceToStart));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", distanceToStart: ");
        return b.f(this.distanceToStart, sb2, "]");
    }
}
