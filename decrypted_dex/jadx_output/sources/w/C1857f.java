package w;

import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1857f {

    /* renamed from: d, reason: collision with root package name */
    public float f21973d;

    /* renamed from: f, reason: collision with root package name */
    public int f21975f;

    /* renamed from: a, reason: collision with root package name */
    public int f21970a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f21971b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f21972c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f21974e = new float[7];

    /* renamed from: g, reason: collision with root package name */
    public C1853b[] f21976g = new C1853b[8];

    /* renamed from: h, reason: collision with root package name */
    public int f21977h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f21978i = 0;

    public C1857f(int i3) {
        this.f21975f = i3;
    }

    public final void a(C1853b c1853b) {
        int i3 = 0;
        while (true) {
            int i10 = this.f21977h;
            if (i3 >= i10) {
                C1853b[] c1853bArr = this.f21976g;
                if (i10 >= c1853bArr.length) {
                    this.f21976g = (C1853b[]) Arrays.copyOf(c1853bArr, c1853bArr.length * 2);
                }
                C1853b[] c1853bArr2 = this.f21976g;
                int i11 = this.f21977h;
                c1853bArr2[i11] = c1853b;
                this.f21977h = i11 + 1;
                return;
            }
            if (this.f21976g[i3] == c1853b) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void b(C1853b c1853b) {
        int i3 = this.f21977h;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f21976g[i10] == c1853b) {
                for (int i11 = 0; i11 < (i3 - i10) - 1; i11++) {
                    C1853b[] c1853bArr = this.f21976g;
                    int i12 = i10 + i11;
                    c1853bArr[i12] = c1853bArr[i12 + 1];
                }
                this.f21977h--;
                return;
            }
        }
    }

    public final void c() {
        this.f21975f = 5;
        this.f21972c = 0;
        this.f21970a = -1;
        this.f21971b = -1;
        this.f21973d = 0.0f;
        this.f21977h = 0;
        this.f21978i = 0;
    }

    public final void d(C1853b c1853b) {
        int i3 = this.f21977h;
        for (int i10 = 0; i10 < i3; i10++) {
            C1853b c1853b2 = this.f21976g[i10];
            C1852a c1852a = c1853b2.f21953c;
            int i11 = c1852a.f21949h;
            while (true) {
                for (int i12 = 0; i11 != -1 && i12 < c1852a.f21942a; i12++) {
                    int i13 = c1852a.f21946e[i11];
                    C1857f c1857f = c1853b.f21951a;
                    if (i13 == c1857f.f21970a) {
                        float f10 = c1852a.f21948g[i11];
                        c1852a.h(c1857f, false);
                        C1852a c1852a2 = c1853b.f21953c;
                        int i14 = c1852a2.f21949h;
                        for (int i15 = 0; i14 != -1 && i15 < c1852a2.f21942a; i15++) {
                            c1852a.a(((C1857f[]) c1852a.f21944c.f20822c)[c1852a2.f21946e[i14]], c1852a2.f21948g[i14] * f10, false);
                            i14 = c1852a2.f21947f[i14];
                        }
                        c1853b2.f21952b = (c1853b.f21952b * f10) + c1853b2.f21952b;
                        i11 = c1852a.f21949h;
                    } else {
                        i11 = c1852a.f21947f[i11];
                    }
                }
            }
        }
        this.f21977h = 0;
    }

    public final String toString() {
        return StubApp.getString2(1116);
    }
}
