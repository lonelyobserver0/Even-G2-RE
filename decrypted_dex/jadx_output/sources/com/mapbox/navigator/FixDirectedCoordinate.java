package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FixDirectedCoordinate implements Serializable {
    private final double bearing;

    /* renamed from: x, reason: collision with root package name */
    private final double f12535x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12536y;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public FixDirectedCoordinate(double d8, double d10, double d11) {
        this.f12535x = d8;
        this.f12536y = d10;
        this.bearing = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FixDirectedCoordinate fixDirectedCoordinate = (FixDirectedCoordinate) obj;
        return PartialEq.compare(this.f12535x, fixDirectedCoordinate.f12535x) && PartialEq.compare(this.f12536y, fixDirectedCoordinate.f12536y) && PartialEq.compare(this.bearing, fixDirectedCoordinate.bearing);
    }

    public double getBearing() {
        return this.bearing;
    }

    public double getX() {
        return this.f12535x;
    }

    public double getY() {
        return this.f12536y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12535x), Double.valueOf(this.f12536y), Double.valueOf(this.bearing));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        b.m(this.f12535x, sb2, ", y: ");
        b.m(this.f12536y, sb2, ", bearing: ");
        return b.f(this.bearing, sb2, "]");
    }
}
