package com.mapbox.navigation.ui.maps.internal.route.line;

import P7.c;
import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiUpdateWithRouteProgressValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiEventValue;", "", "routeId", "", "routeGeometryIndex", "LP7/c;", "state", "legIndex", "<init>", "(Ljava/lang/String;ILP7/c;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getRouteId", "()Ljava/lang/String;", "I", "getRouteGeometryIndex", "()I", "LP7/c;", "getState", "()LP7/c;", "Ljava/lang/Integer;", "getLegIndex", "()Ljava/lang/Integer;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineApiUpdateWithRouteProgressValue extends RouteLineApiEventValue {
    private final Integer legIndex;
    private final int routeGeometryIndex;
    private final String routeId;
    private final c state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiUpdateWithRouteProgressValue(String routeId, int i3, c state, Integer num) {
        super(StubApp.getString2(14746));
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.routeId = routeId;
        this.routeGeometryIndex = i3;
        this.state = state;
        this.legIndex = num;
    }

    public final Integer getLegIndex() {
        return this.legIndex;
    }

    public final int getRouteGeometryIndex() {
        return this.routeGeometryIndex;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public final c getState() {
        return this.state;
    }
}
