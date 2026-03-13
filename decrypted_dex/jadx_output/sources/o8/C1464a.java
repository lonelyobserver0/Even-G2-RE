package o8;

import P7.b;
import P7.c;
import Qb.L;
import V8.C;
import V8.p;
import V8.q;
import b3.C0498N;
import b3.C0517s;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.route.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kb.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1464a implements C {

    /* renamed from: a, reason: collision with root package name */
    public final q f18385a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f18386b;

    /* renamed from: c, reason: collision with root package name */
    public g f18387c;

    /* renamed from: d, reason: collision with root package name */
    public RouteLeg f18388d;

    public C1464a(q tripSession) {
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        this.f18385a = tripSession;
        this.f18386b = new CopyOnWriteArraySet();
    }

    @Override // V8.C
    public final void a(b routeProgress) {
        g gVar;
        DirectionsRoute directionsRoute;
        List<RouteLeg> legs;
        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
        P7.a routeLegProgress = routeProgress.f5566e;
        if (routeProgress.f5565d != c.f5581c || routeProgress.f5574n) {
            return;
        }
        Integer valueOf = Integer.valueOf(routeLegProgress.f5553a);
        g gVar2 = routeProgress.f5562a;
        List<RouteLeg> legs2 = gVar2.f12498a.legs();
        Integer valueOf2 = legs2 != null ? Integer.valueOf(CollectionsKt.getLastIndex(legs2)) : null;
        CopyOnWriteArraySet copyOnWriteArraySet = this.f18386b;
        if (valueOf2 == null || valueOf.intValue() >= valueOf2.intValue()) {
            if (Intrinsics.areEqual(this.f18387c, gVar2)) {
                return;
            }
            this.f18387c = gVar2;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                C0517s c0517s = (C0517s) it.next();
                switch (c0517s.f10652a) {
                    case 0:
                        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                        ((C0498N) c0517s.f10653b).f10543E0 = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                        break;
                }
            }
            return;
        }
        RouteLeg routeLeg = this.f18388d;
        RouteLeg routeLeg2 = routeLegProgress.f5554b;
        if (!Intrinsics.areEqual(routeLeg, routeLeg2)) {
            this.f18388d = routeLeg2;
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                C0517s c0517s2 = (C0517s) it2.next();
                switch (c0517s2.f10652a) {
                    case 0:
                        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                        ((C0498N) c0517s2.f10653b).f10543E0 = false;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                        break;
                }
            }
        }
        Intrinsics.checkNotNullParameter(routeLegProgress, "routeLegProgress");
        q qVar = this.f18385a;
        b bVar = qVar.f7890v;
        Integer valueOf3 = (bVar == null || (gVar = bVar.f5562a) == null || (directionsRoute = gVar.f12498a) == null || (legs = directionsRoute.legs()) == null) ? null : Integer.valueOf(legs.size());
        if (valueOf3 == null) {
            return;
        }
        P7.a aVar = bVar.f5566e;
        int intValue = Integer.valueOf(aVar.f5553a).intValue() + 1;
        if (intValue >= valueOf3.intValue()) {
            return;
        }
        e callback = new e(this, aVar);
        Intrinsics.checkNotNullParameter(callback, "callback");
        qVar.f7875f = L.j(qVar.f7877h.f1513b, null, new p(qVar, new Ref.BooleanRef(), intValue, callback, null), 3);
    }
}
