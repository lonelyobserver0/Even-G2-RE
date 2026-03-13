package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StylePackLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePackLoadProgress(long j, long j3, long j10, long j11, long j12, long j13) {
        this.completedResourceCount = j;
        this.completedResourceSize = j3;
        this.erroredResourceCount = j10;
        this.requiredResourceCount = j11;
        this.loadedResourceCount = j12;
        this.loadedResourceSize = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePackLoadProgress.class != obj.getClass()) {
            return false;
        }
        StylePackLoadProgress stylePackLoadProgress = (StylePackLoadProgress) obj;
        return this.completedResourceCount == stylePackLoadProgress.completedResourceCount && this.completedResourceSize == stylePackLoadProgress.completedResourceSize && this.erroredResourceCount == stylePackLoadProgress.erroredResourceCount && this.requiredResourceCount == stylePackLoadProgress.requiredResourceCount && this.loadedResourceCount == stylePackLoadProgress.loadedResourceCount && this.loadedResourceSize == stylePackLoadProgress.loadedResourceSize;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getLoadedResourceCount() {
        return this.loadedResourceCount;
    }

    public long getLoadedResourceSize() {
        return this.loadedResourceSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.loadedResourceCount), Long.valueOf(this.loadedResourceSize));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[completedResourceCount: ");
        com.mapbox.common.b.p(this.completedResourceCount, sb2, ", completedResourceSize: ");
        com.mapbox.common.b.p(this.completedResourceSize, sb2, ", erroredResourceCount: ");
        com.mapbox.common.b.p(this.erroredResourceCount, sb2, ", requiredResourceCount: ");
        com.mapbox.common.b.p(this.requiredResourceCount, sb2, ", loadedResourceCount: ");
        com.mapbox.common.b.p(this.loadedResourceCount, sb2, ", loadedResourceSize: ");
        return Xa.h.i(this.loadedResourceSize, sb2, "]");
    }
}
