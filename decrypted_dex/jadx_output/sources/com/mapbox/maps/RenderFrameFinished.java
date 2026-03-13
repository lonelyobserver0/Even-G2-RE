package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RenderFrameFinished implements Serializable {
    private final boolean needsRepaint;
    private final boolean placementChanged;
    private final RenderModeType renderMode;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderFrameFinished(RenderModeType renderModeType, boolean z2, boolean z10, EventTimeInterval eventTimeInterval) {
        this.renderMode = renderModeType;
        this.needsRepaint = z2;
        this.placementChanged = z10;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderFrameFinished.class != obj.getClass()) {
            return false;
        }
        RenderFrameFinished renderFrameFinished = (RenderFrameFinished) obj;
        return Objects.equals(this.renderMode, renderFrameFinished.renderMode) && this.needsRepaint == renderFrameFinished.needsRepaint && this.placementChanged == renderFrameFinished.placementChanged && Objects.equals(this.timeInterval, renderFrameFinished.timeInterval);
    }

    public boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public boolean getPlacementChanged() {
        return this.placementChanged;
    }

    public RenderModeType getRenderMode() {
        return this.renderMode;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.renderMode, Boolean.valueOf(this.needsRepaint), Boolean.valueOf(this.placementChanged), this.timeInterval);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[renderMode: ");
        sb2.append(RecordUtils.fieldToString(this.renderMode));
        sb2.append(", needsRepaint: ");
        Xa.h.A(this.needsRepaint, sb2, ", placementChanged: ");
        Xa.h.A(this.placementChanged, sb2, ", timeInterval: ");
        sb2.append(RecordUtils.fieldToString(this.timeInterval));
        sb2.append("]");
        return sb2.toString();
    }
}
