package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MatchingOptions implements Serializable {
    private final boolean allowPartialMatching;
    private final PartialPolylineDistanceCalculationStrategy partialPolylineDistanceCalculationStrategy;
    private final boolean useOnlyPreloadedTiles;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchingOptions(boolean z2, boolean z10, PartialPolylineDistanceCalculationStrategy partialPolylineDistanceCalculationStrategy) {
        this.useOnlyPreloadedTiles = z2;
        this.allowPartialMatching = z10;
        this.partialPolylineDistanceCalculationStrategy = partialPolylineDistanceCalculationStrategy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchingOptions matchingOptions = (MatchingOptions) obj;
        return this.useOnlyPreloadedTiles == matchingOptions.useOnlyPreloadedTiles && this.allowPartialMatching == matchingOptions.allowPartialMatching && Objects.equals(this.partialPolylineDistanceCalculationStrategy, matchingOptions.partialPolylineDistanceCalculationStrategy);
    }

    public boolean getAllowPartialMatching() {
        return this.allowPartialMatching;
    }

    public PartialPolylineDistanceCalculationStrategy getPartialPolylineDistanceCalculationStrategy() {
        return this.partialPolylineDistanceCalculationStrategy;
    }

    public boolean getUseOnlyPreloadedTiles() {
        return this.useOnlyPreloadedTiles;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.useOnlyPreloadedTiles), Boolean.valueOf(this.allowPartialMatching), this.partialPolylineDistanceCalculationStrategy);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[useOnlyPreloadedTiles: ");
        h.A(this.useOnlyPreloadedTiles, sb2, ", allowPartialMatching: ");
        h.A(this.allowPartialMatching, sb2, ", partialPolylineDistanceCalculationStrategy: ");
        sb2.append(RecordUtils.fieldToString(this.partialPolylineDistanceCalculationStrategy));
        sb2.append("]");
        return sb2.toString();
    }
}
