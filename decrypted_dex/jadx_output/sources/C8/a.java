package C8;

import D9.l;
import M4.Z;
import R4.h;
import Vc.i;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0439n;
import b3.C0498N;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.X;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import l4.C1162a1;
import l4.C1191k0;
import l4.C1200n0;
import l4.C1219x;
import l4.P0;
import l4.RunnableC1160a;
import l4.RunnableC1201n1;
import l4.X0;
import l4.Z0;
import l4.q1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1135b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f1134a = i3;
        this.f1135b = obj;
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: all -> 0x002c, RuntimeException -> 0x002f, TryCatch #0 {RuntimeException -> 0x002f, blocks: (B:3:0x0005, B:5:0x001d, B:7:0x0023, B:12:0x0051, B:15:0x0058, B:17:0x0073, B:19:0x007f, B:24:0x0093, B:28:0x00a4, B:35:0x0032, B:37:0x0039, B:39:0x0049), top: B:2:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.google.android.gms.internal.measurement.W r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C8.a.i(com.google.android.gms.internal.measurement.W, android.os.Bundle):void");
    }

    public void j(W w10) {
        C1162a1 c1162a1 = ((C1200n0) ((P0) this.f1135b).f4728a).f16546m;
        C1200n0.k(c1162a1);
        synchronized (c1162a1.f16355m) {
            try {
                if (Objects.equals(c1162a1.f16351g, w10)) {
                    c1162a1.f16351g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C1200n0) c1162a1.f4728a).f16539d.y()) {
            c1162a1.f16350f.remove(Integer.valueOf(w10.f11397a));
        }
    }

    public void k(W w10) {
        C1200n0 c1200n0 = (C1200n0) ((P0) this.f1135b).f4728a;
        C1162a1 c1162a1 = c1200n0.f16546m;
        C1200n0.k(c1162a1);
        synchronized (c1162a1.f16355m) {
            c1162a1.f16354l = false;
            c1162a1.f16352h = true;
        }
        C1200n0 c1200n02 = (C1200n0) c1162a1.f4728a;
        c1200n02.f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c1200n02.f16539d.y()) {
            X0 p8 = c1162a1.p(w10);
            c1162a1.f16348d = c1162a1.f16347c;
            c1162a1.f16347c = null;
            C1191k0 c1191k0 = c1200n02.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new RunnableC1160a(c1162a1, p8, elapsedRealtime));
        } else {
            c1162a1.f16347c = null;
            C1191k0 c1191k02 = c1200n02.f16542g;
            C1200n0.l(c1191k02);
            c1191k02.t(new i(c1162a1, elapsedRealtime));
        }
        q1 q1Var = c1200n0.f16543h;
        C1200n0.k(q1Var);
        C1200n0 c1200n03 = (C1200n0) q1Var.f4728a;
        c1200n03.f16545l.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C1191k0 c1191k03 = c1200n03.f16542g;
        C1200n0.l(c1191k03);
        c1191k03.t(new RunnableC1201n1(q1Var, elapsedRealtime2, 1));
    }

    public void l(W w10) {
        C1200n0 c1200n0 = (C1200n0) ((P0) this.f1135b).f4728a;
        q1 q1Var = c1200n0.f16543h;
        C1200n0.k(q1Var);
        C1200n0 c1200n02 = (C1200n0) q1Var.f4728a;
        c1200n02.f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1191k0 c1191k0 = c1200n02.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new RunnableC1201n1(q1Var, elapsedRealtime, 0));
        C1162a1 c1162a1 = c1200n0.f16546m;
        C1200n0.k(c1162a1);
        Object obj = c1162a1.f16355m;
        synchronized (obj) {
            c1162a1.f16354l = true;
            if (!Objects.equals(w10, c1162a1.f16351g)) {
                synchronized (obj) {
                    c1162a1.f16351g = w10;
                    c1162a1.f16352h = false;
                    C1200n0 c1200n03 = (C1200n0) c1162a1.f4728a;
                    if (c1200n03.f16539d.y()) {
                        c1162a1.j = null;
                        C1191k0 c1191k02 = c1200n03.f16542g;
                        C1200n0.l(c1191k02);
                        c1191k02.t(new Z0(c1162a1, 1));
                    }
                }
            }
        }
        C1200n0 c1200n04 = (C1200n0) c1162a1.f4728a;
        if (!c1200n04.f16539d.y()) {
            c1162a1.f16347c = c1162a1.j;
            C1191k0 c1191k03 = c1200n04.f16542g;
            C1200n0.l(c1191k03);
            c1191k03.t(new Z0(c1162a1, 0));
            return;
        }
        c1162a1.t(w10.f11398b, c1162a1.p(w10), false);
        C1219x c1219x = ((C1200n0) c1162a1.f4728a).f16548p;
        C1200n0.i(c1219x);
        C1200n0 c1200n05 = (C1200n0) c1219x.f4728a;
        c1200n05.f16545l.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C1191k0 c1191k04 = c1200n05.f16542g;
        C1200n0.l(c1191k04);
        c1191k04.t(new i(c1219x, elapsedRealtime2));
    }

    public void m(W w10, Bundle bundle) {
        X0 x02;
        C1162a1 c1162a1 = ((C1200n0) ((P0) this.f1135b).f4728a).f16546m;
        C1200n0.k(c1162a1);
        if (!((C1200n0) c1162a1.f4728a).f16539d.y() || bundle == null || (x02 = (X0) c1162a1.f16350f.get(Integer.valueOf(w10.f11397a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(StubApp.getString2(290), x02.f16319c);
        bundle2.putString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), x02.f16317a);
        bundle2.putString(StubApp.getString2(1176), x02.f16318b);
        bundle.putBundle(StubApp.getString2(1177), bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                c cVar = (c) this.f1135b;
                if (cVar.f1137a.add(activity)) {
                    int i3 = cVar.f1141e;
                    if (i3 <= 0) {
                        l.f(StubApp.getString2(1195), StubApp.getString2(1196));
                        if (cVar.f1139c.size() == 0 && cVar.f1137a.size() == 1) {
                            c.b(cVar, EnumC0439n.f9916d);
                            break;
                        }
                    } else {
                        cVar.f1141e = i3 - 1;
                        break;
                    }
                }
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    String string2 = StubApp.getString2(493);
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString(StubApp.getString2("1178"));
                            if (string == null) {
                                string = extras.getString(StubApp.getString2("1179"));
                            }
                            if (!TextUtils.isEmpty(string)) {
                                ArrayDeque arrayDeque = (ArrayDeque) this.f1135b;
                                if (arrayDeque.contains(string)) {
                                    break;
                                } else {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle(StubApp.getString2("1180"));
                        }
                    } catch (RuntimeException e10) {
                        Log.w(string2, StubApp.getString2(1181), e10);
                    }
                    String string22 = StubApp.getString2(878);
                    if (bundle2 == null ? false : string22.equals(bundle2.getString(StubApp.getString2(1182)))) {
                        if (bundle2 != null) {
                            if (string22.equals(bundle2.getString(StubApp.getString2(1183)))) {
                                T4.a aVar = (T4.a) h.e().c(T4.a.class);
                                if (Log.isLoggable(string2, 3)) {
                                    Log.d(string2, StubApp.getString2(1184));
                                }
                                if (aVar != null) {
                                    String string3 = bundle2.getString(StubApp.getString2(1185));
                                    T4.b bVar = (T4.b) aVar;
                                    Z z2 = U4.a.f7456c;
                                    String string23 = StubApp.getString2(1186);
                                    if (!z2.contains(string23)) {
                                        C0657o0 c0657o0 = (C0657o0) bVar.f7174a.f13748b;
                                        c0657o0.getClass();
                                        c0657o0.a(new X(c0657o0, string23, StubApp.getString2(1187), (Object) string3, true));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(StubApp.getString2(376), StubApp.getString2(1188));
                                    bundle3.putString(StubApp.getString2(1189), StubApp.getString2(490));
                                    bundle3.putString(StubApp.getString2(1190), string3);
                                    bVar.a(string23, StubApp.getString2(1191), bundle3);
                                } else {
                                    Log.w(string2, StubApp.getString2(1192));
                                }
                            } else if (Log.isLoggable(string2, 3)) {
                                Log.d(string2, StubApp.getString2(1193));
                            }
                        }
                        hc.b.Q(StubApp.getString2(1194), bundle2);
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                i(W.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                c cVar = (c) this.f1135b;
                if (cVar.f1137a.remove(activity)) {
                    if (!activity.isChangingConfigurations()) {
                        l.f(StubApp.getString2(1197), StubApp.getString2(1196));
                        if (cVar.f1139c.size() == 0 && cVar.f1137a.size() == 0 && cVar.f1141e == 0) {
                            c.b(cVar, EnumC0439n.f9915c);
                            break;
                        }
                    } else {
                        cVar.f1141e++;
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                j(W.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                l.f(StubApp.getString2(1199), StubApp.getString2(1196));
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                ((C0498N) this.f1135b).f10586p0 = true;
                R2.c.b(StubApp.getString2(103), StubApp.getString2(1198));
                break;
            default:
                k(W.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                l.f(StubApp.getString2(1201), StubApp.getString2(1196));
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                ((C0498N) this.f1135b).f10586p0 = false;
                R2.c.b(StubApp.getString2(103), StubApp.getString2(1200));
                break;
            default:
                l(W.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                l.f(StubApp.getString2(1202), StubApp.getString2(1196));
                break;
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                break;
            default:
                m(W.d(activity), outState);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                c cVar = (c) this.f1135b;
                if (cVar.f1138b.add(activity)) {
                    int i3 = cVar.f1142f;
                    if (i3 <= 0) {
                        l.f(StubApp.getString2(1203), StubApp.getString2(1196));
                        if (cVar.f1140d.size() == 0 && cVar.f1138b.size() == 1) {
                            c.b(cVar, EnumC0439n.f9917e);
                            break;
                        }
                    } else {
                        cVar.f1142f = i3 - 1;
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f1134a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                c cVar = (c) this.f1135b;
                if (cVar.f1138b.remove(activity)) {
                    if (!activity.isChangingConfigurations()) {
                        l.f(StubApp.getString2(1204), StubApp.getString2(1196));
                        if (cVar.f1140d.size() == 0 && cVar.f1138b.size() == 0 && cVar.f1142f == 0) {
                            c.b(cVar, EnumC0439n.f9916d);
                            break;
                        }
                    } else {
                        cVar.f1142f++;
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    public a() {
        this.f1134a = 1;
        this.f1135b = new ArrayDeque(10);
    }
}
