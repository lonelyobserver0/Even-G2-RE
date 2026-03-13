package L0;

import kotlin.jvm.internal.LongCompanionObject;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: L0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0108d implements InterfaceC0129z, InterfaceC0128y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0129z f4052a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0128y f4053b;

    /* renamed from: c, reason: collision with root package name */
    public C0107c[] f4054c = new C0107c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f4055d;

    /* renamed from: e, reason: collision with root package name */
    public long f4056e;

    /* renamed from: f, reason: collision with root package name */
    public long f4057f;

    /* renamed from: g, reason: collision with root package name */
    public C0110f f4058g;

    public C0108d(InterfaceC0129z interfaceC0129z, boolean z2, long j, long j3) {
        this.f4052a = interfaceC0129z;
        this.f4055d = z2 ? j : -9223372036854775807L;
        this.f4056e = j;
        this.f4057f = j3;
    }

    @Override // L0.InterfaceC0128y
    public final void a(InterfaceC0129z interfaceC0129z) {
        if (this.f4058g != null) {
            return;
        }
        InterfaceC0128y interfaceC0128y = this.f4053b;
        interfaceC0128y.getClass();
        interfaceC0128y.a(this);
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, v0.c0 c0Var) {
        long j3 = this.f4056e;
        if (j == j3) {
            return j3;
        }
        long j10 = AbstractC1560u.j(c0Var.f21706a, 0L, j - j3);
        long j11 = this.f4057f;
        long j12 = AbstractC1560u.j(c0Var.f21707b, 0L, j11 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j11 - j);
        if (j10 != c0Var.f21706a || j12 != c0Var.f21707b) {
            c0Var = new v0.c0(j10, j12);
        }
        return this.f4052a.b(j, c0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r10 > r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // L0.InterfaceC0129z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(O0.s[] r15, boolean[] r16, L0.Z[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r17
            int r1 = r0.length
            L0.c[] r1 = new L0.C0107c[r1]
            r14.f4054c = r1
            int r1 = r0.length
            L0.Z[] r5 = new L0.Z[r1]
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r0.length
            r9 = 0
            if (r2 >= r3) goto L21
            L0.c[] r3 = r14.f4054c
            r4 = r0[r2]
            L0.c r4 = (L0.C0107c) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            L0.Z r9 = r4.f4046a
        L1c:
            r5[r2] = r9
            int r2 = r2 + 1
            goto Lc
        L21:
            L0.z r2 = r14.f4052a
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            long r10 = r2.c(r3, r4, r5, r6, r7)
            boolean r2 = r14.d()
            if (r2 == 0) goto L5b
            long r6 = r14.f4056e
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L5b
            r12 = 0
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 == 0) goto L5b
            int r2 = r15.length
            r4 = r1
        L42:
            if (r4 >= r2) goto L5b
            r6 = r15[r4]
            if (r6 == 0) goto L58
            o0.m r6 = r6.n()
            java.lang.String r7 = r6.f18216n
            java.lang.String r6 = r6.f18213k
            boolean r6 = o0.AbstractC1405B.a(r7, r6)
            if (r6 != 0) goto L58
            r2 = r10
            goto L60
        L58:
            int r4 = r4 + 1
            goto L42
        L5b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L60:
            r14.f4055d = r2
            int r15 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r15 == 0) goto L7b
            long r2 = r14.f4056e
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 < 0) goto L79
            long r2 = r14.f4057f
            r6 = -9223372036854775808
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L7b
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 > 0) goto L79
            goto L7b
        L79:
            r15 = r1
            goto L7c
        L7b:
            r15 = 1
        L7c:
            r0.AbstractC1550k.g(r15)
        L7f:
            int r15 = r0.length
            if (r1 >= r15) goto La5
            r15 = r5[r1]
            if (r15 != 0) goto L8b
            L0.c[] r15 = r14.f4054c
            r15[r1] = r9
            goto L9c
        L8b:
            L0.c[] r2 = r14.f4054c
            r3 = r2[r1]
            if (r3 == 0) goto L95
            L0.Z r3 = r3.f4046a
            if (r3 == r15) goto L9c
        L95:
            L0.c r3 = new L0.c
            r3.<init>(r14, r15)
            r2[r1] = r3
        L9c:
            L0.c[] r15 = r14.f4054c
            r15 = r15[r1]
            r0[r1] = r15
            int r1 = r1 + 1
            goto L7f
        La5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0108d.c(O0.s[], boolean[], L0.Z[], boolean[], long):long");
    }

    public final boolean d() {
        return this.f4055d != -9223372036854775807L;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f4053b = interfaceC0128y;
        this.f4052a.e(this, j);
    }

    @Override // L0.b0
    public final long f() {
        long f10 = this.f4052a.f();
        if (f10 != Long.MIN_VALUE) {
            long j = this.f4057f;
            if (j == Long.MIN_VALUE || f10 < j) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        return this.f4052a.g(i3);
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        InterfaceC0128y interfaceC0128y = this.f4053b;
        interfaceC0128y.getClass();
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        C0110f c0110f = this.f4058g;
        if (c0110f != null) {
            throw c0110f;
        }
        this.f4052a.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // L0.InterfaceC0129z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f4055d = r0
            L0.c[] r0 = r5.f4054c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f4047b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            L0.z r0 = r5.f4052a
            long r0 = r0.k(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f4056e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f4057f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            r0.AbstractC1550k.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0108d.k(long):long");
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        this.f4052a.l(j);
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f4052a.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        if (d()) {
            long j = this.f4055d;
            this.f4055d = -9223372036854775807L;
            long p8 = p();
            return p8 != -9223372036854775807L ? p8 : j;
        }
        long p9 = this.f4052a.p();
        if (p9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1550k.g(p9 >= this.f4056e);
        long j3 = this.f4057f;
        AbstractC1550k.g(j3 == Long.MIN_VALUE || p9 <= j3);
        return p9;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        return this.f4052a.s();
    }

    @Override // L0.b0
    public final long u() {
        long u2 = this.f4052a.u();
        if (u2 != Long.MIN_VALUE) {
            long j = this.f4057f;
            if (j == Long.MIN_VALUE || u2 < j) {
                return u2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // L0.b0
    public final void v(long j) {
        this.f4052a.v(j);
    }
}
