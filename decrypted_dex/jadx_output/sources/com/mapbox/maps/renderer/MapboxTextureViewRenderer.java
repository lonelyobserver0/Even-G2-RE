package com.mapbox.maps.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.mapbox.maps.ContextMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0011\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0016H\u0016R\u0014\u0010\u000f\u001a\u00020\u0010X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "Landroid/view/TextureView$SurfaceTextureListener;", "textureView", "Landroid/view/TextureView;", "antialiasingSampleCount", "", "contextMode", "Lcom/mapbox/maps/ContextMode;", "mapName", "", "(Landroid/view/TextureView;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "onSurfaceTextureAvailable", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "", "surface", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxTextureViewRenderer extends MapboxRenderer implements TextureView.SurfaceTextureListener {
    private final MapboxWidgetRenderer widgetRenderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(TextureView textureView, int i3, ContextMode contextMode, String mapName) {
        super(mapName);
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(contextMode, "contextMode");
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        MapboxWidgetRenderer mapboxWidgetRenderer = new MapboxWidgetRenderer(i3, mapName);
        this.widgetRenderer = mapboxWidgetRenderer;
        setRenderThread$maps_sdk_release(new MapboxRenderThread(this, mapboxWidgetRenderer, true, i3, contextMode, mapName));
        textureView.setOpaque(false);
        textureView.setSurfaceTextureListener(this);
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    /* renamed from: getWidgetRenderer$maps_sdk_release, reason: from getter */
    public MapboxWidgetRenderer getWidgetRenderer() {
        return this.widgetRenderer;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        getRenderThread$maps_sdk_release().onSurfaceCreated(new Surface(surfaceTexture), width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
        surface.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(MapboxRenderThread renderThread) {
        super("");
        Intrinsics.checkNotNullParameter(renderThread, "renderThread");
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(renderThread);
    }
}
