package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ScreenCoordinate implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final double f12414x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12415y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenCoordinate(double d8, double d10) {
        this.f12414x = d8;
        this.f12415y = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenCoordinate.class != obj.getClass()) {
            return false;
        }
        ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
        return PartialEq.compare(this.f12414x, screenCoordinate.f12414x) && PartialEq.compare(this.f12415y, screenCoordinate.f12415y);
    }

    public double getX() {
        return this.f12414x;
    }

    public double getY() {
        return this.f12415y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12414x), Double.valueOf(this.f12415y));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        com.mapbox.common.b.m(this.f12414x, sb2, ", y: ");
        return com.mapbox.common.b.f(this.f12415y, sb2, "]");
    }
}
