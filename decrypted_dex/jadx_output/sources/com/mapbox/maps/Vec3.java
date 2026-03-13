package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Vec3 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final double f12418x;

    /* renamed from: y, reason: collision with root package name */
    private final double f12419y;

    /* renamed from: z, reason: collision with root package name */
    private final double f12420z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec3(double d8, double d10, double d11) {
        this.f12418x = d8;
        this.f12419y = d10;
        this.f12420z = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec3.class != obj.getClass()) {
            return false;
        }
        Vec3 vec3 = (Vec3) obj;
        return PartialEq.compare(this.f12418x, vec3.f12418x) && PartialEq.compare(this.f12419y, vec3.f12419y) && PartialEq.compare(this.f12420z, vec3.f12420z);
    }

    public double getX() {
        return this.f12418x;
    }

    public double getY() {
        return this.f12419y;
    }

    public double getZ() {
        return this.f12420z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f12418x), Double.valueOf(this.f12419y), Double.valueOf(this.f12420z));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        com.mapbox.common.b.m(this.f12418x, sb2, ", y: ");
        com.mapbox.common.b.m(this.f12419y, sb2, ", z: ");
        return com.mapbox.common.b.f(this.f12420z, sb2, "]");
    }
}
