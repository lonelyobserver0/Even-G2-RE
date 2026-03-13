package com.mapbox.maps.renderer;

import D5.w;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import c5.B;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.DelegatingMapClient;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderModeType;
import com.mapbox.maps.Size;
import com.mapbox.maps.renderer.gl.PixelReader;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 N2\u00020\u0001:\u0001NB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205J\b\u00107\u001a\u000205H\u0007J\b\u00108\u001a\u000205H\u0007J\b\u00109\u001a\u000205H\u0007J\b\u0010:\u001a\u000205H\u0007J\u0016\u0010;\u001a\u0002052\u0006\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020)H\u0002J\u0010\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020AH\u0007J\u0010\u0010B\u001a\u0002052\u0006\u0010@\u001a\u00020AH\u0007J\u0006\u0010C\u001a\u000205J\b\u0010D\u001a\u000205H\u0007J\b\u0010E\u001a\u000205H\u0017J\u0010\u0010F\u001a\u0002052\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020\tH\u0007J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020KH\u0007J\b\u0010L\u001a\u0004\u0018\u00010=J\u0010\u0010L\u001a\u0002052\u0006\u0010J\u001a\u00020MH\u0007R\u0014\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)8A@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0012\u0010/\u001a\u000200X \u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/DelegatingMapClient;", "mapName", "", "(Ljava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "height", "", "map", "Lcom/mapbox/maps/NativeMapImpl;", "getMap$maps_sdk_release", "()Lcom/mapbox/maps/NativeMapImpl;", "setMap$maps_sdk_release", "(Lcom/mapbox/maps/NativeMapImpl;)V", "pixelReader", "Lcom/mapbox/maps/renderer/gl/PixelReader;", "getPixelReader$maps_sdk_release$annotations", "getPixelReader$maps_sdk_release", "()Lcom/mapbox/maps/renderer/gl/PixelReader;", "setPixelReader$maps_sdk_release", "(Lcom/mapbox/maps/renderer/gl/PixelReader;)V", "readyForSnapshot", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getReadyForSnapshot$maps_sdk_release$annotations", "getReadyForSnapshot$maps_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setReadyForSnapshot$maps_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "renderFrameCancelable", "Lcom/mapbox/common/Cancelable;", "renderFrameFinishedCallback", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "getRenderThread$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxRenderThread;", "setRenderThread$maps_sdk_release", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "<set-?>", "", "snapshotLegacyModeEnabled", "getSnapshotLegacyModeEnabled$maps_sdk_release", "()Z", "setSnapshotLegacyModeEnabled$maps_sdk_release", "(Z)V", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "width", "createRenderer", "", "destroyRenderer", "onDestroy", "onResume", "onStart", "onStop", "onSurfaceChanged", "performSnapshot", "Landroid/graphics/Bitmap;", "legacyMode", "queueNonRenderEvent", "runnable", "Ljava/lang/Runnable;", "queueRenderEvent", "render", "resetThreadServiceType", "scheduleRepaint", "setMap", "setMaximumFps", "fps", "setOnFpsChangedListener", "listener", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "snapshot", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MapboxRenderer implements DelegatingMapClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RenderEvent repaintRenderEvent = new RenderEvent(null, true);
    private final String TAG;
    private int height;
    private NativeMapImpl map;
    private PixelReader pixelReader;
    private AtomicBoolean readyForSnapshot;
    private Cancelable renderFrameCancelable;
    private final RenderFrameFinishedCallback renderFrameFinishedCallback;
    public MapboxRenderThread renderThread;
    private boolean snapshotLegacyModeEnabled;
    private int width;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;", "", "()V", "repaintRenderEvent", "Lcom/mapbox/maps/renderer/RenderEvent;", "getRepaintRenderEvent$maps_sdk_release$annotations", "getRepaintRenderEvent$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderEvent;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRepaintRenderEvent$maps_sdk_release$annotations() {
        }

        public final RenderEvent getRepaintRenderEvent$maps_sdk_release() {
            return MapboxRenderer.repaintRenderEvent;
        }

        private Companion() {
        }
    }

    public MapboxRenderer(String mapName) {
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.readyForSnapshot = new AtomicBoolean(false);
        this.renderFrameFinishedCallback = new B(this, 12);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14498));
        sb2.append(!StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
    }

    public static /* synthetic */ void getPixelReader$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getReadyForSnapshot$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final Bitmap performSnapshot(boolean legacyMode) {
        PixelReader pixelReader;
        PixelReader pixelReader2;
        if (this.width == 0 && this.height == 0) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14499));
            return null;
        }
        PixelReader pixelReader3 = this.pixelReader;
        if (pixelReader3 == null || pixelReader3 == null || pixelReader3.getWidth() != this.width || (pixelReader = this.pixelReader) == null || pixelReader.getHeight() != this.height || (pixelReader2 = this.pixelReader) == null || pixelReader2.getLegacyMode() != legacyMode) {
            PixelReader pixelReader4 = this.pixelReader;
            if (pixelReader4 != null) {
                pixelReader4.release();
            }
            this.pixelReader = new PixelReader(this.width, this.height, legacyMode);
        }
        PixelReader pixelReader5 = this.pixelReader;
        Intrinsics.checkNotNull(pixelReader5);
        try {
            ByteBuffer readPixels = pixelReader5.readPixels();
            readPixels.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(readPixels);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n        wi…romBuffer(buffer)\n      }");
            int i3 = this.width;
            float f10 = i3 / 2.0f;
            int i10 = this.height;
            float f11 = i10 / 2.0f;
            try {
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f, f10, f11);
                Unit unit = Unit.INSTANCE;
                return Bitmap.createBitmap(createBitmap, 0, 0, i3, i10, matrix, true);
            } finally {
                createBitmap.recycle();
            }
        } catch (Throwable th) {
            MapboxLogger.logW(this.TAG, StubApp.getString2(14500) + th.getLocalizedMessage() + StubApp.getString2(14501));
            if (pixelReader5.getLegacyMode()) {
                return null;
            }
            MapboxLogger.logW(this.TAG, StubApp.getString2(14502));
            pixelReader5.release();
            this.pixelReader = new PixelReader(pixelReader5.getWidth(), pixelReader5.getHeight(), true);
            return performSnapshot(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFrameFinishedCallback$lambda$0(MapboxRenderer this$0, RenderFrameFinished eventData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (eventData.getRenderMode() == RenderModeType.FULL) {
            this$0.readyForSnapshot.set(true);
            Cancelable cancelable = this$0.renderFrameCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.graphics.Bitmap] */
    public static final void snapshot$lambda$3$lambda$2(ReentrantLock lock, Ref.ObjectRef snapshot, MapboxRenderer this$0, boolean z2, Condition condition) {
        Intrinsics.checkNotNullParameter(lock, "$lock");
        Intrinsics.checkNotNullParameter(snapshot, "$snapshot");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lock.lock();
        try {
            snapshot.element = this$0.performSnapshot(z2);
            condition.signal();
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapshot$lambda$4(MapView.OnSnapshotReady listener, MapboxRenderer this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        listener.onSnapshotReady(this$0.performSnapshot(z2));
    }

    public final void createRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.createRenderer();
        }
    }

    public final void destroyRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.destroyRenderer();
        }
        PixelReader pixelReader = this.pixelReader;
        if (pixelReader != null) {
            pixelReader.release();
        }
        this.pixelReader = null;
    }

    /* renamed from: getMap$maps_sdk_release, reason: from getter */
    public final NativeMapImpl getMap() {
        return this.map;
    }

    /* renamed from: getPixelReader$maps_sdk_release, reason: from getter */
    public final PixelReader getPixelReader() {
        return this.pixelReader;
    }

    /* renamed from: getReadyForSnapshot$maps_sdk_release, reason: from getter */
    public final AtomicBoolean getReadyForSnapshot() {
        return this.readyForSnapshot;
    }

    public final MapboxRenderThread getRenderThread$maps_sdk_release() {
        MapboxRenderThread mapboxRenderThread = this.renderThread;
        if (mapboxRenderThread != null) {
            return mapboxRenderThread;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renderThread");
        return null;
    }

    /* renamed from: getSnapshotLegacyModeEnabled$maps_sdk_release, reason: from getter */
    public final boolean getSnapshotLegacyModeEnabled() {
        return this.snapshotLegacyModeEnabled;
    }

    /* renamed from: getWidgetRenderer$maps_sdk_release */
    public abstract MapboxWidgetRenderer getWidgetRenderer();

    public final void onDestroy() {
        getWidgetRenderer().cleanUpAllWidgets();
        getRenderThread$maps_sdk_release().destroy$maps_sdk_release();
        getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(null);
    }

    public final void onResume() {
        getRenderThread$maps_sdk_release().scheduleThreadServiceTypeReset();
    }

    public final void onStart() {
        getRenderThread$maps_sdk_release().resume();
        NativeMapImpl nativeMapImpl = this.map;
        this.renderFrameCancelable = nativeMapImpl != null ? nativeMapImpl.subscribe(this.renderFrameFinishedCallback) : null;
    }

    public final void onStop() {
        getRenderThread$maps_sdk_release().pause();
        Cancelable cancelable = this.renderFrameCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.readyForSnapshot.set(false);
    }

    public final void onSurfaceChanged(int width, int height) {
        if (width == this.width && height == this.height) {
            return;
        }
        this.width = width;
        this.height = height;
        GLES20.glViewport(0, 0, width, height);
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.setSize(new Size(width, height));
        }
    }

    public final void queueNonRenderEvent(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, false));
    }

    public final void queueRenderEvent(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, true));
    }

    public final void render() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.render();
        }
    }

    @MapboxExperimental
    public final void resetThreadServiceType() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.resetThreadServiceType();
        }
    }

    @Override // com.mapbox.maps.MapClient
    public void scheduleRepaint() {
        getRenderThread$maps_sdk_release().queueRenderEvent(repaintRenderEvent);
    }

    public final synchronized void setMap(NativeMapImpl map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public final void setMap$maps_sdk_release(NativeMapImpl nativeMapImpl) {
        this.map = nativeMapImpl;
    }

    public final void setMaximumFps(int fps) {
        if (fps > 0) {
            getRenderThread$maps_sdk_release().setUserRefreshRate(fps);
            return;
        }
        MapboxLogger.logE(this.TAG, StubApp.getString2(14503) + fps + StubApp.getString2(14504));
    }

    public final synchronized void setOnFpsChangedListener(OnFpsChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(listener);
    }

    public final void setPixelReader$maps_sdk_release(PixelReader pixelReader) {
        this.pixelReader = pixelReader;
    }

    public final void setReadyForSnapshot$maps_sdk_release(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.readyForSnapshot = atomicBoolean;
    }

    public final void setRenderThread$maps_sdk_release(MapboxRenderThread mapboxRenderThread) {
        Intrinsics.checkNotNullParameter(mapboxRenderThread, "<set-?>");
        this.renderThread = mapboxRenderThread;
    }

    public final void setSnapshotLegacyModeEnabled$maps_sdk_release(boolean z2) {
        this.snapshotLegacyModeEnabled = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap snapshot() {
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14499));
            return null;
        }
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final boolean z2 = this.snapshotLegacyModeEnabled;
        reentrantLock.lock();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new Runnable() { // from class: com.mapbox.maps.renderer.e
                @Override // java.lang.Runnable
                public final void run() {
                    MapboxRenderer.snapshot$lambda$3$lambda$2(reentrantLock, objectRef, this, z2, newCondition);
                }
            }, true));
            newCondition.await(1L, TimeUnit.SECONDS);
            return (Bitmap) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void snapshot(MapView.OnSnapshotReady listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14499));
            listener.onSnapshotReady(null);
        } else {
            getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new w(listener, this, this.snapshotLegacyModeEnabled), true));
        }
    }
}
