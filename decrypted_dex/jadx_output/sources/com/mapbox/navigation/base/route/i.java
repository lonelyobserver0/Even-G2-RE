package com.mapbox.navigation.base.route;

import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f12510a = LazyKt.lazy(h.f12509a);

    public static final DirectionsRoute a(DirectionsResponse directionsResponse, int i3, RouteOptions routeOptions) {
        DirectionsRoute build = directionsResponse.routes().get(i3).toBuilder().requestUuid(directionsResponse.uuid()).routeIndex(String.valueOf(i3)).routeOptions(routeOptions).build();
        Intrinsics.checkNotNullExpressionValue(build, "response.routes()[routeI…Options)\n        .build()");
        return build;
    }

    public static final DirectionsResponse b(DataRef dataRef) {
        Intrinsics.checkNotNullParameter(dataRef, "<this>");
        Intrinsics.checkNotNullParameter(dataRef, "<this>");
        ByteBuffer buffer = dataRef.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
        InputStreamReader inputStreamReader = new InputStreamReader(new D9.c(buffer));
        try {
            DirectionsResponse fromJson = DirectionsResponse.fromJson(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            Intrinsics.checkNotNullExpressionValue(fromJson, "this.toReader().use { re…se.fromJson(reader)\n    }");
            return fromJson;
        } finally {
        }
    }
}
