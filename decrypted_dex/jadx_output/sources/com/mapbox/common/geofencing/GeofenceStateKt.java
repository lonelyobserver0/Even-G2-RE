package com.mapbox.common.geofencing;

import com.mapbox.common.geofencing.GeofenceState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"geofenceState", "Lcom/mapbox/common/geofencing/GeofenceState;", "initializer", "Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "", "Lkotlin/ExtensionFunctionType;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GeofenceStateKt {
    public static final /* synthetic */ GeofenceState geofenceState(Function1 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        GeofenceState.Builder builder = new GeofenceState.Builder();
        initializer.invoke(builder);
        return builder.build();
    }
}
