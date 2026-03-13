package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEvent;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEvent;", "instanceId", "", "value", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEventValue;", "(Ljava/lang/String;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEventValue;)V", "getValue", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEventValue;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineViewEvent extends RouteLineEvent {
    private final RouteLineViewEventValue value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewEvent(String instanceId, RouteLineViewEventValue value) {
        super(StubApp.getString2(12957), instanceId);
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final RouteLineViewEventValue getValue() {
        return this.value;
    }
}
