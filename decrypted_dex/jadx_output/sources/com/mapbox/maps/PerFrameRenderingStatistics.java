package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PerFrameRenderingStatistics implements Serializable {
    private final DurationStatistics shadowMapDurationStatistics;
    private final List<GroupPerformanceStatistics> topRenderGroups;
    private final List<GroupPerformanceStatistics> topRenderLayers;
    private final DurationStatistics uploadDurationStatistics;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PerFrameRenderingStatistics(List<GroupPerformanceStatistics> list, List<GroupPerformanceStatistics> list2, DurationStatistics durationStatistics, DurationStatistics durationStatistics2) {
        this.topRenderGroups = list;
        this.topRenderLayers = list2;
        this.shadowMapDurationStatistics = durationStatistics;
        this.uploadDurationStatistics = durationStatistics2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerFrameRenderingStatistics.class != obj.getClass()) {
            return false;
        }
        PerFrameRenderingStatistics perFrameRenderingStatistics = (PerFrameRenderingStatistics) obj;
        return Objects.equals(this.topRenderGroups, perFrameRenderingStatistics.topRenderGroups) && Objects.equals(this.topRenderLayers, perFrameRenderingStatistics.topRenderLayers) && Objects.equals(this.shadowMapDurationStatistics, perFrameRenderingStatistics.shadowMapDurationStatistics) && Objects.equals(this.uploadDurationStatistics, perFrameRenderingStatistics.uploadDurationStatistics);
    }

    public DurationStatistics getShadowMapDurationStatistics() {
        return this.shadowMapDurationStatistics;
    }

    public List<GroupPerformanceStatistics> getTopRenderGroups() {
        return this.topRenderGroups;
    }

    public List<GroupPerformanceStatistics> getTopRenderLayers() {
        return this.topRenderLayers;
    }

    public DurationStatistics getUploadDurationStatistics() {
        return this.uploadDurationStatistics;
    }

    public int hashCode() {
        return Objects.hash(this.topRenderGroups, this.topRenderLayers, this.shadowMapDurationStatistics, this.uploadDurationStatistics);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[topRenderGroups: ");
        com.mapbox.common.b.v(", topRenderLayers: ", sb2, this.topRenderGroups);
        com.mapbox.common.b.v(", shadowMapDurationStatistics: ", sb2, this.topRenderLayers);
        sb2.append(RecordUtils.fieldToString(this.shadowMapDurationStatistics));
        sb2.append(", uploadDurationStatistics: ");
        sb2.append(RecordUtils.fieldToString(this.uploadDurationStatistics));
        sb2.append("]");
        return sb2.toString();
    }
}
