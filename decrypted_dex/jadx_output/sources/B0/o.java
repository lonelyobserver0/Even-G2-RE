package B0;

import D5.N;
import a0.C0379a;
import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0438m;
import com.even.translate.azure.translation.AzureTranslationEventHandler;
import com.journeyapps.barcodescanner.BarcodeView;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.renderer.FpsManager;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuversList;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import e5.C0846e;
import f5.u0;
import i5.C1059c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import n6.C1387a;
import n6.C1388b;
import no.nordicsemi.android.dfu.DfuBaseService;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f509b;

    public /* synthetic */ o(Object obj, int i3) {
        this.f508a = i3;
        this.f509b = obj;
    }

    private final void a() {
        Y.p pVar = (Y.p) this.f509b;
        String string2 = StubApp.getString2(483);
        synchronized (pVar.f8685d) {
            try {
                if (pVar.f8689h == null) {
                    return;
                }
                try {
                    K.j c10 = pVar.c();
                    int i3 = c10.f3568e;
                    if (i3 == 2) {
                        synchronized (pVar.f8685d) {
                        }
                    }
                    if (i3 != 0) {
                        throw new RuntimeException(string2 + i3 + StubApp.getString2("74"));
                    }
                    try {
                        String string22 = StubApp.getString2("484");
                        int i10 = J.g.f3258a;
                        Trace.beginSection(string22);
                        C2.i iVar = pVar.f8684c;
                        Context context = pVar.f8682a;
                        iVar.getClass();
                        K.j[] jVarArr = {c10};
                        a4.f fVar = F.e.f2170a;
                        Trace.beginSection(u0.A(StubApp.getString2("485")));
                        try {
                            Typeface h2 = F.e.f2170a.h(context, jVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer t3 = android.support.v4.media.session.b.t(pVar.f8682a, c10.f3564a);
                            if (t3 == null || h2 == null) {
                                throw new RuntimeException(StubApp.getString2("487"));
                            }
                            try {
                                Trace.beginSection(StubApp.getString2("486"));
                                p2.h hVar = new p2.h(h2, AbstractC1526a.G(t3));
                                Trace.endSection();
                                synchronized (pVar.f8685d) {
                                    try {
                                        u0 u0Var = pVar.f8689h;
                                        if (u0Var != null) {
                                            u0Var.t(hVar);
                                        }
                                    } finally {
                                    }
                                }
                                pVar.b();
                            } finally {
                                int i11 = J.g.f3258a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f8685d) {
                        try {
                            u0 u0Var2 = pVar.f8689h;
                            if (u0Var2 != null) {
                                u0Var2.s(th2);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        O0.l lVar = (O0.l) this.f509b;
        Map map = null;
        ((AtomicReference) lVar.f5144c).set(null);
        synchronized (lVar) {
            if (((AtomicMarkableReference) lVar.f5143b).isMarked()) {
                C0846e c0846e = (C0846e) ((AtomicMarkableReference) lVar.f5143b).getReference();
                synchronized (c0846e) {
                    map = Collections.unmodifiableMap(new HashMap(c0846e.f13610a));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) lVar.f5143b;
                atomicMarkableReference.set((C0846e) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            C1059c c1059c = (C1059c) lVar.f5145d;
            ((e5.h) c1059c.f14843b).h((String) c1059c.f14842a, map, lVar.f5142a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = true;
        String str = null;
        switch (this.f508a) {
            case 0:
                ((F5.c) this.f509b).l();
                return;
            case 1:
                B3.s sVar = (B3.s) this.f509b;
                synchronized (((ArrayDeque) sVar.f653e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) sVar.f651c).edit();
                    String str2 = (String) sVar.f650b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) sVar.f653e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) sVar.f652d);
                    }
                    edit.putString(str2, sb2.toString()).commit();
                }
                return;
            case 2:
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(491));
                N n10 = (N) this.f509b;
                sb3.append(n10.f1389a.getAction());
                sb3.append(StubApp.getString2(492));
                Log.w(StubApp.getString2(493), sb3.toString());
                n10.f1390b.d(null);
                return;
            case 3:
                E0.h hVar = (E0.h) this.f509b;
                synchronized (hVar.f1756a) {
                    try {
                        if (hVar.f1767m) {
                            return;
                        }
                        long j = hVar.f1766l - 1;
                        hVar.f1766l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            hVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (hVar.f1756a) {
                            hVar.f1768n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 4:
                ((HandlerThread) this.f509b).quit();
                return;
            case 5:
                H3.j jVar = (H3.j) this.f509b;
                jVar.getClass();
                ((I3.h) jVar.f2736d).p(new C2.d(jVar, 15));
                return;
            case 6:
                ((J0.d) this.f509b).x();
                return;
            case 7:
                K2.a aVar = (K2.a) this.f509b;
                aVar.f3632b.invoke();
                aVar.f3633c = null;
                return;
            case 8:
                Qa.b bVar = (Qa.b) this.f509b;
                EventChannel.EventSink eventSink = bVar.f5787b;
                ConnectivityManager connectivityManager = (ConnectivityManager) bVar.f5786a.f20712b;
                eventSink.success(s2.d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case 9:
                ((R0.m) this.f509b).f6014m--;
                return;
            case 10:
                Object systemService = ((Ta.d) this.f509b).f7244a.getSystemService(StubApp.getString2(490));
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel(DfuBaseService.NOTIFICATION_ID);
                return;
            case 11:
                break;
            case 12:
                String string2 = StubApp.getString2(381);
                R2.c.b(string2, StubApp.getString2(488));
                W2.c cVar = (W2.c) this.f509b;
                cVar.f8079e = true;
                cVar.f8078d = null;
                cVar.f8081g.removeCallbacksAndMessages(null);
                cVar.f8077c.setStreamHandler(null);
                R2.c.d(string2, StubApp.getString2(489));
                return;
            case 13:
                a();
                return;
            case 14:
                E e10 = (E) this.f509b;
                int i3 = e10.f9867b;
                C0446v c0446v = e10.f9871f;
                if (i3 == 0) {
                    e10.f9868c = true;
                    c0446v.e(EnumC0438m.ON_PAUSE);
                }
                if (e10.f9866a == 0 && e10.f9868c) {
                    c0446v.e(EnumC0438m.ON_STOP);
                    e10.f9869d = true;
                    return;
                }
                return;
            case 15:
                ((FlutterJNI) ((bb.d) ((J9.c) this.f509b).f3462b).f10746e).prefetchDefaultFontManager();
                return;
            case 16:
                AzureTranslationEventHandler.dispose$lambda$0((AzureTranslationEventHandler) this.f509b);
                return;
            case 17:
                NativeMapImpl._set_sizeSet_$lambda$1((NativeMapImpl) this.f509b);
                return;
            case 18:
                FpsManager.onRenderingPausedRunnable$lambda$1((FpsManager) this.f509b);
                return;
            case 19:
                d.i iVar = (d.i) this.f509b;
                Runnable runnable = iVar.f13062b;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    iVar.f13062b = null;
                    return;
                }
                return;
            case 20:
                d.m.b((d.m) this.f509b);
                return;
            case 21:
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = (AbstractComponentCallbacksC0789t) this.f509b;
                abstractComponentCallbacksC0789t.f13363Z.f13232e.v(abstractComponentCallbacksC0789t.f13367d);
                abstractComponentCallbacksC0789t.f13367d = null;
                return;
            case 22:
                C1059c c1059c = (C1059c) this.f509b;
                synchronized (((AtomicMarkableReference) c1059c.f14848g)) {
                    try {
                        if (((AtomicMarkableReference) c1059c.f14848g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) c1059c.f14848g).getReference();
                            ((AtomicMarkableReference) c1059c.f14848g).set(str, false);
                        } else {
                            z2 = false;
                        }
                    } finally {
                    }
                }
                if (z2) {
                    ((e5.h) c1059c.f14843b).i((String) c1059c.f14842a, str);
                    return;
                }
                return;
            case 23:
                b();
                return;
            case 24:
                int i10 = MapboxManeuversList.f12530b;
                String string22 = StubApp.getString2(392);
                MapboxManeuversList mapboxManeuversList = (MapboxManeuversList) this.f509b;
                Intrinsics.checkNotNullParameter(mapboxManeuversList, string22);
                mapboxManeuversList.f12531a = false;
                mapboxManeuversList.layout(mapboxManeuversList.getLeft(), mapboxManeuversList.getTop(), mapboxManeuversList.getRight(), mapboxManeuversList.getBottom());
                mapboxManeuversList.onLayout(false, mapboxManeuversList.getLeft(), mapboxManeuversList.getTop(), mapboxManeuversList.getRight(), mapboxManeuversList.getBottom());
                return;
            case 25:
                i7.o this$0 = (i7.o) this.f509b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f14915p0.removeCallbacksAndMessages(null);
                this$0.f14910m0.clear();
                this$0.P(this$0.f14906k0);
                this$0.P(this$0.f14908l0);
                return;
            case 26:
                ((PlatformViewsController) this.f509b).lambda$onEndFrame$3();
                return;
            case 27:
                m6.e.a((BarcodeView) ((C0379a) this.f509b).f9233b);
                return;
            case 28:
                C1388b c1388b = ((C1387a) this.f509b).f17805a;
                c1388b.f17808b = false;
                c1388b.a();
                return;
            default:
                ((no.nordicsemi.android.ble.u) this.f509b).getClass();
                return;
        }
        while (true) {
            U9.d dVar = (U9.d) this.f509b;
            ArrayList arrayList = dVar.f7505f;
            if (arrayList.isEmpty() || dVar.f7510l != null) {
                return;
            }
            ((V9.e) arrayList.get(0)).f7912a.run();
            arrayList.remove(0);
        }
    }

    public /* synthetic */ o(no.nordicsemi.android.ble.u uVar, BluetoothDevice bluetoothDevice, byte[] bArr, int i3) {
        this.f508a = 29;
        this.f509b = uVar;
    }
}
