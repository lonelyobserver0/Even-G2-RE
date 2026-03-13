package wa;

import aa.C0395b;
import aa.C0398e;
import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import ta.C1741a;
import ta.InterfaceC1743c;
import xa.C1936d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class m implements InterfaceC1743c, o {
    public static final Ia.b j = new Ia.b(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f22230a;

    /* renamed from: b, reason: collision with root package name */
    public final C0395b f22231b;

    /* renamed from: c, reason: collision with root package name */
    public final Y9.b f22232c;

    /* renamed from: d, reason: collision with root package name */
    public final n f22233d;

    /* renamed from: e, reason: collision with root package name */
    public List f22234e;

    /* renamed from: f, reason: collision with root package name */
    public float f22235f;

    /* renamed from: g, reason: collision with root package name */
    public float f22236g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractMap f22237h;

    public m(String str) {
        this.f22236g = -1.0f;
        C1471d c1471d = new C1471d();
        this.f22230a = c1471d;
        c1471d.V(oa.j.f18621y3, oa.j.f18556k1);
        this.f22231b = null;
        Y9.b a3 = w.a(str);
        this.f22232c = a3;
        if (a3 == null) {
            throw new IllegalArgumentException(StubApp.getString2(23988).concat(str));
        }
        this.f22233d = Oc.a.f(a3);
        this.f22237h = new ConcurrentHashMap();
    }

    public static C0395b o(AbstractC1469b abstractC1469b) {
        if (abstractC1469b instanceof oa.j) {
            return b.a(((oa.j) abstractC1469b).f18626a);
        }
        if (!(abstractC1469b instanceof oa.p)) {
            throw new IOException(StubApp.getString2(23992));
        }
        oa.h hVar = null;
        try {
            hVar = ((oa.p) abstractC1469b).Z();
            ConcurrentHashMap concurrentHashMap = b.f22187a;
            C0398e c0398e = new C0398e();
            c0398e.f9344b = new byte[512];
            c0398e.f9343a = true;
            return c0398e.p(hVar);
        } finally {
            F1.h(hVar);
        }
    }

    @Override // wa.o
    public Ia.b a() {
        return j;
    }

    public float e() {
        float f10;
        float f11;
        float f12 = this.f22235f;
        if (f12 != 0.0f) {
            return f12;
        }
        C1468a F3 = this.f22230a.F(oa.j.f18460I3);
        if (F3 != null) {
            f10 = 0.0f;
            f11 = 0.0f;
            for (int i3 = 0; i3 < F3.f18393a.size(); i3++) {
                AbstractC1469b G4 = F3.G(i3);
                if (G4 instanceof oa.l) {
                    float a3 = ((oa.l) G4).a();
                    if (a3 > 0.0f) {
                        f10 += a3;
                        f11 += 1.0f;
                    }
                }
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f13 = f10 > 0.0f ? f10 / f11 : 0.0f;
        this.f22235f = f13;
        return f13;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && ((m) obj).f22230a == this.f22230a;
    }

    public Ia.e f(int i3) {
        return new Ia.e(k(i3) / 1000.0f, 0.0f);
    }

    public n g() {
        return this.f22233d;
    }

    public Ia.e h(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(23993));
    }

    public final int hashCode() {
        return this.f22230a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:16:0x000e, B:18:0x001a, B:20:0x001f, B:6:0x002e, B:8:0x0035, B:10:0x003f, B:5:0x0028), top: B:15:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float i() {
        /*
            r4 = this;
            float r0 = r4.f22236g
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5b
            r0 = 32
            aa.b r1 = r4.f22231b
            if (r1 == 0) goto L28
            oa.d r2 = r4.f22230a     // Catch: java.lang.Exception -> L26
            oa.j r3 = oa.j.t3     // Catch: java.lang.Exception -> L26
            java.util.Map r2 = r2.f18397a     // Catch: java.lang.Exception -> L26
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L28
            int r1 = r1.f9340l     // Catch: java.lang.Exception -> L26
            r2 = -1
            if (r1 <= r2) goto L2e
            float r1 = r4.k(r1)     // Catch: java.lang.Exception -> L26
            r4.f22236g = r1     // Catch: java.lang.Exception -> L26
            goto L2e
        L26:
            r0 = move-exception
            goto L46
        L28:
            float r1 = r4.k(r0)     // Catch: java.lang.Exception -> L26
            r4.f22236g = r1     // Catch: java.lang.Exception -> L26
        L2e:
            float r1 = r4.f22236g     // Catch: java.lang.Exception -> L26
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L5b
            float r0 = r4.c(r0)     // Catch: java.lang.Exception -> L26
            r4.f22236g = r0     // Catch: java.lang.Exception -> L26
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L5b
            float r0 = r4.e()     // Catch: java.lang.Exception -> L26
            r4.f22236g = r0     // Catch: java.lang.Exception -> L26
            goto L5b
        L46:
            r1 = 948(0x3b4, float:1.328E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 23994(0x5dba, float:3.3623E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            android.util.Log.e(r1, r2, r0)
            r0 = 1132068864(0x437a0000, float:250.0)
            r4.f22236g = r0
        L5b:
            float r0 = r4.f22236g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.m.i():float");
    }

    public abstract float j(int i3);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r2.f18397a.containsKey(oa.j.f18545g2) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float k(int r7) {
        /*
            r6 = this;
            java.util.AbstractMap r0 = r6.f22237h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L13
            float r7 = r1.floatValue()
            return r7
        L13:
            oa.j r1 = oa.j.f18460I3
            oa.d r2 = r6.f22230a
            oa.b r1 = r2.J(r1)
            if (r1 != 0) goto L27
            oa.j r1 = oa.j.f18545g2
            java.util.Map r3 = r2.f18397a
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L7e
        L27:
            oa.j r1 = oa.j.f18540f1
            r3 = 0
            r4 = -1
            int r1 = r2.N(r1, r3, r4)
            oa.j r5 = oa.j.f18488P1
            int r2 = r2.N(r5, r3, r4)
            java.util.List r3 = r6.l()
            int r3 = r3.size()
            int r4 = r7 - r1
            r5 = 0
            if (r3 <= 0) goto L64
            if (r7 < r1) goto L64
            if (r7 > r2) goto L64
            if (r4 >= r3) goto L64
            java.util.List r1 = r6.l()
            java.lang.Object r1 = r1.get(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 != 0) goto L58
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L58:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r1)
            float r7 = r1.floatValue()
            return r7
        L64:
            wa.n r1 = r6.g()
            if (r1 == 0) goto L7e
            oa.j r2 = oa.j.f18545g2
            oa.d r1 = r1.f22238a
            float r1 = r1.M(r2, r5)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r2)
            return r1
        L7e:
            boolean r1 = r6.m()
            if (r1 == 0) goto L94
            float r1 = r6.j(r7)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r2)
            return r1
        L94:
            float r1 = r6.c(r7)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.m.k(int):float");
    }

    public final List l() {
        if (this.f22234e == null) {
            C1468a F3 = this.f22230a.F(oa.j.f18460I3);
            if (F3 != null) {
                ArrayList arrayList = F3.f18393a;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    AbstractC1469b G4 = F3.G(i3);
                    if (G4 instanceof oa.l) {
                        arrayList2.add(Float.valueOf(((oa.l) G4).a()));
                    } else {
                        arrayList2.add(null);
                    }
                }
                this.f22234e = new C1741a(arrayList2, F3);
            } else {
                this.f22234e = Collections.EMPTY_LIST;
            }
        }
        return this.f22234e;
    }

    public abstract boolean m();

    public abstract boolean n();

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f22230a;
    }

    public abstract int q(ByteArrayInputStream byteArrayInputStream);

    public String r(int i3) {
        C0395b c0395b = this.f22231b;
        if (c0395b == null) {
            return null;
        }
        String str = c0395b.f9331b;
        HashMap hashMap = c0395b.f9337h;
        return (str != null && str.startsWith(StubApp.getString2(23995)) && ((this.f22230a.J(oa.j.t3) instanceof oa.j) || hashMap.isEmpty())) ? new String(new char[]{(char) i3}) : (String) hashMap.get(Integer.valueOf(i3));
    }

    public String s(int i3, C1936d c1936d) {
        return r(i3);
    }

    public String toString() {
        return getClass().getSimpleName() + StubApp.getString2(397) + getName();
    }

    public m(C1471d c1471d) {
        n f10;
        this.f22236g = -1.0f;
        this.f22230a = c1471d;
        this.f22237h = new HashMap();
        Y9.b a3 = w.a(getName());
        this.f22232c = a3;
        C1471d G4 = c1471d.G(oa.j.f18565m1);
        C0395b c0395b = null;
        if (G4 != null) {
            f10 = new n(G4);
        } else {
            f10 = a3 != null ? Oc.a.f(a3) : null;
        }
        this.f22233d = f10;
        String string2 = StubApp.getString2(21828);
        String string22 = StubApp.getString2(948);
        String string23 = StubApp.getString2(23989);
        AbstractC1469b J10 = c1471d.J(oa.j.t3);
        if (J10 != null) {
            try {
                c0395b = o(J10);
                if (c0395b.f9337h.isEmpty()) {
                    Log.w(string22, string23 + getName());
                    String str = c0395b.f9331b;
                    str = str == null ? "" : str;
                    String str2 = c0395b.f9333d;
                    String str3 = str2 != null ? str2 : "";
                    AbstractC1469b J11 = c1471d.J(oa.j.f18513X0);
                    if (!str.contains(string2)) {
                        if (!str3.contains(string2)) {
                            if (!oa.j.f18435D1.equals(J11)) {
                                if (oa.j.f18440E1.equals(J11)) {
                                }
                            }
                        }
                    }
                    c0395b = b.a(oa.j.f18435D1.f18626a);
                    Log.w(string22, StubApp.getString2("23990"));
                }
            } catch (IOException e10) {
                Log.e(string22, StubApp.getString2(23991) + getName(), e10);
            }
        }
        this.f22231b = c0395b;
    }
}
