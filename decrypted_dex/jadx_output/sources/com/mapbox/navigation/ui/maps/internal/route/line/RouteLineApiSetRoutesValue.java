package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiSetRoutesValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiEventValue;", "legIndex", "", "routeLines", "", "Lcom/mapbox/navigation/ui/maps/internal/route/line/LightRouteLine;", "(ILjava/util/List;)V", "getLegIndex", "()I", "getRouteLines", "()Ljava/util/List;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineApiSetRoutesValue extends RouteLineApiEventValue {
    private final int legIndex;
    private final List<LightRouteLine> routeLines;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiSetRoutesValue(int i3, List<LightRouteLine> routeLines) {
        super(StubApp.getString2(14743));
        Intrinsics.checkNotNullParameter(routeLines, "routeLines");
        this.legIndex = i3;
        this.routeLines = routeLines;
    }

    public final int getLegIndex() {
        return this.legIndex;
    }

    public final List<LightRouteLine> getRouteLines() {
        return this.routeLines;
    }
}
