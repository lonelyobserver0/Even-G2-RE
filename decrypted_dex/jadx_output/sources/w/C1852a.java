package w;

import com.stub.StubApp;
import java.util.Arrays;
import p0.AbstractC1482f;
import sa.C1608a;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1852a {

    /* renamed from: b, reason: collision with root package name */
    public final C1853b f21943b;

    /* renamed from: c, reason: collision with root package name */
    public final C1608a f21944c;

    /* renamed from: a, reason: collision with root package name */
    public int f21942a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21945d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f21946e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f21947f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f21948g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f21949h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f21950i = -1;
    public boolean j = false;

    public C1852a(C1853b c1853b, C1608a c1608a) {
        this.f21943b = c1853b;
        this.f21944c = c1608a;
    }

    public final void a(C1857f c1857f, float f10, boolean z2) {
        if (f10 == 0.0f) {
            return;
        }
        int i3 = this.f21949h;
        C1853b c1853b = this.f21943b;
        if (i3 == -1) {
            this.f21949h = 0;
            this.f21948g[0] = f10;
            this.f21946e[0] = c1857f.f21970a;
            this.f21947f[0] = -1;
            c1857f.f21978i++;
            c1857f.a(c1853b);
            this.f21942a++;
            if (this.j) {
                return;
            }
            int i10 = this.f21950i + 1;
            this.f21950i = i10;
            int[] iArr = this.f21946e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f21950i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i3 != -1 && i12 < this.f21942a; i12++) {
            int i13 = this.f21946e[i3];
            int i14 = c1857f.f21970a;
            if (i13 == i14) {
                float[] fArr = this.f21948g;
                float f11 = fArr[i3] + f10;
                fArr[i3] = f11;
                if (f11 == 0.0f) {
                    if (i3 == this.f21949h) {
                        this.f21949h = this.f21947f[i3];
                    } else {
                        int[] iArr2 = this.f21947f;
                        iArr2[i11] = iArr2[i3];
                    }
                    if (z2) {
                        c1857f.b(c1853b);
                    }
                    if (this.j) {
                        this.f21950i = i3;
                    }
                    c1857f.f21978i--;
                    this.f21942a--;
                    return;
                }
                return;
            }
            if (i13 < i14) {
                i11 = i3;
            }
            i3 = this.f21947f[i3];
        }
        int i15 = this.f21950i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr3 = this.f21946e;
            if (iArr3[i15] != -1) {
                i15 = iArr3.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr4 = this.f21946e;
        if (i15 >= iArr4.length && this.f21942a < iArr4.length) {
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f21946e;
                if (i17 >= iArr5.length) {
                    break;
                }
                if (iArr5[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr6 = this.f21946e;
        if (i15 >= iArr6.length) {
            i15 = iArr6.length;
            int i18 = this.f21945d * 2;
            this.f21945d = i18;
            this.j = false;
            this.f21950i = i15 - 1;
            this.f21948g = Arrays.copyOf(this.f21948g, i18);
            this.f21946e = Arrays.copyOf(this.f21946e, this.f21945d);
            this.f21947f = Arrays.copyOf(this.f21947f, this.f21945d);
        }
        this.f21946e[i15] = c1857f.f21970a;
        this.f21948g[i15] = f10;
        if (i11 != -1) {
            int[] iArr7 = this.f21947f;
            iArr7[i15] = iArr7[i11];
            iArr7[i11] = i15;
        } else {
            this.f21947f[i15] = this.f21949h;
            this.f21949h = i15;
        }
        c1857f.f21978i++;
        c1857f.a(c1853b);
        this.f21942a++;
        if (!this.j) {
            this.f21950i++;
        }
        int i19 = this.f21950i;
        int[] iArr8 = this.f21946e;
        if (i19 >= iArr8.length) {
            this.j = true;
            this.f21950i = iArr8.length - 1;
        }
    }

    public final void b() {
        int i3 = this.f21949h;
        for (int i10 = 0; i3 != -1 && i10 < this.f21942a; i10++) {
            C1857f c1857f = ((C1857f[]) this.f21944c.f20822c)[this.f21946e[i3]];
            if (c1857f != null) {
                c1857f.b(this.f21943b);
            }
            i3 = this.f21947f[i3];
        }
        this.f21949h = -1;
        this.f21950i = -1;
        this.j = false;
        this.f21942a = 0;
    }

    public final float c(C1857f c1857f) {
        int i3 = this.f21949h;
        for (int i10 = 0; i3 != -1 && i10 < this.f21942a; i10++) {
            if (this.f21946e[i3] == c1857f.f21970a) {
                return this.f21948g[i3];
            }
            i3 = this.f21947f[i3];
        }
        return 0.0f;
    }

    public final C1857f d(boolean[] zArr, C1857f c1857f) {
        int i3;
        int i10 = this.f21949h;
        C1857f c1857f2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i10 != -1 && i11 < this.f21942a; i11++) {
            float f11 = this.f21948g[i10];
            if (f11 < 0.0f) {
                C1857f c1857f3 = ((C1857f[]) this.f21944c.f20822c)[this.f21946e[i10]];
                if ((zArr == null || !zArr[c1857f3.f21970a]) && c1857f3 != c1857f && (((i3 = c1857f3.f21975f) == 3 || i3 == 4) && f11 < f10)) {
                    f10 = f11;
                    c1857f2 = c1857f3;
                }
            }
            i10 = this.f21947f[i10];
        }
        return c1857f2;
    }

    public final C1857f e(int i3) {
        int i10 = this.f21949h;
        for (int i11 = 0; i10 != -1 && i11 < this.f21942a; i11++) {
            if (i11 == i3) {
                return ((C1857f[]) this.f21944c.f20822c)[this.f21946e[i10]];
            }
            i10 = this.f21947f[i10];
        }
        return null;
    }

    public final float f(int i3) {
        int i10 = this.f21949h;
        for (int i11 = 0; i10 != -1 && i11 < this.f21942a; i11++) {
            if (i11 == i3) {
                return this.f21948g[i10];
            }
            i10 = this.f21947f[i10];
        }
        return 0.0f;
    }

    public final void g(C1857f c1857f, float f10) {
        if (f10 == 0.0f) {
            h(c1857f, true);
            return;
        }
        int i3 = this.f21949h;
        C1853b c1853b = this.f21943b;
        if (i3 == -1) {
            this.f21949h = 0;
            this.f21948g[0] = f10;
            this.f21946e[0] = c1857f.f21970a;
            this.f21947f[0] = -1;
            c1857f.f21978i++;
            c1857f.a(c1853b);
            this.f21942a++;
            if (this.j) {
                return;
            }
            int i10 = this.f21950i + 1;
            this.f21950i = i10;
            int[] iArr = this.f21946e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f21950i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i3 != -1 && i12 < this.f21942a; i12++) {
            int i13 = this.f21946e[i3];
            int i14 = c1857f.f21970a;
            if (i13 == i14) {
                this.f21948g[i3] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i3;
            }
            i3 = this.f21947f[i3];
        }
        int i15 = this.f21950i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr2 = this.f21946e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f21946e;
        if (i15 >= iArr3.length && this.f21942a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f21946e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f21946e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f21945d * 2;
            this.f21945d = i18;
            this.j = false;
            this.f21950i = i15 - 1;
            this.f21948g = Arrays.copyOf(this.f21948g, i18);
            this.f21946e = Arrays.copyOf(this.f21946e, this.f21945d);
            this.f21947f = Arrays.copyOf(this.f21947f, this.f21945d);
        }
        this.f21946e[i15] = c1857f.f21970a;
        this.f21948g[i15] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f21947f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f21947f[i15] = this.f21949h;
            this.f21949h = i15;
        }
        c1857f.f21978i++;
        c1857f.a(c1853b);
        int i19 = this.f21942a + 1;
        this.f21942a = i19;
        if (!this.j) {
            this.f21950i++;
        }
        int[] iArr7 = this.f21946e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f21950i >= iArr7.length) {
            this.j = true;
            this.f21950i = iArr7.length - 1;
        }
    }

    public final float h(C1857f c1857f, boolean z2) {
        int i3 = this.f21949h;
        if (i3 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i3 != -1 && i10 < this.f21942a) {
            if (this.f21946e[i3] == c1857f.f21970a) {
                if (i3 == this.f21949h) {
                    this.f21949h = this.f21947f[i3];
                } else {
                    int[] iArr = this.f21947f;
                    iArr[i11] = iArr[i3];
                }
                if (z2) {
                    c1857f.b(this.f21943b);
                }
                c1857f.f21978i--;
                this.f21942a--;
                this.f21946e[i3] = -1;
                if (this.j) {
                    this.f21950i = i3;
                }
                return this.f21948g[i3];
            }
            i10++;
            i11 = i3;
            i3 = this.f21947f[i3];
        }
        return 0.0f;
    }

    public final String toString() {
        int i3 = this.f21949h;
        String str = "";
        for (int i10 = 0; i3 != -1 && i10 < this.f21942a; i10++) {
            StringBuilder b2 = AbstractC1856e.b(AbstractC1482f.g(str, StubApp.getString2(438)));
            b2.append(this.f21948g[i3]);
            b2.append(StubApp.getString2(8801));
            StringBuilder b10 = AbstractC1856e.b(b2.toString());
            b10.append(((C1857f[]) this.f21944c.f20822c)[this.f21946e[i3]]);
            str = b10.toString();
            i3 = this.f21947f[i3];
        }
        return str;
    }
}
