package O8;

import Qb.I;
import V8.C0353e;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RerouteControllerInterface;
import com.mapbox.navigator.RerouteDetectorInterface;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends Oc.a {

    /* renamed from: b, reason: collision with root package name */
    public final RerouteControllerInterface f5263b;

    /* renamed from: c, reason: collision with root package name */
    public final RerouteDetectorInterface f5264c;

    /* renamed from: d, reason: collision with root package name */
    public final Vb.l f5265d;

    /* renamed from: e, reason: collision with root package name */
    public final E9.q f5266e;

    /* renamed from: f, reason: collision with root package name */
    public final I f5267f;

    /* renamed from: g, reason: collision with root package name */
    public final Xb.d f5268g;

    /* renamed from: h, reason: collision with root package name */
    public final A0.c f5269h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet f5270i;
    public Tc.d j;

    public p(Z8.f rerouteEventsProvider, RerouteControllerInterface rerouteController, RerouteDetectorInterface rerouteDetector, Vb.l getCurrentRoutes, E9.q updateRoutes, I scope, Xb.d parsingDispatcher, A0.c routeParsingTracking) {
        Intrinsics.checkNotNullParameter(rerouteEventsProvider, "rerouteEventsProvider");
        Intrinsics.checkNotNullParameter(rerouteController, "rerouteController");
        Intrinsics.checkNotNullParameter(rerouteDetector, "rerouteDetector");
        Intrinsics.checkNotNullParameter(getCurrentRoutes, "getCurrentRoutes");
        Intrinsics.checkNotNullParameter(updateRoutes, "updateRoutes");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parsingDispatcher, "parsingDispatcher");
        Intrinsics.checkNotNullParameter(routeParsingTracking, "routeParsingTracking");
        this.f5263b = rerouteController;
        this.f5264c = rerouteDetector;
        this.f5265d = getCurrentRoutes;
        this.f5266e = updateRoutes;
        this.f5267f = scope;
        this.f5268g = parsingDispatcher;
        this.f5269h = routeParsingTracking;
        this.f5270i = new CopyOnWriteArraySet();
        this.j = u.f5281c;
        Z9.q nativeRerouteObserver = new Z9.q(this, 14);
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(4460), StubApp.getString2(4455));
        }
        Intrinsics.checkNotNullParameter(nativeRerouteObserver, "nativeRerouteObserver");
        rerouteEventsProvider.a().addRerouteObserver(nativeRerouteObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(final O8.p r8, com.mapbox.bindgen.DataRef r9, java.lang.String r10, com.mapbox.navigator.RouterOrigin r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8.getClass()
            boolean r0 = r12 instanceof O8.n
            if (r0 == 0) goto L17
            r0 = r12
            O8.n r0 = (O8.n) r0
            int r1 = r0.f5257d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f5257d = r1
        L15:
            r7 = r0
            goto L1d
        L17:
            O8.n r0 = new O8.n
            r0.<init>(r8, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r7.f5255b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f5257d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L30
            O8.p r8 = r7.f5254a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L57
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 275(0x113, float:3.85E-43)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r4 = Y3.a.p(r11)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7.f5254a = r8
            r7.f5257d = r2
            Xb.d r1 = r8.f5268g
            r2 = r9
            r3 = r10
            java.lang.Object r12 = Ec.l.s(r1, r2, r3, r4, r5, r7)
            if (r12 != r0) goto L57
            return r0
        L57:
            com.mapbox.bindgen.Expected r12 = (com.mapbox.bindgen.Expected) r12
            O8.j r9 = new O8.j
            r10 = 0
            r9.<init>(r8)
            O8.j r10 = new O8.j
            r11 = 1
            r10.<init>(r8)
            java.lang.Object r8 = r12.fold(r9, r10)
            java.lang.String r9 = "parseDirectionsResponse(…\n            },\n        )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.p.V(O8.p, com.mapbox.bindgen.DataRef, java.lang.String, com.mapbox.navigator.RouterOrigin, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Oc.a
    public final void M(c5.B callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // Oc.a
    public final boolean U(C0353e rerouteStateObserver) {
        Intrinsics.checkNotNullParameter(rerouteStateObserver, "rerouteStateObserver");
        return this.f5270i.remove(rerouteStateObserver);
    }

    public final void W(Tc.d dVar) {
        if (Intrinsics.areEqual(this.j, dVar)) {
            return;
        }
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(4461) + dVar, StubApp.getString2(4455));
        }
        this.j = dVar;
        Iterator it = this.f5270i.iterator();
        while (it.hasNext()) {
            ((C0353e) it.next()).a(dVar);
        }
    }

    @Override // Oc.a
    public final void u() {
    }
}
