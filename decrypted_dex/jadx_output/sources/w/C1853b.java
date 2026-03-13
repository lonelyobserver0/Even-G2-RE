package w;

import sa.C1608a;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1853b {

    /* renamed from: c, reason: collision with root package name */
    public final C1852a f21953c;

    /* renamed from: a, reason: collision with root package name */
    public C1857f f21951a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f21952b = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21954d = false;

    public C1853b(C1608a c1608a) {
        this.f21953c = new C1852a(this, c1608a);
    }

    public final void a(C1855d c1855d, int i3) {
        C1857f i10 = c1855d.i(i3);
        C1852a c1852a = this.f21953c;
        c1852a.g(i10, 1.0f);
        c1852a.g(c1855d.i(i3), -1.0f);
    }

    public void b(C1857f c1857f) {
        int i3 = c1857f.f21972c;
        float f10 = 1.0f;
        if (i3 != 1) {
            if (i3 == 2) {
                f10 = 1000.0f;
            } else if (i3 == 3) {
                f10 = 1000000.0f;
            } else if (i3 == 4) {
                f10 = 1.0E9f;
            } else if (i3 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f21953c.g(c1857f, f10);
    }

    public final void c(C1857f c1857f, C1857f c1857f2, C1857f c1857f3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f21952b = i3;
        }
        C1852a c1852a = this.f21953c;
        if (z2) {
            c1852a.g(c1857f, 1.0f);
            c1852a.g(c1857f2, -1.0f);
            c1852a.g(c1857f3, -1.0f);
        } else {
            c1852a.g(c1857f, -1.0f);
            c1852a.g(c1857f2, 1.0f);
            c1852a.g(c1857f3, 1.0f);
        }
    }

    public final void d(C1857f c1857f, C1857f c1857f2, C1857f c1857f3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f21952b = i3;
        }
        C1852a c1852a = this.f21953c;
        if (z2) {
            c1852a.g(c1857f, 1.0f);
            c1852a.g(c1857f2, -1.0f);
            c1852a.g(c1857f3, 1.0f);
        } else {
            c1852a.g(c1857f, -1.0f);
            c1852a.g(c1857f2, 1.0f);
            c1852a.g(c1857f3, -1.0f);
        }
    }

    public final void e(C1857f c1857f) {
        C1857f c1857f2 = this.f21951a;
        C1852a c1852a = this.f21953c;
        if (c1857f2 != null) {
            c1852a.g(c1857f2, -1.0f);
            this.f21951a = null;
        }
        float h2 = c1852a.h(c1857f, true) * (-1.0f);
        this.f21951a = c1857f;
        if (h2 == 1.0f) {
            return;
        }
        this.f21952b /= h2;
        int i3 = c1852a.f21949h;
        for (int i10 = 0; i3 != -1 && i10 < c1852a.f21942a; i10++) {
            float[] fArr = c1852a.f21948g;
            fArr[i3] = fArr[i3] / h2;
            i3 = c1852a.f21947f[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            w.f r0 = r10.f21951a
            if (r0 != 0) goto Lc
            r0 = 824(0x338, float:1.155E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L1c
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            w.f r1 = r10.f21951a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L1c:
            r1 = 4978(0x1372, float:6.976E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
            float r1 = r10.f21952b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3f
            java.lang.StringBuilder r0 = w.AbstractC1856e.b(r0)
            float r1 = r10.f21952b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L40
        L3f:
            r1 = r4
        L40:
            w.a r5 = r10.f21953c
            int r6 = r5.f21942a
        L44:
            if (r4 >= r6) goto Lb4
            w.f r7 = r5.e(r4)
            if (r7 != 0) goto L4d
            goto Lb1
        L4d:
            float r7 = r5.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto Lb1
        L56:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6b
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L85
            r1 = 23748(0x5cc4, float:3.3278E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
        L69:
            float r7 = r7 * r9
            goto L85
        L6b:
            if (r8 <= 0) goto L79
            r1 = 6619(0x19db, float:9.275E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
            goto L85
        L79:
            r1 = 6618(0x19da, float:9.274E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
            goto L69
        L85:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L97
            r1 = 1116(0x45c, float:1.564E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
            goto Lb0
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            r0 = 23749(0x5cc5, float:3.328E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lb0:
            r1 = r3
        Lb1:
            int r4 = r4 + 1
            goto L44
        Lb4:
            if (r1 != 0) goto Lc1
            r1 = 995(0x3e3, float:1.394E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1853b.toString():java.lang.String");
    }
}
