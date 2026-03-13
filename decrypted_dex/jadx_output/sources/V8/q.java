package V8;

import Qb.K0;
import Qb.L;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import m8.C1286g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: A, reason: collision with root package name */
    public final l f7868A;

    /* renamed from: B, reason: collision with root package name */
    public final i f7869B;

    /* renamed from: a, reason: collision with root package name */
    public final U8.d f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.h f7871b;

    /* renamed from: c, reason: collision with root package name */
    public final Z8.f f7872c;

    /* renamed from: d, reason: collision with root package name */
    public final B3.s f7873d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7874e;

    /* renamed from: f, reason: collision with root package name */
    public K0 f7875f;

    /* renamed from: g, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f7876g;

    /* renamed from: h, reason: collision with root package name */
    public final D9.f f7877h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet f7878i;
    public final CopyOnWriteArraySet j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f7879k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet f7880l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f7881m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f7882n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f7883o;

    /* renamed from: p, reason: collision with root package name */
    public final E0 f7884p;

    /* renamed from: q, reason: collision with root package name */
    public VoiceInstructions f7885q;

    /* renamed from: r, reason: collision with root package name */
    public E f7886r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7887s;

    /* renamed from: t, reason: collision with root package name */
    public C1286g f7888t;

    /* renamed from: u, reason: collision with root package name */
    public Location f7889u;

    /* renamed from: v, reason: collision with root package name */
    public P7.b f7890v;

    /* renamed from: w, reason: collision with root package name */
    public List f7891w;

    /* renamed from: x, reason: collision with root package name */
    public C0350b f7892x;

    /* renamed from: y, reason: collision with root package name */
    public Q2.g f7893y;

    /* renamed from: z, reason: collision with root package name */
    public final h f7894z;

    public q(U8.d tripService, B3.h tripSessionLocationEngine, Z8.f navigator, D9.h threadController, B3.s eHorizonSubscriptionManager) {
        Intrinsics.checkNotNullParameter(tripService, "tripService");
        Intrinsics.checkNotNullParameter(tripSessionLocationEngine, "tripSessionLocationEngine");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(eHorizonSubscriptionManager, "eHorizonSubscriptionManager");
        this.f7870a = tripService;
        this.f7871b = tripSessionLocationEngine;
        this.f7872c = navigator;
        this.f7873d = eHorizonSubscriptionManager;
        this.f7877h = threadController.a();
        this.f7878i = new CopyOnWriteArraySet();
        this.j = new CopyOnWriteArraySet();
        this.f7879k = new CopyOnWriteArraySet();
        this.f7880l = new CopyOnWriteArraySet();
        this.f7881m = new CopyOnWriteArraySet();
        this.f7882n = new CopyOnWriteArraySet();
        this.f7883o = new CopyOnWriteArraySet();
        this.f7884p = new E0(29, false);
        this.f7886r = E.f7803b;
        this.f7891w = CollectionsKt.emptyList();
        int i3 = 0;
        this.f7894z = new h(this, i3);
        this.f7868A = new l(this, i3);
        C0351c nativeNavigatorRecreationObserver = new C0351c(this, i3);
        Intrinsics.checkNotNullParameter(nativeNavigatorRecreationObserver, "nativeNavigatorRecreationObserver");
        navigator.f9061n.add(nativeNavigatorRecreationObserver);
        this.f7869B = new i(this);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(V8.q r23, com.mapbox.navigator.NavigationStatus r24) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.q.a(V8.q, com.mapbox.navigator.NavigationStatus):void");
    }

    public final void b(h fallbackVersionsObserver) {
        Intrinsics.checkNotNullParameter(fallbackVersionsObserver, "fallbackVersionsObserver");
        CopyOnWriteArraySet copyOnWriteArraySet = this.f7883o;
        if (copyOnWriteArraySet.isEmpty()) {
            this.f7872c.a().setFallbackVersionsObserver(this.f7894z);
        }
        copyOnWriteArraySet.add(fallbackVersionsObserver);
    }

    public final void c(C routeProgressObserver) {
        Intrinsics.checkNotNullParameter(routeProgressObserver, "routeProgressObserver");
        this.j.add(routeProgressObserver);
        P7.b bVar = this.f7890v;
        if (bVar != null) {
            routeProgressObserver.a(bVar);
        }
    }

    public final void d(boolean z2) {
        if (this.f7887s == z2) {
            return;
        }
        this.f7887s = z2;
        Iterator it = this.f7879k.iterator();
        while (it.hasNext()) {
            ((C1286g) it.next()).a(z2);
        }
    }

    public final void e(C1286g offRouteObserver, Oc.a rerouteController) {
        Intrinsics.checkNotNullParameter(offRouteObserver, "offRouteObserver");
        Intrinsics.checkNotNullParameter(rerouteController, "rerouteController");
        this.f7888t = offRouteObserver;
        this.f7893y = new Q2.g(this, rerouteController);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0 A[LOOP:0: B:12:0x00ea->B:14:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r10, int r11, com.mapbox.navigator.SetRoutesReason r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.q.f(java.util.List, int, com.mapbox.navigator.SetRoutesReason, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r15 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        if (r15 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r15 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        if (r15 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x01f1 -> B:12:0x01f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r13, m8.G r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.q.g(java.util.List, m8.G, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void h() {
        E e10 = this.f7886r;
        E e11 = E.f7803b;
        if (e10 == e11) {
            return;
        }
        if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(6729), StubApp.getString2(6675));
        }
        Z8.f fVar = this.f7872c;
        fVar.a().stopNavigationSession();
        i navigatorObserver = this.f7869B;
        Intrinsics.checkNotNullParameter(navigatorObserver, "navigatorObserver");
        fVar.a().removeObserver(navigatorObserver);
        fVar.f9062o.remove(navigatorObserver);
        U8.d dVar = this.f7870a;
        boolean compareAndSet = dVar.f7492c.compareAndSet(true, false);
        if (compareAndSet) {
            U8.d.f7488f = null;
            K0 k02 = dVar.f7494e;
            if (k02 != null) {
                k02.d(null);
            }
            dVar.f7491b.invoke();
            dVar.f7490a.onTripSessionStopped();
        } else if (!compareAndSet) {
            D9.l.f(StubApp.getString2(6730), StubApp.getString2(6731));
        }
        this.f7871b.k();
        L.e(this.f7877h.f1512a);
        K0 k03 = this.f7875f;
        if (k03 != null) {
            k03.d(null);
        }
        this.f7892x = null;
        this.f7889u = null;
        this.f7890v = null;
        d(false);
        if (this.f7886r == e11) {
            return;
        }
        this.f7886r = e11;
        Iterator it = this.f7880l.iterator();
        while (it.hasNext()) {
            ((F) it.next()).b(e11);
        }
    }
}
