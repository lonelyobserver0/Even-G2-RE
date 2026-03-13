package com.mapbox.maps.renderer;

import android.os.SystemClock;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.renderer.RenderThreadStats;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J%\u0010\u0014\u001a\u0004\u0018\u00010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "", "()V", "frameTimeList", "", "", "isRecording", "", "()Z", "startTime", "", "totalDroppedFrames", "addFrameStats", "", "frameTime", "droppedFrames", "", "addFrameStats$maps_sdk_release", "end", "Lcom/mapbox/maps/renderer/RenderThreadStats;", "percentileOfSortedList", "sortedValues", "", "percentile", "(Ljava/util/List;D)Ljava/lang/Double;", "start", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RenderThreadStatsRecorder {
    private final List<Double> frameTimeList = new ArrayList();
    private long startTime;
    private long totalDroppedFrames;

    private final Double percentileOfSortedList(List<Double> sortedValues, double percentile) {
        return (Double) CollectionsKt.getOrNull(sortedValues, ((int) Math.ceil((percentile / 100.0d) * sortedValues.size())) - 1);
    }

    public final void addFrameStats$maps_sdk_release(double frameTime, int droppedFrames) {
        this.totalDroppedFrames += droppedFrames;
        this.frameTimeList.add(Double.valueOf(frameTime));
    }

    public final RenderThreadStats end() {
        if (!isRecording()) {
            throw new RuntimeException(StubApp.getString2(14524));
        }
        List<Double> list = CollectionsKt.toList(this.frameTimeList);
        List<Double> sorted = CollectionsKt.sorted(this.frameTimeList);
        RenderThreadStats build = new RenderThreadStats.Builder().setTotalTime(SystemClock.elapsedRealtime() - this.startTime).setTotalFrames(this.frameTimeList.size() + this.totalDroppedFrames).setTotalDroppedFrames(this.totalDroppedFrames).setFrameTimeList(list).setPercentile50(percentileOfSortedList(sorted, 50.0d)).setPercentile90(percentileOfSortedList(sorted, 90.0d)).setPercentile95(percentileOfSortedList(sorted, 95.0d)).setPercentile99(percentileOfSortedList(sorted, 99.0d)).build();
        this.startTime = 0L;
        this.totalDroppedFrames = 0L;
        this.frameTimeList.clear();
        return build;
    }

    public final boolean isRecording() {
        return this.startTime != 0;
    }

    public final void start() {
        if (isRecording()) {
            throw new RuntimeException(StubApp.getString2(14525));
        }
        this.startTime = SystemClock.elapsedRealtime();
    }
}
