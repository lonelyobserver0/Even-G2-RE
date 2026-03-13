package Ab;

import B3.s;
import D5.AbstractServiceC0044h;
import H0.C0063f;
import H0.I;
import H0.InterfaceC0062e;
import H0.t;
import Kc.C0104k;
import L0.B;
import M4.F;
import M4.Z;
import R8.C0250h;
import Xa.A;
import Y.p;
import Y.q;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import c5.l;
import c5.r;
import com.builttoroam.devicecalendar.CalendarDelegate;
import com.even.translate.TranslatePlugin;
import com.even.translate.azure.translation.AzureTranslationRecognizer;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.C0587a0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleMonitoringState;
import com.stub.StubApp;
import d0.C0775e;
import d0.a0;
import e5.C0844c;
import f5.u0;
import i5.C1059c;
import ib.C1069c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import l4.E0;
import o0.C1414K;
import q4.k;
import rc.C1589d;
import sb.C1645f;
import sb.V0;
import sb.W0;
import sc.AbstractC1687a;
import tc.C1756b;
import tc.J;
import tc.L;
import uc.C1787a;
import v0.C1830z;
import v0.M;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f262d;

    public /* synthetic */ c(r rVar, FlutterError flutterError) {
        this.f259a = 5;
        Map map = Collections.EMPTY_MAP;
        this.f260b = rVar;
        this.f261c = flutterError;
        this.f262d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string2;
        k kVar;
        int i3 = 11;
        int i10 = 12;
        C1756b c1756b = null;
        switch (this.f259a) {
            case 0:
                C1589d c1589d = ((i) ((E0) this.f260b).f16038c).f288c;
                h hVar = (h) this.f261c;
                Db.c cVar = (Db.c) this.f262d;
                C1787a c1787a = c1589d.f20570f;
                c1787a.f22300n = true;
                c1787a.e(StubApp.getString2(439));
                Intrinsics.checkNotNull(hVar);
                J j = new J(Oc.a.S(hVar), Oc.a.S(hVar), i10);
                if (cVar == null || (string2 = cVar.getMessage()) == null) {
                    string2 = StubApp.getString2(440);
                }
                L l9 = new L(c1589d.f20569e, new C1756b(C0104k.f3820d, string2), j, 18);
                EventChannel.EventSink eventSink = c1589d.f20565a.f21940a;
                if (eventSink != null) {
                    eventSink.success(l9.a());
                    return;
                }
                return;
            case 1:
                C1589d c1589d2 = ((i) ((E0) this.f260b).f16038c).f288c;
                h hVar2 = (h) this.f261c;
                h hVar3 = (h) this.f262d;
                c1589d2.getClass();
                Intrinsics.checkNotNull(hVar3);
                Intrinsics.checkNotNullParameter(hVar3, "<this>");
                boolean z2 = AbstractC1687a.f21008a[hVar3.ordinal()] != 3;
                C1787a c1787a2 = c1589d2.f20570f;
                c1787a2.f22300n = z2;
                c1787a2.e(StubApp.getString2(437) + hVar2 + StubApp.getString2(438) + hVar3);
                Intrinsics.checkNotNull(hVar2);
                L l10 = new L(c1589d2.f20569e, c1756b, new J(Oc.a.S(hVar2), Oc.a.S(hVar3), i10), 22);
                EventChannel.EventSink eventSink2 = c1589d2.f20565a.f21940a;
                if (eventSink2 != null) {
                    eventSink2.success(l10.a());
                    return;
                }
                return;
            case 2:
                Intent intent = (Intent) this.f261c;
                kVar = (k) this.f262d;
                AbstractServiceC0044h abstractServiceC0044h = (AbstractServiceC0044h) this.f260b;
                abstractServiceC0044h.getClass();
                try {
                    abstractServiceC0044h.b(intent);
                    return;
                } finally {
                    kVar.b(null);
                }
            case 3:
                C2.d dVar = ((C0063f) this.f260b).f2545c;
                String str = (String) this.f261c;
                H0.r rVar = (H0.r) dVar.f1057b;
                rVar.f2618c = str;
                InterfaceC0062e interfaceC0062e = (InterfaceC0062e) this.f262d;
                I m4 = interfaceC0062e.m();
                t tVar = rVar.f2619d;
                if (m4 != null) {
                    tVar.f2629d.j.f2466c.put(Integer.valueOf(interfaceC0062e.f()), m4);
                    tVar.f2646y = true;
                }
                tVar.m();
                return;
            case 4:
                F2.a aVar = (F2.a) this.f260b;
                u0 u0Var = (u0) this.f261c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f262d;
                aVar.getClass();
                try {
                    q d8 = AbstractC0624h2.d(aVar.f2212a);
                    if (d8 == null) {
                        throw new RuntimeException(StubApp.getString2("436"));
                    }
                    p pVar = (p) ((Y.g) d8.f8656b);
                    synchronized (pVar.f8685d) {
                        pVar.f8687f = threadPoolExecutor;
                    }
                    ((Y.g) d8.f8656b).a(new Y.j(u0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    u0Var.s(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 5:
                l lVar = ((r) this.f260b).f10932h;
                Thread currentThread = Thread.currentThread();
                lVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                c5.t tVar2 = lVar.f10905n;
                if (tVar2 == null || !tVar2.f10951e.get()) {
                    long j3 = currentTimeMillis / 1000;
                    String e10 = lVar.e();
                    String string22 = StubApp.getString2(280);
                    if (e10 == null) {
                        Log.w(string22, StubApp.getString2(433), null);
                        return;
                    }
                    C0844c c0844c = new C0844c(e10, j3, Collections.EMPTY_MAP);
                    C1059c c1059c = lVar.f10904m;
                    c1059c.getClass();
                    String concat = StubApp.getString2(434).concat(e10);
                    if (Log.isLoggable(string22, 2)) {
                        Log.v(string22, concat, null);
                    }
                    c1059c.m((FlutterError) this.f261c, currentThread, StubApp.getString2(435), c0844c, false);
                    return;
                }
                return;
            case 6:
                CalendarDelegate.retrieveEvents$lambda$2$lambda$1((CalendarDelegate) this.f260b, (List) this.f261c, (MethodChannel.Result) this.f262d);
                return;
            case 7:
                CalendarDelegate.createOrUpdateEvent$lambda$5$lambda$4((CalendarDelegate) this.f260b, (Ref.ObjectRef) this.f261c, (MethodChannel.Result) this.f262d);
                return;
            case 8:
                TranslatePlugin.handleStopTranslation$lambda$3((AzureTranslationRecognizer) this.f260b, (TranslatePlugin) this.f261c, (MethodChannel.Result) this.f262d);
                return;
            case 9:
                LifecycleMonitorAndroid.notifyObservers$lambda$4$lambda$2$lambda$1((Map.Entry) this.f260b, (LifecycleMonitoringState) this.f261c, (String) this.f262d);
                return;
            case 10:
                String string23 = StubApp.getString2(432);
                ViewGroup viewGroup = (ViewGroup) this.f260b;
                Intrinsics.checkNotNullParameter(viewGroup, string23);
                String string24 = StubApp.getString2(392);
                C0775e c0775e = (C0775e) this.f262d;
                Intrinsics.checkNotNullParameter(c0775e, string24);
                viewGroup.endViewTransition((View) this.f261c);
                ((a0) c0775e.f13297c.f4728a).c(c0775e);
                return;
            case 11:
                hb.i iVar = (hb.i) this.f260b;
                String str2 = (String) this.f261c;
                kVar = (k) this.f262d;
                try {
                    FirebaseAnalytics firebaseAnalytics = iVar.f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                    c0657o0.getClass();
                    c0657o0.a(new C0587a0(c0657o0, str2));
                    return;
                } catch (Exception e11) {
                    kVar.a(e11);
                    return;
                }
            case 12:
                R4.h hVar4 = (R4.h) this.f261c;
                k kVar2 = (k) this.f262d;
                HashMap hashMap = C1069c.f14975c;
                ((C1069c) this.f260b).getClass();
                try {
                    hVar4.a();
                    String str3 = hVar4.f6194b;
                    hVar4.a();
                    ib.e c10 = C1069c.c(hVar4.f6195c);
                    Boolean valueOf = Boolean.valueOf(hVar4.k());
                    Map map = (Map) a4.f.b(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(hVar4));
                    ib.f fVar = new ib.f();
                    if (str3 == null) {
                        throw new IllegalStateException(StubApp.getString2("431"));
                    }
                    fVar.f14994a = str3;
                    fVar.f14995b = c10;
                    fVar.f14996c = valueOf;
                    if (map == null) {
                        throw new IllegalStateException(StubApp.getString2("430"));
                    }
                    fVar.f14997d = map;
                    kVar2.b(fVar);
                    return;
                } catch (Exception e12) {
                    kVar2.a(e12);
                    return;
                }
            case 13:
                k kVar3 = (k) this.f261c;
                R4.h hVar5 = (R4.h) this.f262d;
                jb.b bVar = (jb.b) this.f260b;
                try {
                    A a3 = new A();
                    hVar5.a();
                    if (hVar5.f6194b.equals(StubApp.getString2("429"))) {
                        a3.put(StubApp.getString2("428"), Boolean.valueOf(jb.b.a(bVar, R4.h.e())));
                    }
                    kVar3.b(a3);
                    return;
                } catch (Exception e13) {
                    kVar3.a(e13);
                    return;
                }
            case 14:
                Map map2 = (Map) this.f261c;
                k kVar4 = (k) this.f262d;
                jb.b bVar2 = (jb.b) this.f260b;
                try {
                    Object obj = map2.get(StubApp.getString2("427"));
                    Objects.requireNonNull(obj);
                    Y4.b.a().b((Boolean) obj);
                    A a9 = new A();
                    a9.put(StubApp.getString2("428"), Boolean.valueOf(jb.b.a(bVar2, R4.h.e())));
                    kVar4.b(a9);
                    return;
                } catch (Exception e14) {
                    kVar4.a(e14);
                    return;
                }
            case 15:
                C1645f callback = new C1645f(i3);
                V0 pigeon_instanceArg = (V0) this.f260b;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView viewArg = (WebView) this.f261c;
                ClientCertRequest requestArg = (ClientCertRequest) this.f262d;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(requestArg, "requestArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                s sVar = w02.f21007a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(426), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, requestArg), new com.mapbox.common.location.a(i10, callback));
                return;
            case 16:
                C1645f callback2 = new C1645f(i3);
                V0 pigeon_instanceArg2 = (V0) this.f260b;
                W0 w03 = pigeon_instanceArg2.f20913a;
                WebView webViewArg = (WebView) this.f261c;
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f262d;
                w03.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(requestArg2, "requestArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                s sVar2 = w03.f21007a;
                sVar2.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar2.f651c, StubApp.getString2(425), sVar2.i()).send(CollectionsKt.listOf(pigeon_instanceArg2, webViewArg, requestArg2), new com.mapbox.common.location.a(13, callback2));
                return;
            default:
                M m10 = (M) this.f260b;
                m10.getClass();
                Z g10 = ((F) this.f261c).g();
                w0.c cVar2 = m10.f21618c;
                C1830z c1830z = cVar2.f21995g;
                c1830z.getClass();
                C0250h c0250h = cVar2.f21992d;
                c0250h.getClass();
                c0250h.f6297b = M4.I.m(g10);
                if (!g10.isEmpty()) {
                    c0250h.f6300e = (B) g10.get(0);
                    B b2 = (B) this.f262d;
                    b2.getClass();
                    c0250h.f6301f = b2;
                }
                if (((B) c0250h.f6299d) == null) {
                    c0250h.f6299d = C0250h.e(c1830z, (M4.I) c0250h.f6297b, (B) c0250h.f6300e, (C1414K) c0250h.f6296a);
                }
                c0250h.l(c1830z.t());
                return;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i3) {
        this.f259a = i3;
        this.f260b = obj;
        this.f261c = obj2;
        this.f262d = obj3;
    }
}
