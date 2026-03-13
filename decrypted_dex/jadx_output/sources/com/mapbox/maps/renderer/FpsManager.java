package com.mapbox.maps.renderer;

import B0.o;
import android.os.Handler;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\b\u0010'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020%J\u0010\u0010)\u001a\u00020*2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010+\u001a\u00020%J\u0018\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020*J\u000e\u0010/\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u000bJ\u0010\u00102\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020%H\u0002R\u0014\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#¨\u00065"}, d2 = {"Lcom/mapbox/maps/renderer/FpsManager;", "", "handler", "Landroid/os/Handler;", "mapName", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "choreographerSkips", "", "choreographerTicks", "fpsChangedListener", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "frameRenderTimeAccumulatedNs", "", "onRenderingPausedRunnable", "Ljava/lang/Runnable;", "preRenderTimeNs", "previousDrawnFrameIndex", "previousFrameTimeNs", "screenRefreshPeriodNs", "screenRefreshRate", "<set-?>", "skippedNow", "getSkippedNow", "()I", "userRefreshRate", "userToScreenRefreshRateRatio", "", "Ljava/lang/Double;", "calculateFpsAndReset", "", "destroy", "onRenderingPaused", "onSurfaceDestroyed", "performPacing", "", "postRender", "preRender", "frameTimeNs", "recorderStarted", "setScreenRefreshRate", "setUserRefreshRate", "refreshRate", "updateFrameStats", "updateUserToScreenRefreshRatio", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FpsManager {
    private static final boolean LOG_STATISTICS = false;
    private static final int SCREEN_METRICS_NOT_DEFINED = -1;
    private static final int USER_DEFINED_REFRESH_RATE_NOT_SET = -1;
    public static final int VSYNC_COUNT_TILL_IDLE = 3;
    private final String TAG;
    private int choreographerSkips;
    private int choreographerTicks;
    private OnFpsChangedListener fpsChangedListener;
    private long frameRenderTimeAccumulatedNs;
    private final Handler handler;
    private final Runnable onRenderingPausedRunnable;
    private long preRenderTimeNs;
    private int previousDrawnFrameIndex;
    private long previousFrameTimeNs;
    private long screenRefreshPeriodNs;
    private int screenRefreshRate;
    private int skippedNow;
    private int userRefreshRate;
    private Double userToScreenRefreshRateRatio;
    private static final Object fpsManagerToken = new Object();
    private static final long ONE_SECOND_NS = (long) Math.pow(10.0d, 9.0d);
    private static final long ONE_MILLISECOND_NS = (long) Math.pow(10.0d, 6.0d);

    public FpsManager(Handler handler, String mapName) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.handler = handler;
        this.userRefreshRate = -1;
        this.screenRefreshRate = -1;
        this.screenRefreshPeriodNs = -1L;
        this.previousFrameTimeNs = -1L;
        this.preRenderTimeNs = -1L;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14431));
        sb2.append(!StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
        this.onRenderingPausedRunnable = new o(this, 18);
    }

    private final void calculateFpsAndReset() {
        int i3 = this.choreographerTicks;
        if (i3 == 0) {
            return;
        }
        OnFpsChangedListener onFpsChangedListener = this.fpsChangedListener;
        if (onFpsChangedListener != null) {
            double d8 = (1.0d - (this.choreographerSkips / i3)) * this.screenRefreshRate;
            onFpsChangedListener.onFpsChanged(d8);
            int i10 = this.choreographerTicks;
            int i11 = this.choreographerSkips;
            String string2 = StubApp.getString2(14432);
            String string22 = StubApp.getString2(14433);
            String string23 = StubApp.getString2(14434);
            if (i10 == i11) {
                MapboxLogger.logI(this.TAG, string23 + d8 + StubApp.getString2(14435) + this.choreographerSkips + string22 + this.choreographerTicks + string2);
            } else {
                double d10 = this.frameRenderTimeAccumulatedNs / (i10 - i11);
                String str = this.TAG;
                StringBuilder sb2 = new StringBuilder(string23);
                sb2.append(d8);
                sb2.append(StubApp.getString2(14436));
                sb2.append(d10 / ONE_MILLISECOND_NS);
                sb2.append(StubApp.getString2(14437));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(StubApp.getString2(3170), Arrays.copyOf(new Object[]{Double.valueOf((this.screenRefreshPeriodNs / d10) * this.screenRefreshRate)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                sb2.append(format);
                sb2.append(StubApp.getString2(14438));
                sb2.append(this.choreographerSkips);
                sb2.append(string22);
                sb2.append(this.choreographerTicks);
                sb2.append(string2);
                MapboxLogger.logI(str, sb2.toString());
            }
        }
        this.previousDrawnFrameIndex = 0;
        this.frameRenderTimeAccumulatedNs = 0L;
        this.choreographerTicks = 0;
        this.choreographerSkips = 0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void onRenderingPaused() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        calculateFpsAndReset();
        this.previousFrameTimeNs = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRenderingPausedRunnable$lambda$1(FpsManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRenderingPaused();
    }

    private final boolean performPacing(double userToScreenRefreshRateRatio) {
        int i3 = (int) (this.choreographerTicks * userToScreenRefreshRateRatio);
        if (i3 > this.previousDrawnFrameIndex) {
            this.previousDrawnFrameIndex = i3;
            return true;
        }
        this.choreographerSkips++;
        return LOG_STATISTICS;
    }

    public static /* synthetic */ boolean preRender$default(FpsManager fpsManager, long j, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = LOG_STATISTICS;
        }
        return fpsManager.preRender(j, z2);
    }

    private final void updateFrameStats(long frameTimeNs) {
        this.preRenderTimeNs = System.nanoTime();
        this.skippedNow = 0;
        long j = this.previousFrameTimeNs;
        if (j != -1) {
            long j3 = frameTimeNs - j;
            long j10 = this.screenRefreshPeriodNs;
            long j11 = ONE_MILLISECOND_NS;
            if (j3 > j10 + j11) {
                int i3 = (int) ((frameTimeNs - j) / (j10 + j11));
                this.skippedNow = i3;
                this.choreographerSkips += i3;
            }
        }
        this.previousFrameTimeNs = frameTimeNs;
        this.choreographerTicks = this.skippedNow + 1 + this.choreographerTicks;
    }

    private final void updateUserToScreenRefreshRatio() {
        int i3;
        int i10 = this.userRefreshRate;
        if (i10 != -1 && (i3 = this.screenRefreshRate) != -1) {
            this.userToScreenRefreshRateRatio = Double.valueOf(RangesKt.coerceIn(i10 / i3, 0.0d, 1.0d));
            MapboxLogger.logI(this.TAG, StubApp.getString2(14439) + this.userToScreenRefreshRateRatio);
            calculateFpsAndReset();
            return;
        }
        MapboxLogger.logI(this.TAG, StubApp.getString2(14440) + this.userRefreshRate + StubApp.getString2(14441) + this.screenRefreshRate + ')');
    }

    public final void destroy() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        this.fpsChangedListener = null;
    }

    /* renamed from: getFpsChangedListener$maps_sdk_release, reason: from getter */
    public final OnFpsChangedListener getFpsChangedListener() {
        return this.fpsChangedListener;
    }

    public final int getSkippedNow() {
        return this.skippedNow;
    }

    public final void onSurfaceDestroyed() {
        onRenderingPaused();
    }

    public final void postRender() {
        this.frameRenderTimeAccumulatedNs += System.nanoTime() - this.preRenderTimeNs;
        if (this.choreographerTicks >= this.screenRefreshRate) {
            calculateFpsAndReset();
        } else {
            this.handler.postDelayed(this.onRenderingPausedRunnable, fpsManagerToken, (this.screenRefreshPeriodNs / ONE_MILLISECOND_NS) * 3);
        }
        this.preRenderTimeNs = -1L;
    }

    public final boolean preRender(long frameTimeNs, boolean recorderStarted) {
        if (this.userToScreenRefreshRateRatio == null && this.fpsChangedListener == null && !recorderStarted) {
            return true;
        }
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        updateFrameStats(frameTimeNs);
        Double d8 = this.userToScreenRefreshRateRatio;
        if (d8 != null) {
            return performPacing(d8.doubleValue());
        }
        return true;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener = onFpsChangedListener;
    }

    public final void setScreenRefreshRate(int screenRefreshRate) {
        if (this.screenRefreshRate == screenRefreshRate) {
            return;
        }
        this.screenRefreshRate = screenRefreshRate;
        this.screenRefreshPeriodNs = ONE_SECOND_NS / screenRefreshRate;
        updateUserToScreenRefreshRatio();
    }

    public final void setUserRefreshRate(int refreshRate) {
        if (this.userRefreshRate != refreshRate) {
            this.userRefreshRate = refreshRate;
            MapboxLogger.logI(this.TAG, StubApp.getString2(14442) + this.userRefreshRate);
            updateUserToScreenRefreshRatio();
        }
    }
}
