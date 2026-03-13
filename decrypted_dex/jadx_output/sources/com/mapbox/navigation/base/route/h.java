package com.mapbox.navigation.base.route;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f12509a = new h(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StepIntersection.Builder builder = StepIntersection.builder();
        Double valueOf = Double.valueOf(0.0d);
        StepIntersection build = builder.rawLocation(new double[]{0.0d, 0.0d}).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder()\n        .rawLo…0, 0.0))\n        .build()");
        DirectionsRoute build2 = DirectionsRoute.builder().distance(valueOf).duration(valueOf).legs(CollectionsKt.listOf(RouteLeg.builder().steps(CollectionsKt.listOf(LegStep.builder().distance(0.0d).duration(0.0d).mode(StubApp.getString2(4429)).maneuver(StepManeuver.builder().rawLocation(new double[]{0.0d, 0.0d}).type(StubApp.getString2(1530)).build()).weight(0.0d).geometry(LineString.fromLngLats((List<Point>) CollectionsKt.listOf((Object[]) new Point[]{Point.fromLngLat(0.0d, 0.0d), Point.fromLngLat(0.0d, 0.0d)})).toPolyline(6)).intersections(CollectionsKt.listOf(build)).build())).build())).build();
        Intrinsics.checkNotNullExpressionValue(build2, "builder()\n        .dista…akeLegs)\n        .build()");
        return build2;
    }
}
