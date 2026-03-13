package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileRegionEstimateProgress implements Serializable {
    private final long completedResourceCount;
    private final long erroredResourceCount;
    private final TileRegionEstimateResult partialResult;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateProgress(long j, long j3, long j10, TileRegionEstimateResult tileRegionEstimateResult) {
        this.requiredResourceCount = j;
        this.erroredResourceCount = j3;
        this.completedResourceCount = j10;
        this.partialResult = tileRegionEstimateResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateProgress tileRegionEstimateProgress = (TileRegionEstimateProgress) obj;
        return this.requiredResourceCount == tileRegionEstimateProgress.requiredResourceCount && this.erroredResourceCount == tileRegionEstimateProgress.erroredResourceCount && this.completedResourceCount == tileRegionEstimateProgress.completedResourceCount && Objects.equals(this.partialResult, tileRegionEstimateProgress.partialResult);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public TileRegionEstimateResult getPartialResult() {
        return this.partialResult;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requiredResourceCount), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.completedResourceCount), this.partialResult);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[requiredResourceCount: ");
        b.p(this.requiredResourceCount, sb2, ", erroredResourceCount: ");
        b.p(this.erroredResourceCount, sb2, ", completedResourceCount: ");
        b.p(this.completedResourceCount, sb2, ", partialResult: ");
        sb2.append(RecordUtils.fieldToString(this.partialResult));
        sb2.append("]");
        return sb2.toString();
    }
}
