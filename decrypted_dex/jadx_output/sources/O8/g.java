package O8;

import Qb.K0;
import V8.C0353e;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends Oc.a {

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f5238b;

    /* renamed from: c, reason: collision with root package name */
    public final V8.q f5239c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.e f5240d;

    /* renamed from: e, reason: collision with root package name */
    public final L7.j f5241e;

    /* renamed from: f, reason: collision with root package name */
    public final i f5242f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f5243g;

    /* renamed from: h, reason: collision with root package name */
    public final D9.f f5244h;

    /* renamed from: i, reason: collision with root package name */
    public K0 f5245i;
    public E8.c j;

    /* renamed from: k, reason: collision with root package name */
    public Tc.d f5246k;

    public g(q8.d directionsSession, V8.q tripSession, I4.e routeOptionsUpdater, L7.j rerouteOptions, D9.h threadController, Y.m evDynamicDataHolder) {
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(routeOptionsUpdater, "routeOptionsUpdater");
        Intrinsics.checkNotNullParameter(rerouteOptions, "rerouteOptions");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        i compositeRerouteOptionsAdapter = new i(evDynamicDataHolder, new i(new Ac.m(tripSession, 6)), new C0180a(1), new C0180a(0));
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(routeOptionsUpdater, "routeOptionsUpdater");
        Intrinsics.checkNotNullParameter(rerouteOptions, "rerouteOptions");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(compositeRerouteOptionsAdapter, "compositeRerouteOptionsAdapter");
        this.f5238b = directionsSession;
        this.f5239c = tripSession;
        this.f5240d = routeOptionsUpdater;
        this.f5241e = rerouteOptions;
        this.f5242f = compositeRerouteOptionsAdapter;
        this.f5243g = new CopyOnWriteArraySet();
        this.f5244h = threadController.a();
        this.f5246k = u.f5281c;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x047f A[Catch: Exception -> 0x0442, TryCatch #1 {Exception -> 0x0442, blocks: (B:103:0x0404, B:105:0x042f, B:108:0x0436, B:109:0x0449, B:111:0x0453, B:114:0x045a, B:115:0x0471, B:117:0x047f, B:118:0x0495, B:120:0x04d6, B:124:0x0511, B:127:0x04e3, B:129:0x04f3, B:131:0x050e, B:132:0x0500, B:134:0x0509, B:136:0x046d, B:137:0x0445), top: B:102:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d6 A[Catch: Exception -> 0x0442, TryCatch #1 {Exception -> 0x0442, blocks: (B:103:0x0404, B:105:0x042f, B:108:0x0436, B:109:0x0449, B:111:0x0453, B:114:0x045a, B:115:0x0471, B:117:0x047f, B:118:0x0495, B:120:0x04d6, B:124:0x0511, B:127:0x04e3, B:129:0x04f3, B:131:0x050e, B:132:0x0500, B:134:0x0509, B:136:0x046d, B:137:0x0445), top: B:102:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04f3 A[Catch: Exception -> 0x0442, TryCatch #1 {Exception -> 0x0442, blocks: (B:103:0x0404, B:105:0x042f, B:108:0x0436, B:109:0x0449, B:111:0x0453, B:114:0x045a, B:115:0x0471, B:117:0x047f, B:118:0x0495, B:120:0x04d6, B:124:0x0511, B:127:0x04e3, B:129:0x04f3, B:131:0x050e, B:132:0x0500, B:134:0x0509, B:136:0x046d, B:137:0x0445), top: B:102:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0500 A[Catch: Exception -> 0x0442, LOOP:2: B:132:0x0500->B:134:0x0509, LOOP_START, TryCatch #1 {Exception -> 0x0442, blocks: (B:103:0x0404, B:105:0x042f, B:108:0x0436, B:109:0x0449, B:111:0x0453, B:114:0x045a, B:115:0x0471, B:117:0x047f, B:118:0x0495, B:120:0x04d6, B:124:0x0511, B:127:0x04e3, B:129:0x04f3, B:131:0x050e, B:132:0x0500, B:134:0x0509, B:136:0x046d, B:137:0x0445), top: B:102:0x0404 }] */
    @Override // Oc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(c5.B r24) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.g.M(c5.B):void");
    }

    @Override // Oc.a
    public final boolean U(C0353e rerouteStateObserver) {
        Intrinsics.checkNotNullParameter(rerouteStateObserver, "rerouteStateObserver");
        return this.f5243g.remove(rerouteStateObserver);
    }

    public final void V(Tc.d dVar) {
        if (Intrinsics.areEqual(this.f5246k, dVar)) {
            return;
        }
        this.f5246k = dVar;
        boolean z2 = dVar instanceof u;
        if (!(dVar instanceof t)) {
            this.j = null;
        }
        Iterator it = this.f5243g.iterator();
        while (it.hasNext()) {
            ((C0353e) it.next()).a(this.f5246k);
        }
    }

    @Override // Oc.a
    public final void u() {
        K0 k02 = this.f5245i;
        if (k02 != null) {
            k02.d(null);
        }
        this.f5245i = null;
        Tc.d dVar = this.f5246k;
        t tVar = t.f5280c;
        if (Intrinsics.areEqual(dVar, tVar) && D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(4443), StubApp.getString2(4418));
        }
        if (Intrinsics.areEqual(this.f5246k, tVar)) {
            V(v.f5282c);
            V(u.f5281c);
        }
    }
}
