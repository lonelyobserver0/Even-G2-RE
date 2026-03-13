package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapPlayerOptions implements Serializable {
    private final boolean avoidPlaybackPauses;
    private final int playbackCount;
    private final double playbackSpeedMultiplier;

    /* renamed from: com.mapbox.maps.MapPlayerOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private int playbackCount = 1;
        private double playbackSpeedMultiplier = 1.0d;
        private boolean avoidPlaybackPauses = false;

        public Builder avoidPlaybackPauses(boolean z2) {
            this.avoidPlaybackPauses = z2;
            return this;
        }

        public MapPlayerOptions build() {
            return new MapPlayerOptions(this.playbackCount, this.playbackSpeedMultiplier, this.avoidPlaybackPauses, null);
        }

        public Builder playbackCount(int i3) {
            this.playbackCount = i3;
            return this;
        }

        public Builder playbackSpeedMultiplier(double d8) {
            this.playbackSpeedMultiplier = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ MapPlayerOptions(int i3, double d8, boolean z2, AnonymousClass1 anonymousClass1) {
        this(i3, d8, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapPlayerOptions.class != obj.getClass()) {
            return false;
        }
        MapPlayerOptions mapPlayerOptions = (MapPlayerOptions) obj;
        return this.playbackCount == mapPlayerOptions.playbackCount && PartialEq.compare(this.playbackSpeedMultiplier, mapPlayerOptions.playbackSpeedMultiplier) && this.avoidPlaybackPauses == mapPlayerOptions.avoidPlaybackPauses;
    }

    public boolean getAvoidPlaybackPauses() {
        return this.avoidPlaybackPauses;
    }

    public int getPlaybackCount() {
        return this.playbackCount;
    }

    public double getPlaybackSpeedMultiplier() {
        return this.playbackSpeedMultiplier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.playbackCount), Double.valueOf(this.playbackSpeedMultiplier), Boolean.valueOf(this.avoidPlaybackPauses));
    }

    public Builder toBuilder() {
        return new Builder().playbackCount(this.playbackCount).playbackSpeedMultiplier(this.playbackSpeedMultiplier).avoidPlaybackPauses(this.avoidPlaybackPauses);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[playbackCount: ");
        com.mapbox.common.b.o(this.playbackCount, ", playbackSpeedMultiplier: ", sb2);
        com.mapbox.common.b.m(this.playbackSpeedMultiplier, sb2, ", avoidPlaybackPauses: ");
        return com.mapbox.common.b.k(this.avoidPlaybackPauses, sb2, "]");
    }

    private MapPlayerOptions(int i3, double d8, boolean z2) {
        this.playbackCount = i3;
        this.playbackSpeedMultiplier = d8;
        this.avoidPlaybackPauses = z2;
    }

    private MapPlayerOptions() {
        this.playbackCount = 1;
        this.playbackSpeedMultiplier = 1.0d;
        this.avoidPlaybackPauses = false;
    }
}
