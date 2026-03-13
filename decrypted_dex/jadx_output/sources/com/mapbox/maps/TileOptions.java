package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TileOptions implements Serializable {
    private final short buffer;
    private final boolean clip;
    private final short tileSize;
    private final double tolerance;
    private final boolean wrap;

    /* renamed from: com.mapbox.maps.TileOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private double tolerance = 0.375d;
        private short tileSize = 512;
        private short buffer = 128;
        private boolean clip = false;
        private boolean wrap = false;

        public Builder buffer(short s10) {
            this.buffer = s10;
            return this;
        }

        public TileOptions build() {
            return new TileOptions(this.tolerance, this.tileSize, this.buffer, this.clip, this.wrap, null);
        }

        public Builder clip(boolean z2) {
            this.clip = z2;
            return this;
        }

        public Builder tileSize(short s10) {
            this.tileSize = s10;
            return this;
        }

        public Builder tolerance(double d8) {
            this.tolerance = d8;
            return this;
        }

        public Builder wrap(boolean z2) {
            this.wrap = z2;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ TileOptions(double d8, short s10, short s11, boolean z2, boolean z10, AnonymousClass1 anonymousClass1) {
        this(d8, s10, s11, z2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileOptions.class != obj.getClass()) {
            return false;
        }
        TileOptions tileOptions = (TileOptions) obj;
        return PartialEq.compare(this.tolerance, tileOptions.tolerance) && this.tileSize == tileOptions.tileSize && this.buffer == tileOptions.buffer && this.clip == tileOptions.clip && this.wrap == tileOptions.wrap;
    }

    public short getBuffer() {
        return this.buffer;
    }

    public boolean getClip() {
        return this.clip;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public double getTolerance() {
        return this.tolerance;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.tolerance), Short.valueOf(this.tileSize), Short.valueOf(this.buffer), Boolean.valueOf(this.clip), Boolean.valueOf(this.wrap));
    }

    public Builder toBuilder() {
        return new Builder().tolerance(this.tolerance).tileSize(this.tileSize).buffer(this.buffer).clip(this.clip).wrap(this.wrap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[tolerance: ");
        com.mapbox.common.b.m(this.tolerance, sb2, ", tileSize: ");
        sb2.append(RecordUtils.fieldToString(Short.valueOf(this.tileSize)));
        sb2.append(", buffer: ");
        sb2.append(RecordUtils.fieldToString(Short.valueOf(this.buffer)));
        sb2.append(", clip: ");
        Xa.h.A(this.clip, sb2, ", wrap: ");
        return com.mapbox.common.b.k(this.wrap, sb2, "]");
    }

    private TileOptions(double d8, short s10, short s11, boolean z2, boolean z10) {
        this.tolerance = d8;
        this.tileSize = s10;
        this.buffer = s11;
        this.clip = z2;
        this.wrap = z10;
    }

    private TileOptions() {
        this.tolerance = 0.375d;
        this.tileSize = (short) 512;
        this.buffer = (short) 128;
        this.clip = false;
        this.wrap = false;
    }
}
