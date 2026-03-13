package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Vec4 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    private final double f12421w;

    /* renamed from: x, reason: collision with root package name */
    private final double f12422x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12423y;

    /* renamed from: z, reason: collision with root package name */
    private final double f12424z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec4(double d8, double d10, double d11, double d12) {
        this.f12422x = d8;
        this.f12423y = d10;
        this.f12424z = d11;
        this.f12421w = d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec4.class != obj.getClass()) {
            return false;
        }
        Vec4 vec4 = (Vec4) obj;
        return PartialEq.compare(this.f12422x, vec4.f12422x) && PartialEq.compare(this.f12423y, vec4.f12423y) && PartialEq.compare(this.f12424z, vec4.f12424z) && PartialEq.compare(this.f12421w, vec4.f12421w);
    }

    public double getW() {
        return this.f12421w;
    }

    public double getX() {
        return this.f12422x;
    }

    public double getY() {
        return this.f12423y;
    }

    public double getZ() {
        return this.f12424z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12422x), Double.valueOf(this.f12423y), Double.valueOf(this.f12424z), Double.valueOf(this.f12421w));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        com.mapbox.common.b.m(this.f12422x, sb2, ", y: ");
        com.mapbox.common.b.m(this.f12423y, sb2, ", z: ");
        com.mapbox.common.b.m(this.f12424z, sb2, ", w: ");
        return com.mapbox.common.b.f(this.f12421w, sb2, "]");
    }
}
