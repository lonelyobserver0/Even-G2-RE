package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewWithStyleIdValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewEventValue;", "action", "", "styleId", "(Ljava/lang/String;Ljava/lang/String;)V", "getStyleId", "()Ljava/lang/String;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class RouteLineViewWithStyleIdValue extends RouteLineViewEventValue {
    private final String styleId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewWithStyleIdValue(String action, String str) {
        super(action);
        Intrinsics.checkNotNullParameter(action, "action");
        this.styleId = str;
    }

    public final String getStyleId() {
        return this.styleId;
    }
}
