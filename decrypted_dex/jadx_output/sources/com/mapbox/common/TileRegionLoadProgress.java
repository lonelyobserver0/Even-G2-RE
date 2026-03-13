package com.mapbox.common;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileRegionLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionLoadProgress(long j, long j3, long j10, long j11, long j12, long j13) {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionLoadProgress tileRegionLoadProgress = (TileRegionLoadProgress) obj;
        return this.completedResourceCount == tileRegionLoadProgress.completedResourceCount && this.completedResourceSize == tileRegionLoadProgress.completedResourceSize && this.erroredResourceCount == tileRegionLoadProgress.erroredResourceCount && this.requiredResourceCount == tileRegionLoadProgress.requiredResourceCount && this.loadedResourceCount == tileRegionLoadProgress.loadedResourceCount && this.loadedResourceSize == tileRegionLoadProgress.loadedResourceSize;
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
        b.p(this.completedResourceCount, sb2, ", completedResourceSize: ");
        b.p(this.completedResourceSize, sb2, ", erroredResourceCount: ");
        b.p(this.erroredResourceCount, sb2, ", requiredResourceCount: ");
        b.p(this.requiredResourceCount, sb2, ", loadedResourceCount: ");
        b.p(this.loadedResourceCount, sb2, ", loadedResourceSize: ");
        return h.i(this.loadedResourceSize, sb2, "]");
    }
}
