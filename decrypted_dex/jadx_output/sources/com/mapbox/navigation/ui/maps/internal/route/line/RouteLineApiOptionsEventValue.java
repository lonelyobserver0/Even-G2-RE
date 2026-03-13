package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiOptionsEventValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiEventValue;", "options", "Lcom/mapbox/navigation/ui/maps/route/line/model/MapboxRouteLineApiOptions;", "(Lcom/mapbox/navigation/ui/maps/route/line/model/MapboxRouteLineApiOptions;)V", "getOptions", "()Lcom/mapbox/navigation/ui/maps/route/line/model/MapboxRouteLineApiOptions;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineApiOptionsEventValue extends RouteLineApiEventValue {
    private final MapboxRouteLineApiOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiOptionsEventValue(MapboxRouteLineApiOptions options) {
        super("options");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
    }

    public final MapboxRouteLineApiOptions getOptions() {
        return this.options;
    }
}
