package l4;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import cb.C0585c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.P3;
import com.stub.StubApp;
import f4.C0879c;
import j1.C1081j;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class P0 extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public C8.a f16206c;

    /* renamed from: d, reason: collision with root package name */
    public V6.b f16207d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f16208e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16209f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f16210g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f16211h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f16212k;

    /* renamed from: l, reason: collision with root package name */
    public D0 f16213l;

    /* renamed from: m, reason: collision with root package name */
    public D0 f16214m;

    /* renamed from: n, reason: collision with root package name */
    public PriorityQueue f16215n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16216p;

    /* renamed from: q, reason: collision with root package name */
    public C1224z0 f16217q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicLong f16218r;

    /* renamed from: s, reason: collision with root package name */
    public long f16219s;

    /* renamed from: t, reason: collision with root package name */
    public final C1197m0 f16220t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16221v;

    /* renamed from: w, reason: collision with root package name */
    public D0 f16222w;

    /* renamed from: x, reason: collision with root package name */
    public N0 f16223x;

    /* renamed from: y, reason: collision with root package name */
    public D0 f16224y;

    /* renamed from: z, reason: collision with root package name */
    public final C0879c f16225z;

    public P0(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16208e = new CopyOnWriteArraySet();
        this.f16211h = new Object();
        this.j = false;
        this.f16212k = 1;
        this.f16221v = true;
        this.f16225z = new C0879c(this);
        this.f16210g = new AtomicReference();
        this.f16217q = C1224z0.f16709c;
        this.f16219s = -1L;
        this.f16218r = new AtomicLong(0L);
        this.f16220t = new C1197m0(c1200n0);
    }

    public final void A(Boolean bool, boolean z2) {
        k();
        l();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16248n.c(bool, StubApp.getString2(20057));
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        c1164b0.k();
        SharedPreferences.Editor edit = c1164b0.o().edit();
        String string2 = StubApp.getString2(5223);
        if (bool != null) {
            edit.putBoolean(string2, bool.booleanValue());
        } else {
            edit.remove(string2);
        }
        edit.apply();
        if (z2) {
            c1164b0.k();
            SharedPreferences.Editor edit2 = c1164b0.o().edit();
            String string22 = StubApp.getString2(20058);
            if (bool != null) {
                edit2.putBoolean(string22, bool.booleanValue());
            } else {
                edit2.remove(string22);
            }
            edit2.apply();
        }
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        if (c1200n0.f16531C || !(bool == null || bool.booleanValue())) {
            B();
        }
    }

    public final void B() {
        k();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        String k3 = c1164b0.f16377n.k();
        if (k3 != null) {
            boolean equals = StubApp.getString2(20059).equals(k3);
            W3.a aVar = c1200n0.f16545l;
            if (equals) {
                aVar.getClass();
                v(System.currentTimeMillis(), null, StubApp.getString2(4849), StubApp.getString2(19571));
            } else {
                Long valueOf = Long.valueOf(true != StubApp.getString2(6547).equals(k3) ? 0L : 1L);
                aVar.getClass();
                v(System.currentTimeMillis(), valueOf, StubApp.getString2(4849), StubApp.getString2(19571));
            }
        }
        boolean d8 = c1200n0.d();
        T t3 = c1200n0.f16541f;
        if (!d8 || !this.f16221v) {
            C1200n0.l(t3);
            t3.f16248n.b(StubApp.getString2(20061));
            C1189j1 o5 = c1200n0.o();
            o5.k();
            o5.l();
            o5.y(new RunnableC1174e1(o5, o5.A(true), 3));
            return;
        }
        C1200n0.l(t3);
        t3.f16248n.b(StubApp.getString2(20060));
        w();
        q1 q1Var = c1200n0.f16543h;
        C1200n0.k(q1Var);
        q1Var.f16594e.n();
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new C0(this));
    }

    public final void C() {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (!(StubApp.getOrigApplicationContext(c1200n0.f16536a.getApplicationContext()) instanceof Application) || this.f16206c == null) {
            return;
        }
        ((Application) StubApp.getOrigApplicationContext(c1200n0.f16536a.getApplicationContext())).unregisterActivityLifecycleCallbacks(this.f16206c);
    }

    public final void D(Bundle bundle, int i3, long j) {
        Boolean bool;
        String str;
        EnumC1218w0 enumC1218w0;
        l();
        C1224z0 c1224z0 = C1224z0.f16709c;
        EnumC1222y0[] enumC1222y0Arr = EnumC1220x0.f16655b.f16658a;
        int length = enumC1222y0Arr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                str = null;
                break;
            }
            String str2 = enumC1222y0Arr[i10].f16689a;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals(StubApp.getString2(12542)) ? Boolean.TRUE : str.equals(StubApp.getString2(12543)) ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str != null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16246l.c(str, StubApp.getString2(20062));
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16246l.b(StubApp.getString2(20063));
        }
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        boolean q10 = c1191k0.q();
        C1224z0 b2 = C1224z0.b(i3, bundle);
        Iterator it = b2.f16710a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC1218w0 = EnumC1218w0.f16645b;
            if (!hasNext) {
                break;
            } else if (((EnumC1218w0) it.next()) != enumC1218w0) {
                F(b2, q10);
                break;
            }
        }
        C1204p c10 = C1204p.c(i3, bundle);
        Iterator it2 = c10.f16576e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC1218w0) it2.next()) != enumC1218w0) {
                E(c10, q10);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = C1224z0.d(bundle.getString(StubApp.getString2(12547))).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String string2 = i3 == -30 ? StubApp.getString2(19852) : StubApp.getString2(4849);
            if (q10) {
                v(j, bool.toString(), string2, StubApp.getString2(20064));
            } else {
                u(string2, StubApp.getString2(20064), bool.toString(), false, j);
            }
        }
    }

    public final void E(C1204p c1204p, boolean z2) {
        Q4.b bVar = new Q4.b(this, c1204p);
        if (z2) {
            k();
            bVar.run();
        } else {
            C1191k0 c1191k0 = ((C1200n0) this.f4728a).f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(bVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0120
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void F(l4.C1224z0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.P0.F(l4.z0, boolean):void");
    }

    public final void G() {
        P3.a();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (c1200n0.f16539d.u(null, AbstractC1148D.f15955Q0)) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            boolean q10 = c1191k0.q();
            T t3 = c1200n0.f16541f;
            if (q10) {
                C1200n0.l(t3);
                t3.f16242f.b(StubApp.getString2(20071));
                return;
            }
            if (C0585c.g()) {
                C1200n0.l(t3);
                t3.f16242f.b(StubApp.getString2(20070));
                return;
            }
            l();
            C1200n0.l(t3);
            t3.f16249p.b(StubApp.getString2(20067));
            AtomicReference atomicReference = new AtomicReference();
            C1200n0.l(c1191k0);
            c1191k0.u(atomicReference, 10000L, StubApp.getString2(20068), new J0(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list != null) {
                C1200n0.l(c1191k0);
                c1191k0.t(new Q4.b(29, this, list));
            } else {
                C1200n0.l(t3);
                t3.f16244h.b(StubApp.getString2(20069));
            }
        }
    }

    public final PriorityQueue H() {
        if (this.f16215n == null) {
            this.f16215n = new PriorityQueue(Comparator.comparing(M0.f16156a, A.i.f25b));
        }
        return this.f16215n;
    }

    public final void I() {
        u1 u1Var;
        k();
        this.f16216p = false;
        if (H().isEmpty() || this.j || (u1Var = (u1) H().poll()) == null) {
            return;
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        K1 k12 = c1200n0.j;
        C1200n0.j(k12);
        F1.h E10 = k12.E();
        if (E10 != null) {
            this.j = true;
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            Ac.b bVar = t3.f16249p;
            String string2 = StubApp.getString2(20072);
            String str = u1Var.f16635a;
            bVar.c(str, string2);
            Q4.c e10 = E10.e(Uri.parse(str));
            if (e10 != null) {
                e10.a(new Q4.b(0, e10, new E0(this, u1Var)), new B3.q(this));
            } else {
                this.j = false;
                H().add(u1Var);
            }
        }
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return false;
    }

    public final void o(C1224z0 c1224z0) {
        k();
        boolean z2 = (c1224z0.i(EnumC1222y0.f16685c) && c1224z0.i(EnumC1222y0.f16684b)) || ((C1200n0) this.f4728a).o().t();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        if (z2 != c1200n0.f16531C) {
            C1191k0 c1191k02 = c1200n0.f16542g;
            C1200n0.l(c1191k02);
            c1191k02.k();
            c1200n0.f16531C = z2;
            C1164b0 c1164b0 = ((C1200n0) this.f4728a).f16540e;
            C1200n0.j(c1164b0);
            c1164b0.k();
            SharedPreferences o5 = c1164b0.o();
            String string2 = StubApp.getString2(20058);
            Boolean valueOf = o5.contains(string2) ? Boolean.valueOf(c1164b0.o().getBoolean(string2, true)) : null;
            if (!z2 || valueOf == null || valueOf.booleanValue()) {
                A(Boolean.valueOf(z2), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.P0.p(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x065d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.P0.q():void");
    }

    public final void r(String str, String str2, Bundle bundle) {
        k();
        ((C1200n0) this.f4728a).f16545l.getClass();
        s(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void s(long j, Bundle bundle, String str, String str2) {
        k();
        boolean z2 = true;
        if (this.f16207d != null && !K1.I(str2)) {
            z2 = false;
        }
        t(str, str2, j, bundle, true, z2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r32, java.lang.String r33, long r34, android.os.Bundle r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.P0.t(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void u(String str, String str2, Object obj, boolean z2, long j) {
        int i3;
        int length;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (z2) {
            K1 k12 = c1200n0.j;
            C1200n0.j(k12);
            i3 = k12.p0(str2);
        } else {
            K1 k13 = c1200n0.j;
            C1200n0.j(k13);
            String string2 = StubApp.getString2(19995);
            if (k13.k0(string2, str2)) {
                if (k13.m0(string2, A0.f15907i, null, str2)) {
                    ((C1200n0) k13.f4728a).getClass();
                    if (k13.n0(24, string2, str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 15;
                }
            }
            i3 = 6;
        }
        C0879c c0879c = this.f16225z;
        if (i3 != 0) {
            C1200n0.j(c1200n0.j);
            String p8 = K1.p(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            C1200n0.j(c1200n0.j);
            K1.A(c0879c, null, i3, StubApp.getString2(19489), p8, length);
            return;
        }
        String string22 = str == null ? StubApp.getString2(4849) : str;
        if (obj == null) {
            String str3 = string22;
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new RunnableC1205p0(this, str3, str2, (Object) null, j));
            return;
        }
        K1 k14 = c1200n0.j;
        C1200n0.j(k14);
        int x7 = k14.x(obj, str2);
        K1 k15 = c1200n0.j;
        if (x7 != 0) {
            C1200n0.j(k15);
            String p9 = K1.p(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C1200n0.j(k15);
            K1.A(c0879c, null, x7, StubApp.getString2(19489), p9, length);
            return;
        }
        C1200n0.j(k15);
        Object y10 = k15.y(obj, str2);
        if (y10 != null) {
            C1191k0 c1191k02 = c1200n0.f16542g;
            C1200n0.l(c1191k02);
            c1191k02.t(new RunnableC1205p0(this, string22, str2, y10, j));
        }
    }

    public final void v(long j, Object obj, String str, String str2) {
        String str3;
        boolean r8;
        Object obj2 = obj;
        S3.D.e(str);
        S3.D.e(str2);
        k();
        l();
        boolean equals = StubApp.getString2(20064).equals(str2);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (equals) {
            boolean z2 = obj2 instanceof String;
            String string2 = StubApp.getString2(19571);
            if (z2) {
                String str4 = (String) obj2;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String string22 = StubApp.getString2(9372);
                    long j3 = true != string22.equals(lowerCase) ? 0L : 1L;
                    obj2 = Long.valueOf(j3);
                    C1164b0 c1164b0 = c1200n0.f16540e;
                    C1200n0.j(c1164b0);
                    if (j3 == 1) {
                        string22 = StubApp.getString2(6547);
                    }
                    c1164b0.f16377n.l(string22);
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16249p.d(StubApp.getString2(20133), StubApp.getString2(19853), obj2);
                    str3 = string2;
                }
            }
            if (obj2 == null) {
                C1164b0 c1164b02 = c1200n0.f16540e;
                C1200n0.j(c1164b02);
                c1164b02.f16377n.l(StubApp.getString2(20059));
            } else {
                string2 = str2;
            }
            T t32 = c1200n0.f16541f;
            C1200n0.l(t32);
            t32.f16249p.d(StubApp.getString2(20133), StubApp.getString2(19853), obj2);
            str3 = string2;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!c1200n0.d()) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16249p.b(StubApp.getString2(20134));
            return;
        }
        if (c1200n0.h()) {
            H1 h12 = new H1(j, obj3, str3, str);
            C1189j1 o5 = c1200n0.o();
            o5.k();
            o5.l();
            o5.w();
            C1158N n10 = ((C1200n0) o5.f4728a).n();
            n10.getClass();
            Parcel obtain = Parcel.obtain();
            C1081j.b(h12, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                T t11 = ((C1200n0) n10.f4728a).f16541f;
                C1200n0.l(t11);
                t11.f16243g.b(StubApp.getString2(20135));
                r8 = false;
            } else {
                r8 = n10.r(1, marshall);
            }
            o5.y(new P3.i(o5, o5.A(true), r8, h12, 1));
        }
    }

    public final void w() {
        k();
        l();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (c1200n0.h()) {
            C1178g c1178g = c1200n0.f16539d;
            ((C1200n0) c1178g.f4728a).getClass();
            Boolean w10 = c1178g.w(StubApp.getString2(20136));
            if (w10 != null && w10.booleanValue()) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.f16248n.b(StubApp.getString2(20137));
                C1191k0 c1191k0 = c1200n0.f16542g;
                C1200n0.l(c1191k0);
                c1191k0.t(new C0(this, 2));
            }
            C1189j1 o5 = c1200n0.o();
            o5.k();
            o5.l();
            M1 A4 = o5.A(true);
            o5.w();
            C1200n0 c1200n02 = (C1200n0) o5.f4728a;
            c1200n02.f16539d.u(null, AbstractC1148D.f15980c1);
            c1200n02.n().r(3, new byte[0]);
            o5.y(new RunnableC1174e1(o5, A4, 1));
            this.f16221v = false;
            C1164b0 c1164b0 = c1200n0.f16540e;
            C1200n0.j(c1164b0);
            c1164b0.k();
            SharedPreferences o10 = c1164b0.o();
            String string2 = StubApp.getString2(19454);
            String string = o10.getString(string2, null);
            ((C1200n0) c1164b0.f4728a).p().m();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c1164b0.o().edit();
                edit.putString(string2, str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1200n0.p().m();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(StubApp.getString2(19504), string);
            r(StubApp.getString2(3305), StubApp.getString2(19408), bundle);
        }
    }

    public final void x(Bundle bundle, long j) {
        S3.D.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        String string2 = StubApp.getString2(3132);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString(string2));
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (!isEmpty) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.j.b(StubApp.getString2(20138));
        }
        bundle2.remove(string2);
        A0.e(bundle2, string2, String.class, null);
        String string22 = StubApp.getString2(3353);
        A0.e(bundle2, string22, String.class, null);
        String string23 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        A0.e(bundle2, string23, String.class, null);
        String string24 = StubApp.getString2(1061);
        A0.e(bundle2, string24, Object.class, null);
        String string25 = StubApp.getString2(12356);
        A0.e(bundle2, string25, String.class, null);
        String string26 = StubApp.getString2(12357);
        A0.e(bundle2, string26, Long.class, 0L);
        A0.e(bundle2, StubApp.getString2(12358), String.class, null);
        A0.e(bundle2, StubApp.getString2(12359), Bundle.class, null);
        A0.e(bundle2, StubApp.getString2(12360), String.class, null);
        A0.e(bundle2, StubApp.getString2(12361), Bundle.class, null);
        String string27 = StubApp.getString2(12362);
        A0.e(bundle2, string27, Long.class, 0L);
        A0.e(bundle2, StubApp.getString2(12363), String.class, null);
        A0.e(bundle2, StubApp.getString2(12364), Bundle.class, null);
        S3.D.e(bundle2.getString(string23));
        S3.D.e(bundle2.getString(string22));
        S3.D.h(bundle2.get(string24));
        bundle2.putLong(StubApp.getString2(3138), j);
        String string = bundle2.getString(string23);
        Object obj = bundle2.get(string24);
        K1 k12 = c1200n0.j;
        C1200n0.j(k12);
        int p02 = k12.p0(string);
        C1159O c1159o = c1200n0.f16544k;
        T t10 = c1200n0.f16541f;
        if (p02 != 0) {
            C1200n0.l(t10);
            t10.f16242f.c(c1159o.c(string), StubApp.getString2(20143));
            return;
        }
        K1 k13 = c1200n0.j;
        C1200n0.j(k13);
        if (k13.x(obj, string) != 0) {
            C1200n0.l(t10);
            String c10 = c1159o.c(string);
            t10.f16242f.d(StubApp.getString2(20142), c10, obj);
            return;
        }
        Object y10 = k13.y(obj, string);
        if (y10 == null) {
            C1200n0.l(t10);
            String c11 = c1159o.c(string);
            t10.f16242f.d(StubApp.getString2(20139), c11, obj);
            return;
        }
        A0.c(bundle2, y10);
        long j3 = bundle2.getLong(string26);
        if (!TextUtils.isEmpty(bundle2.getString(string25)) && (j3 > 15552000000L || j3 < 1)) {
            C1200n0.l(t10);
            String c12 = c1159o.c(string);
            Long valueOf = Long.valueOf(j3);
            t10.f16242f.d(StubApp.getString2(20140), c12, valueOf);
            return;
        }
        long j10 = bundle2.getLong(string27);
        if (j10 <= 15552000000L && j10 >= 1) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new K0(this, bundle2, 0));
        } else {
            C1200n0.l(t10);
            String c13 = c1159o.c(string);
            Long valueOf2 = Long.valueOf(j10);
            t10.f16242f.d(StubApp.getString2(20141), c13, valueOf2);
        }
    }

    public final void y(String str, String str2, Bundle bundle) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        S3.D.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), str);
        bundle2.putLong(StubApp.getString2(3138), currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(StubApp.getString2(12363), str2);
            bundle2.putBundle(StubApp.getString2(12364), bundle);
        }
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new K0(this, bundle2, 1));
    }

    public final void z(C1224z0 c1224z0, long j, boolean z2) {
        k();
        l();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        C1224z0 r8 = c1164b0.r();
        long j3 = this.f16219s;
        int i3 = c1224z0.f16711b;
        T t3 = c1200n0.f16541f;
        if (j <= j3 && C1224z0.l(r8.f16711b, i3)) {
            C1200n0.l(t3);
            t3.f16247m.c(c1224z0, StubApp.getString2(20144));
            return;
        }
        C1164b0 c1164b02 = c1200n0.f16540e;
        C1200n0.j(c1164b02);
        c1164b02.k();
        SharedPreferences o5 = c1164b02.o();
        String string2 = StubApp.getString2(5206);
        if (!C1224z0.l(i3, o5.getInt(string2, 100))) {
            C1200n0.l(t3);
            t3.f16247m.c(Integer.valueOf(i3), StubApp.getString2(5231));
            return;
        }
        SharedPreferences.Editor edit = c1164b02.o().edit();
        edit.putString(StubApp.getString2(19788), c1224z0.g());
        edit.putInt(string2, i3);
        edit.apply();
        C1200n0.l(t3);
        t3.f16249p.c(c1224z0, StubApp.getString2(20145));
        this.f16219s = j;
        if (c1200n0.o().u()) {
            C1189j1 o10 = c1200n0.o();
            o10.k();
            o10.l();
            o10.y(new RunnableC1183h1(o10, 2));
        } else {
            C1189j1 o11 = c1200n0.o();
            o11.k();
            o11.l();
            if (o11.t()) {
                o11.y(new RunnableC1174e1(o11, o11.A(false)));
            }
        }
        if (z2) {
            c1200n0.o().o(new AtomicReference());
        }
    }
}
