package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OfflineRegionStatus implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long completedTileCount;
    private final long completedTileSize;
    private final OfflineRegionDownloadState downloadState;
    private final long requiredResourceCount;
    private final boolean requiredResourceCountIsPrecise;
    private final long requiredTileCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionStatus(OfflineRegionDownloadState offlineRegionDownloadState, long j, long j3, long j10, long j11, long j12, long j13, boolean z2) {
        this.downloadState = offlineRegionDownloadState;
        this.completedResourceCount = j;
        this.completedResourceSize = j3;
        this.completedTileCount = j10;
        this.requiredTileCount = j11;
        this.completedTileSize = j12;
        this.requiredResourceCount = j13;
        this.requiredResourceCountIsPrecise = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionStatus.class != obj.getClass()) {
            return false;
        }
        OfflineRegionStatus offlineRegionStatus = (OfflineRegionStatus) obj;
        return Objects.equals(this.downloadState, offlineRegionStatus.downloadState) && this.completedResourceCount == offlineRegionStatus.completedResourceCount && this.completedResourceSize == offlineRegionStatus.completedResourceSize && this.completedTileCount == offlineRegionStatus.completedTileCount && this.requiredTileCount == offlineRegionStatus.requiredTileCount && this.completedTileSize == offlineRegionStatus.completedTileSize && this.requiredResourceCount == offlineRegionStatus.requiredResourceCount && this.requiredResourceCountIsPrecise == offlineRegionStatus.requiredResourceCountIsPrecise;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getCompletedTileCount() {
        return this.completedTileCount;
    }

    public long getCompletedTileSize() {
        return this.completedTileSize;
    }

    public OfflineRegionDownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public boolean getRequiredResourceCountIsPrecise() {
        return this.requiredResourceCountIsPrecise;
    }

    public long getRequiredTileCount() {
        return this.requiredTileCount;
    }

    public int hashCode() {
        return Objects.hash(this.downloadState, Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.completedTileCount), Long.valueOf(this.requiredTileCount), Long.valueOf(this.completedTileSize), Long.valueOf(this.requiredResourceCount), Boolean.valueOf(this.requiredResourceCountIsPrecise));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[downloadState: ");
        sb2.append(RecordUtils.fieldToString(this.downloadState));
        sb2.append(", completedResourceCount: ");
        com.mapbox.common.b.p(this.completedResourceCount, sb2, ", completedResourceSize: ");
        com.mapbox.common.b.p(this.completedResourceSize, sb2, ", completedTileCount: ");
        com.mapbox.common.b.p(this.completedTileCount, sb2, ", requiredTileCount: ");
        com.mapbox.common.b.p(this.requiredTileCount, sb2, ", completedTileSize: ");
        com.mapbox.common.b.p(this.completedTileSize, sb2, ", requiredResourceCount: ");
        com.mapbox.common.b.p(this.requiredResourceCount, sb2, ", requiredResourceCountIsPrecise: ");
        return com.mapbox.common.b.k(this.requiredResourceCountIsPrecise, sb2, "]");
    }
}
