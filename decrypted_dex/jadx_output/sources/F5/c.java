package F5;

import A.e;
import B0.k;
import D9.l;
import H0.p;
import H5.C0085s;
import L0.a0;
import L0.b0;
import L0.h0;
import L5.n;
import M4.C0150v;
import M4.F;
import M4.G;
import M4.r;
import N.I;
import N.InterfaceC0167m;
import N.Z;
import N.c0;
import Qb.C0203k;
import Qb.K0;
import Qb.L;
import R0.f;
import R0.t;
import R0.u;
import R8.B;
import R8.D;
import T.InterfaceC0294j;
import X2.h;
import X2.i;
import X2.o;
import X2.q;
import X2.w;
import X2.x;
import Z9.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.HttpServiceFactory;
import com.mapbox.common.HttpServiceInterface;
import com.mapbox.common.LoggingLevel;
import com.mapbox.maps.StyleManager;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteAlternativesObserver;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.SetAlternativeRoutesCallback;
import com.stub.StubApp;
import f4.C0882f;
import g5.C0955a;
import h1.C1005h;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MessageCodec;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import l4.E0;
import o0.C1404A;
import o0.C1417N;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC0167m, a0, D3.b, H1.c, K5.b, Nc.b, RouteAlternativesObserver, u, SetAlternativeRoutesCallback {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f2236c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2237a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2238b;

    public /* synthetic */ c(Object obj, int i3) {
        this.f2237a = i3;
        this.f2238b = obj;
    }

    public static String j(String str, String str2) {
        return str + StubApp.getString2(2019) + str2 + StubApp.getString2(2020);
    }

    @Override // Nc.b
    public FileChannel b() {
        return new FileInputStream((File) this.f2238b).getChannel();
    }

    @Override // H1.c
    public void c(int i3, Serializable serializable) {
        String string2;
        switch (i3) {
            case 1:
                string2 = StubApp.getString2(1088);
                break;
            case 2:
                string2 = StubApp.getString2(1087);
                break;
            case 3:
                string2 = StubApp.getString2(1086);
                break;
            case 4:
                string2 = StubApp.getString2(1085);
                break;
            case 5:
                string2 = StubApp.getString2(1084);
                break;
            case 6:
                string2 = StubApp.getString2(1083);
                break;
            case 7:
                string2 = StubApp.getString2(1082);
                break;
            case 8:
                string2 = StubApp.getString2(1081);
                break;
            case 9:
            default:
                string2 = "";
                break;
            case 10:
                string2 = StubApp.getString2(1080);
                break;
            case 11:
                string2 = StubApp.getString2(1079);
                break;
        }
        String string22 = StubApp.getString2(1089);
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e(string22, string2, (Throwable) serializable);
        } else {
            Log.d(string22, string2);
        }
        ((ProfileInstallReceiver) this.f2238b).setResultCode(i3);
    }

    @Override // N.InterfaceC0167m
    public c0 d(View view, c0 c0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2238b;
        if (!Objects.equals(coordinatorLayout.f9649p, c0Var)) {
            coordinatorLayout.f9649p = c0Var;
            boolean z2 = c0Var.d() > 0;
            coordinatorLayout.f9650q = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            Z z10 = c0Var.f4771a;
            if (!z10.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    WeakHashMap weakHashMap = I.f4732a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f8a != null && z10.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0Var;
    }

    @Override // R0.u
    public void e() {
        f fVar = (f) this.f2238b;
        Surface surface = fVar.f5960j1;
        if (surface != null) {
            C c10 = fVar.f5950Y0;
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new t(c10, surface, SystemClock.elapsedRealtime()));
            }
            fVar.f5963m1 = true;
        }
    }

    public void f(String str, String str2) {
        String a3 = p.a(str.trim());
        String trim = str2.trim();
        A0.c cVar = (A0.c) this.f2238b;
        cVar.getClass();
        r.c(a3, trim);
        C0150v c0150v = (C0150v) cVar.f29a;
        if (c0150v == null) {
            c0150v = C0150v.a();
            cVar.f29a = c0150v;
        }
        M4.C c10 = (M4.C) c0150v.get(a3);
        if (c10 == null) {
            G g10 = M4.I.f4549b;
            r.d(4, StubApp.getString2(2021));
            F f10 = new F(4);
            C0150v c0150v2 = (C0150v) cVar.f29a;
            if (c0150v2 == null) {
                c0150v2 = C0150v.a();
                cVar.f29a = c0150v2;
            }
            c0150v2.put(a3, f10);
            c10 = f10;
        }
        c10.c(trim);
    }

    @Override // H1.c
    public void g() {
        Log.d(StubApp.getString2(1089), StubApp.getString2(1090));
    }

    @Override // Pb.a
    public Object get() {
        switch (this.f2237a) {
            case 4:
                return this.f2238b;
            case 9:
                Context appContext = (Context) ((K5.c) this.f2238b).f3721a;
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                return X.f.b(new U.a(H5.r.f2914c), new C0085s(appContext, 1));
            default:
                return new n((InterfaceC0294j) ((Pb.a) this.f2238b).get());
        }
    }

    @Override // L0.a0
    public void h(b0 b0Var) {
        k kVar = (k) this.f2238b;
        kVar.f485s.h(kVar);
    }

    public void i(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            int i10 = AbstractC1560u.f20190a;
            String[] split = str.split(StubApp.getString2(2022), 2);
            if (split.length == 2) {
                f(split[0], split[1]);
            }
        }
    }

    public void k(h data) {
        Intrinsics.checkNotNullParameter(data, "progress");
        R2.c.e(StubApp.getString2(390), StubApp.getString2(2023) + data);
        Intrinsics.checkNotNullParameter(data, "data");
        Message obtain = Message.obtain();
        Pair pair = TuplesKt.to(StubApp.getString2(2024), Boolean.valueOf(data.f8276a));
        Pair pair2 = TuplesKt.to(StubApp.getString2(2025), data.f8277b);
        Pair pair3 = TuplesKt.to(StubApp.getString2(2026), data.f8278c);
        Pair pair4 = TuplesKt.to(StubApp.getString2(2027), data.f8279d);
        Pair pair5 = TuplesKt.to(StubApp.getString2(2028), data.f8280e);
        Pair pair6 = TuplesKt.to(StubApp.getString2(2029), data.f8281f);
        Pair pair7 = TuplesKt.to(StubApp.getString2(2030), data.f8282g);
        Pair pair8 = TuplesKt.to(StubApp.getString2(2031), data.f8283h);
        x xVar = data.f8284i;
        Pair pair9 = TuplesKt.to(StubApp.getString2(2032), xVar != null ? Integer.valueOf(xVar.f8368a) : null);
        x xVar2 = data.j;
        obtain.obj = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to(StubApp.getString2(2033), xVar2 != null ? Integer.valueOf(xVar2.f8368a) : null));
        Z2.a aVar = Z2.b.f8972b;
        if (aVar != null) {
            aVar.sendMessage(obtain);
        }
    }

    public void l() {
        k kVar = (k) this.f2238b;
        int i3 = kVar.f486t - 1;
        kVar.f486t = i3;
        if (i3 > 0) {
            return;
        }
        int i10 = 0;
        for (B0.r rVar : kVar.f488w) {
            rVar.h();
            i10 += rVar.f531O.f4093a;
        }
        C1417N[] c1417nArr = new C1417N[i10];
        int i11 = 0;
        for (B0.r rVar2 : kVar.f488w) {
            rVar2.h();
            int i12 = rVar2.f531O.f4093a;
            int i13 = 0;
            while (i13 < i12) {
                rVar2.h();
                c1417nArr[i11] = rVar2.f531O.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.f487v = new h0(c1417nArr);
        kVar.f485s.a(kVar);
    }

    @Override // R0.u
    public void m() {
        f fVar = (f) this.f2238b;
        if (fVar.f5960j1 != null) {
            fVar.H0(0, 1);
        }
    }

    public void n(i infoArg) {
        Intrinsics.checkNotNullParameter(infoArg, "evenRoutesPreviewInfo");
        w wVar = (w) this.f2238b;
        R2.c.e(StubApp.getString2(390), StubApp.getString2(2034) + infoArg);
        X2.p pVar = wVar.f8336g;
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(infoArg, "infoArg");
            String string2 = StubApp.getString2(696);
            q qVar = wVar.f8345s;
            Intrinsics.checkNotNullParameter(qVar, string2);
            String str = StubApp.getString2(2035) + "";
            new BasicMessageChannel(pVar.f8316a, str, (MessageCodec) X2.p.f8315b.getValue()).send(CollectionsKt.listOf(infoArg), new o(qVar, str, 4));
        }
    }

    public void o() {
        w wVar = (w) this.f2238b;
        R2.c.b(StubApp.getString2(390), StubApp.getString2(2036));
        X2.p pVar = wVar.f8336g;
        if (pVar != null) {
            String string2 = StubApp.getString2(696);
            q qVar = wVar.f8345s;
            Intrinsics.checkNotNullParameter(qVar, string2);
            String str = StubApp.getString2(2037) + "";
            new BasicMessageChannel(pVar.f8316a, str, (MessageCodec) X2.p.f8315b.getValue()).send(null, new o(qVar, str, 1));
        }
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (l.a(l.g(), LoggingLevel.ERROR)) {
            l.e(StubApp.getString2(2038) + message, StubApp.getString2(2039));
        }
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onOnlinePrimaryRouteAvailable(RouteInterface onlinePrimaryRoute) {
        Intrinsics.checkNotNullParameter(onlinePrimaryRoute, "onlinePrimaryRoute");
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onRouteAlternativesChanged(List routeAlternatives, List removed) {
        Intrinsics.checkNotNullParameter(routeAlternatives, "routeAlternatives");
        Intrinsics.checkNotNullParameter(removed, "removed");
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onRouteAlternativesUpdated(RouteInterface routeInterface, List routeAlternatives, List removedAlternatives) {
        Intrinsics.checkNotNullParameter(routeAlternatives, "routeAlternatives");
        Intrinsics.checkNotNullParameter(removedAlternatives, "removedAlternatives");
        if (l.a(l.g(), LoggingLevel.INFO)) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(2040));
            ArrayList arrayList = new ArrayList(CollectionsKt.f(routeAlternatives));
            Iterator it = routeAlternatives.iterator();
            while (it.hasNext()) {
                arrayList.add(((RouteAlternative) it.next()).getRoute().getRouteId());
            }
            sb2.append(arrayList);
            l.f(sb2.toString(), StubApp.getString2(2039));
        }
        P8.i iVar = (P8.i) this.f2238b;
        K0 k02 = (K0) iVar.f5635h;
        if (k02 != null) {
            k02.d(null);
        }
        iVar.f5635h = L.j(((D9.f) ((Lazy) iVar.f5634g).getValue()).f1513b, null, new P8.h(routeInterface, routeAlternatives, iVar, new P8.e(iVar, this, null), null), 3);
    }

    public C1404A p(T0.l lVar, C0955a c0955a) {
        C1553n c1553n = (C1553n) this.f2238b;
        C1404A c1404a = null;
        int i3 = 0;
        while (true) {
            try {
                lVar.i(c1553n.f20176a, 0, 10, false);
                c1553n.G(0);
                if (c1553n.x() != 4801587) {
                    break;
                }
                c1553n.H(3);
                int t3 = c1553n.t();
                int i10 = t3 + 10;
                if (c1404a == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(c1553n.f20176a, 0, bArr, 0, 10);
                    lVar.i(bArr, 10, t3, false);
                    c1404a = new C1005h(c0955a).z(i10, bArr);
                } else {
                    lVar.a(t3, false);
                }
                i3 += i10;
            } catch (EOFException unused) {
            }
        }
        lVar.f7032f = 0;
        lVar.a(i3, false);
        return c1404a;
    }

    public void q(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullExpressionValue(((StyleManager) this.f2238b).removeStyleLayer(layerId), "originalStyleManager.removeStyleLayer(layerId)");
    }

    @Override // com.mapbox.navigator.SetAlternativeRoutesCallback
    public void run(Expected result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.onError(Z8.d.f9045b);
        List list = (List) result.getValue();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        ((C0203k) this.f2238b).resumeWith(Result.m40constructorimpl(list));
    }

    public String toString() {
        switch (this.f2237a) {
            case 24:
                return Xa.h.s(new StringBuilder(StubApp.getString2(2041)), (String) this.f2238b, Typography.greater);
            default:
                return super.toString();
        }
    }

    public c(C0882f c0882f, V6.b bVar) {
        this.f2237a = 22;
        this.f2238b = bVar;
        c0882f.j(new U4.b(this));
    }

    public c(R4.b chain) {
        this.f2237a = 14;
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f2238b = chain;
    }

    public c(StyleManager originalStyleManager) {
        this.f2237a = 2;
        Intrinsics.checkNotNullParameter(originalStyleManager, "originalStyleManager");
        this.f2238b = originalStyleManager;
    }

    public c(B routeRefresherExecutor, C stateHolder, Vb.f scope, D listener, E0 attemptListener) {
        this.f2237a = 19;
        Intrinsics.checkNotNullParameter(routeRefresherExecutor, "routeRefresherExecutor");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(attemptListener, "attemptListener");
        this.f2238b = scope;
    }

    public c(int i3) {
        this.f2237a = i3;
        switch (i3) {
            case 6:
                break;
            case 7:
                this.f2238b = new A0.c();
                break;
            case 11:
                HttpServiceInterface httpService = HttpServiceFactory.getInstance();
                Intrinsics.checkNotNullExpressionValue(httpService, "getInstance()");
                Intrinsics.checkNotNullParameter(httpService, "httpService");
                this.f2238b = httpService;
                Ec.d.a(K8.a.f3757c);
                break;
            case 20:
                this.f2238b = new AtomicInteger(0);
                break;
            case 21:
                this.f2238b = new C1553n(10);
                break;
            default:
                this.f2238b = new HashSet();
                break;
        }
    }

    public c(boolean z2) {
        this.f2237a = 25;
        this.f2238b = new AtomicBoolean(z2);
    }

    public c(Context context) {
        boolean isEmpty;
        this.f2237a = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences(StubApp.getString2(1376), 0);
        this.f2238b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), StubApp.getString2(2016));
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i(StubApp.getString2("493"), StubApp.getString2("2017"));
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d(StubApp.getString2(493), StubApp.getString2(2018) + e10.getMessage());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i3, String str, String str2) {
        this(7);
        this.f2237a = 7;
        f(StubApp.getString2(2015), str);
        f(StubApp.getString2(393), String.valueOf(i3));
        if (str2 != null) {
            f(StubApp.getString2(403), str2);
        }
    }
}
