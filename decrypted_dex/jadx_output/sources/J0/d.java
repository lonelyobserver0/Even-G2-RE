package J0;

import A0.f;
import I4.e;
import L0.AbstractC0105a;
import L0.B;
import L0.C0123t;
import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.d0;
import M0.h;
import P0.j;
import P0.l;
import P0.o;
import P0.p;
import P0.q;
import P0.r;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.regex.Matcher;
import kotlin.jvm.internal.LongCompanionObject;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import o0.AbstractC1448w;
import o0.C1444s;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1725y;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends AbstractC0105a implements j {

    /* renamed from: A, reason: collision with root package name */
    public K0.c f3282A;

    /* renamed from: B, reason: collision with root package name */
    public Handler f3283B;

    /* renamed from: C, reason: collision with root package name */
    public C1447v f3284C;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3285h;
    public final Uri j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1707g f3286k;

    /* renamed from: l, reason: collision with root package name */
    public final K1 f3287l;

    /* renamed from: m, reason: collision with root package name */
    public final e f3288m;

    /* renamed from: n, reason: collision with root package name */
    public final A0.j f3289n;

    /* renamed from: p, reason: collision with root package name */
    public final e f3290p;

    /* renamed from: q, reason: collision with root package name */
    public final long f3291q;

    /* renamed from: r, reason: collision with root package name */
    public final f f3292r;

    /* renamed from: s, reason: collision with root package name */
    public final q f3293s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3294t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1708h f3295v;

    /* renamed from: w, reason: collision with root package name */
    public o f3296w;

    /* renamed from: x, reason: collision with root package name */
    public p f3297x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1726z f3298y;

    /* renamed from: z, reason: collision with root package name */
    public long f3299z;

    static {
        AbstractC1448w.a(StubApp.getString2(2902));
    }

    public d(C1447v c1447v, InterfaceC1707g interfaceC1707g, q qVar, K1 k12, e eVar, A0.j jVar, e eVar2, long j) {
        this.f3284C = c1447v;
        C1444s c1444s = c1447v.f18249b;
        c1444s.getClass();
        this.f3282A = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = c1444s.f18242a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = AbstractC1560u.j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, StubApp.getString2(2903));
                }
            }
        }
        this.j = uri2;
        this.f3286k = interfaceC1707g;
        this.f3293s = qVar;
        this.f3287l = k12;
        this.f3288m = eVar;
        this.f3289n = jVar;
        this.f3290p = eVar2;
        this.f3291q = j;
        this.f3292r = a(null);
        this.f3285h = false;
        this.f3294t = new ArrayList();
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        f a3 = a(b2);
        f fVar = new f(this.f4042d.f34c, 0, b2);
        K0.c cVar = this.f3282A;
        InterfaceC1726z interfaceC1726z = this.f3298y;
        p pVar = this.f3297x;
        c cVar2 = new c(cVar, this.f3287l, interfaceC1726z, this.f3288m, this.f3289n, fVar, this.f3290p, a3, pVar, eVar);
        this.f3294t.add(cVar2);
        return cVar2;
    }

    @Override // L0.AbstractC0105a
    public final synchronized C1447v h() {
        return this.f3284C;
    }

    @Override // L0.AbstractC0105a
    public final void j() {
        this.f3297x.a();
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f3298y = interfaceC1726z;
        Looper myLooper = Looper.myLooper();
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        A0.j jVar2 = this.f3289n;
        jVar2.c(myLooper, jVar);
        jVar2.prepare();
        if (this.f3285h) {
            this.f3297x = new u5.d(15);
            w();
            return;
        }
        this.f3295v = this.f3286k.g();
        o oVar = new o(StubApp.getString2(2904));
        this.f3296w = oVar;
        this.f3297x = oVar;
        this.f3283B = AbstractC1560u.m(null);
        x();
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        c cVar = (c) interfaceC0129z;
        for (h hVar : cVar.f3280n) {
            hVar.B(null);
        }
        cVar.f3278l = null;
        this.f3294t.remove(interfaceC0129z);
    }

    @Override // P0.j
    public final void o(l lVar, long j, long j3, boolean z2) {
        r rVar = (r) lVar;
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f3290p.getClass();
        this.f3292r.c(c0123t, rVar.f5437c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // L0.AbstractC0105a
    public final void q() {
        this.f3282A = this.f3285h ? this.f3282A : null;
        this.f3295v = null;
        this.f3299z = 0L;
        o oVar = this.f3296w;
        if (oVar != null) {
            oVar.e(null);
            this.f3296w = null;
        }
        Handler handler = this.f3283B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3283B = null;
        }
        this.f3289n.release();
    }

    @Override // P0.j
    public final void r(l lVar, long j, long j3) {
        r rVar = (r) lVar;
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f3290p.getClass();
        this.f3292r.d(c0123t, rVar.f5437c);
        this.f3282A = (K0.c) rVar.f5440f;
        this.f3299z = j - j3;
        w();
        if (this.f3282A.f3595d) {
            this.f3283B.postDelayed(new B0.o(this, 6), Math.max(0L, (this.f3299z + DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    @Override // P0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A1.g t(P0.l r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            r5 = 0
            P0.r r4 = (P0.r) r4
            L0.t r6 = new L0.t
            long r0 = r4.f5435a
            t0.y r0 = r4.f5438d
            android.net.Uri r1 = r0.f21125c
            java.util.Map r0 = r0.f21126d
            r6.<init>(r0, r7)
            I4.e r7 = r3.f3290p
            r7.getClass()
            boolean r7 = r9 instanceof o0.C1406C
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4e
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4e
            boolean r7 = r9 instanceof t0.C1718r
            if (r7 != 0) goto L4e
            boolean r7 = r9 instanceof P0.n
            if (r7 != 0) goto L4e
            int r7 = t0.C1709i.f21069b
            r7 = r9
        L2d:
            if (r7 == 0) goto L42
            boolean r8 = r7 instanceof t0.C1709i
            if (r8 == 0) goto L3d
            r8 = r7
            t0.i r8 = (t0.C1709i) r8
            int r8 = r8.f21070a
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L3d
            goto L4e
        L3d:
            java.lang.Throwable r7 = r7.getCause()
            goto L2d
        L42:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L4f
        L4e:
            r7 = r0
        L4f:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L56
            A1.g r5 = P0.o.f5431f
            goto L5c
        L56:
            A1.g r10 = new A1.g
            r10.<init>(r5, r7, r5)
            r5 = r10
        L5c:
            boolean r7 = r5.a()
            r7 = r7 ^ 1
            A0.f r8 = r3.f3292r
            int r4 = r4.f5437c
            r8.g(r6, r4, r9, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.d.t(P0.l, long, long, java.io.IOException, int):A1.g");
    }

    @Override // L0.AbstractC0105a
    public final synchronized void v(C1447v c1447v) {
        this.f3284C = c1447v;
    }

    public final void w() {
        d0 d0Var;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f3294t;
            if (i3 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i3);
            K0.c cVar2 = this.f3282A;
            cVar.f3279m = cVar2;
            for (h hVar : cVar.f3280n) {
                b bVar = (b) hVar.f4474e;
                K0.b[] bVarArr = bVar.f3266f.f3597f;
                int i10 = bVar.f3262b;
                K0.b bVar2 = bVarArr[i10];
                int i11 = bVar2.f3586k;
                K0.b bVar3 = cVar2.f3597f[i10];
                if (i11 == 0 || bVar3.f3586k == 0) {
                    bVar.f3267g += i11;
                } else {
                    int i12 = i11 - 1;
                    long[] jArr = bVar2.f3590o;
                    long b2 = bVar2.b(i12) + jArr[i12];
                    long j = bVar3.f3590o[0];
                    if (b2 <= j) {
                        bVar.f3267g += i11;
                    } else {
                        bVar.f3267g = AbstractC1560u.e(jArr, j, true) + bVar.f3267g;
                    }
                }
                bVar.f3266f = cVar2;
            }
            InterfaceC0128y interfaceC0128y = cVar.f3278l;
            interfaceC0128y.getClass();
            interfaceC0128y.h(cVar);
            i3++;
        }
        long j3 = Long.MIN_VALUE;
        long j10 = Long.MAX_VALUE;
        for (K0.b bVar4 : this.f3282A.f3597f) {
            if (bVar4.f3586k > 0) {
                long[] jArr2 = bVar4.f3590o;
                j10 = Math.min(j10, jArr2[0]);
                int i13 = bVar4.f3586k - 1;
                j3 = Math.max(j3, bVar4.b(i13) + jArr2[i13]);
            }
        }
        if (j10 == LongCompanionObject.MAX_VALUE) {
            long j11 = this.f3282A.f3595d ? -9223372036854775807L : 0L;
            K0.c cVar3 = this.f3282A;
            boolean z2 = cVar3.f3595d;
            d0Var = new d0(j11, 0L, 0L, 0L, true, z2, z2, cVar3, h());
        } else {
            K0.c cVar4 = this.f3282A;
            if (cVar4.f3595d) {
                long j12 = cVar4.f3599h;
                if (j12 != -9223372036854775807L && j12 > 0) {
                    j10 = Math.max(j10, j3 - j12);
                }
                long j13 = j10;
                long j14 = j3 - j13;
                long J10 = j14 - AbstractC1560u.J(this.f3291q);
                if (J10 < 5000000) {
                    J10 = Math.min(5000000L, j14 / 2);
                }
                d0Var = new d0(-9223372036854775807L, j14, j13, J10, true, true, true, this.f3282A, h());
            } else {
                long j15 = cVar4.f3598g;
                if (j15 == -9223372036854775807L) {
                    j15 = j3 - j10;
                }
                long j16 = j15;
                long j17 = j10;
                d0Var = new d0(-9223372036854775807L, -9223372036854775807L, j17 + j16, j16, j17, 0L, true, false, false, this.f3282A, h(), null);
            }
        }
        m(d0Var);
    }

    public final void x() {
        if (this.f3296w.c()) {
            return;
        }
        r rVar = new r(this.f3295v, this.j, 4, this.f3293s);
        o oVar = this.f3296w;
        e eVar = this.f3290p;
        int i3 = rVar.f5437c;
        oVar.f(rVar, this, eVar.t(i3));
        this.f3292r.h(new C0123t(rVar.f5436b), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
