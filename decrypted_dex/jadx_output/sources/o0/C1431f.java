package o0;

import com.stub.StubApp;
import java.util.Arrays;
import p0.AbstractC1482f;
import r0.AbstractC1560u;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1431f {

    /* renamed from: h, reason: collision with root package name */
    public static final C1431f f18135h = new C1431f(1, 2, 3, null, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f18136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18138c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18139d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18141f;

    /* renamed from: g, reason: collision with root package name */
    public int f18142g;

    static {
        i2.u.A(0, 1, 2, 3, 4);
        AbstractC1560u.E(5);
    }

    public C1431f(int i3, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f18136a = i3;
        this.f18137b = i10;
        this.f18138c = i11;
        this.f18139d = bArr;
        this.f18140e = i12;
        this.f18141f = i13;
    }

    public static String a(int i3) {
        return i3 != -1 ? i3 != 1 ? i3 != 2 ? i2.u.p(i3, StubApp.getString2(21534)) : StubApp.getString2(21535) : StubApp.getString2(21536) : StubApp.getString2(21537);
    }

    public static String b(int i3) {
        return i3 != -1 ? i3 != 6 ? i3 != 1 ? i3 != 2 ? i2.u.p(i3, StubApp.getString2(21538)) : StubApp.getString2(21539) : StubApp.getString2(21540) : StubApp.getString2(21541) : StubApp.getString2(21542);
    }

    public static String c(int i3) {
        return i3 != -1 ? i3 != 10 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 6 ? i3 != 7 ? i2.u.p(i3, StubApp.getString2(21543)) : StubApp.getString2(21544) : StubApp.getString2(21545) : StubApp.getString2(21546) : StubApp.getString2(21547) : StubApp.getString2(16010) : StubApp.getString2(21548) : StubApp.getString2(21549);
    }

    public static boolean e(C1431f c1431f) {
        if (c1431f == null) {
            return true;
        }
        int i3 = c1431f.f18136a;
        if (i3 != -1 && i3 != 1 && i3 != 2) {
            return false;
        }
        int i10 = c1431f.f18137b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = c1431f.f18138c;
        if ((i11 != -1 && i11 != 3) || c1431f.f18139d != null) {
            return false;
        }
        int i12 = c1431f.f18141f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = c1431f.f18140e;
        return i13 == -1 || i13 == 8;
    }

    public static int f(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 9) {
            return (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 4) {
            return 10;
        }
        if (i3 == 13) {
            return 2;
        }
        if (i3 == 16) {
            return 6;
        }
        if (i3 != 18) {
            return (i3 == 6 || i3 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f18136a == -1 || this.f18137b == -1 || this.f18138c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1431f.class == obj.getClass()) {
            C1431f c1431f = (C1431f) obj;
            if (this.f18136a == c1431f.f18136a && this.f18137b == c1431f.f18137b && this.f18138c == c1431f.f18138c && Arrays.equals(this.f18139d, c1431f.f18139d) && this.f18140e == c1431f.f18140e && this.f18141f == c1431f.f18141f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18142g == 0) {
            this.f18142g = ((((Arrays.hashCode(this.f18139d) + ((((((527 + this.f18136a) * 31) + this.f18137b) * 31) + this.f18138c) * 31)) * 31) + this.f18140e) * 31) + this.f18141f;
        }
        return this.f18142g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(21550));
        sb2.append(b(this.f18136a));
        String string2 = StubApp.getString2(81);
        sb2.append(string2);
        sb2.append(a(this.f18137b));
        sb2.append(string2);
        sb2.append(c(this.f18138c));
        sb2.append(string2);
        sb2.append(this.f18139d != null);
        sb2.append(string2);
        String string22 = StubApp.getString2(4615);
        int i3 = this.f18140e;
        if (i3 != -1) {
            str = i3 + StubApp.getString2(21551);
        } else {
            str = string22;
        }
        sb2.append(str);
        sb2.append(string2);
        int i10 = this.f18141f;
        if (i10 != -1) {
            string22 = i10 + StubApp.getString2(21552);
        }
        return AbstractC1482f.k(sb2, string22, StubApp.getString2(74));
    }
}
