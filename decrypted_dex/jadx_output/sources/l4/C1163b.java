package l4;

import com.google.android.gms.internal.measurement.AbstractC0639k2;
import com.google.android.gms.internal.measurement.C0676s0;
import com.google.android.gms.internal.measurement.C0686u0;
import com.google.android.gms.internal.measurement.C0689u3;
import com.google.android.gms.internal.measurement.C0697w1;
import com.google.android.gms.internal.measurement.C0701x0;
import com.google.android.gms.internal.measurement.C0711z0;
import com.stub.StubApp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1163b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16357b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f16358c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f16359d;

    /* renamed from: e, reason: collision with root package name */
    public Long f16360e;

    /* renamed from: f, reason: collision with root package name */
    public Long f16361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1166c f16363h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0639k2 f16364i;

    public C1163b(String str, int i3) {
        this.f16356a = str;
        this.f16357b = i3;
    }

    public static Boolean c(Boolean bool, boolean z2) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.A0 a02, T t3) {
        List u2;
        S3.D.h(a02);
        if (str != null && a02.p() && a02.x() != 1 && (a02.x() != 7 ? a02.q() : a02.v() != 0)) {
            int x7 = a02.x();
            boolean t10 = a02.t();
            String r8 = (t10 || x7 == 2 || x7 == 7) ? a02.r() : a02.r().toUpperCase(Locale.ENGLISH);
            if (a02.v() == 0) {
                u2 = null;
            } else {
                u2 = a02.u();
                if (!t10) {
                    ArrayList arrayList = new ArrayList(u2.size());
                    Iterator it = u2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    u2 = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = x7 == 2 ? r8 : null;
            if (x7 != 7 ? r8 != null : u2 != null && !u2.isEmpty()) {
                if (!t10 && x7 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (x7 - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != t10 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (t3 != null) {
                                    t3.j.c(str2, StubApp.getString2(20349));
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(r8));
                    case 3:
                        return Boolean.valueOf(str.endsWith(r8));
                    case 4:
                        return Boolean.valueOf(str.contains(r8));
                    case 5:
                        return Boolean.valueOf(str.equals(r8));
                    case 6:
                        if (u2 != null) {
                            return Boolean.valueOf(u2.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(long j, C0701x0 c0701x0) {
        try {
            return f(new BigDecimal(j), c0701x0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(BigDecimal bigDecimal, C0701x0 c0701x0, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        S3.D.h(c0701x0);
        if (c0701x0.p()) {
            if (c0701x0.z() != 1 && (c0701x0.z() != 5 ? c0701x0.s() : c0701x0.u() && c0701x0.w())) {
                int z2 = c0701x0.z();
                try {
                    if (c0701x0.z() == 5) {
                        if (W.Q(c0701x0.v()) && W.Q(c0701x0.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c0701x0.v());
                            bigDecimal4 = new BigDecimal(c0701x0.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (W.Q(c0701x0.t())) {
                        bigDecimal2 = new BigDecimal(c0701x0.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (z2 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i3 = z2 - 1;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d8 != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x02f7, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02d8, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0432 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.C0613f1 r21, long r22, l4.C1209s r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1163b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.f1, long, l4.s, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b(Long l9, Long l10, C0697w1 c0697w1, boolean z2) {
        C0689u3.a();
        C1200n0 c1200n0 = (C1200n0) this.f16363h.f4728a;
        boolean u2 = c1200n0.f16539d.u(this.f16356a, AbstractC1148D.f15929D0);
        C0711z0 c0711z0 = (C0711z0) this.f16364i;
        boolean t3 = c0711z0.t();
        boolean u10 = c0711z0.u();
        boolean w10 = c0711z0.w();
        Object[] objArr = t3 || u10 || w10;
        Boolean bool = null;
        r4 = null;
        Boolean bool2 = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean f10 = null;
        bool = null;
        T t10 = c1200n0.f16541f;
        if (z2 && objArr != true) {
            C1200n0.l(t10);
            t10.f16249p.d(StubApp.getString2(20369), Integer.valueOf(this.f16357b), c0711z0.p() ? Integer.valueOf(c0711z0.q()) : null);
            return true;
        }
        C0686u0 s10 = c0711z0.s();
        boolean u11 = s10.u();
        boolean u12 = c0697w1.u();
        C1159O c1159o = c1200n0.f16544k;
        if (u12) {
            if (s10.r()) {
                bool = c(e(c0697w1.v(), s10.s()), u11);
            } else {
                C1200n0.l(t10);
                t10.j.c(c1159o.c(c0697w1.r()), StubApp.getString2(20370));
            }
        } else if (c0697w1.y()) {
            if (s10.r()) {
                double z10 = c0697w1.z();
                try {
                    bool2 = f(new BigDecimal(z10), s10.s(), Math.ulp(z10));
                } catch (NumberFormatException unused) {
                }
                bool = c(bool2, u11);
            } else {
                C1200n0.l(t10);
                t10.j.c(c1159o.c(c0697w1.r()), StubApp.getString2(20371));
            }
        } else if (!c0697w1.s()) {
            C1200n0.l(t10);
            t10.j.c(c1159o.c(c0697w1.r()), StubApp.getString2(20374));
        } else if (s10.p()) {
            String t11 = c0697w1.t();
            com.google.android.gms.internal.measurement.A0 q10 = s10.q();
            C1200n0.l(t10);
            bool = c(d(t11, q10, t10), u11);
        } else if (!s10.r()) {
            C1200n0.l(t10);
            t10.j.c(c1159o.c(c0697w1.r()), StubApp.getString2(20372));
        } else if (W.Q(c0697w1.t())) {
            String t12 = c0697w1.t();
            C0701x0 s11 = s10.s();
            if (W.Q(t12)) {
                try {
                    f10 = f(new BigDecimal(t12), s11, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            bool = c(f10, u11);
        } else {
            C1200n0.l(t10);
            t10.j.d(StubApp.getString2(20373), c1159o.c(c0697w1.r()), c0697w1.t());
        }
        C1200n0.l(t10);
        t10.f16249p.c(bool == null ? StubApp.getString2(1116) : bool, StubApp.getString2(20375));
        if (bool == null) {
            return false;
        }
        this.f16358c = Boolean.TRUE;
        if (!w10 || bool.booleanValue()) {
            if (!z2 || c0711z0.t()) {
                this.f16359d = bool;
            }
            if (bool.booleanValue() && objArr != false && c0697w1.p()) {
                long q11 = c0697w1.q();
                if (l9 != null) {
                    q11 = l9.longValue();
                }
                if (u2 && c0711z0.t() && !c0711z0.u() && l10 != null) {
                    q11 = l10.longValue();
                }
                if (c0711z0.u()) {
                    this.f16361f = Long.valueOf(q11);
                } else {
                    this.f16360e = Long.valueOf(q11);
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1163b(C1166c c1166c, String str, int i3, C0676s0 c0676s0) {
        this(str, i3);
        this.f16362g = 0;
        Objects.requireNonNull(c1166c);
        this.f16363h = c1166c;
        this.f16364i = c0676s0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1163b(C1166c c1166c, String str, int i3, C0711z0 c0711z0) {
        this(str, i3);
        this.f16362g = 1;
        Objects.requireNonNull(c1166c);
        this.f16363h = c1166c;
        this.f16364i = c0711z0;
    }
}
