package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapRecorderOptions implements Serializable {
    private final boolean compressed;
    private final boolean loggingEnabled;
    private final Long timeWindow;

    /* renamed from: com.mapbox.maps.MapRecorderOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Long timeWindow;
        private boolean loggingEnabled = false;
        private boolean compressed = true;

        public MapRecorderOptions build() {
            return new MapRecorderOptions(this.timeWindow, this.loggingEnabled, this.compressed, null);
        }

        public Builder compressed(boolean z2) {
            this.compressed = z2;
            return this;
        }

        public Builder loggingEnabled(boolean z2) {
            this.loggingEnabled = z2;
            return this;
        }

        public Builder timeWindow(Long l9) {
            this.timeWindow = l9;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ MapRecorderOptions(Long l9, boolean z2, boolean z10, AnonymousClass1 anonymousClass1) {
        this(l9, z2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapRecorderOptions.class != obj.getClass()) {
            return false;
        }
        MapRecorderOptions mapRecorderOptions = (MapRecorderOptions) obj;
        return Objects.equals(this.timeWindow, mapRecorderOptions.timeWindow) && this.loggingEnabled == mapRecorderOptions.loggingEnabled && this.compressed == mapRecorderOptions.compressed;
    }

    public boolean getCompressed() {
        return this.compressed;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public int hashCode() {
        return Objects.hash(this.timeWindow, Boolean.valueOf(this.loggingEnabled), Boolean.valueOf(this.compressed));
    }

    public Builder toBuilder() {
        return new Builder().timeWindow(this.timeWindow).loggingEnabled(this.loggingEnabled).compressed(this.compressed);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeWindow: ");
        com.mapbox.common.b.u(this.timeWindow, sb2, ", loggingEnabled: ");
        Xa.h.A(this.loggingEnabled, sb2, ", compressed: ");
        return com.mapbox.common.b.k(this.compressed, sb2, "]");
    }

    private MapRecorderOptions(Long l9, boolean z2, boolean z10) {
        this.timeWindow = l9;
        this.loggingEnabled = z2;
        this.compressed = z10;
    }

    private MapRecorderOptions(Long l9) {
        this.timeWindow = l9;
        this.loggingEnabled = false;
        this.compressed = true;
    }
}
