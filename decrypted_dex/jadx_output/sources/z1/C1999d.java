package z1;

import r0.C1553n;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1999d implements T0.o {

    /* renamed from: a, reason: collision with root package name */
    public final C1998c f23773a = new C1998c(null, 0, 1);

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f23774b = new C1553n(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f23775c;

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f23775c = false;
        this.f23773a.a();
    }

    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        C1553n c1553n = this.f23774b;
        int read = ((T0.l) pVar).read(c1553n.f20176a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        c1553n.G(0);
        c1553n.F(read);
        boolean z2 = this.f23775c;
        C1998c c1998c = this.f23773a;
        if (!z2) {
            c1998c.f23772n = 0L;
            this.f23775c = true;
        }
        c1998c.c(c1553n);
        return 0;
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        this.f23773a.f(qVar, new C1994F(0, 1));
        qVar.q();
        qVar.D(new T0.t(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(T0.p r15) {
        /*
            r14 = this;
            r0.n r0 = new r0.n
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = r2
        L9:
            byte[] r4 = r0.f20176a
            r5 = r15
            T0.l r5 = (T0.l) r5
            r5.i(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L90
            r5.f7032f = r2
            r5.a(r3, r2)
            r15 = r2
            r1 = r3
        L25:
            byte[] r4 = r0.f20176a
            r6 = 7
            r5.i(r4, r2, r6, r2)
            r0.G(r2)
            int r4 = r0.A()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4c
            if (r4 == r9) goto L4c
            r5.f7032f = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r15 < r4) goto L47
            goto L89
        L47:
            r5.a(r1, r2)
            r15 = r2
            goto L25
        L4c:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L52
            return r8
        L52:
            byte[] r8 = r0.f20176a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L5a
            r11 = r12
            goto L87
        L5a:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L81
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L82
        L81:
            r6 = r10
        L82:
            if (r4 != r9) goto L86
            int r6 = r6 + 2
        L86:
            int r11 = r11 + r6
        L87:
            if (r11 != r12) goto L8a
        L89:
            return r2
        L8a:
            int r11 = r11 + (-7)
            r5.a(r11, r2)
            goto L25
        L90:
            r0.H(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C1999d.h(T0.p):boolean");
    }

    @Override // T0.o
    public final void release() {
    }
}
