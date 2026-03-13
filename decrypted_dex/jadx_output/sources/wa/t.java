package wa;

import fa.C0935a;
import ha.C1013a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import ta.C1747g;
import xa.AbstractC1935c;
import xa.C1933a;
import xa.C1940h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t extends q {

    /* renamed from: p, reason: collision with root package name */
    public Float f22259p;

    /* renamed from: q, reason: collision with root package name */
    public Ia.b f22260q;

    /* renamed from: r, reason: collision with root package name */
    public final C1013a f22261r;

    /* renamed from: s, reason: collision with root package name */
    public final X9.b f22262s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f22263t;

    /* renamed from: v, reason: collision with root package name */
    public C0935a f22264v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(oa.C1471d r9) {
        /*
            r8 = this;
            r0 = 24027(0x5ddb, float:3.3669E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r9)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1 = 0
            r8.f22259p = r1
            wa.n r2 = r8.f22233d
            r3 = 948(0x3b4, float:1.328E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            if (r2 == 0) goto L46
            ta.h r4 = r2.b()
            if (r4 == 0) goto L46
            byte[] r4 = r4.a()
            int r5 = r4.length
            if (r5 != 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 24028(0x5ddc, float:3.367E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            oa.j r5 = oa.j.f18622z
            java.lang.String r9 = r9.Q(r5)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.e(r3, r9)
        L46:
            r4 = r1
        L47:
            r9 = 0
            if (r4 == 0) goto L9a
            Z9.C r5 = new Z9.C     // Catch: java.io.IOException -> L6a
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7)     // Catch: java.io.IOException -> L6a
            l4.z r6 = new l4.z     // Catch: java.io.IOException -> L6a
            r7 = 29
            r6.<init>(r7)     // Catch: java.io.IOException -> L6a
            java.util.ArrayList r4 = r5.u(r4, r6)     // Catch: java.io.IOException -> L6a
            java.lang.Object r4 = r4.get(r9)     // Catch: java.io.IOException -> L6a
            Z9.i r4 = (Z9.AbstractC0374i) r4     // Catch: java.io.IOException -> L6a
            boolean r5 = r4 instanceof Z9.F     // Catch: java.io.IOException -> L6a
            if (r5 == 0) goto L6c
            Z9.F r4 = (Z9.F) r4     // Catch: java.io.IOException -> L6a
            r1 = r4
            goto L9a
        L6a:
            r0 = move-exception
            goto L7c
        L6c:
            java.lang.Class r4 = r4.getClass()     // Catch: java.io.IOException -> L6a
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.io.IOException -> L6a
            java.lang.String r0 = r0.concat(r4)     // Catch: java.io.IOException -> L6a
            android.util.Log.e(r3, r0)     // Catch: java.io.IOException -> L6a
            goto L9a
        L7c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 24029(0x5ddd, float:3.3672E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            oa.d r5 = r8.f22230a
            oa.j r6 = oa.j.f18622z
            java.lang.String r5 = r5.Q(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r0)
        L9a:
            if (r1 == 0) goto La2
            r8.f22262s = r1
            r9 = 1
            r8.f22263t = r9
            goto Led
        La2:
            wa.e r0 = Ec.d.A()
            oa.d r1 = r8.f22230a
            oa.j r4 = oa.j.f18622z
            java.lang.String r1 = r1.Q(r4)
            wa.h r0 = (wa.h) r0
            aa.e r0 = r0.h(r1, r2)
            java.lang.Object r1 = r0.f9344b
            X9.b r1 = (X9.b) r1
            r8.f22262s = r1
            boolean r0 = r0.f9343a
            if (r0 == 0) goto Leb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 23983(0x5daf, float:3.3607E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.<init>(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 6035(0x1793, float:8.457E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            oa.d r1 = r8.f22230a
            java.lang.String r1 = r1.Q(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
        Leb:
            r8.f22263t = r9
        Led:
            r8.u()
            Ia.b r9 = r8.a()
            ha.a r9 = r9.b()
            r8.f22261r = r9
            r9.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.t.<init>(oa.d):void");
    }

    @Override // wa.m, wa.o
    public final Ia.b a() {
        List list;
        Ia.b bVar = m.j;
        if (this.f22260q == null) {
            try {
                list = this.f22262s.a();
            } catch (IOException unused) {
                this.f22260q = bVar;
                list = null;
            }
            if (list == null || list.size() != 6) {
                return bVar;
            }
            this.f22260q = new Ia.b(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue(), ((Number) list.get(4)).floatValue(), ((Number) list.get(5)).floatValue());
        }
        return this.f22260q;
    }

    @Override // wa.o
    public final C0935a b() {
        C1747g a3;
        if (this.f22264v == null) {
            n nVar = this.f22233d;
            this.f22264v = (nVar == null || (a3 = nVar.a()) == null || (a3.a() == 0.0f && a3.b() == 0.0f && a3.c() == 0.0f && a3.d() == 0.0f)) ? this.f22262s.d() : new C0935a(a3.a(), a3.b(), a3.c(), a3.d());
        }
        return this.f22264v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3.e(r5) != false) goto L15;
     */
    @Override // wa.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            xa.c r2 = r4.f22241k
            java.lang.String r5 = r2.c(r5)
            boolean r2 = r4.f22263t
            X9.b r3 = r4.f22262s
            if (r2 != 0) goto L39
            boolean r2 = r3.e(r5)
            if (r2 == 0) goto L15
            goto L39
        L15:
            xa.d r2 = r4.f22242l
            java.lang.String r5 = r2.c(r5)
            if (r5 == 0) goto L32
            int r2 = r5.length()
            if (r2 != r0) goto L32
            int r5 = r5.codePointAt(r1)
            java.lang.String r5 = Tc.d.k(r5)
            boolean r2 = r3.e(r5)
            if (r2 == 0) goto L32
            goto L39
        L32:
            r5 = 7719(0x1e27, float:1.0817E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
        L39:
            float r5 = r3.h(r5)
            r2 = 2
            float[] r2 = new float[r2]
            r2[r1] = r5
            r5 = 0
            r2[r0] = r5
            ha.a r5 = r4.f22261r
            r5.b(r2, r2)
            r5 = r2[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.t.c(int):float");
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22263t;
    }

    @Override // wa.m
    public final float e() {
        if (this.f22259p == null) {
            this.f22259p = Float.valueOf(500.0f);
        }
        return this.f22259p.floatValue();
    }

    @Override // wa.o
    public final String getName() {
        return this.f22230a.Q(oa.j.f18622z);
    }

    @Override // wa.m
    public final int q(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read();
    }

    @Override // wa.q
    public final AbstractC1935c v() {
        Y9.b bVar;
        if (!this.f22263t && (bVar = this.f22232c) != null) {
            return new C1933a(bVar);
        }
        X9.b bVar2 = this.f22262s;
        return bVar2 instanceof X9.a ? C1933a.d(((X9.a) bVar2).b()) : C1940h.f23131d;
    }
}
