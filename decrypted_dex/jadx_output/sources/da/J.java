package da;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import fa.C0935a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class J implements X9.b, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final F f13480d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f13481e;

    /* renamed from: a, reason: collision with root package name */
    public int f13477a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f13478b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13479c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13482f = new ArrayList();

    public J(F f10) {
        this.f13480d = f10;
    }

    public final int A() {
        if (this.f13477a == -1) {
            u uVar = (u) C(StubApp.getString2(17128));
            if (uVar != null) {
                this.f13477a = uVar.f13535f;
            } else {
                this.f13477a = 0;
            }
        }
        return this.f13477a;
    }

    public final synchronized H C(String str) {
        H h2;
        h2 = (H) this.f13479c.get(str);
        if (h2 != null && !h2.f13472d) {
            J(h2);
        }
        return h2;
    }

    public final synchronized byte[] F(H h2) {
        byte[] h4;
        long d8 = this.f13480d.d();
        this.f13480d.seek(h2.f13470b);
        h4 = this.f13480d.h((int) h2.f13471c);
        this.f13480d.seek(d8);
        return h4;
    }

    public final InterfaceC0813c G() {
        C0815e c0815e;
        n nVar;
        C0816f c0816f = (C0816f) C(StubApp.getString2(17132));
        if (c0816f == null) {
            c0815e = null;
        } else {
            C0815e b2 = c0816f.b(0, 4);
            if (b2 == null) {
                b2 = c0816f.b(3, 10);
            }
            if (b2 == null) {
                b2 = c0816f.b(0, 3);
            }
            if (b2 == null) {
                b2 = c0816f.b(3, 1);
            }
            if (b2 == null) {
                b2 = c0816f.b(3, 0);
            }
            if (b2 == null) {
                C0815e[] c0815eArr = c0816f.f13505f;
                if (c0815eArr.length > 0) {
                    c0815e = c0815eArr[0];
                }
            }
            c0815e = b2;
        }
        ArrayList arrayList = this.f13482f;
        return (arrayList.isEmpty() || (nVar = (n) C(StubApp.getString2(17141))) == null) ? c0815e : new a5.c(c0815e, nVar, Collections.unmodifiableList(arrayList), 4);
    }

    public final int H() {
        if (this.f13478b == -1) {
            p v2 = v();
            if (v2 != null) {
                this.f13478b = v2.f13521f;
            } else {
                this.f13478b = 0;
            }
        }
        return this.f13478b;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap r0 = r7.f13481e     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L48
            java.lang.String r0 = "1154"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L3e
            da.H r0 = r7.C(r0)     // Catch: java.lang.Throwable -> L3e
            da.C r0 = (da.C) r0     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L48
            java.lang.String r0 = "1154"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L3e
            da.H r0 = r7.C(r0)     // Catch: java.lang.Throwable -> L3e
            da.C r0 = (da.C) r0     // Catch: java.lang.Throwable -> L3e
            java.lang.String[] r0 = r0.f13463g     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L41
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3e
            int r3 = r0.length     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            r7.f13481e = r2     // Catch: java.lang.Throwable -> L3e
            r2 = r1
        L2d:
            int r3 = r0.length     // Catch: java.lang.Throwable -> L3e
            if (r2 >= r3) goto L48
            java.util.HashMap r3 = r7.f13481e     // Catch: java.lang.Throwable -> L3e
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 + 1
            goto L2d
        L3e:
            r8 = move-exception
            goto Lce
        L41:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            r7.f13481e = r0     // Catch: java.lang.Throwable -> L3e
        L48:
            monitor-exit(r7)
            java.util.HashMap r0 = r7.f13481e
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L75
            int r2 = r0.intValue()
            if (r2 <= 0) goto L75
            int r2 = r0.intValue()
            r3 = 17128(0x42e8, float:2.4001E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            da.H r3 = r7.C(r3)
            da.u r3 = (da.u) r3
            int r3 = r3.f13535f
            if (r2 >= r3) goto L75
            int r8 = r0.intValue()
            return r8
        L75:
            r0 = 17157(0x4305, float:2.4042E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r0 = r8.startsWith(r0)
            r2 = -1
            if (r0 == 0) goto Lbc
            int r0 = r8.length()
            r3 = 7
            if (r0 != r3) goto Lbc
            int r0 = r8.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 3
        L94:
            int r5 = r4 + 4
            if (r5 > r0) goto Lb2
            java.lang.String r4 = r8.substring(r4, r5)     // Catch: java.lang.NumberFormatException -> Lbc
            r6 = 16
            int r4 = java.lang.Integer.parseInt(r4, r6)     // Catch: java.lang.NumberFormatException -> Lbc
            r6 = 55295(0xd7ff, float:7.7485E-41)
            if (r4 <= r6) goto Lac
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r4 < r6) goto Lb0
        Lac:
            char r4 = (char) r4     // Catch: java.lang.NumberFormatException -> Lbc
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> Lbc
        Lb0:
            r4 = r5
            goto L94
        Lb2:
            java.lang.String r8 = r3.toString()     // Catch: java.lang.NumberFormatException -> Lbc
            int r0 = r8.length()     // Catch: java.lang.NumberFormatException -> Lbc
            if (r0 != 0) goto Lbe
        Lbc:
            r8 = r2
            goto Lc2
        Lbe:
            int r8 = r8.codePointAt(r1)     // Catch: java.lang.NumberFormatException -> Lbc
        Lc2:
            if (r8 <= r2) goto Lcd
            da.c r0 = r7.G()
            int r8 = r0.e(r8)
            return r8
        Lcd:
            return r1
        Lce:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: da.J.I(java.lang.String):int");
    }

    public final void J(H h2) {
        synchronized (this.f13480d) {
            long d8 = this.f13480d.d();
            this.f13480d.seek(h2.f13470b);
            h2.a(this, this.f13480d);
            this.f13480d.seek(d8);
        }
    }

    public void K(float f10) {
    }

    @Override // X9.b
    public final List a() {
        float H2 = (1000.0f / H()) * 0.001f;
        return Arrays.asList(Float.valueOf(H2), 0, 0, Float.valueOf(H2), 0, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13480d.close();
    }

    @Override // X9.b
    public final C0935a d() {
        p v2 = v();
        short s10 = v2.f13522g;
        short s11 = v2.f13524i;
        float H2 = 1000.0f / H();
        return new C0935a(s10 * H2, v2.f13523h * H2, s11 * H2, v2.j * H2);
    }

    @Override // X9.b
    public final boolean e(String str) {
        return I(str) != 0;
    }

    public final void finalize() {
        super.finalize();
        close();
    }

    @Override // X9.b
    public final String getName() {
        x xVar = (x) C(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        if (xVar != null) {
            return xVar.f13547h;
        }
        return null;
    }

    @Override // X9.b
    public final float h(String str) {
        return k(I(str));
    }

    public final int k(int i3) {
        r rVar = (r) C(StubApp.getString2(17130));
        if (rVar == null) {
            return 250;
        }
        int[] iArr = rVar.f13528f;
        if (iArr.length == 0) {
            return 250;
        }
        return i3 < rVar.f13531i ? iArr[i3] : iArr[iArr.length - 1];
    }

    public o p() {
        return (o) C(StubApp.getString2(17133));
    }

    public final String toString() {
        try {
            x xVar = (x) C(StubApp.getString2("152"));
            return xVar != null ? xVar.f13547h : "(null)";
        } catch (IOException e10) {
            return StubApp.getString2(17158) + e10.getMessage() + StubApp.getString2(74);
        }
    }

    public final p v() {
        return (p) C(StubApp.getString2(17134));
    }
}
