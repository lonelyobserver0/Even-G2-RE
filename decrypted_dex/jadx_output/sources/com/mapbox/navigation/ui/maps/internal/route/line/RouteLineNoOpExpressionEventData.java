package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineNoOpExpressionEventData;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;", "()V", "equals", "", "other", "", "hashCode", "", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineNoOpExpressionEventData extends RouteLineExpressionEventData {
    public RouteLineNoOpExpressionEventData() {
        super(StubApp.getString2(14757));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(RouteLineNoOpExpressionEventData.class, other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return RouteLineNoOpExpressionEventData.class.hashCode();
    }
}
