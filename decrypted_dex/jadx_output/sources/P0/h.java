package P0;

import L0.B;
import M4.I;
import M4.Z;
import M4.e0;
import R8.C0250h;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.C1552m;
import r0.C1555p;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements d, InterfaceC1726z {

    /* renamed from: n, reason: collision with root package name */
    public static final Z f5397n = I.p(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o, reason: collision with root package name */
    public static final Z f5398o = I.p(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p, reason: collision with root package name */
    public static final Z f5399p = I.p(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q, reason: collision with root package name */
    public static final Z f5400q = I.p(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r, reason: collision with root package name */
    public static final Z f5401r = I.p(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s, reason: collision with root package name */
    public static final Z f5402s = I.p(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t, reason: collision with root package name */
    public static h f5403t;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f5404a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.c f5405b = new A0.c(13);

    /* renamed from: c, reason: collision with root package name */
    public final C1555p f5406c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5407d;

    /* renamed from: e, reason: collision with root package name */
    public final t f5408e;

    /* renamed from: f, reason: collision with root package name */
    public int f5409f;

    /* renamed from: g, reason: collision with root package name */
    public long f5410g;

    /* renamed from: h, reason: collision with root package name */
    public long f5411h;

    /* renamed from: i, reason: collision with root package name */
    public long f5412i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f5413k;

    /* renamed from: l, reason: collision with root package name */
    public long f5414l;

    /* renamed from: m, reason: collision with root package name */
    public int f5415m;

    public h(Context context, HashMap hashMap, int i3, C1555p c1555p, boolean z2) {
        this.f5404a = e0.a(hashMap);
        this.f5408e = new t(i3);
        this.f5406c = c1555p;
        this.f5407d = z2;
        if (context == null) {
            this.f5415m = 0;
            this.f5413k = a(0);
            return;
        }
        C1552m e10 = C1552m.e(context);
        int f10 = e10.f();
        this.f5415m = f10;
        this.f5413k = a(f10);
        f fVar = new f(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e10.f20171c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fVar));
        ((Handler) e10.f20170b).post(new com.even.translate.a(17, e10, fVar));
    }

    public final long a(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        e0 e0Var = this.f5404a;
        Long l9 = (Long) e0Var.get(valueOf);
        if (l9 == null) {
            l9 = (Long) e0Var.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    public final void b(long j, int i3, long j3) {
        final long j10;
        final int i10;
        final long j11;
        if (i3 == 0 && j == 0 && j3 == this.f5414l) {
            return;
        }
        this.f5414l = j3;
        Iterator it = ((CopyOnWriteArrayList) this.f5405b.f29a).iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (cVar.f5384c) {
                j10 = j;
                i10 = i3;
                j11 = j3;
            } else {
                j10 = j;
                i10 = i3;
                j11 = j3;
                cVar.f5382a.post(new Runnable() { // from class: P0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        w0.c cVar2 = c.this.f5383b;
                        C0250h c0250h = cVar2.f21992d;
                        w0.a F3 = cVar2.F(((I) c0250h.f6297b).isEmpty() ? null : (B) M4.r.j((I) c0250h.f6297b));
                        cVar2.J(F3, 1006, new q1.m(F3, i10, j10, j11));
                    }
                });
            }
            i3 = i10;
            j = j10;
            j3 = j11;
        }
    }
}
