package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActiveGuidanceInfo implements Serializable {
    private final ActiveGuidanceProgress legProgress;
    private final ActiveGuidanceProgress linkProgress;
    private final ActiveGuidanceProgress routeProgress;
    private final ActiveGuidanceProgress stepProgress;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ActiveGuidanceInfo(ActiveGuidanceProgress activeGuidanceProgress, ActiveGuidanceProgress activeGuidanceProgress2, ActiveGuidanceProgress activeGuidanceProgress3, ActiveGuidanceProgress activeGuidanceProgress4) {
        this.routeProgress = activeGuidanceProgress;
        this.legProgress = activeGuidanceProgress2;
        this.stepProgress = activeGuidanceProgress3;
        this.linkProgress = activeGuidanceProgress4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveGuidanceInfo activeGuidanceInfo = (ActiveGuidanceInfo) obj;
        return Objects.equals(this.routeProgress, activeGuidanceInfo.routeProgress) && Objects.equals(this.legProgress, activeGuidanceInfo.legProgress) && Objects.equals(this.stepProgress, activeGuidanceInfo.stepProgress) && Objects.equals(this.linkProgress, activeGuidanceInfo.linkProgress);
    }

    public ActiveGuidanceProgress getLegProgress() {
        return this.legProgress;
    }

    public ActiveGuidanceProgress getLinkProgress() {
        return this.linkProgress;
    }

    public ActiveGuidanceProgress getRouteProgress() {
        return this.routeProgress;
    }

    public ActiveGuidanceProgress getStepProgress() {
        return this.stepProgress;
    }

    public int hashCode() {
        return Objects.hash(this.routeProgress, this.legProgress, this.stepProgress, this.linkProgress);
    }

    public String toString() {
        return "[routeProgress: " + RecordUtils.fieldToString(this.routeProgress) + ", legProgress: " + RecordUtils.fieldToString(this.legProgress) + ", stepProgress: " + RecordUtils.fieldToString(this.stepProgress) + ", linkProgress: " + RecordUtils.fieldToString(this.linkProgress) + "]";
    }
}
