package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UpcomingRouteAlert implements Serializable {
    private final double distanceToStart;
    private final RoadObject roadObject;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UpcomingRouteAlert(RoadObject roadObject, double d8) {
        this.roadObject = roadObject;
        this.distanceToStart = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpcomingRouteAlert upcomingRouteAlert = (UpcomingRouteAlert) obj;
        return Objects.equals(this.roadObject, upcomingRouteAlert.roadObject) && PartialEq.compare(this.distanceToStart, upcomingRouteAlert.distanceToStart);
    }

    public double getDistanceToStart() {
        return this.distanceToStart;
    }

    public RoadObject getRoadObject() {
        return this.roadObject;
    }

    public int hashCode() {
        return Objects.hash(this.roadObject, Double.valueOf(this.distanceToStart));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[roadObject: ");
        sb2.append(RecordUtils.fieldToString(this.roadObject));
        sb2.append(", distanceToStart: ");
        return b.f(this.distanceToStart, sb2, "]");
    }
}
