package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CumulativeRenderingStatistics implements Serializable {
    private final Long drawCalls;
    private final Long fboSwitchCount;
    private final Long graphicsPrograms;
    private final Double graphicsProgramsCreationTimeMillis;
    private final Long textureBytes;
    private final Long vertexBytes;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CumulativeRenderingStatistics(Long l9, Long l10, Long l11, Long l12, Double d8, Long l13) {
        this.drawCalls = l9;
        this.textureBytes = l10;
        this.vertexBytes = l11;
        this.graphicsPrograms = l12;
        this.graphicsProgramsCreationTimeMillis = d8;
        this.fboSwitchCount = l13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CumulativeRenderingStatistics.class != obj.getClass()) {
            return false;
        }
        CumulativeRenderingStatistics cumulativeRenderingStatistics = (CumulativeRenderingStatistics) obj;
        return Objects.equals(this.drawCalls, cumulativeRenderingStatistics.drawCalls) && Objects.equals(this.textureBytes, cumulativeRenderingStatistics.textureBytes) && Objects.equals(this.vertexBytes, cumulativeRenderingStatistics.vertexBytes) && Objects.equals(this.graphicsPrograms, cumulativeRenderingStatistics.graphicsPrograms) && Objects.equals(this.graphicsProgramsCreationTimeMillis, cumulativeRenderingStatistics.graphicsProgramsCreationTimeMillis) && Objects.equals(this.fboSwitchCount, cumulativeRenderingStatistics.fboSwitchCount);
    }

    public Long getDrawCalls() {
        return this.drawCalls;
    }

    public Long getFboSwitchCount() {
        return this.fboSwitchCount;
    }

    public Long getGraphicsPrograms() {
        return this.graphicsPrograms;
    }

    public Double getGraphicsProgramsCreationTimeMillis() {
        return this.graphicsProgramsCreationTimeMillis;
    }

    public Long getTextureBytes() {
        return this.textureBytes;
    }

    public Long getVertexBytes() {
        return this.vertexBytes;
    }

    public int hashCode() {
        return Objects.hash(this.drawCalls, this.textureBytes, this.vertexBytes, this.graphicsPrograms, this.graphicsProgramsCreationTimeMillis, this.fboSwitchCount);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[drawCalls: ");
        com.mapbox.common.b.u(this.drawCalls, sb2, ", textureBytes: ");
        com.mapbox.common.b.u(this.textureBytes, sb2, ", vertexBytes: ");
        com.mapbox.common.b.u(this.vertexBytes, sb2, ", graphicsPrograms: ");
        com.mapbox.common.b.u(this.graphicsPrograms, sb2, ", graphicsProgramsCreationTimeMillis: ");
        com.mapbox.common.b.r(this.graphicsProgramsCreationTimeMillis, sb2, ", fboSwitchCount: ");
        sb2.append(RecordUtils.fieldToString(this.fboSwitchCount));
        sb2.append("]");
        return sb2.toString();
    }
}
