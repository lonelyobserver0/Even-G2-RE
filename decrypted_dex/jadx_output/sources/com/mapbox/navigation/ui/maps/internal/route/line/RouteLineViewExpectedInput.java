package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class RouteLineViewExpectedInput {

    @SerializedName("type")
    private final String type;

    public RouteLineViewExpectedInput(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public final String getType() {
        return this.type;
    }
}
