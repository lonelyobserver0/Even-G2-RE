package P8;

import J7.o;
import L0.AbstractC0105a;
import L0.C;
import L0.C0124u;
import L0.C0127x;
import L0.F;
import L0.InterfaceC0129z;
import L0.c0;
import V8.q;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.navigation.base.route.l;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.navigator.RouteAlternativesOptions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC1416M;
import r0.AbstractC1560u;
import r0.C1557r;
import t0.InterfaceC1726z;
import v0.C1802E;
import v0.O;
import v0.T;
import v0.U;
import v0.V;
import v0.a0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5628a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5630c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5631d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5632e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5633f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5634g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5635h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5636i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5637k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5638l;

    public i(l options, Z8.f navigator, q tripSession, D9.h threadController, o routeParsingManager, q8.d directionSession) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(routeParsingManager, "routeParsingManager");
        Intrinsics.checkNotNullParameter(directionSession, "directionSession");
        this.f5629b = tripSession;
        this.f5630c = threadController;
        this.f5631d = routeParsingManager;
        this.f5632e = directionSession;
        this.f5633f = StubApp.getString2(1933);
        this.f5634g = LazyKt.lazy(new d(this, 0));
        RouteAlternativesControllerInterface routeAlternativesControllerInterface = navigator.j;
        if (routeAlternativesControllerInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeAlternativesController");
            routeAlternativesControllerInterface = null;
        }
        routeAlternativesControllerInterface.setRouteAlternativesOptions(new RouteAlternativesOptions((short) TimeUnit.MILLISECONDS.toSeconds(options.f12511a), 8));
        this.f5636i = routeAlternativesControllerInterface;
        this.j = new LinkedHashMap();
        this.f5628a = true;
        this.f5638l = new F5.c(this, 17);
    }

    public AbstractC1416M a(int i3, ArrayList arrayList, c0 c0Var) {
        if (!arrayList.isEmpty()) {
            this.f5637k = c0Var;
            for (int i10 = i3; i10 < arrayList.size() + i3; i10++) {
                V v2 = (V) arrayList.get(i10 - i3);
                ArrayList arrayList2 = (ArrayList) this.f5630c;
                if (i10 > 0) {
                    V v8 = (V) arrayList2.get(i10 - 1);
                    v2.f21655d = v8.f21652a.f4146q.f4123b.o() + v8.f21655d;
                    v2.f21656e = false;
                    v2.f21654c.clear();
                } else {
                    v2.f21655d = 0;
                    v2.f21656e = false;
                    v2.f21654c.clear();
                }
                int o5 = v2.f21652a.f4146q.f4123b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((V) arrayList2.get(i11)).f21655d += o5;
                }
                arrayList2.add(i10, v2);
                ((HashMap) this.f5632e).put(v2.f21653b, v2);
                if (this.f5628a) {
                    e(v2);
                    if (((IdentityHashMap) this.f5631d).isEmpty()) {
                        ((HashSet) this.f5635h).add(v2);
                    } else {
                        U u2 = (U) ((HashMap) this.f5634g).get(v2);
                        if (u2 != null) {
                            u2.f21649a.c(u2.f21650b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public AbstractC1416M b() {
        ArrayList arrayList = (ArrayList) this.f5630c;
        if (arrayList.isEmpty()) {
            return AbstractC1416M.f18066a;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            V v2 = (V) arrayList.get(i10);
            v2.f21655d = i3;
            i3 += v2.f21652a.f4146q.f4123b.o();
        }
        return new a0(arrayList, (c0) this.f5637k);
    }

    public void c() {
        Iterator it = ((HashSet) this.f5635h).iterator();
        while (it.hasNext()) {
            V v2 = (V) it.next();
            if (v2.f21654c.isEmpty()) {
                U u2 = (U) ((HashMap) this.f5634g).get(v2);
                if (u2 != null) {
                    u2.f21649a.c(u2.f21650b);
                }
                it.remove();
            }
        }
    }

    public void d(V v2) {
        if (v2.f21656e && v2.f21654c.isEmpty()) {
            U u2 = (U) ((HashMap) this.f5634g).remove(v2);
            u2.getClass();
            O o5 = u2.f21650b;
            AbstractC0105a abstractC0105a = u2.f21649a;
            abstractC0105a.p(o5);
            T t3 = u2.f21651c;
            abstractC0105a.u(t3);
            abstractC0105a.s(t3);
            ((HashSet) this.f5635h).remove(v2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [L0.C, v0.O] */
    public void e(V v2) {
        C0127x c0127x = v2.f21652a;
        ?? r12 = new C() { // from class: v0.O
            @Override // L0.C
            public final void a(AbstractC0105a abstractC0105a, AbstractC1416M abstractC1416M) {
                C1557r c1557r = ((C1802E) P8.i.this.f5633f).j;
                c1557r.d(2);
                c1557r.e(22);
            }
        };
        T t3 = new T(this, v2);
        ((HashMap) this.f5634g).put(v2, new U(c0127x, r12, t3));
        int i3 = AbstractC1560u.f20190a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0127x.getClass();
        A0.f fVar = c0127x.f4041c;
        fVar.getClass();
        F f10 = new F();
        f10.f3895a = handler;
        f10.f3896b = t3;
        fVar.f34c.add(f10);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        A0.f fVar2 = c0127x.f4042d;
        fVar2.getClass();
        A0.e eVar = new A0.e();
        eVar.f31a = t3;
        fVar2.f34c.add(eVar);
        c0127x.k(r12, (InterfaceC1726z) this.f5638l, (w0.j) this.f5629b);
    }

    public void f(List routes, List nativeAlternatives) {
        Object obj;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(nativeAlternatives, "nativeAlternatives");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.j;
        linkedHashMap.clear();
        Iterator it = nativeAlternatives.iterator();
        while (it.hasNext()) {
            RouteAlternative routeAlternative = (RouteAlternative) it.next();
            Iterator it2 = routes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.areEqual(routeAlternative.getRoute().getRouteId(), ((com.mapbox.navigation.base.route.g) obj).f12506i)) {
                        break;
                    }
                }
            }
            com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) obj;
            if (gVar != null) {
                String routeId = routeAlternative.getRoute().getRouteId();
                Intrinsics.checkNotNullExpressionValue(routeId, "nativeAlternative.route.routeId");
                linkedHashMap.put(routeId, L1.x(routeAlternative, gVar));
            }
        }
    }

    public void g(InterfaceC0129z interfaceC0129z) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f5631d;
        V v2 = (V) identityHashMap.remove(interfaceC0129z);
        v2.getClass();
        v2.f21652a.n(interfaceC0129z);
        v2.f21654c.remove(((C0124u) interfaceC0129z).f4132a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(v2);
    }

    public void h(int i3, int i10) {
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            ArrayList arrayList = (ArrayList) this.f5630c;
            V v2 = (V) arrayList.remove(i11);
            ((HashMap) this.f5632e).remove(v2.f21653b);
            int i12 = -v2.f21652a.f4146q.f4123b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((V) arrayList.get(i13)).f21655d += i12;
            }
            v2.f21656e = true;
            if (this.f5628a) {
                d(v2);
            }
        }
    }

    public void i(Function0 function0) {
        boolean z2 = false;
        boolean z10 = this.f5628a && ((s2.d) this.f5637k) != null;
        function0.invoke();
        if (this.f5628a && ((s2.d) this.f5637k) != null) {
            z2 = true;
        }
        F5.c cVar = (F5.c) this.f5638l;
        RouteAlternativesControllerInterface routeAlternativesControllerInterface = (RouteAlternativesControllerInterface) this.f5636i;
        if (z2 && !z10) {
            routeAlternativesControllerInterface.addObserver(cVar);
        }
        if (z2 || !z10) {
            return;
        }
        routeAlternativesControllerInterface.removeObserver(cVar);
    }

    public i(C1802E c1802e, w0.c cVar, C1557r c1557r, w0.j jVar) {
        this.f5629b = jVar;
        this.f5633f = c1802e;
        this.f5637k = new c0();
        this.f5631d = new IdentityHashMap();
        this.f5632e = new HashMap();
        this.f5630c = new ArrayList();
        this.f5636i = cVar;
        this.j = c1557r;
        this.f5634g = new HashMap();
        this.f5635h = new HashSet();
    }
}
