package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiSetVanishingOffsetValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineApiEventValue;", "offset", "", "(D)V", "getOffset", "()D", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineApiSetVanishingOffsetValue extends RouteLineApiEventValue {
    private final double offset;

    public RouteLineApiSetVanishingOffsetValue(double d8) {
        super(StubApp.getString2(14744));
        this.offset = d8;
    }

    public final double getOffset() {
        return this.offset;
    }
}
