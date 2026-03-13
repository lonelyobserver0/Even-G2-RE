package I0;

import H0.m;
import T0.H;
import T0.q;
import o0.C1438m;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public int f3074a;

    /* renamed from: b, reason: collision with root package name */
    public int f3075b;

    /* renamed from: c, reason: collision with root package name */
    public int f3076c;

    /* renamed from: d, reason: collision with root package name */
    public long f3077d;

    /* renamed from: e, reason: collision with root package name */
    public long f3078e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3079f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3080g;

    public g(m mVar) {
        this.f3079f = mVar;
        this.f3077d = -9223372036854775807L;
        this.f3075b = -1;
    }

    @Override // I0.i
    public void b(long j, long j3) {
        this.f3077d = j;
        this.f3078e = j3;
        this.f3076c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if ((r24.e() >> 6) == 0) goto L24;
     */
    @Override // I0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(r0.C1553n r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f3080g
            T0.H r5 = (T0.H) r5
            r0.AbstractC1550k.h(r5)
            int r5 = r0.f3075b
            r6 = -1
            if (r5 == r6) goto L41
            int r5 = H0.C0066i.a(r5)
            if (r2 == r5) goto L41
            int r7 = r0.AbstractC1560u.f20190a
            java.util.Locale r7 = java.util.Locale.US
            r7 = 2778(0xada, float:3.893E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r8 = 2779(0xadb, float:3.894E-42)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r9 = 2786(0xae2, float:3.904E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            java.lang.String r5 = p0.AbstractC1482f.e(r5, r7, r2, r8, r9)
            r7 = 2804(0xaf4, float:3.929E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r0.AbstractC1550k.w(r7, r5)
        L41:
            int r5 = r1.a()
            java.lang.Object r7 = r0.f3080g
            T0.H r7 = (T0.H) r7
            r8 = 0
            r7.a(r1, r5, r8)
            int r7 = r0.f3076c
            if (r7 != 0) goto L8a
            byte[] r7 = r1.f20176a
            byte[] r9 = new byte[r3]
            r9 = {x00c6: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            r10 = 986(0x3da, float:1.382E-42)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            hc.b.j(r7, r10)
            r10 = r8
        L63:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L77
            r11 = r8
        L69:
            if (r11 >= r3) goto L78
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L75
            int r10 = r10 + r4
            goto L63
        L75:
            int r11 = r11 + r4
            goto L69
        L77:
            r10 = r6
        L78:
            if (r10 == r6) goto L87
            int r10 = r10 + r3
            r1.G(r10)
            int r1 = r1.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L87
            goto L88
        L87:
            r4 = r8
        L88:
            r0.f3074a = r4
        L8a:
            int r1 = r0.f3076c
            int r1 = r1 + r5
            r0.f3076c = r1
            if (r28 == 0) goto Lc2
            long r3 = r0.f3077d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = r25
            if (r1 != 0) goto La0
            r0.f3077d = r11
        La0:
            long r9 = r0.f3078e
            long r13 = r0.f3077d
            r15 = 90000(0x15f90, float:1.26117E-40)
            long r17 = android.support.v4.media.session.b.B(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f3080g
            r16 = r1
            T0.H r16 = (T0.H) r16
            int r1 = r0.f3074a
            int r3 = r0.f3076c
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.c(r17, r19, r20, r21, r22)
            r0.f3076c = r8
        Lc2:
            r0.f3075b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.g.c(r0.n, long, int, boolean):void");
    }

    @Override // I0.i
    public void d(long j) {
    }

    @Override // I0.i
    public void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 2);
        this.f3080g = w10;
        int i10 = AbstractC1560u.f20190a;
        w10.d(((m) this.f3079f).f2588c);
    }

    public g(int i3, int i10, C1438m c1438m, int i11, Object obj, long j, long j3) {
        this.f3074a = i3;
        this.f3075b = i10;
        this.f3079f = c1438m;
        this.f3076c = i11;
        this.f3080g = obj;
        this.f3077d = j;
        this.f3078e = j3;
    }
}
