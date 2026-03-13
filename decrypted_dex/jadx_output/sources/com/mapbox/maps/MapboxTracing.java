package com.mapbox.maps;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "Please use com.mapbox.common.MapboxTracing instead.", replaceWith = @ReplaceWith(expression = "MapboxTracing", imports = {"com.mapbox.common.MapboxTracing"}))
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/MapboxTracing;", "", "()V", "impl", "Lcom/mapbox/common/MapboxTracing;", "disableAll", "", "enableAll", "enableCore", "enablePlatform", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxTracing {
    public static final MapboxTracing INSTANCE = new MapboxTracing();
    private static final com.mapbox.common.MapboxTracing impl = com.mapbox.common.MapboxTracing.INSTANCE;

    private MapboxTracing() {
    }

    public final void disableAll() {
        impl.disableAll();
    }

    public final void enableAll() {
        impl.enableAll();
    }

    public final void enableCore() {
        impl.enableCore();
    }

    public final void enablePlatform() {
        impl.enablePlatform();
    }
}
