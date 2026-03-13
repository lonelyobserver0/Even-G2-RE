package O8;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0180a implements InterfaceC0181b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5224a;

    public /* synthetic */ C0180a(int i3) {
        this.f5224a = i3;
    }

    public static RouteOptions b(E8.c cVar, RouteOptions routeOptions) {
        String string2;
        Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
        if (unrecognizedJsonProperties == null) {
            unrecognizedJsonProperties = MapsKt.emptyMap();
        }
        int ordinal = cVar.f1936a.ordinal();
        if (ordinal == 0) {
            return routeOptions;
        }
        if (ordinal == 1) {
            string2 = StubApp.getString2(4405);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = StubApp.getString2(4404);
        }
        D9.l.d(StubApp.getString2(4408), StubApp.getString2(4406) + string2 + StubApp.getString2(4407));
        RouteOptions build = routeOptions.toBuilder().unrecognizedJsonProperties(MapsKt.plus(MapsKt.plus(unrecognizedJsonProperties, MapsKt.mapOf(TuplesKt.to(StubApp.getString2(354), new JsonPrimitive(StubApp.getString2(4409))))), MapsKt.mapOf(TuplesKt.to(StubApp.getString2(532), new JsonPrimitive(string2))))).build();
        Intrinsics.checkNotNullExpressionValue(build, "routeOptions.toBuilder()…   )\n            .build()");
        return build;
    }

    @Override // O8.InterfaceC0181b
    public final RouteOptions a(RouteOptions routeOptions, y params) {
        switch (this.f5224a) {
            case 0:
                Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
                Intrinsics.checkNotNullParameter(params, "params");
                RouteOptions.Builder builder = routeOptions.toBuilder();
                Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
                RouteOptions build = builder.unrecognizedJsonProperties(unrecognizedJsonProperties != null ? MapsKt__MapsKt.minus((Map) unrecognizedJsonProperties, (Iterable) CollectionsKt.listOf((Object[]) new String[]{StubApp.getString2(4412), StubApp.getString2(4413)})) : null).build();
                Intrinsics.checkNotNullExpressionValue(build, "routeOptions.toBuilder()…   )\n            .build()");
                return build;
            default:
                Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
                Intrinsics.checkNotNullParameter(params, "params");
                try {
                    return b(params.f5285a, routeOptions);
                } catch (Throwable th) {
                    if (!D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                        return routeOptions;
                    }
                    D9.l.e(StubApp.getString2(4410) + th + StubApp.getString2(4411), StubApp.getString2(4408));
                    return routeOptions;
                }
        }
    }
}
