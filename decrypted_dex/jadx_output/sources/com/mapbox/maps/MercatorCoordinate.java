package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MercatorCoordinate implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final double f12412x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12413y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MercatorCoordinate(double d8, double d10) {
        this.f12412x = d8;
        this.f12413y = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MercatorCoordinate.class != obj.getClass()) {
            return false;
        }
        MercatorCoordinate mercatorCoordinate = (MercatorCoordinate) obj;
        return PartialEq.compare(this.f12412x, mercatorCoordinate.f12412x) && PartialEq.compare(this.f12413y, mercatorCoordinate.f12413y);
    }

    public double getX() {
        return this.f12412x;
    }

    public double getY() {
        return this.f12413y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12412x), Double.valueOf(this.f12413y));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        com.mapbox.common.b.m(this.f12412x, sb2, ", y: ");
        return com.mapbox.common.b.f(this.f12413y, sb2, "]");
    }
}
