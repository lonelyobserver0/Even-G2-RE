package com.mapbox.maps.renderer;

import com.mapbox.maps.MapboxExperimental;
import com.stub.StubApp;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!BU\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006\""}, d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStats;", "", "totalTime", "", "totalFrames", "totalDroppedFrames", "frameTimeList", "", "", "percentile50", "percentile90", "percentile95", "percentile99", "(JJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getFrameTimeList", "()Ljava/util/List;", "getPercentile50", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentile90", "getPercentile95", "getPercentile99", "getTotalDroppedFrames", "()J", "getTotalFrames", "getTotalTime", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RenderThreadStats {
    private final List<Double> frameTimeList;
    private final Double percentile50;
    private final Double percentile90;
    private final Double percentile95;
    private final Double percentile99;
    private final long totalDroppedFrames;
    private final long totalFrames;
    private final long totalTime;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStats$Builder;", "", "()V", "frameTimeList", "", "", "percentile50", "Ljava/lang/Double;", "percentile90", "percentile95", "percentile99", "totalDroppedFrames", "", "totalFrames", "totalTime", "build", "Lcom/mapbox/maps/renderer/RenderThreadStats;", "setFrameTimeList", "setPercentile50", "(Ljava/lang/Double;)Lcom/mapbox/maps/renderer/RenderThreadStats$Builder;", "setPercentile90", "setPercentile95", "setPercentile99", "setTotalDroppedFrames", "setTotalFrames", "setTotalTime", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private List<Double> frameTimeList = CollectionsKt.emptyList();
        private Double percentile50;
        private Double percentile90;
        private Double percentile95;
        private Double percentile99;
        private long totalDroppedFrames;
        private long totalFrames;
        private long totalTime;

        public final RenderThreadStats build() {
            return new RenderThreadStats(this.totalTime, this.totalFrames, this.totalDroppedFrames, this.frameTimeList, this.percentile50, this.percentile90, this.percentile95, this.percentile99, null);
        }

        public final Builder setFrameTimeList(List<Double> frameTimeList) {
            Intrinsics.checkNotNullParameter(frameTimeList, "frameTimeList");
            this.frameTimeList = frameTimeList;
            return this;
        }

        public final Builder setPercentile50(Double percentile50) {
            this.percentile50 = percentile50;
            return this;
        }

        public final Builder setPercentile90(Double percentile90) {
            this.percentile90 = percentile90;
            return this;
        }

        public final Builder setPercentile95(Double percentile95) {
            this.percentile95 = percentile95;
            return this;
        }

        public final Builder setPercentile99(Double percentile99) {
            this.percentile99 = percentile99;
            return this;
        }

        public final Builder setTotalDroppedFrames(long totalDroppedFrames) {
            this.totalDroppedFrames = totalDroppedFrames;
            return this;
        }

        public final Builder setTotalFrames(long totalFrames) {
            this.totalFrames = totalFrames;
            return this;
        }

        public final Builder setTotalTime(long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
    }

    public /* synthetic */ RenderThreadStats(long j, long j3, long j10, List list, Double d8, Double d10, Double d11, Double d12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j3, j10, list, d8, d10, d11, d12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RenderThreadStats.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.renderer.RenderThreadStats");
        RenderThreadStats renderThreadStats = (RenderThreadStats) other;
        return this.totalTime == renderThreadStats.totalTime && this.totalFrames == renderThreadStats.totalFrames && this.totalDroppedFrames == renderThreadStats.totalDroppedFrames && Intrinsics.areEqual(this.percentile50, renderThreadStats.percentile50) && Intrinsics.areEqual(this.percentile90, renderThreadStats.percentile90) && Intrinsics.areEqual(this.percentile95, renderThreadStats.percentile95) && Intrinsics.areEqual(this.percentile99, renderThreadStats.percentile99) && Intrinsics.areEqual(this.frameTimeList, renderThreadStats.frameTimeList);
    }

    public final List<Double> getFrameTimeList() {
        return this.frameTimeList;
    }

    public final Double getPercentile50() {
        return this.percentile50;
    }

    public final Double getPercentile90() {
        return this.percentile90;
    }

    public final Double getPercentile95() {
        return this.percentile95;
    }

    public final Double getPercentile99() {
        return this.percentile99;
    }

    public final long getTotalDroppedFrames() {
        return this.totalDroppedFrames;
    }

    public final long getTotalFrames() {
        return this.totalFrames;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.totalTime), Long.valueOf(this.totalFrames), Long.valueOf(this.totalDroppedFrames), this.percentile50, this.percentile90, this.percentile95, this.percentile99);
    }

    public String toString() {
        return StubApp.getString2(14516) + this.totalTime + StubApp.getString2(14517) + this.totalFrames + StubApp.getString2(14518) + this.totalDroppedFrames + StubApp.getString2(14519) + this.frameTimeList + StubApp.getString2(14520) + this.percentile50 + StubApp.getString2(14521) + this.percentile90 + StubApp.getString2(14522) + this.percentile95 + StubApp.getString2(14523) + this.percentile99 + ')';
    }

    private RenderThreadStats(long j, long j3, long j10, List<Double> list, Double d8, Double d10, Double d11, Double d12) {
        this.totalTime = j;
        this.totalFrames = j3;
        this.totalDroppedFrames = j10;
        this.frameTimeList = list;
        this.percentile50 = d8;
        this.percentile90 = d10;
        this.percentile95 = d11;
        this.percentile99 = d12;
    }
}
