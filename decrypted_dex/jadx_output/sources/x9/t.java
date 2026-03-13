package x9;

import Qb.L;
import Qb.L0;
import Qb.W;
import android.util.LruCache;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import l4.C1145A;
import m8.C1284e;
import sa.C1608a;
import w9.C1872b;
import x8.C1919b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final MapboxRouteLineApiOptions f23063a;

    /* renamed from: b, reason: collision with root package name */
    public final Vb.f f23064b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919b f23065c;

    /* renamed from: d, reason: collision with root package name */
    public final w9.d f23066d;

    /* renamed from: e, reason: collision with root package name */
    public final C1608a f23067e;

    /* renamed from: f, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f23068f;

    /* renamed from: g, reason: collision with root package name */
    public List f23069g;

    /* renamed from: h, reason: collision with root package name */
    public List f23070h;

    /* renamed from: i, reason: collision with root package name */
    public List f23071i;
    public List j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f23072k;

    /* renamed from: l, reason: collision with root package name */
    public final Zb.e f23073l;

    /* renamed from: m, reason: collision with root package name */
    public final C1284e f23074m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23075n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f23076o;

    /* renamed from: p, reason: collision with root package name */
    public Map f23077p;

    /* renamed from: q, reason: collision with root package name */
    public final Lazy f23078q;

    /* renamed from: r, reason: collision with root package name */
    public final C1145A f23079r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f23080s;

    /* renamed from: t, reason: collision with root package name */
    public final A9.h f23081t;

    public t(MapboxRouteLineApiOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        L0 job = L.b();
        Vb.f calculationsScope = Qb.J.a(CoroutineContext.Element.DefaultImpls.plus(job, W.f5838a));
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(calculationsScope, "scope");
        C1919b c1919b = options.getVanishingRouteLineEnabled() ? new C1919b() : null;
        w9.d sender = new w9.d();
        C1608a lowMemoryManager = new C1608a(2);
        Intrinsics.checkNotNullParameter(options, "routeLineOptions");
        Intrinsics.checkNotNullParameter(calculationsScope, "calculationsScope");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(lowMemoryManager, "lowMemoryManager");
        this.f23063a = options;
        this.f23064b = calculationsScope;
        this.f23065c = c1919b;
        this.f23066d = sender;
        this.f23067e = lowMemoryManager;
        this.f23069g = CollectionsKt.emptyList();
        this.f23070h = CollectionsKt.emptyList();
        this.f23071i = CollectionsKt.emptyList();
        this.j = CollectionsKt.emptyList();
        this.f23072k = new ArrayList();
        Zb.e mutex = Zb.f.a();
        this.f23073l = mutex;
        this.f23074m = new C1284e(this, 1);
        L0 job2 = L.b();
        Vb.f scope = Qb.J.a(CoroutineContext.Element.DefaultImpls.plus(job2, Vb.q.f7968a.f6359c));
        Intrinsics.checkNotNullParameter(job2, "job");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f23076o = copyOnWriteArrayList;
        this.f23077p = MapsKt.emptyMap();
        Lazy lazy = LazyKt.lazy(C1926e.f22974b);
        this.f23078q = lazy;
        this.f23080s = new CopyOnWriteArrayList();
        Intrinsics.checkNotNullParameter(options, "options");
        w9.h.f22164a.d(new C1872b(sender, options, null));
        copyOnWriteArrayList.addAll(options.getTrafficBackfillRoadClasses());
        this.f23079r = options.getIsRouteCalloutsEnabled() ? new C1145A(21) : null;
        Zb.d dVar = new Zb.d(this, 1);
        LruCache cache = (LruCache) lazy.getValue();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f23081t = new A9.h(dVar, cache);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (r0.d(r8, r1, r9, r2) == r3) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x9.t r16, java.util.ArrayList r17, r9.p r18, java.util.List r19, int r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.t.a(x9.t, java.util.ArrayList, r9.p, java.util.List, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0317  */
    /* JADX WARN: Type inference failed for: r5v47, types: [Qb.O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function0 r61, int r62, kotlin.coroutines.jvm.internal.ContinuationImpl r63) {
        /*
            Method dump skipped, instructions count: 2485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.t.b(kotlin.jvm.functions.Function0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(InterfaceC0853a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        E7.a aVar = E7.a.f1927a;
        E7.a.c(StubApp.getString2(24206));
        long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
        synchronized (this.f23074m) {
            if (this.f23075n) {
                this.f23075n = false;
                this.f23067e.k(this.f23074m);
                Unit unit = Unit.INSTANCE;
            }
        }
        Vb.f fVar = this.f23064b;
        Xb.d dVar = W.f5838a;
        L.j(fVar, Vb.q.f7968a, new l(this, m1480markNowz9LOYto, consumer, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r3.size() > r17) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r21, boolean r22, boolean r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.t.d(java.util.ArrayList, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void e(List newRoutes, final InterfaceC0853a consumer) {
        Intrinsics.checkNotNullParameter(newRoutes, "newRoutes");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(newRoutes, "newRoutes");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        List alternativeRoutesMetadata = CollectionsKt.emptyList();
        Intrinsics.checkNotNullParameter(newRoutes, "newRoutes");
        Intrinsics.checkNotNullParameter(alternativeRoutesMetadata, "alternativeRoutesMetadata");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ArrayList newRoutes2 = new ArrayList(CollectionsKt.f(newRoutes));
        Iterator it = newRoutes.iterator();
        while (it.hasNext()) {
            newRoutes2.add(new NavigationRouteLine((com.mapbox.navigation.base.route.g) it.next(), null));
        }
        Intrinsics.checkNotNullParameter(newRoutes2, "newRoutes");
        Intrinsics.checkNotNullParameter(alternativeRoutesMetadata, "alternativeRoutesMetadata");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        E7.a aVar = E7.a.f1927a;
        E7.a.c(StubApp.getString2(24204));
        final long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
        L.f(this.f23064b.f7941a);
        if (newRoutes2.isEmpty()) {
            c(new InterfaceC0853a() { // from class: x9.d
                @Override // e9.InterfaceC0853a
                public final void accept(Object obj) {
                    Expected clearRouteLineResult = (Expected) obj;
                    InterfaceC0853a consumer2 = consumer;
                    Intrinsics.checkNotNullParameter(consumer2, "$consumer");
                    Intrinsics.checkNotNullParameter(clearRouteLineResult, "clearRouteLineResult");
                    Expected mapValue = clearRouteLineResult.mapValue(new w0.b(28));
                    Intrinsics.checkNotNullExpressionValue(mapValue, "clearRouteLineResult.map…      )\n                }");
                    E7.a aVar2 = E7.a.f1927a;
                    Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
                    E7.a.b(StubApp.getString2(24204));
                    consumer2.accept(mapValue);
                }
            });
            return;
        }
        synchronized (this.f23074m) {
            if (!this.f23075n) {
                this.f23075n = true;
                this.f23067e.a(this.f23074m);
                Unit unit = Unit.INSTANCE;
            }
        }
        Vb.f fVar = this.f23064b;
        Xb.d dVar = W.f5838a;
        L.j(fVar, Vb.q.f7968a, new r(this, newRoutes2, alternativeRoutesMetadata, m1480markNowz9LOYto, consumer, null), 2);
    }
}
