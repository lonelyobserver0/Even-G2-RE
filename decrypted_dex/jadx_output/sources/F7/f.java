package F7;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.g f2296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f2297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, ArrayList arrayList2, com.mapbox.navigation.base.route.g gVar, Integer num) {
        super(1);
        this.f2294a = arrayList;
        this.f2295b = arrayList2;
        this.f2296c = gVar;
        this.f2297d = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map<String, JsonElement> unrecognizedJsonProperties;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        DirectionsRoute directionsRoute = (DirectionsRoute) obj;
        Intrinsics.checkNotNullParameter(directionsRoute, "$this$null");
        DirectionsRoute.Builder builder = directionsRoute.toBuilder();
        ArrayList arrayList = this.f2294a;
        DirectionsRoute.Builder legs = builder.legs(arrayList);
        List<DirectionsWaypoint> waypoints = directionsRoute.waypoints();
        ArrayList arrayList2 = this.f2295b;
        DirectionsRoute.Builder waypoints2 = legs.waypoints(AbstractC1526a.a(waypoints, arrayList2));
        Intrinsics.checkNotNullExpressionValue(waypoints2, "toBuilder()\n            ….waypoints(), waypoints))");
        List<DirectionsWaypoint> a3 = AbstractC1526a.a(this.f2296c.f12499b, arrayList2);
        if (arrayList != null) {
            Iterator<RouteLeg> it = arrayList.iterator();
            double d8 = 0.0d;
            while (true) {
                if (it.hasNext()) {
                    Double duration = it.next().duration();
                    if (duration == null) {
                        break;
                    }
                    d8 += duration.doubleValue();
                } else {
                    if (a3 != null) {
                        for (DirectionsWaypoint directionsWaypoint : a3) {
                            if (directionsWaypoint != null && (unrecognizedJsonProperties = directionsWaypoint.getUnrecognizedJsonProperties()) != null && (jsonElement = unrecognizedJsonProperties.get(StubApp.getString2(2127))) != null && (asJsonObject = jsonElement.getAsJsonObject()) != null && (jsonElement2 = asJsonObject.get(StubApp.getString2(2128))) != null) {
                                d8 = jsonElement2.getAsDouble() + d8;
                            }
                        }
                    }
                    waypoints2.duration(Double.valueOf(d8));
                }
            }
        }
        Map<String, JsonElement> unrecognizedJsonProperties2 = directionsRoute.getUnrecognizedJsonProperties();
        Integer num = this.f2297d;
        String string2 = StubApp.getString2(1915);
        if (num != null) {
            if (unrecognizedJsonProperties2 == null) {
                unrecognizedJsonProperties2 = MapsKt.emptyMap();
            }
            Map<String, JsonElement> mutableMap = MapsKt.toMutableMap(unrecognizedJsonProperties2);
            mutableMap.put(string2, new JsonPrimitive(num));
            DirectionsRoute.Builder unrecognizedJsonProperties3 = waypoints2.unrecognizedJsonProperties(mutableMap);
            Intrinsics.checkNotNullExpressionValue(unrecognizedJsonProperties3, "{\n        unrecognizedJs…       },\n        )\n    }");
            waypoints2 = unrecognizedJsonProperties3;
        } else if (unrecognizedJsonProperties2 != null && !unrecognizedJsonProperties2.isEmpty()) {
            Map<String, JsonElement> mutableMap2 = MapsKt.toMutableMap(unrecognizedJsonProperties2);
            mutableMap2.remove(string2);
            DirectionsRoute.Builder unrecognizedJsonProperties4 = waypoints2.unrecognizedJsonProperties(mutableMap2);
            Intrinsics.checkNotNullExpressionValue(unrecognizedJsonProperties4, "{\n            unrecogniz…,\n            )\n        }");
            waypoints2 = unrecognizedJsonProperties4;
        }
        DirectionsRoute build = waypoints2.build();
        Intrinsics.checkNotNullExpressionValue(build, "toBuilder()\n            …Ttl)\n            .build()");
        return build;
    }
}
