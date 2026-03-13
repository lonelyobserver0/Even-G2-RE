package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Vec2 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final double f12416x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12417y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec2(double d8, double d10) {
        this.f12416x = d8;
        this.f12417y = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec2.class != obj.getClass()) {
            return false;
        }
        Vec2 vec2 = (Vec2) obj;
        return PartialEq.compare(this.f12416x, vec2.f12416x) && PartialEq.compare(this.f12417y, vec2.f12417y);
    }

    public double getX() {
        return this.f12416x;
    }

    public double getY() {
        return this.f12417y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12416x), Double.valueOf(this.f12417y));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        com.mapbox.common.b.m(this.f12416x, sb2, ", y: ");
        return com.mapbox.common.b.f(this.f12417y, sb2, "]");
    }
}
