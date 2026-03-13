package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActiveGuidanceProgress implements Serializable {
    private final double distanceTraveled;
    private final double fractionTraveled;
    private final double remainingDistance;
    private final long remainingDuration;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ActiveGuidanceProgress(double d8, double d10, double d11, long j) {
        this.distanceTraveled = d8;
        this.fractionTraveled = d10;
        this.remainingDistance = d11;
        this.remainingDuration = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveGuidanceProgress activeGuidanceProgress = (ActiveGuidanceProgress) obj;
        return PartialEq.compare(this.distanceTraveled, activeGuidanceProgress.distanceTraveled) && PartialEq.compare(this.fractionTraveled, activeGuidanceProgress.fractionTraveled) && PartialEq.compare(this.remainingDistance, activeGuidanceProgress.remainingDistance) && this.remainingDuration == activeGuidanceProgress.remainingDuration;
    }

    public double getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public double getFractionTraveled() {
        return this.fractionTraveled;
    }

    public double getRemainingDistance() {
        return this.remainingDistance;
    }

    public long getRemainingDuration() {
        return this.remainingDuration;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distanceTraveled), Double.valueOf(this.fractionTraveled), Double.valueOf(this.remainingDistance), Long.valueOf(this.remainingDuration));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distanceTraveled: ");
        b.m(this.distanceTraveled, sb2, ", fractionTraveled: ");
        b.m(this.fractionTraveled, sb2, ", remainingDistance: ");
        b.m(this.remainingDistance, sb2, ", remainingDuration: ");
        return h.i(this.remainingDuration, sb2, "]");
    }
}
