package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Point3d implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final float f12540x;

    /* renamed from: y, reason: collision with root package name */
    private final float f12541y;

    /* renamed from: z, reason: collision with root package name */
    private final float f12542z;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Point3d(float f10, float f11, float f12) {
        this.f12540x = f10;
        this.f12541y = f11;
        this.f12542z = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point3d point3d = (Point3d) obj;
        return PartialEq.compare(this.f12540x, point3d.f12540x) && PartialEq.compare(this.f12541y, point3d.f12541y) && PartialEq.compare(this.f12542z, point3d.f12542z);
    }

    public float getX() {
        return this.f12540x;
    }

    public float getY() {
        return this.f12541y;
    }

    public float getZ() {
        return this.f12542z;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f12540x), Float.valueOf(this.f12541y), Float.valueOf(this.f12542z));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        b.n(this.f12540x, sb2, ", y: ");
        b.n(this.f12541y, sb2, ", z: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.f12542z)));
        sb2.append("]");
        return sb2.toString();
    }
}
