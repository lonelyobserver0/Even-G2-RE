package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H'J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\tH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "", "needRender", "", "getNeedRender", "()Z", "getPosition", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "getRotation", "", "onSurfaceChanged", "", "width", "", "height", "prepare", "release", "render", "setPosition", "widgetPosition", "setRotation", "angleDegrees", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface WidgetRenderer {
    boolean getNeedRender();

    @MapboxExperimental
    WidgetPosition getPosition();

    float getRotation();

    void onSurfaceChanged(int width, int height);

    void prepare();

    void release();

    void render();

    @MapboxExperimental
    void setPosition(WidgetPosition widgetPosition);

    void setRotation(float angleDegrees);
}
