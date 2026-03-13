package o0;

import android.text.TextUtils;
import com.stub.StubApp;
import g5.C0955a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import w.AbstractC1856e;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1438m {

    /* renamed from: A, reason: collision with root package name */
    public final int f18191A;

    /* renamed from: B, reason: collision with root package name */
    public final C1431f f18192B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18193C;

    /* renamed from: D, reason: collision with root package name */
    public final int f18194D;

    /* renamed from: E, reason: collision with root package name */
    public final int f18195E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18196F;

    /* renamed from: G, reason: collision with root package name */
    public final int f18197G;

    /* renamed from: H, reason: collision with root package name */
    public final int f18198H;

    /* renamed from: I, reason: collision with root package name */
    public final int f18199I;

    /* renamed from: J, reason: collision with root package name */
    public final int f18200J;

    /* renamed from: K, reason: collision with root package name */
    public final int f18201K;

    /* renamed from: L, reason: collision with root package name */
    public final int f18202L;

    /* renamed from: M, reason: collision with root package name */
    public int f18203M;

    /* renamed from: a, reason: collision with root package name */
    public final String f18204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18205b;

    /* renamed from: c, reason: collision with root package name */
    public final M4.I f18206c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18207d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18208e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18209f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18210g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18211h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18212i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18213k;

    /* renamed from: l, reason: collision with root package name */
    public final C1404A f18214l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18215m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18216n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18217o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18218p;

    /* renamed from: q, reason: collision with root package name */
    public final List f18219q;

    /* renamed from: r, reason: collision with root package name */
    public final C1435j f18220r;

    /* renamed from: s, reason: collision with root package name */
    public final long f18221s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18222t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18223u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18224v;

    /* renamed from: w, reason: collision with root package name */
    public final float f18225w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18226x;

    /* renamed from: y, reason: collision with root package name */
    public final float f18227y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f18228z;

    static {
        new C1437l().a();
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
        i2.u.A(5, 6, 7, 8, 9);
        i2.u.A(10, 11, 12, 13, 14);
        i2.u.A(15, 16, 17, 18, 19);
        i2.u.A(20, 21, 22, 23, 24);
        i2.u.A(25, 26, 27, 28, 29);
        AbstractC1560u.E(30);
        AbstractC1560u.E(31);
        AbstractC1560u.E(32);
        AbstractC1560u.E(33);
    }

    public C1438m(C1437l c1437l) {
        boolean z2;
        String str;
        this.f18204a = c1437l.f18166a;
        String K10 = AbstractC1560u.K(c1437l.f18169d);
        this.f18207d = K10;
        if (c1437l.f18168c.isEmpty() && c1437l.f18167b != null) {
            this.f18206c = M4.I.q(new C1439n(K10, c1437l.f18167b));
            this.f18205b = c1437l.f18167b;
        } else if (c1437l.f18168c.isEmpty() || c1437l.f18167b != null) {
            if (!c1437l.f18168c.isEmpty() || c1437l.f18167b != null) {
                for (int i3 = 0; i3 < c1437l.f18168c.size(); i3++) {
                    if (!((C1439n) c1437l.f18168c.get(i3)).f18230b.equals(c1437l.f18167b)) {
                    }
                }
                z2 = false;
                AbstractC1550k.g(z2);
                this.f18206c = c1437l.f18168c;
                this.f18205b = c1437l.f18167b;
            }
            z2 = true;
            AbstractC1550k.g(z2);
            this.f18206c = c1437l.f18168c;
            this.f18205b = c1437l.f18167b;
        } else {
            M4.I i10 = c1437l.f18168c;
            this.f18206c = i10;
            Iterator it = i10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C1439n) i10.get(0)).f18230b;
                    break;
                }
                C1439n c1439n = (C1439n) it.next();
                if (TextUtils.equals(c1439n.f18229a, K10)) {
                    str = c1439n.f18230b;
                    break;
                }
            }
            this.f18205b = str;
        }
        this.f18208e = c1437l.f18170e;
        AbstractC1550k.f(StubApp.getString2(21553), c1437l.f18172g == 0 || (c1437l.f18171f & 32768) != 0);
        this.f18209f = c1437l.f18171f;
        this.f18210g = c1437l.f18172g;
        int i11 = c1437l.f18173h;
        this.f18211h = i11;
        int i12 = c1437l.f18174i;
        this.f18212i = i12;
        this.j = i12 != -1 ? i12 : i11;
        this.f18213k = c1437l.j;
        this.f18214l = c1437l.f18175k;
        this.f18215m = c1437l.f18176l;
        this.f18216n = c1437l.f18177m;
        this.f18217o = c1437l.f18178n;
        this.f18218p = c1437l.f18179o;
        List list = c1437l.f18180p;
        this.f18219q = list == null ? Collections.EMPTY_LIST : list;
        C1435j c1435j = c1437l.f18181q;
        this.f18220r = c1435j;
        this.f18221s = c1437l.f18182r;
        this.f18222t = c1437l.f18183s;
        this.f18223u = c1437l.f18184t;
        this.f18224v = c1437l.f18185u;
        this.f18225w = c1437l.f18186v;
        int i13 = c1437l.f18187w;
        this.f18226x = i13 == -1 ? 0 : i13;
        float f10 = c1437l.f18188x;
        this.f18227y = f10 == -1.0f ? 1.0f : f10;
        this.f18228z = c1437l.f18189y;
        this.f18191A = c1437l.f18190z;
        this.f18192B = c1437l.f18155A;
        this.f18193C = c1437l.f18156B;
        this.f18194D = c1437l.f18157C;
        this.f18195E = c1437l.f18158D;
        int i14 = c1437l.f18159E;
        this.f18196F = i14 == -1 ? 0 : i14;
        int i15 = c1437l.f18160F;
        this.f18197G = i15 != -1 ? i15 : 0;
        this.f18198H = c1437l.f18161G;
        this.f18199I = c1437l.f18162H;
        this.f18200J = c1437l.f18163I;
        this.f18201K = c1437l.f18164J;
        int i16 = c1437l.f18165K;
        if (i16 != 0 || c1435j == null) {
            this.f18202L = i16;
        } else {
            this.f18202L = 1;
        }
    }

    public static String c(C1438m c1438m) {
        String string2;
        String string22;
        int i3;
        if (c1438m == null) {
            return StubApp.getString2(1116);
        }
        A0.c cVar = new A0.c(String.valueOf(','));
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(21554));
        b2.append(c1438m.f18204a);
        b2.append(StubApp.getString2(21555));
        b2.append(c1438m.f18216n);
        String str = c1438m.f18215m;
        if (str != null) {
            b2.append(StubApp.getString2(21556));
            b2.append(str);
        }
        int i10 = c1438m.j;
        if (i10 != -1) {
            b2.append(StubApp.getString2(21557));
            b2.append(i10);
        }
        String str2 = c1438m.f18213k;
        if (str2 != null) {
            b2.append(StubApp.getString2(21558));
            b2.append(str2);
        }
        C1435j c1435j = c1438m.f18220r;
        if (c1435j != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i11 = 0; i11 < c1435j.f18153d; i11++) {
                UUID uuid = c1435j.f18150a[i11].f18146b;
                if (uuid.equals(AbstractC1430e.f18131b)) {
                    linkedHashSet.add(StubApp.getString2(907));
                } else if (uuid.equals(AbstractC1430e.f18132c)) {
                    linkedHashSet.add(StubApp.getString2(21559));
                } else if (uuid.equals(AbstractC1430e.f18134e)) {
                    linkedHashSet.add(StubApp.getString2(21560));
                } else if (uuid.equals(AbstractC1430e.f18133d)) {
                    linkedHashSet.add(StubApp.getString2(21561));
                } else if (uuid.equals(AbstractC1430e.f18130a)) {
                    linkedHashSet.add(StubApp.getString2(21562));
                } else {
                    linkedHashSet.add(StubApp.getString2(21563) + uuid + StubApp.getString2(74));
                }
            }
            b2.append(StubApp.getString2(21564));
            cVar.e(b2, linkedHashSet.iterator());
            b2.append(']');
        }
        int i12 = c1438m.f18223u;
        if (i12 != -1 && (i3 = c1438m.f18224v) != -1) {
            b2.append(StubApp.getString2(21565));
            b2.append(i12);
            b2.append(StubApp.getString2(925));
            b2.append(i3);
        }
        float f10 = c1438m.f18227y;
        double d8 = f10;
        int i13 = O4.c.f5206a;
        if (Math.copySign(d8 - 1.0d, 1.0d) > 0.001d && d8 != 1.0d && (!Double.isNaN(d8) || !Double.isNaN(1.0d))) {
            b2.append(StubApp.getString2(21566));
            Object[] objArr = {Float.valueOf(f10)};
            int i14 = AbstractC1560u.f20190a;
            b2.append(String.format(Locale.US, StubApp.getString2(21567), objArr));
        }
        C1431f c1431f = c1438m.f18192B;
        if (c1431f != null) {
            int i15 = c1431f.f18141f;
            int i16 = c1431f.f18140e;
            if ((i16 != -1 && i15 != -1) || c1431f.d()) {
                b2.append(StubApp.getString2(21568));
                boolean d10 = c1431f.d();
                String string23 = StubApp.getString2(601);
                if (d10) {
                    String b10 = C1431f.b(c1431f.f18136a);
                    String a3 = C1431f.a(c1431f.f18137b);
                    String c10 = C1431f.c(c1431f.f18138c);
                    Locale locale = Locale.US;
                    string22 = b10 + string23 + a3 + string23 + c10;
                } else {
                    string22 = StubApp.getString2(21569);
                }
                b2.append(string22 + string23 + ((i16 == -1 || i15 == -1) ? StubApp.getString2(21570) : i16 + string23 + i15));
            }
        }
        float f11 = c1438m.f18225w;
        if (f11 != -1.0f) {
            b2.append(StubApp.getString2(21571));
            b2.append(f11);
        }
        int i17 = c1438m.f18193C;
        if (i17 != -1) {
            b2.append(StubApp.getString2(6820));
            b2.append(i17);
        }
        int i18 = c1438m.f18194D;
        if (i18 != -1) {
            b2.append(StubApp.getString2(21572));
            b2.append(i18);
        }
        String str3 = c1438m.f18207d;
        if (str3 != null) {
            b2.append(StubApp.getString2(6716));
            b2.append(str3);
        }
        M4.I i19 = c1438m.f18206c;
        boolean isEmpty = i19.isEmpty();
        String string24 = StubApp.getString2(511);
        if (!isEmpty) {
            b2.append(StubApp.getString2(21573));
            cVar.e(b2, M4.r.u(i19, new C0955a(13)).iterator());
            b2.append(string24);
        }
        int i20 = c1438m.f18208e;
        if (i20 != 0) {
            b2.append(StubApp.getString2(21574));
            int i21 = AbstractC1560u.f20190a;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 4) != 0) {
                arrayList.add(StubApp.getString2(3305));
            }
            if ((i20 & 1) != 0) {
                arrayList.add(StubApp.getString2(5107));
            }
            if ((i20 & 2) != 0) {
                arrayList.add(StubApp.getString2(21575));
            }
            cVar.e(b2, arrayList.iterator());
            b2.append(string24);
        }
        int i22 = c1438m.f18209f;
        if (i22 != 0) {
            b2.append(StubApp.getString2(21576));
            int i23 = AbstractC1560u.f20190a;
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add(StubApp.getString2(470));
            }
            if ((i22 & 2) != 0) {
                arrayList2.add(StubApp.getString2(21577));
            }
            if ((i22 & 4) != 0) {
                arrayList2.add(StubApp.getString2(21578));
            }
            if ((i22 & 8) != 0) {
                arrayList2.add(StubApp.getString2(21579));
            }
            if ((i22 & 16) != 0) {
                arrayList2.add(StubApp.getString2(21580));
            }
            if ((i22 & 32) != 0) {
                arrayList2.add(StubApp.getString2(21581));
            }
            if ((i22 & 64) != 0) {
                arrayList2.add(StubApp.getString2(21582));
            }
            if ((i22 & 128) != 0) {
                arrayList2.add(StubApp.getString2(3711));
            }
            if ((i22 & 256) != 0) {
                arrayList2.add(StubApp.getString2(21583));
            }
            if ((i22 & 512) != 0) {
                arrayList2.add(StubApp.getString2(21584));
            }
            if ((i22 & 1024) != 0) {
                arrayList2.add(StubApp.getString2(21585));
            }
            if ((i22 & 2048) != 0) {
                arrayList2.add(StubApp.getString2(21586));
            }
            if ((i22 & 4096) != 0) {
                arrayList2.add(StubApp.getString2(21587));
            }
            if ((i22 & 8192) != 0) {
                arrayList2.add(StubApp.getString2(21588));
            }
            if ((i22 & 16384) != 0) {
                arrayList2.add(StubApp.getString2(21589));
            }
            if ((i22 & 32768) != 0) {
                arrayList2.add(StubApp.getString2(21590));
            }
            cVar.e(b2, arrayList2.iterator());
            b2.append(string24);
        }
        if ((i22 & 32768) != 0) {
            b2.append(StubApp.getString2(21591));
            int i24 = AbstractC1560u.f20190a;
            int i25 = c1438m.f18210g;
            if (i25 == 0) {
                string2 = StubApp.getString2(1146);
            } else if (i25 == 1) {
                string2 = StubApp.getString2(21596);
            } else if (i25 == 2) {
                string2 = StubApp.getString2(21595);
            } else if (i25 == 3) {
                string2 = StubApp.getString2(21594);
            } else {
                if (i25 != 4) {
                    throw new IllegalStateException(StubApp.getString2(21593));
                }
                string2 = StubApp.getString2(21592);
            }
            b2.append(string2);
        }
        return b2.toString();
    }

    public final C1437l a() {
        C1437l c1437l = new C1437l();
        c1437l.f18166a = this.f18204a;
        c1437l.f18167b = this.f18205b;
        c1437l.f18168c = this.f18206c;
        c1437l.f18169d = this.f18207d;
        c1437l.f18170e = this.f18208e;
        c1437l.f18171f = this.f18209f;
        c1437l.f18173h = this.f18211h;
        c1437l.f18174i = this.f18212i;
        c1437l.j = this.f18213k;
        c1437l.f18175k = this.f18214l;
        c1437l.f18176l = this.f18215m;
        c1437l.f18177m = this.f18216n;
        c1437l.f18178n = this.f18217o;
        c1437l.f18179o = this.f18218p;
        c1437l.f18180p = this.f18219q;
        c1437l.f18181q = this.f18220r;
        c1437l.f18182r = this.f18221s;
        c1437l.f18183s = this.f18222t;
        c1437l.f18184t = this.f18223u;
        c1437l.f18185u = this.f18224v;
        c1437l.f18186v = this.f18225w;
        c1437l.f18187w = this.f18226x;
        c1437l.f18188x = this.f18227y;
        c1437l.f18189y = this.f18228z;
        c1437l.f18190z = this.f18191A;
        c1437l.f18155A = this.f18192B;
        c1437l.f18156B = this.f18193C;
        c1437l.f18157C = this.f18194D;
        c1437l.f18158D = this.f18195E;
        c1437l.f18159E = this.f18196F;
        c1437l.f18160F = this.f18197G;
        c1437l.f18161G = this.f18198H;
        c1437l.f18162H = this.f18199I;
        c1437l.f18163I = this.f18200J;
        c1437l.f18164J = this.f18201K;
        c1437l.f18165K = this.f18202L;
        return c1437l;
    }

    public final boolean b(C1438m c1438m) {
        List list = this.f18219q;
        if (list.size() != c1438m.f18219q.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) c1438m.f18219q.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final C1438m d(C1438m c1438m) {
        String str;
        M4.I i3;
        String str2;
        C1434i[] c1434iArr;
        if (this == c1438m) {
            return this;
        }
        int h2 = AbstractC1405B.h(this.f18216n);
        String str3 = c1438m.f18204a;
        String str4 = c1438m.f18205b;
        if (str4 == null) {
            str4 = this.f18205b;
        }
        M4.I i10 = c1438m.f18206c;
        if (i10.isEmpty()) {
            i10 = this.f18206c;
        }
        if ((h2 != 3 && h2 != 1) || (str = c1438m.f18207d) == null) {
            str = this.f18207d;
        }
        int i11 = this.f18211h;
        if (i11 == -1) {
            i11 = c1438m.f18211h;
        }
        int i12 = this.f18212i;
        if (i12 == -1) {
            i12 = c1438m.f18212i;
        }
        String str5 = this.f18213k;
        if (str5 == null) {
            String t3 = AbstractC1560u.t(h2, c1438m.f18213k);
            if (AbstractC1560u.T(t3).length == 1) {
                str5 = t3;
            }
        }
        C1404A c1404a = c1438m.f18214l;
        C1404A c1404a2 = this.f18214l;
        if (c1404a2 != null) {
            c1404a = c1404a2.e(c1404a);
        }
        float f10 = this.f18225w;
        if (f10 == -1.0f && h2 == 2) {
            f10 = c1438m.f18225w;
        }
        int i13 = this.f18208e | c1438m.f18208e;
        int i14 = this.f18209f | c1438m.f18209f;
        ArrayList arrayList = new ArrayList();
        C1435j c1435j = c1438m.f18220r;
        if (c1435j != null) {
            C1434i[] c1434iArr2 = c1435j.f18150a;
            i3 = i10;
            int length = c1434iArr2.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = length;
                C1434i c1434i = c1434iArr2[i15];
                int i17 = i15;
                if (c1434i.f18149e != null) {
                    arrayList.add(c1434i);
                }
                i15 = i17 + 1;
                length = i16;
            }
            str2 = c1435j.f18152c;
        } else {
            i3 = i10;
            str2 = null;
        }
        C1435j c1435j2 = this.f18220r;
        if (c1435j2 != null) {
            if (str2 == null) {
                str2 = c1435j2.f18152c;
            }
            int size = arrayList.size();
            C1434i[] c1434iArr3 = c1435j2.f18150a;
            int length2 = c1434iArr3.length;
            String str6 = str2;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = length2;
                C1434i c1434i2 = c1434iArr3[i18];
                int i20 = i18;
                if (c1434i2.f18149e != null) {
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size) {
                            c1434iArr = c1434iArr3;
                            arrayList.add(c1434i2);
                            break;
                        }
                        int i22 = i21;
                        c1434iArr = c1434iArr3;
                        if (((C1434i) arrayList.get(i21)).f18146b.equals(c1434i2.f18146b)) {
                            break;
                        }
                        i21 = i22 + 1;
                        c1434iArr3 = c1434iArr;
                    }
                } else {
                    c1434iArr = c1434iArr3;
                }
                i18 = i20 + 1;
                length2 = i19;
                c1434iArr3 = c1434iArr;
            }
            str2 = str6;
        }
        C1435j c1435j3 = arrayList.isEmpty() ? null : new C1435j(arrayList, str2);
        C1437l a3 = a();
        a3.f18166a = str3;
        a3.f18167b = str4;
        a3.f18168c = M4.I.m(i3);
        a3.f18169d = str;
        a3.f18170e = i13;
        a3.f18171f = i14;
        a3.f18173h = i11;
        a3.f18174i = i12;
        a3.j = str5;
        a3.f18175k = c1404a;
        a3.f18181q = c1435j3;
        a3.f18186v = f10;
        a3.f18163I = c1438m.f18200J;
        a3.f18164J = c1438m.f18201K;
        return new C1438m(a3);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1438m.class != obj.getClass()) {
            return false;
        }
        C1438m c1438m = (C1438m) obj;
        int i10 = this.f18203M;
        return (i10 == 0 || (i3 = c1438m.f18203M) == 0 || i10 == i3) && this.f18208e == c1438m.f18208e && this.f18209f == c1438m.f18209f && this.f18210g == c1438m.f18210g && this.f18211h == c1438m.f18211h && this.f18212i == c1438m.f18212i && this.f18217o == c1438m.f18217o && this.f18221s == c1438m.f18221s && this.f18223u == c1438m.f18223u && this.f18224v == c1438m.f18224v && this.f18226x == c1438m.f18226x && this.f18191A == c1438m.f18191A && this.f18193C == c1438m.f18193C && this.f18194D == c1438m.f18194D && this.f18195E == c1438m.f18195E && this.f18196F == c1438m.f18196F && this.f18197G == c1438m.f18197G && this.f18198H == c1438m.f18198H && this.f18200J == c1438m.f18200J && this.f18201K == c1438m.f18201K && this.f18202L == c1438m.f18202L && Float.compare(this.f18225w, c1438m.f18225w) == 0 && Float.compare(this.f18227y, c1438m.f18227y) == 0 && Objects.equals(this.f18204a, c1438m.f18204a) && Objects.equals(this.f18205b, c1438m.f18205b) && this.f18206c.equals(c1438m.f18206c) && Objects.equals(this.f18213k, c1438m.f18213k) && Objects.equals(this.f18215m, c1438m.f18215m) && Objects.equals(this.f18216n, c1438m.f18216n) && Objects.equals(this.f18207d, c1438m.f18207d) && Arrays.equals(this.f18228z, c1438m.f18228z) && Objects.equals(this.f18214l, c1438m.f18214l) && Objects.equals(this.f18192B, c1438m.f18192B) && Objects.equals(this.f18220r, c1438m.f18220r) && b(c1438m);
    }

    public final int hashCode() {
        if (this.f18203M == 0) {
            String str = this.f18204a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18205b;
            int hashCode2 = (this.f18206c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f18207d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18208e) * 31) + this.f18209f) * 31) + this.f18210g) * 31) + this.f18211h) * 31) + this.f18212i) * 31;
            String str4 = this.f18213k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C1404A c1404a = this.f18214l;
            int hashCode5 = (hashCode4 + (c1404a == null ? 0 : c1404a.hashCode())) * 961;
            String str5 = this.f18215m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f18216n;
            this.f18203M = ((((((((((((((((((((Float.floatToIntBits(this.f18227y) + ((((Float.floatToIntBits(this.f18225w) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f18217o) * 31) + ((int) this.f18221s)) * 31) + this.f18223u) * 31) + this.f18224v) * 31)) * 31) + this.f18226x) * 31)) * 31) + this.f18191A) * 31) + this.f18193C) * 31) + this.f18194D) * 31) + this.f18195E) * 31) + this.f18196F) * 31) + this.f18197G) * 31) + this.f18198H) * 31) + this.f18200J) * 31) + this.f18201K) * 31) + this.f18202L;
        }
        return this.f18203M;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(21597));
        sb2.append(this.f18204a);
        String string2 = StubApp.getString2(81);
        sb2.append(string2);
        sb2.append(this.f18205b);
        sb2.append(string2);
        sb2.append(this.f18215m);
        sb2.append(string2);
        sb2.append(this.f18216n);
        sb2.append(string2);
        sb2.append(this.f18213k);
        sb2.append(string2);
        sb2.append(this.j);
        sb2.append(string2);
        sb2.append(this.f18207d);
        sb2.append(StubApp.getString2(1631));
        sb2.append(this.f18223u);
        sb2.append(string2);
        sb2.append(this.f18224v);
        sb2.append(string2);
        sb2.append(this.f18225w);
        sb2.append(string2);
        sb2.append(this.f18192B);
        sb2.append(StubApp.getString2(21598));
        sb2.append(this.f18193C);
        sb2.append(string2);
        return AbstractC1482f.f(this.f18194D, StubApp.getString2(6691), sb2);
    }
}
