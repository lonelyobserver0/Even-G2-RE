package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EdgeInsets implements Serializable {
    private final double bottom;
    private final double left;
    private final double right;
    private final double top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EdgeInsets(double d8, double d10, double d11, double d12) {
        this.top = d8;
        this.left = d10;
        this.bottom = d11;
        this.right = d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EdgeInsets.class != obj.getClass()) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return PartialEq.compare(this.top, edgeInsets.top) && PartialEq.compare(this.left, edgeInsets.left) && PartialEq.compare(this.bottom, edgeInsets.bottom) && PartialEq.compare(this.right, edgeInsets.right);
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.top), Double.valueOf(this.left), Double.valueOf(this.bottom), Double.valueOf(this.right));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[top: ");
        com.mapbox.common.b.m(this.top, sb2, ", left: ");
        com.mapbox.common.b.m(this.left, sb2, ", bottom: ");
        com.mapbox.common.b.m(this.bottom, sb2, ", right: ");
        return com.mapbox.common.b.f(this.right, sb2, "]");
    }
}
