package com.mapbox.maps;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001a\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000eH&J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0013H&J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H'J\n\u0010#\u001a\u0004\u0018\u00010$H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020%H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006&"}, d2 = {"Lcom/mapbox/maps/MapControllable;", "Lcom/mapbox/maps/MapboxLifecycleObserver;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "addRendererSetupErrorListener", "", "rendererSetupErrorListener", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "addWidget", "widget", "Lcom/mapbox/maps/renderer/widget/Widget;", "onGenericMotionEvent", "", "event", "Landroid/view/MotionEvent;", "onSizeChanged", "w", "", "h", "onTouchEvent", "queueEvent", "Ljava/lang/Runnable;", "needRender", "removeRendererSetupErrorListener", "removeWidget", "setMaximumFps", "fps", "setOnFpsChangedListener", "listener", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setRenderThreadStatsRecorder", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "snapshot", "Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MapControllable extends MapboxLifecycleObserver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onResume(MapControllable mapControllable) {
            MapboxLifecycleObserver.DefaultImpls.onResume(mapControllable);
        }

        public static /* synthetic */ void queueEvent$default(MapControllable mapControllable, Runnable runnable, boolean z2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(13931));
            }
            if ((i3 & 2) != 0) {
                z2 = true;
            }
            mapControllable.queueEvent(runnable, z2);
        }
    }

    void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    void addWidget(Widget widget);

    /* renamed from: getMapboxMap */
    MapboxMap getMapboxMapDeprecated();

    boolean onGenericMotionEvent(MotionEvent event);

    void onSizeChanged(int w10, int h2);

    boolean onTouchEvent(MotionEvent event);

    void queueEvent(Runnable event, boolean needRender);

    void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    boolean removeWidget(Widget widget);

    void setMaximumFps(int fps);

    void setOnFpsChangedListener(OnFpsChangedListener listener);

    @MapboxExperimental
    void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder);

    Bitmap snapshot();

    void snapshot(MapView.OnSnapshotReady listener);
}
