package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\u0019R\u0014\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/mapbox/maps/renderer/RenderHandlerThread;", "", "mapName", "", "(Ljava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "handler", "Landroid/os/Handler;", "getHandler$maps_sdk_release", "()Landroid/os/Handler;", "setHandler$maps_sdk_release", "(Landroid/os/Handler;)V", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$maps_sdk_release$annotations", "getHandlerThread$maps_sdk_release", "()Landroid/os/HandlerThread;", "handlerThreadName", "isRunning", "", "isRunning$maps_sdk_release", "()Z", "clearRenderEventQueue", "", "post", "task", "Ljava/lang/Runnable;", "postDelayed", "delayMillis", "", "start", "stop", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RenderHandlerThread {
    private final String TAG;
    private volatile Handler handler;
    private final HandlerThread handlerThread;
    private final String handlerThreadName;

    public RenderHandlerThread(String mapName) {
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        String j = !StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(14511), mapName) : StubApp.getString2(14512);
        this.handlerThreadName = j;
        this.handlerThread = new HandlerThread(j, -4);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14513));
        sb2.append(j);
        sb2.append(!StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
    }

    public static /* synthetic */ void getHandlerThread$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final void clearRenderEventQueue() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: getHandler$maps_sdk_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* renamed from: getHandlerThread$maps_sdk_release, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    public final boolean isRunning$maps_sdk_release() {
        return this.handler != null && this.handlerThread.isAlive();
    }

    public final void post(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        postDelayed(task, 0L);
    }

    public final void postDelayed(Runnable task, long delayMillis) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessageDelayed(Message.obtain(handler, task), delayMillis);
            return;
        }
        MapboxLogger.logW(this.TAG, StubApp.getString2(14514) + this.handlerThreadName + StubApp.getString2(14515));
    }

    public final void setHandler$maps_sdk_release(Handler handler) {
        this.handler = handler;
    }

    public final Handler start() {
        this.handlerThread.start();
        Handler handler = new Handler(this.handlerThread.getLooper());
        this.handler = handler;
        return handler;
    }

    public final void stop() {
        this.handlerThread.quit();
        this.handler = null;
    }
}
