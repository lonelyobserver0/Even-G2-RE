package com.mapbox.common;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileRegionEstimateOptions implements Serializable {
    private final float errorMargin;
    private final Value extraOptions;
    private final long preciseEstimationTimeout;
    private final long timeout;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateOptions(float f10, long j, long j3, Value value) {
        this.errorMargin = f10;
        this.preciseEstimationTimeout = j;
        this.timeout = j3;
        this.extraOptions = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateOptions tileRegionEstimateOptions = (TileRegionEstimateOptions) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateOptions.errorMargin) && this.preciseEstimationTimeout == tileRegionEstimateOptions.preciseEstimationTimeout && this.timeout == tileRegionEstimateOptions.timeout && Objects.equals(this.extraOptions, tileRegionEstimateOptions.extraOptions);
    }

    public float getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public long getPreciseEstimationTimeout() {
        return this.preciseEstimationTimeout;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.errorMargin), Long.valueOf(this.preciseEstimationTimeout), Long.valueOf(this.timeout), this.extraOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[errorMargin: ");
        b.n(this.errorMargin, sb2, ", preciseEstimationTimeout: ");
        b.p(this.preciseEstimationTimeout, sb2, ", timeout: ");
        b.p(this.timeout, sb2, ", extraOptions: ");
        sb2.append(RecordUtils.fieldToString(this.extraOptions));
        sb2.append("]");
        return sb2.toString();
    }

    public TileRegionEstimateOptions(Value value) {
        this.extraOptions = value;
        this.errorMargin = 0.05f;
        this.preciseEstimationTimeout = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        this.timeout = 0L;
    }
}
