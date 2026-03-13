package com.mapbox.maps.renderer;

import android.view.Surface;
import com.mapbox.maps.ContextMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0011\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "antialiasingSampleCount", "", "contextMode", "Lcom/mapbox/maps/ContextMode;", "mapName", "", "(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "createSurface", "", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "surfaceChanged", "", "surface", "Landroid/view/Surface;", "width", "height", "surfaceCreated", "surfaceDestroyed", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapboxSurfaceRenderer extends MapboxRenderer {
    private boolean createSurface;
    private final MapboxWidgetRenderer widgetRenderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceRenderer(int i3, ContextMode contextMode, String mapName) {
        super(mapName);
        Intrinsics.checkNotNullParameter(contextMode, "contextMode");
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.widgetRenderer = new MapboxWidgetRenderer(i3, mapName);
        setRenderThread$maps_sdk_release(new MapboxRenderThread(this, getWidgetRenderer(), false, i3, contextMode, mapName));
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    /* renamed from: getWidgetRenderer$maps_sdk_release, reason: from getter */
    public MapboxWidgetRenderer getWidgetRenderer() {
        return this.widgetRenderer;
    }

    public final void surfaceChanged(Surface surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.createSurface) {
            getRenderThread$maps_sdk_release().onSurfaceCreated(surface, width, height);
            this.createSurface = false;
        }
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(width, height);
    }

    public final void surfaceCreated() {
        this.createSurface = true;
    }

    public final void surfaceDestroyed() {
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceRenderer(MapboxRenderThread renderThread) {
        super("");
        Intrinsics.checkNotNullParameter(renderThread, "renderThread");
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(renderThread);
    }
}
