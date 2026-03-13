package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewRenderRouteLineClearValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewWithStyleIdValue;", "styleId", "", "input", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "(Ljava/lang/String;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;)V", "getInput", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineViewRenderRouteLineClearValue extends RouteLineViewWithStyleIdValue {
    private final RouteLineViewExpectedInput input;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteLineClearValue(String str, RouteLineViewExpectedInput input) {
        super(StubApp.getString2(14807), str);
        Intrinsics.checkNotNullParameter(input, "input");
        this.input = input;
    }

    public final RouteLineViewExpectedInput getInput() {
        return this.input;
    }
}
