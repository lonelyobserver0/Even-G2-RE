package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewPushUpdateDynamicOptionsValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewWithStyleIdValue;", "styleId", "", "newOptions", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "(Ljava/lang/String;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;)V", "getNewOptions", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineViewPushUpdateDynamicOptionsValue extends RouteLineViewWithStyleIdValue {
    private final RouteLineViewOptionsData newOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewPushUpdateDynamicOptionsValue(String str, RouteLineViewOptionsData newOptions) {
        super(StubApp.getString2(14797), str);
        Intrinsics.checkNotNullParameter(newOptions, "newOptions");
        this.newOptions = newOptions;
    }

    public final RouteLineViewOptionsData getNewOptions() {
        return this.newOptions;
    }
}
