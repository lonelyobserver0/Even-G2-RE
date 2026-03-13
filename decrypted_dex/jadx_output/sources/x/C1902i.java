package x;

import com.stub.StubApp;
import w.C1855d;
import w.C1857f;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1902i extends k {

    /* renamed from: c, reason: collision with root package name */
    public C1896c f22620c;

    /* renamed from: d, reason: collision with root package name */
    public C1902i f22621d;

    /* renamed from: e, reason: collision with root package name */
    public float f22622e;

    /* renamed from: f, reason: collision with root package name */
    public C1902i f22623f;

    /* renamed from: g, reason: collision with root package name */
    public float f22624g;

    /* renamed from: h, reason: collision with root package name */
    public int f22625h;

    /* renamed from: i, reason: collision with root package name */
    public C1902i f22626i;
    public C1903j j;

    /* renamed from: k, reason: collision with root package name */
    public int f22627k;

    /* renamed from: l, reason: collision with root package name */
    public C1903j f22628l;

    public static String l(int i3) {
        return i3 == 1 ? StubApp.getString2(24092) : i3 == 2 ? StubApp.getString2(7572) : i3 == 3 ? StubApp.getString2(24093) : i3 == 4 ? StubApp.getString2(24094) : i3 == 5 ? StubApp.getString2(24095) : StubApp.getString2(24096);
    }

    @Override // x.k
    public final void e() {
        int i3;
        C1902i c1902i;
        C1902i c1902i2;
        C1902i c1902i3;
        C1902i c1902i4;
        C1902i c1902i5;
        C1902i c1902i6;
        float f10;
        float f11;
        float k3;
        float f12;
        C1902i c1902i7;
        boolean z2 = true;
        if (this.f22631b == 1 || (i3 = this.f22625h) == 4) {
            return;
        }
        C1903j c1903j = this.j;
        if (c1903j != null) {
            if (c1903j.f22631b != 1) {
                return;
            } else {
                this.f22622e = this.f22627k * c1903j.f22629c;
            }
        }
        C1903j c1903j2 = this.f22628l;
        if (c1903j2 == null || c1903j2.f22631b == 1) {
            if (i3 == 1 && ((c1902i7 = this.f22621d) == null || c1902i7.f22631b == 1)) {
                if (c1902i7 == null) {
                    this.f22623f = this;
                    this.f22624g = this.f22622e;
                } else {
                    this.f22623f = c1902i7.f22623f;
                    this.f22624g = c1902i7.f22624g + this.f22622e;
                }
                b();
                return;
            }
            C1896c c1896c = this.f22620c;
            if (i3 != 2 || (c1902i4 = this.f22621d) == null || c1902i4.f22631b != 1 || (c1902i5 = this.f22626i) == null || (c1902i6 = c1902i5.f22621d) == null || c1902i6.f22631b != 1) {
                if (i3 != 3 || (c1902i = this.f22621d) == null || c1902i.f22631b != 1 || (c1902i2 = this.f22626i) == null || (c1902i3 = c1902i2.f22621d) == null || c1902i3.f22631b != 1) {
                    if (i3 == 5) {
                        c1896c.f22521b.r();
                        return;
                    }
                    return;
                } else {
                    this.f22623f = c1902i.f22623f;
                    c1902i2.f22623f = c1902i3.f22623f;
                    this.f22624g = c1902i.f22624g + this.f22622e;
                    c1902i2.f22624g = c1902i3.f22624g + c1902i2.f22622e;
                    b();
                    this.f22626i.b();
                    return;
                }
            }
            this.f22623f = c1902i4.f22623f;
            c1902i5.f22623f = c1902i6.f22623f;
            int i10 = c1896c.f22522c;
            int i11 = 0;
            if (i10 != 4 && i10 != 5) {
                z2 = false;
            }
            if (z2) {
                f10 = c1902i4.f22624g;
                f11 = c1902i6.f22624g;
            } else {
                f10 = c1902i6.f22624g;
                f11 = c1902i4.f22624g;
            }
            float f13 = f10 - f11;
            C1897d c1897d = c1896c.f22521b;
            if (i10 == 2 || i10 == 4) {
                k3 = f13 - c1897d.k();
                f12 = c1897d.f22549U;
            } else {
                k3 = f13 - c1897d.g();
                f12 = c1897d.f22550V;
            }
            int b2 = c1896c.b();
            int b10 = this.f22626i.f22620c.b();
            C1896c c1896c2 = c1896c.f22523d;
            C1902i c1902i8 = this.f22626i;
            if (c1896c2 == c1902i8.f22620c.f22523d) {
                f12 = 0.5f;
                b10 = 0;
            } else {
                i11 = b2;
            }
            float f14 = i11;
            float f15 = b10;
            float f16 = (k3 - f14) - f15;
            if (z2) {
                c1902i8.f22624g = (f16 * f12) + c1902i8.f22621d.f22624g + f15;
                this.f22624g = (this.f22621d.f22624g - f14) - ((1.0f - f12) * f16);
            } else {
                this.f22624g = (f16 * f12) + this.f22621d.f22624g + f14;
                c1902i8.f22624g = (c1902i8.f22621d.f22624g - f15) - ((1.0f - f12) * f16);
            }
            b();
            this.f22626i.b();
        }
    }

    public final void f(C1855d c1855d) {
        C1857f c1857f = this.f22620c.f22528i;
        C1902i c1902i = this.f22623f;
        if (c1902i == null) {
            c1855d.d(c1857f, (int) (this.f22624g + 0.5f));
        } else {
            c1855d.e(c1857f, c1855d.j(c1902i.f22620c), (int) (this.f22624g + 0.5f), 6);
        }
    }

    public final void g(C1902i c1902i, int i3) {
        this.f22625h = 1;
        this.f22621d = c1902i;
        this.f22622e = i3;
        c1902i.a(this);
    }

    public final void h(C1902i c1902i, int i3, C1903j c1903j) {
        this.f22621d = c1902i;
        c1902i.a(this);
        this.j = c1903j;
        this.f22627k = i3;
        c1903j.a(this);
    }

    public final void i(C1902i c1902i, int i3) {
        this.f22621d = c1902i;
        this.f22622e = i3;
        c1902i.a(this);
    }

    public final void j() {
        this.f22631b = 0;
        this.f22630a.clear();
        this.f22621d = null;
        this.f22622e = 0.0f;
        this.j = null;
        this.f22627k = 1;
        this.f22628l = null;
        this.f22623f = null;
        this.f22624g = 0.0f;
        this.f22626i = null;
        this.f22625h = 0;
    }

    public final void k(C1902i c1902i, float f10) {
        int i3 = this.f22631b;
        if (i3 == 0 || !(this.f22623f == c1902i || this.f22624g == f10)) {
            this.f22623f = c1902i;
            this.f22624g = f10;
            if (i3 == 1) {
                c();
            }
            b();
        }
    }

    public final String toString() {
        int i3 = this.f22631b;
        C1896c c1896c = this.f22620c;
        if (i3 != 1) {
            return StubApp.getString2(16822) + c1896c + StubApp.getString2(24100) + l(this.f22625h);
        }
        C1902i c1902i = this.f22623f;
        String string2 = StubApp.getString2(24097);
        String string22 = StubApp.getString2(1557);
        if (c1902i == this) {
            return string22 + c1896c + string2 + this.f22624g + StubApp.getString2(24098) + l(this.f22625h);
        }
        return string22 + c1896c + string2 + this.f22623f + StubApp.getString2(478) + this.f22624g + StubApp.getString2(24099) + l(this.f22625h);
    }
}
