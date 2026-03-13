package v0;

import kotlin.jvm.internal.LongCompanionObject;
import o0.AbstractC1416M;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1555p;

/* renamed from: v0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1810e implements Y {

    /* renamed from: b, reason: collision with root package name */
    public final int f21717b;

    /* renamed from: d, reason: collision with root package name */
    public b0 f21719d;

    /* renamed from: e, reason: collision with root package name */
    public int f21720e;

    /* renamed from: f, reason: collision with root package name */
    public w0.j f21721f;

    /* renamed from: g, reason: collision with root package name */
    public C1555p f21722g;

    /* renamed from: h, reason: collision with root package name */
    public int f21723h;
    public L0.Z j;

    /* renamed from: k, reason: collision with root package name */
    public C1438m[] f21724k;

    /* renamed from: l, reason: collision with root package name */
    public long f21725l;

    /* renamed from: m, reason: collision with root package name */
    public long f21726m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21728p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21729q;

    /* renamed from: s, reason: collision with root package name */
    public O0.q f21731s;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21716a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final C1803F f21718c = new C1803F();

    /* renamed from: n, reason: collision with root package name */
    public long f21727n = Long.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC1416M f21730r = AbstractC1416M.f18066a;

    public AbstractC1810e(int i3) {
        this.f21717b = i3;
    }

    public static int f(int i3, int i10, int i11, int i12) {
        return i3 | i10 | i11 | 128 | i12;
    }

    public static boolean m(int i3, boolean z2) {
        int i10 = i3 & 7;
        if (i10 != 4) {
            return z2 && i10 == 3;
        }
        return true;
    }

    public void A(float f10, float f11) {
    }

    public abstract int B(C1438m c1438m);

    public int C() {
        return 0;
    }

    @Override // v0.Y
    public void d(int i3, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v0.C1817l g(java.lang.Exception r11, o0.C1438m r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1a
            boolean r1 = r10.f21729q
            if (r1 != 0) goto L1a
            r1 = 1
            r10.f21729q = r1
            r1 = 0
            int r2 = r10.B(r12)     // Catch: java.lang.Throwable -> L14 v0.C1817l -> L18
            r2 = r2 & 7
            r10.f21729q = r1
            goto L1b
        L14:
            r0 = move-exception
            r10.f21729q = r1
            throw r0
        L18:
            r10.f21729q = r1
        L1a:
            r2 = r0
        L1b:
            java.lang.String r5 = r10.j()
            int r6 = r10.f21720e
            v0.l r1 = new v0.l
            if (r12 != 0) goto L27
            r8 = r0
            goto L28
        L27:
            r8 = r2
        L28:
            r2 = 1
            r3 = r11
            r7 = r12
            r9 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.AbstractC1810e.g(java.lang.Exception, o0.m, boolean, int):v0.l");
    }

    public void h() {
    }

    public J i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.f21727n == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean n();

    public abstract void o();

    public void p(boolean z2, boolean z10) {
    }

    public abstract void q(long j, boolean z2);

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v(C1438m[] c1438mArr, long j, long j3, L0.B b2) {
    }

    public final int w(C1803F c1803f, u0.e eVar, int i3) {
        L0.Z z2 = this.j;
        z2.getClass();
        int i10 = z2.i(c1803f, eVar, i3);
        if (i10 == -4) {
            if (eVar.k(4)) {
                this.f21727n = Long.MIN_VALUE;
                return this.f21728p ? -4 : -3;
            }
            long j = eVar.f21398g + this.f21725l;
            eVar.f21398g = j;
            this.f21727n = Math.max(this.f21727n, j);
            return i10;
        }
        if (i10 == -5) {
            C1438m c1438m = (C1438m) c1803f.f21582b;
            c1438m.getClass();
            long j3 = c1438m.f18221s;
            if (j3 != LongCompanionObject.MAX_VALUE) {
                C1437l a3 = c1438m.a();
                a3.f18182r = j3 + this.f21725l;
                c1803f.f21582b = new C1438m(a3);
            }
        }
        return i10;
    }

    public abstract void x(long j, long j3);

    public final void y(C1438m[] c1438mArr, L0.Z z2, long j, long j3, L0.B b2) {
        AbstractC1550k.g(!this.f21728p);
        this.j = z2;
        if (this.f21727n == Long.MIN_VALUE) {
            this.f21727n = j;
        }
        this.f21724k = c1438mArr;
        this.f21725l = j3;
        v(c1438mArr, j, j3, b2);
    }

    public final void z() {
        AbstractC1550k.g(this.f21723h == 0);
        this.f21718c.c();
        s();
    }
}
