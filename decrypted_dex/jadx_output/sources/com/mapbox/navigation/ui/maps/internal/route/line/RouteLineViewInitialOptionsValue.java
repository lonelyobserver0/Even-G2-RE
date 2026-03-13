package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewInitialOptionsValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEventValue;", "initialOptions", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "(Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;)V", "getInitialOptions", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineViewInitialOptionsValue extends RouteLineViewEventValue {
    private final RouteLineViewOptionsData initialOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewInitialOptionsValue(RouteLineViewOptionsData initialOptions) {
        super(StubApp.getString2(14766));
        Intrinsics.checkNotNullParameter(initialOptions, "initialOptions");
        this.initialOptions = initialOptions;
    }

    public final RouteLineViewOptionsData getInitialOptions() {
        return this.initialOptions;
    }
}
