package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiUpdateTraveledRouteLineValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiEventValue;", "point", "Lcom/mapbox/geojson/Point;", "(Lcom/mapbox/geojson/Point;)V", "getPoint", "()Lcom/mapbox/geojson/Point;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineApiUpdateTraveledRouteLineValue extends RouteLineApiEventValue {
    private final Point point;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiUpdateTraveledRouteLineValue(Point point) {
        super(StubApp.getString2(14745));
        Intrinsics.checkNotNullParameter(point, "point");
        this.point = point;
    }

    public final Point getPoint() {
        return this.point;
    }
}
