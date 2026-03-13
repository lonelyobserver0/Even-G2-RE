package com.mapbox.navigation.base.route;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.navigator.RouteInterface;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final DirectionsRoute f12498a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12499b;

    /* renamed from: c, reason: collision with root package name */
    public final RouteOptions f12500c;

    /* renamed from: d, reason: collision with root package name */
    public final RouteInterface f12501d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12502e;

    /* renamed from: f, reason: collision with root package name */
    public Long f12503f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12504g;

    /* renamed from: h, reason: collision with root package name */
    public final m f12505h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12506i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f12507k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f12508l;

    /* JADX WARN: Removed duplicated region for block: B:42:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.mapbox.api.directions.v5.models.DirectionsRoute r14, java.util.List r15, com.mapbox.api.directions.v5.models.RouteOptions r16, com.mapbox.navigator.RouteInterface r17, java.util.List r18, java.lang.Long r19, a4.f r20, java.lang.String r21, com.mapbox.navigation.base.route.m r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.base.route.g.<init>(com.mapbox.api.directions.v5.models.DirectionsRoute, java.util.List, com.mapbox.api.directions.v5.models.RouteOptions, com.mapbox.navigator.RouteInterface, java.util.List, java.lang.Long, a4.f, java.lang.String, com.mapbox.navigation.base.route.m):void");
    }

    public static g a(g gVar, DirectionsRoute directionsRoute, List list, a4.f fVar, Long l9, m mVar, int i3) {
        if ((i3 & 1) != 0) {
            directionsRoute = gVar.f12498a;
        }
        DirectionsRoute directionsRoute2 = directionsRoute;
        if ((i3 & 2) != 0) {
            list = gVar.f12499b;
        }
        List list2 = list;
        RouteOptions routeOptions = gVar.f12500c;
        RouteInterface nativeRoute = gVar.f12501d;
        if ((i3 & 16) != 0) {
            fVar = null;
        }
        a4.f fVar2 = fVar;
        if ((i3 & 32) != 0) {
            l9 = gVar.f12503f;
        }
        Long l10 = l9;
        m mVar2 = (i3 & 64) != 0 ? gVar.f12505h : mVar;
        Intrinsics.checkNotNullParameter(directionsRoute2, "directionsRoute");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(nativeRoute, "nativeRoute");
        return new g(directionsRoute2, list2, routeOptions, nativeRoute, gVar.f12502e, l10, fVar2, gVar.f12504g, mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.NavigationRoute");
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f12506i, gVar.f12506i) && Intrinsics.areEqual(this.f12498a, gVar.f12498a) && Intrinsics.areEqual(this.f12499b, gVar.f12499b);
    }

    public final int hashCode() {
        int hashCode = (this.f12498a.hashCode() + (this.f12506i.hashCode() * 31)) * 31;
        List list = this.f12499b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(14642)), this.f12506i, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.mapbox.api.directions.v5.models.DirectionsRoute r12, java.util.List r13, com.mapbox.api.directions.v5.models.RouteOptions r14, com.mapbox.navigator.RouteInterface r15, java.lang.Long r16) {
        /*
            r11 = this;
            java.lang.String r0 = "directionsRoute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "routeOptions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "nativeRoute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 14615(0x3917, float:2.048E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r9 = "DIRECTIONS_API"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.List r0 = r12.legs()
            if (r0 == 0) goto L48
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.f(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            com.mapbox.api.directions.v5.models.RouteLeg r2 = (com.mapbox.api.directions.v5.models.RouteLeg) r2
            java.util.List r2 = r2.closures()
            if (r2 != 0) goto L44
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L44:
            r1.add(r2)
            goto L2e
        L48:
            r1 = 0
        L49:
            if (r1 != 0) goto L4f
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L4f:
            r6 = r1
            r10 = 0
            r8 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.base.route.g.<init>(com.mapbox.api.directions.v5.models.DirectionsRoute, java.util.List, com.mapbox.api.directions.v5.models.RouteOptions, com.mapbox.navigator.RouteInterface, java.lang.Long):void");
    }
}
