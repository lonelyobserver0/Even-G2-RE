package l4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import cb.C0585c;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.gms.internal.measurement.S1;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l4.n0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1200n0 implements InterfaceC1216v0 {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C1200n0 f16528H;

    /* renamed from: A, reason: collision with root package name */
    public long f16529A;

    /* renamed from: B, reason: collision with root package name */
    public volatile Boolean f16530B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f16531C;

    /* renamed from: D, reason: collision with root package name */
    public int f16532D;

    /* renamed from: E, reason: collision with root package name */
    public int f16533E;

    /* renamed from: G, reason: collision with root package name */
    public final long f16535G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16537b;

    /* renamed from: c, reason: collision with root package name */
    public final C0585c f16538c;

    /* renamed from: d, reason: collision with root package name */
    public final C1178g f16539d;

    /* renamed from: e, reason: collision with root package name */
    public final C1164b0 f16540e;

    /* renamed from: f, reason: collision with root package name */
    public final T f16541f;

    /* renamed from: g, reason: collision with root package name */
    public final C1191k0 f16542g;

    /* renamed from: h, reason: collision with root package name */
    public final q1 f16543h;
    public final K1 j;

    /* renamed from: k, reason: collision with root package name */
    public final C1159O f16544k;

    /* renamed from: l, reason: collision with root package name */
    public final W3.a f16545l;

    /* renamed from: m, reason: collision with root package name */
    public final C1162a1 f16546m;

    /* renamed from: n, reason: collision with root package name */
    public final P0 f16547n;

    /* renamed from: p, reason: collision with root package name */
    public final C1219x f16548p;

    /* renamed from: q, reason: collision with root package name */
    public final T0 f16549q;

    /* renamed from: r, reason: collision with root package name */
    public final String f16550r;

    /* renamed from: s, reason: collision with root package name */
    public C1158N f16551s;

    /* renamed from: t, reason: collision with root package name */
    public C1189j1 f16552t;

    /* renamed from: v, reason: collision with root package name */
    public C1206q f16553v;

    /* renamed from: w, reason: collision with root package name */
    public C1156L f16554w;

    /* renamed from: x, reason: collision with root package name */
    public U0 f16555x;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f16557z;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16556y = false;

    /* renamed from: F, reason: collision with root package name */
    public final AtomicInteger f16534F = new AtomicInteger(0);

    public C1200n0(bb.d dVar) {
        Context context;
        Context context2 = (Context) dVar.f10744c;
        C0585c c0585c = new C0585c(8);
        this.f16538c = c0585c;
        A0.f15908k = c0585c;
        this.f16536a = context2;
        this.f16537b = dVar.f10743b;
        this.f16530B = (Boolean) dVar.f10745d;
        this.f16550r = (String) dVar.f10748g;
        this.f16531C = true;
        if (P1.f11333h == null && context2 != null) {
            Object obj = P1.f11332g;
            synchronized (obj) {
                try {
                    if (P1.f11333h == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.G1 g12 = P1.f11333h;
                            final Context origApplicationContext = StubApp.getOrigApplicationContext(context2.getApplicationContext());
                            if (origApplicationContext == null) {
                                origApplicationContext = context2;
                            }
                            if (g12 == null || g12.f11272a != origApplicationContext) {
                                if (g12 != null) {
                                    com.google.android.gms.internal.measurement.H1.c();
                                    S1.a();
                                    synchronized (com.google.android.gms.internal.measurement.K1.class) {
                                        try {
                                            com.google.android.gms.internal.measurement.K1 k12 = com.google.android.gms.internal.measurement.K1.f11297d;
                                            if (k12 != null && (context = (Context) k12.f11299b) != null && ((com.google.android.gms.internal.measurement.J1) k12.f11300c) != null && k12.f11298a) {
                                                context.getContentResolver().unregisterContentObserver((com.google.android.gms.internal.measurement.J1) com.google.android.gms.internal.measurement.K1.f11297d.f11300c);
                                            }
                                            com.google.android.gms.internal.measurement.K1.f11297d = null;
                                        } finally {
                                        }
                                    }
                                }
                                P1.f11333h = new com.google.android.gms.internal.measurement.G1(origApplicationContext, Ec.d.B(new L4.k() { // from class: com.google.android.gms.internal.measurement.R1
                                    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)|23|24|25|26|27|28|29|(1:31)(1:82)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:59|60|61)(7:43|44|(3:46|(1:57)|49)(1:58)|50|(1:52)(1:56)|53|54)|55)(1:62))|63|64|65)(1:81)|66|14) */
                                    /* JADX WARN: Code restructure failed: missing block: B:84:0x008b, code lost:
                                    
                                        r0 = move-exception;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:85:0x008c, code lost:
                                    
                                        android.util.Log.e(com.stub.StubApp.getString2("11793"), com.stub.StubApp.getString2("11794"), r0);
                                        r6 = L4.a.f4178a;
                                     */
                                    /* JADX WARN: Finally extract failed */
                                    @Override // L4.k
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object get() {
                                        /*
                                            Method dump skipped, instructions count: 453
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R1.get():java.lang.Object");
                                    }
                                }));
                                P1.f11334i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.f16545l = W3.a.f8099a;
        Long l9 = (Long) dVar.f10747f;
        this.f16535G = l9 != null ? l9.longValue() : System.currentTimeMillis();
        C1178g c1178g = new C1178g(this);
        c1178g.f16431d = c5.C.f10839e;
        this.f16539d = c1178g;
        C1164b0 c1164b0 = new C1164b0(this);
        c1164b0.n();
        this.f16540e = c1164b0;
        T t3 = new T(this);
        t3.n();
        this.f16541f = t3;
        K1 k13 = new K1(this);
        k13.n();
        this.j = k13;
        this.f16544k = new C1159O(new C1170d0(dVar, this));
        this.f16548p = new C1219x(this);
        C1162a1 c1162a1 = new C1162a1(this);
        c1162a1.m();
        this.f16546m = c1162a1;
        P0 p02 = new P0(this);
        p02.m();
        this.f16547n = p02;
        q1 q1Var = new q1(this);
        q1Var.m();
        this.f16543h = q1Var;
        T0 t02 = new T0(this);
        t02.n();
        this.f16549q = t02;
        C1191k0 c1191k0 = new C1191k0(this);
        c1191k0.n();
        this.f16542g = c1191k0;
        com.google.android.gms.internal.measurement.U u2 = (com.google.android.gms.internal.measurement.U) dVar.f10746e;
        boolean z2 = u2 == null || u2.f11375b == 0;
        if (StubApp.getOrigApplicationContext(context2.getApplicationContext()) instanceof Application) {
            k(p02);
            if (StubApp.getOrigApplicationContext(((C1200n0) p02.f4728a).f16536a.getApplicationContext()) instanceof Application) {
                Application application = (Application) StubApp.getOrigApplicationContext(((C1200n0) p02.f4728a).f16536a.getApplicationContext());
                if (p02.f16206c == null) {
                    p02.f16206c = new C8.a(p02, 3);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(p02.f16206c);
                    application.registerActivityLifecycleCallbacks(p02.f16206c);
                    T t10 = ((C1200n0) p02.f4728a).f16541f;
                    l(t10);
                    t10.f16249p.b(StubApp.getString2(20608));
                }
            }
        } else {
            l(t3);
            t3.j.b(StubApp.getString2(20609));
        }
        c1191k0.t(new Q4.b(dVar, this));
    }

    public static final void i(AbstractC1146B abstractC1146B) {
        if (abstractC1146B == null) {
            throw new IllegalStateException(StubApp.getString2(20610));
        }
    }

    public static final void j(Mb.b bVar) {
        if (bVar == null) {
            throw new IllegalStateException(StubApp.getString2(20610));
        }
    }

    public static final void k(AbstractC1150F abstractC1150F) {
        if (abstractC1150F == null) {
            throw new IllegalStateException(StubApp.getString2(20610));
        }
        if (abstractC1150F.f16042b) {
            return;
        }
        throw new IllegalStateException(StubApp.getString2(19674).concat(String.valueOf(abstractC1150F.getClass())));
    }

    public static final void l(AbstractC1214u0 abstractC1214u0) {
        if (abstractC1214u0 == null) {
            throw new IllegalStateException(StubApp.getString2(20610));
        }
        if (abstractC1214u0.f16634b) {
            return;
        }
        throw new IllegalStateException(StubApp.getString2(19674).concat(String.valueOf(abstractC1214u0.getClass())));
    }

    public static C1200n0 r(Context context, com.google.android.gms.internal.measurement.U u2, Long l9) {
        Bundle bundle;
        if (u2 != null) {
            Bundle bundle2 = u2.f11377d;
            u2 = new com.google.android.gms.internal.measurement.U(u2.f11374a, u2.f11375b, u2.f11376c, bundle2, null);
        }
        S3.D.h(context);
        S3.D.h(StubApp.getOrigApplicationContext(context.getApplicationContext()));
        if (f16528H == null) {
            synchronized (C1200n0.class) {
                try {
                    if (f16528H == null) {
                        f16528H = new C1200n0(new bb.d(context, u2, l9));
                    }
                } finally {
                }
            }
        } else if (u2 != null && (bundle = u2.f11377d) != null && bundle.containsKey(StubApp.getString2(9342))) {
            S3.D.h(f16528H);
            f16528H.f16530B = Boolean.valueOf(bundle.getBoolean(StubApp.getString2(9342)));
        }
        S3.D.h(f16528H);
        return f16528H;
    }

    @Override // l4.InterfaceC1216v0
    public final T a() {
        T t3 = this.f16541f;
        l(t3);
        return t3;
    }

    @Override // l4.InterfaceC1216v0
    public final C1191k0 b() {
        C1191k0 c1191k0 = this.f16542g;
        l(c1191k0);
        return c1191k0;
    }

    @Override // l4.InterfaceC1216v0
    public final C0585c c() {
        return this.f16538c;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // l4.InterfaceC1216v0
    public final Context e() {
        return this.f16536a;
    }

    @Override // l4.InterfaceC1216v0
    public final W3.a f() {
        return this.f16545l;
    }

    public final int g() {
        C1191k0 c1191k0 = this.f16542g;
        l(c1191k0);
        c1191k0.k();
        C1178g c1178g = this.f16539d;
        if (c1178g.x()) {
            return 1;
        }
        l(c1191k0);
        c1191k0.k();
        if (!this.f16531C) {
            return 8;
        }
        C1164b0 c1164b0 = this.f16540e;
        j(c1164b0);
        c1164b0.k();
        SharedPreferences o5 = c1164b0.o();
        String string2 = StubApp.getString2(5223);
        Boolean valueOf = o5.contains(string2) ? Boolean.valueOf(c1164b0.o().getBoolean(string2, true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        C0585c c0585c = ((C1200n0) c1178g.f4728a).f16538c;
        Boolean w10 = c1178g.w(StubApp.getString2(20611));
        return w10 != null ? w10.booleanValue() ? 0 : 4 : (this.f16530B == null || this.f16530B.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f16529A) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.f16556y
            if (r0 == 0) goto La0
            l4.k0 r0 = r6.f16542g
            l(r0)
            r0.k()
            java.lang.Boolean r0 = r6.f16557z
            W3.a r1 = r6.f16545l
            if (r0 == 0) goto L34
            long r2 = r6.f16529A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L99
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f16529A
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L99
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f16529A = r0
            l4.K1 r0 = r6.j
            j(r0)
            r1 = 5215(0x145f, float:7.308E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r1 = r0.H(r1)
            r2 = 0
            if (r1 == 0) goto L7f
            r1 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r1 = r0.H(r1)
            if (r1 == 0) goto L7f
            android.content.Context r1 = r6.f16536a
            Y3.b r3 = Y3.c.a(r1)
            boolean r3 = r3.c()
            r4 = 1
            if (r3 != 0) goto L7e
            l4.g r3 = r6.f16539d
            boolean r3 = r3.n()
            if (r3 != 0) goto L7e
            boolean r3 = l4.K1.a0(r1)
            if (r3 == 0) goto L7f
            boolean r1 = l4.K1.D(r1)
            if (r1 == 0) goto L7f
        L7e:
            r2 = r4
        L7f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f16557z = r1
            if (r2 == 0) goto L99
            l4.L r1 = r6.q()
            java.lang.String r1 = r1.r()
            boolean r0 = r0.o(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f16557z = r0
        L99:
            java.lang.Boolean r0 = r6.f16557z
            boolean r0 = r0.booleanValue()
            return r0
        La0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = 20612(0x5084, float:2.8884E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1200n0.h():boolean");
    }

    public final C1159O m() {
        return this.f16544k;
    }

    public final C1158N n() {
        k(this.f16551s);
        return this.f16551s;
    }

    public final C1189j1 o() {
        k(this.f16552t);
        return this.f16552t;
    }

    public final C1206q p() {
        l(this.f16553v);
        return this.f16553v;
    }

    public final C1156L q() {
        k(this.f16554w);
        return this.f16554w;
    }
}
