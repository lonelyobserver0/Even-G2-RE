package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LineDistanceInfo implements Serializable {
    private final double distanceToEnd;
    private final double distanceToEntry;
    private final double distanceToExit;
    private final boolean entryFromStart;
    private final double length;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LineDistanceInfo(double d8, double d10, double d11, boolean z2, double d12) {
        this.distanceToEntry = d8;
        this.distanceToExit = d10;
        this.distanceToEnd = d11;
        this.entryFromStart = z2;
        this.length = d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineDistanceInfo lineDistanceInfo = (LineDistanceInfo) obj;
        return PartialEq.compare(this.distanceToEntry, lineDistanceInfo.distanceToEntry) && PartialEq.compare(this.distanceToExit, lineDistanceInfo.distanceToExit) && PartialEq.compare(this.distanceToEnd, lineDistanceInfo.distanceToEnd) && this.entryFromStart == lineDistanceInfo.entryFromStart && PartialEq.compare(this.length, lineDistanceInfo.length);
    }

    public double getDistanceToEnd() {
        return this.distanceToEnd;
    }

    public double getDistanceToEntry() {
        return this.distanceToEntry;
    }

    public double getDistanceToExit() {
        return this.distanceToExit;
    }

    public boolean getEntryFromStart() {
        return this.entryFromStart;
    }

    public double getLength() {
        return this.length;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distanceToEntry), Double.valueOf(this.distanceToExit), Double.valueOf(this.distanceToEnd), Boolean.valueOf(this.entryFromStart), Double.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distanceToEntry: ");
        b.m(this.distanceToEntry, sb2, ", distanceToExit: ");
        b.m(this.distanceToExit, sb2, ", distanceToEnd: ");
        b.m(this.distanceToEnd, sb2, ", entryFromStart: ");
        h.A(this.entryFromStart, sb2, ", length: ");
        return b.f(this.length, sb2, "]");
    }
}
