package com.mapbox.common;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileStoreImportProgress implements Serializable {
    private final long erroredResourceCount;
    private final long importedResourceCount;
    private final long importedResourceSize;
    private final long requiredResourceBytes;
    private final long requiredResourceCount;
    private final long skippedResourceCount;
    private final long startTime;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreImportProgress(long j, long j3, long j10, long j11, long j12, long j13, long j14) {
        this.startTime = j;
        this.erroredResourceCount = j3;
        this.skippedResourceCount = j10;
        this.importedResourceCount = j11;
        this.importedResourceSize = j12;
        this.requiredResourceCount = j13;
        this.requiredResourceBytes = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreImportProgress tileStoreImportProgress = (TileStoreImportProgress) obj;
        return this.startTime == tileStoreImportProgress.startTime && this.erroredResourceCount == tileStoreImportProgress.erroredResourceCount && this.skippedResourceCount == tileStoreImportProgress.skippedResourceCount && this.importedResourceCount == tileStoreImportProgress.importedResourceCount && this.importedResourceSize == tileStoreImportProgress.importedResourceSize && this.requiredResourceCount == tileStoreImportProgress.requiredResourceCount && this.requiredResourceBytes == tileStoreImportProgress.requiredResourceBytes;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getImportedResourceCount() {
        return this.importedResourceCount;
    }

    public long getImportedResourceSize() {
        return this.importedResourceSize;
    }

    public native double getProgressRate();

    public long getRequiredResourceBytes() {
        return this.requiredResourceBytes;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public long getSkippedResourceCount() {
        return this.skippedResourceCount;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.startTime), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.skippedResourceCount), Long.valueOf(this.importedResourceCount), Long.valueOf(this.importedResourceSize), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.requiredResourceBytes));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[startTime: ");
        b.p(this.startTime, sb2, ", erroredResourceCount: ");
        b.p(this.erroredResourceCount, sb2, ", skippedResourceCount: ");
        b.p(this.skippedResourceCount, sb2, ", importedResourceCount: ");
        b.p(this.importedResourceCount, sb2, ", importedResourceSize: ");
        b.p(this.importedResourceSize, sb2, ", requiredResourceCount: ");
        b.p(this.requiredResourceCount, sb2, ", requiredResourceBytes: ");
        return h.i(this.requiredResourceBytes, sb2, "]");
    }
}
