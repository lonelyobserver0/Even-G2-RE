package l4;

import Z9.C0366a;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0683t2;
import com.google.android.gms.internal.measurement.C0707y1;
import com.google.android.gms.internal.measurement.C0708y2;
import com.google.android.gms.internal.measurement.C0712z1;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t.C1692e;
import t.C1696i;

/* renamed from: l4.g0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1179g0 extends A1 implements InterfaceC1175f {

    /* renamed from: d, reason: collision with root package name */
    public final C1692e f16433d;

    /* renamed from: e, reason: collision with root package name */
    public final C1692e f16434e;

    /* renamed from: f, reason: collision with root package name */
    public final C1692e f16435f;

    /* renamed from: g, reason: collision with root package name */
    public final C1692e f16436g;

    /* renamed from: h, reason: collision with root package name */
    public final C1692e f16437h;
    public final C1692e j;

    /* renamed from: k, reason: collision with root package name */
    public final C1173e0 f16438k;

    /* renamed from: l, reason: collision with root package name */
    public final C0366a f16439l;

    /* renamed from: m, reason: collision with root package name */
    public final C1692e f16440m;

    /* renamed from: n, reason: collision with root package name */
    public final C1692e f16441n;

    /* renamed from: p, reason: collision with root package name */
    public final C1692e f16442p;

    public C1179g0(F1 f12) {
        super(f12);
        this.f16433d = new C1692e(0);
        this.f16434e = new C1692e(0);
        this.f16435f = new C1692e(0);
        this.f16436g = new C1692e(0);
        this.f16437h = new C1692e(0);
        this.f16440m = new C1692e(0);
        this.f16441n = new C1692e(0);
        this.f16442p = new C1692e(0);
        this.j = new C1692e(0);
        this.f16438k = new C1173e0(this);
        this.f16439l = new C0366a(this);
    }

    public static final C1692e u(com.google.android.gms.internal.measurement.J0 j02) {
        C1692e c1692e = new C1692e(0);
        for (com.google.android.gms.internal.measurement.N0 n02 : j02.t()) {
            c1692e.put(n02.p(), n02.q());
        }
        return c1692e;
    }

    public static final EnumC1222y0 v(int i3) {
        int i10 = i3 - 1;
        if (i10 == 1) {
            return EnumC1222y0.f16684b;
        }
        if (i10 == 2) {
            return EnumC1222y0.f16685c;
        }
        if (i10 == 3) {
            return EnumC1222y0.f16686d;
        }
        if (i10 != 4) {
            return null;
        }
        return EnumC1222y0.f16687e;
    }

    public final boolean A(String str, String str2) {
        Boolean bool;
        k();
        q(str);
        if (StubApp.getString2(19427).equals(str2) || StubApp.getString2(19413).equals(str2) || StubApp.getString2(19414).equals(str2)) {
            return true;
        }
        Map map = (Map) this.f16436g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int B(String str, String str2) {
        Integer num;
        k();
        q(str);
        Map map = (Map) this.j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean C(String str) {
        k();
        q(str);
        C1692e c1692e = this.f16434e;
        if (c1692e.get(str) != null) {
            return ((Set) c1692e.get(str)).contains(StubApp.getString2(20194)) || ((Set) c1692e.get(str)).contains(StubApp.getString2(19900));
        }
        return false;
    }

    public final boolean D(String str) {
        k();
        q(str);
        C1692e c1692e = this.f16434e;
        return c1692e.get(str) != null && ((Set) c1692e.get(str)).contains(StubApp.getString2(20190));
    }

    public final boolean E(String str, EnumC1222y0 enumC1222y0) {
        k();
        q(str);
        com.google.android.gms.internal.measurement.E0 F3 = F(str);
        if (F3 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.B0 b02 : F3.p()) {
            if (enumC1222y0 == v(b02.p())) {
                return b02.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.E0 F(String str) {
        k();
        q(str);
        com.google.android.gms.internal.measurement.J0 w10 = w(str);
        if (w10 == null || !w10.B()) {
            return null;
        }
        return w10.C();
    }

    @Override // l4.InterfaceC1175f
    public final String d(String str, String str2) {
        k();
        q(str);
        Map map = (Map) this.f16433d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // l4.A1
    public final void n() {
    }

    public final EnumC1218w0 o(String str, EnumC1222y0 enumC1222y0) {
        k();
        q(str);
        com.google.android.gms.internal.measurement.E0 F3 = F(str);
        EnumC1218w0 enumC1218w0 = EnumC1218w0.f16645b;
        if (F3 != null) {
            Iterator it = F3.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.B0 b02 = (com.google.android.gms.internal.measurement.B0) it.next();
                if (v(b02.p()) == enumC1222y0) {
                    int q10 = b02.q() - 1;
                    if (q10 == 1) {
                        return EnumC1218w0.f16648e;
                    }
                    if (q10 == 2) {
                        return EnumC1218w0.f16647d;
                    }
                }
            }
        }
        return enumC1218w0;
    }

    public final boolean p(String str) {
        k();
        q(str);
        com.google.android.gms.internal.measurement.E0 F3 = F(str);
        if (F3 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.B0 b02 : F3.p()) {
            if (b02.p() == 3 && b02.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void q(String str) {
        l();
        k();
        S3.D.e(str);
        C1692e c1692e = this.f16437h;
        if (c1692e.get(str) == null) {
            C1199n c1199n = this.f16651b.f16061c;
            F1.S(c1199n);
            a5.c s02 = c1199n.s0(str);
            C1692e c1692e2 = this.f16442p;
            C1692e c1692e3 = this.f16441n;
            C1692e c1692e4 = this.f16440m;
            C1692e c1692e5 = this.f16433d;
            if (s02 != null) {
                com.google.android.gms.internal.measurement.I0 i02 = (com.google.android.gms.internal.measurement.I0) t(str, (byte[]) s02.f9282b).i();
                r(str, i02);
                c1692e5.put(str, u((com.google.android.gms.internal.measurement.J0) i02.e()));
                c1692e.put(str, (com.google.android.gms.internal.measurement.J0) i02.e());
                s(str, (com.google.android.gms.internal.measurement.J0) i02.e());
                c1692e4.put(str, ((com.google.android.gms.internal.measurement.J0) i02.f11593b).A());
                c1692e3.put(str, (String) s02.f9283c);
                c1692e2.put(str, (String) s02.f9284d);
                return;
            }
            c1692e5.put(str, null);
            this.f16435f.put(str, null);
            this.f16434e.put(str, null);
            this.f16436g.put(str, null);
            c1692e.put(str, null);
            c1692e4.put(str, null);
            c1692e3.put(str, null);
            c1692e2.put(str, null);
            this.j.put(str, null);
        }
    }

    public final void r(String str, com.google.android.gms.internal.measurement.I0 i02) {
        HashSet hashSet = new HashSet();
        C1692e c1692e = new C1692e(0);
        C1692e c1692e2 = new C1692e(0);
        C1692e c1692e3 = new C1692e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.J0) i02.f11593b).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.F0) it.next()).p());
        }
        for (int i3 = 0; i3 < ((com.google.android.gms.internal.measurement.J0) i02.f11593b).u(); i3++) {
            com.google.android.gms.internal.measurement.G0 g02 = (com.google.android.gms.internal.measurement.G0) ((com.google.android.gms.internal.measurement.J0) i02.f11593b).v(i3).i();
            boolean isEmpty = g02.h().isEmpty();
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            if (isEmpty) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.b(StubApp.getString2(20417));
            } else {
                String h2 = g02.h();
                String g10 = A0.g(A0.f15899a, g02.h(), A0.f15901c);
                if (!TextUtils.isEmpty(g10)) {
                    g02.b();
                    ((com.google.android.gms.internal.measurement.H0) g02.f11593b).w(g10);
                    i02.b();
                    ((com.google.android.gms.internal.measurement.J0) i02.f11593b).H(i3, (com.google.android.gms.internal.measurement.H0) g02.e());
                }
                if (((com.google.android.gms.internal.measurement.H0) g02.f11593b).q() && ((com.google.android.gms.internal.measurement.H0) g02.f11593b).r()) {
                    c1692e.put(h2, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.H0) g02.f11593b).s() && ((com.google.android.gms.internal.measurement.H0) g02.f11593b).t()) {
                    c1692e2.put(g02.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.H0) g02.f11593b).u()) {
                    if (((com.google.android.gms.internal.measurement.H0) g02.f11593b).v() < 2 || ((com.google.android.gms.internal.measurement.H0) g02.f11593b).v() > 65535) {
                        T t10 = c1200n0.f16541f;
                        C1200n0.l(t10);
                        String h4 = g02.h();
                        Integer valueOf = Integer.valueOf(((com.google.android.gms.internal.measurement.H0) g02.f11593b).v());
                        t10.j.d(StubApp.getString2(20418), h4, valueOf);
                    } else {
                        c1692e3.put(g02.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.H0) g02.f11593b).v()));
                    }
                }
            }
        }
        this.f16434e.put(str, hashSet);
        this.f16435f.put(str, c1692e);
        this.f16436g.put(str, c1692e2);
        this.j.put(str, c1692e3);
    }

    public final void s(String key, com.google.android.gms.internal.measurement.J0 j02) {
        Object oldValue;
        int i3 = 2;
        int i10 = 0;
        if (j02.y() == 0) {
            C1173e0 c1173e0 = this.f16438k;
            c1173e0.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (c1173e0.f21034c) {
                try {
                    u.b bVar = c1173e0.f21033b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    oldValue = bVar.f21384a.remove(key);
                    if (oldValue != null) {
                        int i11 = c1173e0.f21035d;
                        C1696i.d(key, oldValue);
                        c1173e0.f21035d = i11 - 1;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oldValue != null) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "oldValue");
                return;
            }
            return;
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16249p.c(Integer.valueOf(j02.y()), StubApp.getString2(20419));
        C0712z1 c0712z1 = (C0712z1) j02.x().get(0);
        try {
            com.google.android.gms.internal.measurement.D d8 = new com.google.android.gms.internal.measurement.D();
            ((HashMap) ((C0708y2) d8.f11242a.f1343d).f11771a).put(StubApp.getString2("20414"), new CallableC1176f0(this, key, i3));
            ((HashMap) ((C0708y2) d8.f11242a.f1343d).f11771a).put(StubApp.getString2("11767"), new CallableC1176f0(this, key, i10));
            ((HashMap) ((C0708y2) d8.f11242a.f1343d).f11771a).put(StubApp.getString2("11763"), new M9.b(this, i3));
            d8.b(c0712z1);
            this.f16438k.c(key, d8);
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16249p.d(StubApp.getString2("20420"), key, Integer.valueOf(c0712z1.q().q()));
            for (C0707y1 c0707y1 : c0712z1.q().p()) {
                T t11 = c1200n0.f16541f;
                C1200n0.l(t11);
                t11.f16249p.c(c0707y1.p(), StubApp.getString2("20421"));
            }
        } catch (com.google.android.gms.internal.measurement.P unused) {
            T t12 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t12);
            t12.f16242f.c(key, StubApp.getString2(20422));
        }
    }

    public final com.google.android.gms.internal.measurement.J0 t(String str, byte[] bArr) {
        String string2 = StubApp.getString2(20423);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.J0.G();
        }
        try {
            com.google.android.gms.internal.measurement.J0 j02 = (com.google.android.gms.internal.measurement.J0) ((com.google.android.gms.internal.measurement.I0) W.X(com.google.android.gms.internal.measurement.J0.F(), bArr)).e();
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.d(StubApp.getString2("20424"), j02.p() ? Long.valueOf(j02.q()) : null, j02.r() ? j02.s() : null);
            return j02;
        } catch (C0683t2 e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.j.d(string2, T.s(str), e10);
            return com.google.android.gms.internal.measurement.J0.G();
        } catch (RuntimeException e11) {
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.j.d(string2, T.s(str), e11);
            return com.google.android.gms.internal.measurement.J0.G();
        }
    }

    public final com.google.android.gms.internal.measurement.J0 w(String str) {
        l();
        k();
        S3.D.e(str);
        q(str);
        return (com.google.android.gms.internal.measurement.J0) this.f16437h.get(str);
    }

    public final String x(String str) {
        k();
        q(str);
        return (String) this.f16440m.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04b2, code lost:
    
        r9.l();
        r9.k();
        S3.D.e(r29);
        r0 = r9.b0();
        r0.delete(r13, r11, new java.lang.String[]{r29, java.lang.String.valueOf(r25)});
        r0.delete(r12, r11, new java.lang.String[]{r29, java.lang.String.valueOf(r25)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04d5, code lost:
    
        r1 = r23;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x037c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0303, code lost:
    
        r0 = r5.f16541f;
        l4.C1200n0.l(r0);
        r0 = r0.j;
        r1 = com.stub.StubApp.getString2("20430");
        r3 = l4.T.s(r29);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x031c, code lost:
    
        if (r14.p() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x031e, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x032b, code lost:
    
        r0.e(r1, r3, r4, java.lang.String.valueOf(r5));
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x032a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03c8, code lost:
    
        r25 = r7;
        r7 = r22.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d6, code lost:
    
        if (r7.hasNext() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03d8, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.C0711z0) r7.next();
        r9.l();
        r9.k();
        S3.D.e(r29);
        S3.D.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f2, code lost:
    
        if (r8.r().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0422, code lost:
    
        r14 = r8.a();
        r22 = r7;
        r7 = new android.content.ContentValues();
        r7.put(r3, r29);
        r26 = r3;
        r7.put(r1, java.lang.Integer.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x043d, code lost:
    
        if (r8.p() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x043f, code lost:
    
        r3 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0449, code lost:
    
        r7.put(r0, r3);
        r27 = r0;
        r7.put(com.stub.StubApp.getString2("20295"), r8.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x045f, code lost:
    
        if (r8.v() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0461, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x046b, code lost:
    
        r7.put(r15, r0);
        r7.put(r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x047d, code lost:
    
        if (r9.b0().insertWithOnConflict(r13, null, r7, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0496, code lost:
    
        r7 = r22;
        r3 = r26;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x047f, code lost:
    
        r0 = r5.f16541f;
        l4.C1200n0.l(r0);
        r0.f16242f.c(l4.T.s(r29), com.stub.StubApp.getString2("20434"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0494, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x049e, code lost:
    
        r1 = r5.f16541f;
        l4.C1200n0.l(r1);
        r1.f16242f.d(com.stub.StubApp.getString2("20435"), l4.T.s(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x046a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0448, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f4, code lost:
    
        r0 = r5.f16541f;
        l4.C1200n0.l(r0);
        r0 = r0.j;
        r1 = com.stub.StubApp.getString2("20433");
        r3 = l4.T.s(r29);
        r4 = java.lang.Integer.valueOf(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x040d, code lost:
    
        if (r8.p() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x040f, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0419, code lost:
    
        r0.e(r1, r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0418, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027a, code lost:
    
        r8 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0286, code lost:
    
        if (r8.hasNext() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0292, code lost:
    
        if (((com.google.android.gms.internal.measurement.C0711z0) r8.next()).p() != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0294, code lost:
    
        r0 = r5.f16541f;
        l4.C1200n0.l(r0);
        r0.j.d(com.stub.StubApp.getString2("20428"), l4.T.s(r29), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ae, code lost:
    
        r8 = r0.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b6, code lost:
    
        r14 = r8.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ba, code lost:
    
        r4 = com.stub.StubApp.getString2(1485);
        r15 = com.stub.StubApp.getString2(20429);
        r22 = r0;
        r0 = com.stub.StubApp.getString2(20294);
        r23 = r1;
        r1 = com.stub.StubApp.getString2(20285);
        r24 = r3;
        r3 = com.stub.StubApp.getString2(3132);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e5, code lost:
    
        if (r14 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e7, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.C0676s0) r8.next();
        r9.l();
        r9.k();
        S3.D.e(r29);
        S3.D.h(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0301, code lost:
    
        if (r14.r().isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0336, code lost:
    
        r25 = r7;
        r7 = r14.a();
        r26 = r8;
        r8 = new android.content.ContentValues();
        r8.put(r3, r29);
        r8.put(r1, java.lang.Integer.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0351, code lost:
    
        if (r14.p() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0353, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035d, code lost:
    
        r8.put(r0, r1);
        r8.put(com.stub.StubApp.getString2("20352"), r14.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0371, code lost:
    
        if (r14.z() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0373, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x037d, code lost:
    
        r8.put(r15, r0);
        r8.put(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x038f, code lost:
    
        if (r9.b0().insertWithOnConflict(r12, null, r8, 5) != (-1)) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0391, code lost:
    
        r0 = r5.f16541f;
        l4.C1200n0.l(r0);
        r0.f16242f.c(l4.T.s(r29), com.stub.StubApp.getString2("20431"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03a5, code lost:
    
        r0 = r22;
        r1 = r23;
        r3 = r24;
        r7 = r25;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b2, code lost:
    
        r1 = r5.f16541f;
        l4.C1200n0.l(r1);
        r1.f16242f.d(com.stub.StubApp.getString2("20432"), l4.T.s(r29), r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r29, java.lang.String r30, java.lang.String r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1179g0.y(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean z(String str, String str2) {
        Boolean bool;
        k();
        q(str);
        String d8 = d(str, StubApp.getString2(19694));
        String string2 = StubApp.getString2(878);
        if (string2.equals(d8) && K1.I(str2)) {
            return true;
        }
        if (string2.equals(d(str, StubApp.getString2(19695))) && K1.i0(str2)) {
            return true;
        }
        Map map = (Map) this.f16435f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
