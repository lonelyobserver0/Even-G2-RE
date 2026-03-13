package wa;

import com.stub.StubApp;
import da.C;
import da.C0815e;
import da.C0816f;
import da.J;
import fa.C0935a;
import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ta.C1747g;
import xa.AbstractC1935c;
import xa.C1933a;
import xa.C1934b;
import xa.C1936d;
import xa.C1938f;
import xa.C1939g;
import xa.C1940h;
import xa.C1942j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends q {

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f22245x = new HashMap(250);

    /* renamed from: p, reason: collision with root package name */
    public C0815e f22246p;

    /* renamed from: q, reason: collision with root package name */
    public C0815e f22247q;

    /* renamed from: r, reason: collision with root package name */
    public C0815e f22248r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22249s;

    /* renamed from: t, reason: collision with root package name */
    public final J f22250t;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f22251v;

    /* renamed from: w, reason: collision with root package name */
    public C0935a f22252w;

    static {
        for (Map.Entry entry : Collections.unmodifiableMap(C1938f.f23127f.f23117a).entrySet()) {
            HashMap hashMap = f22245x;
            if (!hashMap.containsKey(entry.getValue())) {
                hashMap.put(entry.getValue(), entry.getKey());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(oa.C1471d r9) {
        /*
            r8 = this;
            r8.<init>(r9)
            r9 = 0
            r8.f22246p = r9
            r8.f22247q = r9
            r8.f22248r = r9
            r0 = 0
            r8.f22249s = r0
            wa.n r1 = r8.f22233d
            r2 = 1
            r3 = 948(0x3b4, float:1.328E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            if (r1 == 0) goto L69
            oa.d r1 = r1.f22238a
            oa.j r4 = oa.j.p1
            oa.b r1 = r1.J(r4)
            boolean r4 = r1 instanceof oa.p
            if (r4 == 0) goto L2d
            ta.h r4 = new ta.h
            oa.p r1 = (oa.p) r1
            r4.<init>(r1)
            goto L2e
        L2d:
            r4 = r9
        L2e:
            if (r4 == 0) goto L69
            da.G r1 = new da.G     // Catch: java.io.IOException -> L46
            r1.<init>(r2, r0)     // Catch: java.io.IOException -> L46
            oa.b r4 = r4.f21257b     // Catch: java.io.IOException -> L46
            oa.p r4 = (oa.p) r4     // Catch: java.io.IOException -> L46
            oa.h r4 = r4.Z()     // Catch: java.io.IOException -> L46
            da.J r9 = r1.d(r4)     // Catch: java.io.IOException -> L42
            goto L69
        L42:
            r1 = move-exception
            goto L48
        L44:
            r4 = r9
            goto L48
        L46:
            r1 = move-exception
            goto L44
        L48:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 24003(0x5dc3, float:3.3635E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            oa.d r6 = r8.f22230a
            oa.j r7 = oa.j.f18622z
            java.lang.String r6 = r6.Q(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r3, r5, r1)
            com.google.android.gms.internal.measurement.F1.h(r4)
        L69:
            if (r9 == 0) goto L6d
            r1 = r2
            goto L6e
        L6d:
            r1 = r0
        L6e:
            r8.f22251v = r1
            if (r9 != 0) goto Le1
            wa.e r9 = Ec.d.A()
            oa.d r1 = r8.f22230a
            oa.j r4 = oa.j.f18622z
            java.lang.String r1 = r1.Q(r4)
            wa.n r5 = r8.f22233d
            wa.h r9 = (wa.h) r9
            X9.b r1 = r9.c(r2, r1)
            da.J r1 = (da.J) r1
            if (r1 == 0) goto L90
            aa.e r9 = new aa.e
            r9.<init>(r1, r0)
            goto La3
        L90:
            java.lang.String r0 = wa.h.f(r5)
            X9.b r0 = r9.c(r2, r0)
            da.J r0 = (da.J) r0
            if (r0 != 0) goto L9e
            da.J r0 = r9.f22204c
        L9e:
            aa.e r9 = new aa.e
            r9.<init>(r0, r2)
        La3:
            java.lang.Object r0 = r9.f9344b
            X9.b r0 = (X9.b) r0
            da.J r0 = (da.J) r0
            boolean r9 = r9.f9343a
            if (r9 == 0) goto Le0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 24004(0x5dc4, float:3.3637E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r9.<init>(r1)
            r9.append(r0)
            r1 = 24005(0x5dc5, float:3.3638E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r9.append(r1)
            oa.d r1 = r8.f22230a
            java.lang.String r1 = r1.Q(r4)
            r9.append(r1)
            r1 = 620(0x26c, float:8.69E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r3, r9)
        Le0:
            r9 = r0
        Le1:
            r8.f22250t = r9
            r8.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.r.<init>(oa.d):void");
    }

    @Override // wa.o
    public final C0935a b() {
        C1747g a3;
        if (this.f22252w == null) {
            n nVar = this.f22233d;
            this.f22252w = (nVar == null || (a3 = nVar.a()) == null) ? this.f22250t.d() : new C0935a(a3.a(), a3.b(), a3.c(), a3.d());
        }
        return this.f22252w;
    }

    @Override // wa.o
    public final float c(int i3) {
        int w10 = w(i3);
        J j = this.f22250t;
        float k3 = j.k(w10);
        float H2 = j.H();
        return H2 != 1000.0f ? (1000.0f / H2) * k3 : k3;
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22251v;
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
        String[] strArr;
        Y9.b bVar;
        if (!this.f22251v && (bVar = this.f22232c) != null) {
            return new C1933a(bVar);
        }
        if (t() != null && !t().booleanValue()) {
            return C1940h.f23131d;
        }
        String str = (String) w.f22277a.get(this.f22230a.Q(oa.j.f18622z));
        if (m() && !str.equals(StubApp.getString2(23951)) && !str.equals(StubApp.getString2(23958))) {
            return C1940h.f23131d;
        }
        C c10 = (C) this.f22250t.C(StubApp.getString2(1154));
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 <= 256; i3++) {
            int w10 = w(i3);
            if (w10 > 0) {
                String str2 = null;
                if (c10 != null && w10 >= 0 && (strArr = c10.f13463g) != null && w10 < strArr.length) {
                    str2 = strArr[w10];
                }
                if (str2 == null) {
                    str2 = Integer.toString(w10);
                }
                hashMap.put(Integer.valueOf(i3), str2);
            }
        }
        C1933a c1933a = new C1933a(0);
        for (Map.Entry entry : hashMap.entrySet()) {
            c1933a.a(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        return c1933a;
    }

    public final int w(int i3) {
        C0815e c0815e;
        Integer num;
        String c10;
        boolean z2 = this.f22249s;
        int i10 = 0;
        boolean z10 = true;
        J j = this.f22250t;
        if (!z2) {
            C0816f c0816f = (C0816f) j.C(StubApp.getString2(17132));
            if (c0816f != null) {
                for (C0815e c0815e2 : c0816f.f13505f) {
                    int i11 = c0815e2.f13499a;
                    if (3 == i11) {
                        int i12 = c0815e2.f13500b;
                        if (1 == i12) {
                            this.f22246p = c0815e2;
                        } else if (i12 == 0) {
                            this.f22247q = c0815e2;
                        }
                    } else if (1 == i11 && c0815e2.f13500b == 0) {
                        this.f22248r = c0815e2;
                    } else if (i11 == 0 && c0815e2.f13500b == 0) {
                        this.f22246p = c0815e2;
                    } else if (i11 == 0 && 3 == c0815e2.f13500b) {
                        this.f22246p = c0815e2;
                    }
                }
            }
            this.f22249s = true;
        }
        Boolean bool = this.f22243m;
        String string2 = StubApp.getString2(7719);
        if (bool == null) {
            Boolean t3 = t();
            if (t3 == null) {
                if (m()) {
                    String str = (String) w.f22277a.get(getName());
                    if (!str.equals(StubApp.getString2(23951)) && !str.equals(StubApp.getString2(23958))) {
                        z10 = false;
                    }
                    t3 = Boolean.valueOf(z10);
                } else {
                    AbstractC1935c abstractC1935c = this.f22241k;
                    if (abstractC1935c == null) {
                        t3 = Boolean.TRUE;
                    } else if ((abstractC1935c instanceof C1942j) || (abstractC1935c instanceof C1939g) || (abstractC1935c instanceof C1940h)) {
                        t3 = Boolean.FALSE;
                    } else if (abstractC1935c instanceof C1934b) {
                        for (String str2 : ((C1934b) abstractC1935c).f23116e.values()) {
                            if (!string2.equals(str2) && (!C1942j.f23135d.f23118b.containsKey(str2) || !C1939g.f23129d.f23118b.containsKey(str2) || !C1940h.f23131d.f23118b.containsKey(str2))) {
                                t3 = Boolean.TRUE;
                                break;
                            }
                        }
                        t3 = Boolean.FALSE;
                    } else {
                        t3 = null;
                    }
                }
            }
            if (t3 != null) {
                this.f22243m = t3;
            } else {
                this.f22243m = Boolean.TRUE;
            }
        }
        if (this.f22243m.booleanValue()) {
            C0815e c0815e3 = this.f22246p;
            if (c0815e3 != null) {
                AbstractC1935c abstractC1935c2 = this.f22241k;
                if ((abstractC1935c2 instanceof C1942j) || (abstractC1935c2 instanceof C1939g)) {
                    String c11 = abstractC1935c2.c(i3);
                    if (!string2.equals(c11)) {
                        String c12 = C1936d.f23119d.c(c11);
                        if (c12 != null) {
                            i10 = this.f22246p.e(c12.codePointAt(0));
                        }
                    }
                } else {
                    i10 = c0815e3.e(i3);
                }
            }
            C0815e c0815e4 = this.f22247q;
            if (c0815e4 != null) {
                i10 = c0815e4.e(i3);
                if (i3 >= 0 && i3 <= 255) {
                    if (i10 == 0) {
                        i10 = this.f22247q.e(61440 + i3);
                    }
                    if (i10 == 0) {
                        i10 = this.f22247q.e(61696 + i3);
                    }
                    if (i10 == 0) {
                        i10 = this.f22247q.e(61952 + i3);
                    }
                }
            }
            return (i10 != 0 || (c0815e = this.f22248r) == null) ? i10 : c0815e.e(i3);
        }
        String c13 = this.f22241k.c(i3);
        if (!string2.equals(c13)) {
            if (this.f22246p != null && (c10 = C1936d.f23119d.c(c13)) != null) {
                i10 = this.f22246p.e(c10.codePointAt(0));
            }
            if (i10 == 0 && this.f22248r != null && (num = (Integer) f22245x.get(c13)) != null) {
                i10 = this.f22248r.e(num.intValue());
            }
            return i10 == 0 ? j.I(c13) : i10;
        }
        return 0;
    }
}
