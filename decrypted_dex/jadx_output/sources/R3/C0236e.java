package R3;

import S3.C0280n;
import S3.C0281o;
import S3.C0282p;
import S3.O;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p0.AbstractC1482f;
import t.C1693f;

/* renamed from: R3.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0236e implements Handler.Callback {

    /* renamed from: r, reason: collision with root package name */
    public static final Status f6119r = new Status(4, StubApp.getString2(5624), null, null);

    /* renamed from: s, reason: collision with root package name */
    public static final Status f6120s = new Status(4, StubApp.getString2(5625), null, null);

    /* renamed from: t, reason: collision with root package name */
    public static final Object f6121t = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static C0236e f6122v;

    /* renamed from: c, reason: collision with root package name */
    public C0282p f6125c;

    /* renamed from: d, reason: collision with root package name */
    public U3.c f6126d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6127e;

    /* renamed from: f, reason: collision with root package name */
    public final GoogleApiAvailability f6128f;

    /* renamed from: g, reason: collision with root package name */
    public final Z9.C f6129g;

    /* renamed from: p, reason: collision with root package name */
    public final c4.h f6135p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f6136q;

    /* renamed from: a, reason: collision with root package name */
    public long f6123a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6124b = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f6130h = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f6131k = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: l, reason: collision with root package name */
    public p f6132l = null;

    /* renamed from: m, reason: collision with root package name */
    public final C1693f f6133m = new C1693f(0);

    /* renamed from: n, reason: collision with root package name */
    public final C1693f f6134n = new C1693f(0);

    public C0236e(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f6136q = true;
        this.f6127e = context;
        c4.h hVar = new c4.h(looper, this);
        Looper.getMainLooper();
        this.f6135p = hVar;
        this.f6128f = googleApiAvailability;
        this.f6129g = new Z9.C(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (W3.b.f8105f == null) {
            W3.b.f8105f = Boolean.valueOf(packageManager.hasSystemFeature(StubApp.getString2(5626)));
        }
        if (W3.b.f8105f.booleanValue()) {
            this.f6136q = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static Status c(C0233b c0233b, com.google.android.gms.common.b bVar) {
        return new Status(17, AbstractC1482f.i(StubApp.getString2(5627), c0233b.f6111b.f5716b, StubApp.getString2(5628), String.valueOf(bVar)), bVar.f11177c, bVar);
    }

    public static C0236e f(Context context) {
        C0236e c0236e;
        HandlerThread handlerThread;
        synchronized (f6121t) {
            if (f6122v == null) {
                synchronized (O.f6479g) {
                    try {
                        handlerThread = O.f6481i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread(StubApp.getString2("5629"), 9);
                            O.f6481i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = O.f6481i;
                        }
                    } finally {
                    }
                }
                f6122v = new C0236e(StubApp.getOrigApplicationContext(context.getApplicationContext()), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            c0236e = f6122v;
        }
        return c0236e;
    }

    public final void a(p pVar) {
        synchronized (f6121t) {
            try {
                if (this.f6132l != pVar) {
                    this.f6132l = pVar;
                    this.f6133m.clear();
                }
                this.f6133m.addAll(pVar.f6145f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.f6124b) {
            return false;
        }
        C0281o c0281o = (C0281o) C0280n.b().f6548a;
        if (c0281o != null && !c0281o.f6550b) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f6129g.f9077b).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final r d(Q3.h hVar) {
        ConcurrentHashMap concurrentHashMap = this.f6131k;
        C0233b c0233b = hVar.f5725e;
        r rVar = (r) concurrentHashMap.get(c0233b);
        if (rVar == null) {
            rVar = new r(this, hVar);
            concurrentHashMap.put(c0233b, rVar);
        }
        if (rVar.f6149f.m()) {
            this.f6134n.add(c0233b);
        }
        rVar.m();
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(q4.k r9, int r10, Q3.h r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L77
            R3.b r3 = r11.f5725e
            boolean r11 = r8.b()
            if (r11 != 0) goto Lb
            goto L47
        Lb:
            S3.n r11 = S3.C0280n.b()
            java.lang.Object r11 = r11.f6548a
            S3.o r11 = (S3.C0281o) r11
            r0 = 1
            if (r11 == 0) goto L4a
            boolean r1 = r11.f6550b
            if (r1 == 0) goto L47
            java.util.concurrent.ConcurrentHashMap r1 = r8.f6131k
            java.lang.Object r1 = r1.get(r3)
            R3.r r1 = (R3.r) r1
            if (r1 == 0) goto L44
            Q3.c r2 = r1.f6149f
            boolean r4 = r2 instanceof S3.AbstractC0271e
            if (r4 == 0) goto L47
            S3.e r2 = (S3.AbstractC0271e) r2
            S3.K r4 = r2.f6511y
            if (r4 == 0) goto L44
            boolean r4 = r2.f()
            if (r4 != 0) goto L44
            S3.g r11 = I0.j.a(r1, r2, r10)
            if (r11 == 0) goto L47
            int r2 = r1.f6158p
            int r2 = r2 + r0
            r1.f6158p = r2
            boolean r0 = r11.f6517c
            goto L4a
        L44:
            boolean r0 = r11.f6551c
            goto L4a
        L47:
            r10 = 0
            r1 = r8
            goto L64
        L4a:
            I0.j r11 = new I0.j
            r1 = 0
            if (r0 == 0) goto L55
            long r4 = java.lang.System.currentTimeMillis()
            goto L56
        L55:
            r4 = r1
        L56:
            if (r0 == 0) goto L5c
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5c:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L64:
            if (r10 == 0) goto L78
            q4.s r9 = r9.f20051a
            c4.h r11 = r1.f6135p
            r11.getClass()
            B3.q r0 = new B3.q
            r2 = 1
            r0.<init>(r11, r2)
            r9.addOnCompleteListener(r0, r10)
            return
        L77:
            r1 = r8
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.C0236e.e(q4.k, int, Q3.h):void");
    }

    public final void g(com.google.android.gms.common.b bVar, int i3) {
        if (this.f6128f.zah(this.f6127e, bVar, i3)) {
            return;
        }
        c4.h hVar = this.f6135p;
        hVar.sendMessage(hVar.obtainMessage(5, i3, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0331  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.C0236e.handleMessage(android.os.Message):boolean");
    }
}
