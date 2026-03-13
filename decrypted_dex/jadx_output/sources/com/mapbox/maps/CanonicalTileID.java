package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CanonicalTileID implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final int f12409x;

    /* renamed from: y, reason: collision with root package name */
    private final int f12410y;

    /* renamed from: z, reason: collision with root package name */
    private final byte f12411z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CanonicalTileID(byte b2, int i3, int i10) {
        this.f12411z = b2;
        this.f12409x = i3;
        this.f12410y = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CanonicalTileID.class != obj.getClass()) {
            return false;
        }
        CanonicalTileID canonicalTileID = (CanonicalTileID) obj;
        return this.f12411z == canonicalTileID.f12411z && this.f12409x == canonicalTileID.f12409x && this.f12410y == canonicalTileID.f12410y;
    }

    public int getX() {
        return this.f12409x;
    }

    public int getY() {
        return this.f12410y;
    }

    public byte getZ() {
        return this.f12411z;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.f12411z), Integer.valueOf(this.f12409x), Integer.valueOf(this.f12410y));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[z: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.f12411z)));
        sb2.append(", x: ");
        com.mapbox.common.b.o(this.f12409x, ", y: ", sb2);
        return com.mapbox.common.b.g(this.f12410y, "]", sb2);
    }
}
