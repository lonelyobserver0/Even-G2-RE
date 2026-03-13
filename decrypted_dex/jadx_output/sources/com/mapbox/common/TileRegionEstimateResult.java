package com.mapbox.common;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileRegionEstimateResult implements Serializable {
    private final double errorMargin;
    private final Value extraData;
    private final long storageSize;
    private final long transferSize;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateResult(double d8, long j, long j3, Value value) {
        this.errorMargin = d8;
        this.transferSize = j;
        this.storageSize = j3;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateResult tileRegionEstimateResult = (TileRegionEstimateResult) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateResult.errorMargin) && this.transferSize == tileRegionEstimateResult.transferSize && this.storageSize == tileRegionEstimateResult.storageSize && Objects.equals(this.extraData, tileRegionEstimateResult.extraData);
    }

    public double getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public long getStorageSize() {
        return this.storageSize;
    }

    public long getTransferSize() {
        return this.transferSize;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.errorMargin), Long.valueOf(this.transferSize), Long.valueOf(this.storageSize), this.extraData);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[errorMargin: ");
        b.m(this.errorMargin, sb2, ", transferSize: ");
        b.p(this.transferSize, sb2, ", storageSize: ");
        b.p(this.storageSize, sb2, ", extraData: ");
        sb2.append(RecordUtils.fieldToString(this.extraData));
        sb2.append("]");
        return sb2.toString();
    }
}
