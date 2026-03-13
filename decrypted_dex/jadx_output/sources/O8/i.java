package O8;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements InterfaceC0181b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5248a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5249b;

    public i(Y.m evDynamicDataHolder) {
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        this.f5249b = evDynamicDataHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // O8.InterfaceC0181b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mapbox.api.directions.v5.models.RouteOptions a(com.mapbox.api.directions.v5.models.RouteOptions r6, O8.y r7) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.i.a(com.mapbox.api.directions.v5.models.RouteOptions, O8.y):com.mapbox.api.directions.v5.models.RouteOptions");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mapbox.api.directions.v5.models.RouteOptions b(com.mapbox.api.directions.v5.models.RouteOptions r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f5249b
            Ac.m r0 = (Ac.m) r0
            java.lang.Object r0 = r0.f357b
            V8.q r0 = (V8.q) r0
            P7.b r0 = r0.f7890v
            if (r0 == 0) goto L11c
            com.mapbox.navigation.base.route.g r1 = r0.f5562a
            java.lang.String r2 = r1.j
            java.lang.String r3 = "ONLINE"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L11c
            r2 = 4448(0x1160, float:6.233E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r3 = r1.f12504g
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 == 0) goto L11c
            java.lang.String r2 = r15.profile()
            java.lang.String r3 = "driving-traffic"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L11c
            com.mapbox.navigator.RouteInterface r1 = r1.f12501d
            java.lang.String r2 = r1.getResponseUuid()
            java.lang.String r3 = "nativeRoute.responseUuid"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r1 = r1.getRouteIndex()
            java.util.Map r3 = r15.getUnrecognizedJsonProperties()
            if (r3 != 0) goto L4c
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
        L4c:
            r4 = 4449(0x1161, float:6.234E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.Object r5 = r3.get(r4)
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            if (r5 == 0) goto L93
            java.lang.String r5 = r5.getAsString()
            java.lang.String r6 = "it.asString"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r6 = 1262(0x4ee, float:1.768E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            java.lang.String[] r7 = new java.lang.String[]{r6}
            r8 = 0
            r9 = 6
            java.util.List r5 = kotlin.text.StringsKt.I(r5, r7, r8, r9)
            r7 = 9
            java.util.List r8 = kotlin.collections.CollectionsKt.take(r5, r7)
            r11 = 0
            r13 = 30
            r9 = 1262(0x4ee, float:1.768E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r10 = 0
            O8.x r12 = O8.x.f5284a
            java.lang.String r5 = kotlin.collections.CollectionsKt.m(r8, r9, r10, r11, r12, r13)
            if (r5 == 0) goto L93
            java.lang.String r5 = r6.concat(r5)
            goto L94
        L93:
            r5 = 0
        L94:
            if (r5 != 0) goto L98
            java.lang.String r5 = ""
        L98:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 4450(0x1162, float:6.236E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            r6.append(r2)
            r7 = 4451(0x1163, float:6.237E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.append(r7)
            r6.append(r1)
            r7 = 4452(0x1164, float:6.239E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.append(r7)
            int r0 = r0.f5576p
            r6.append(r0)
            r7 = 4453(0x1165, float:6.24E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 4444(0x115c, float:6.227E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            D9.l.d(r7, r6)
            com.mapbox.api.directions.v5.models.RouteOptions$Builder r15 = r15.toBuilder()
            com.google.gson.JsonPrimitive r6 = new com.google.gson.JsonPrimitive
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r2 = 44
            r7.append(r2)
            r7.append(r1)
            r7.append(r2)
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r4, r6)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.plus(r3, r0)
            com.mapbox.api.directions.v5.models.DirectionsJsonObject$Builder r15 = r15.unrecognizedJsonProperties(r0)
            com.mapbox.api.directions.v5.models.RouteOptions$Builder r15 = (com.mapbox.api.directions.v5.models.RouteOptions.Builder) r15
            com.mapbox.api.directions.v5.models.RouteOptions r15 = r15.build()
            java.lang.String r0 = "routeOptions.toBuilder()…   )\n            .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
        L11c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.i.b(com.mapbox.api.directions.v5.models.RouteOptions):com.mapbox.api.directions.v5.models.RouteOptions");
    }

    public i(Ac.m latestRouteProgressProvider) {
        Intrinsics.checkNotNullParameter(latestRouteProgressProvider, "latestRouteProgressProvider");
        this.f5249b = latestRouteProgressProvider;
    }

    public i(Y.m evDynamicDataHolder, i routeHistoryOptionsAdapter, C0180a reasonOptionsAdapter, C0180a cleanupCARelatedParamsAdapter) {
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        Intrinsics.checkNotNullParameter(routeHistoryOptionsAdapter, "routeHistoryOptionsAdapter");
        Intrinsics.checkNotNullParameter(reasonOptionsAdapter, "reasonOptionsAdapter");
        Intrinsics.checkNotNullParameter(cleanupCARelatedParamsAdapter, "cleanupCARelatedParamsAdapter");
        List internalOptionsAdapters = CollectionsKt.listOf((Object[]) new InterfaceC0181b[]{new i(evDynamicDataHolder), routeHistoryOptionsAdapter, reasonOptionsAdapter, cleanupCARelatedParamsAdapter});
        Intrinsics.checkNotNullParameter(internalOptionsAdapters, "internalOptionsAdapters");
        this.f5249b = internalOptionsAdapters;
    }
}
