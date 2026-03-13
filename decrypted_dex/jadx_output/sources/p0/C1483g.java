package p0;

import java.util.Arrays;
import r0.AbstractC1550k;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1483g {

    /* renamed from: a, reason: collision with root package name */
    public final int f19619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19620b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19621c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19622d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19623e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19624f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19625g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19626h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f19627i;
    public short[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f19628k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f19629l;

    /* renamed from: m, reason: collision with root package name */
    public int f19630m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f19631n;

    /* renamed from: o, reason: collision with root package name */
    public int f19632o;

    /* renamed from: p, reason: collision with root package name */
    public int f19633p;

    /* renamed from: q, reason: collision with root package name */
    public int f19634q;

    /* renamed from: r, reason: collision with root package name */
    public int f19635r;

    /* renamed from: s, reason: collision with root package name */
    public int f19636s;

    /* renamed from: t, reason: collision with root package name */
    public int f19637t;

    /* renamed from: u, reason: collision with root package name */
    public int f19638u;

    /* renamed from: v, reason: collision with root package name */
    public int f19639v;

    /* renamed from: w, reason: collision with root package name */
    public double f19640w;

    public C1483g(int i3, int i10, float f10, float f11, int i11) {
        this.f19619a = i3;
        this.f19620b = i10;
        this.f19621c = f10;
        this.f19622d = f11;
        this.f19623e = i3 / i11;
        this.f19624f = i3 / 400;
        int i12 = i3 / 65;
        this.f19625g = i12;
        int i13 = i12 * 2;
        this.f19626h = i13;
        this.f19627i = new short[i13];
        this.j = new short[i13 * i10];
        this.f19629l = new short[i13 * i10];
        this.f19631n = new short[i13 * i10];
    }

    public static void e(int i3, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i3; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i3 - i18) * sArr2[i17])) / i3);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i3, int i10) {
        short[] c10 = c(this.f19629l, this.f19630m, i10);
        this.f19629l = c10;
        int i11 = this.f19620b;
        System.arraycopy(sArr, i3 * i11, c10, this.f19630m * i11, i11 * i10);
        this.f19630m += i10;
    }

    public final void b(short[] sArr, int i3, int i10) {
        int i11 = this.f19626h / i10;
        int i12 = this.f19620b;
        int i13 = i10 * i12;
        int i14 = i3 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[AbstractC1482f.c(i15, i13, i14, i17)];
            }
            this.f19627i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i3, int i10) {
        int length = sArr.length;
        int i11 = this.f19620b;
        int i12 = length / i11;
        return i3 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i3, int i10, int i11) {
        int i12 = i3 * this.f19620b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f19638u = i14 / i15;
        this.f19639v = i16 / i13;
        return i15;
    }

    public final void f() {
        float f10;
        double d8;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j;
        long j3;
        int i16 = this.f19630m;
        float f11 = this.f19621c;
        float f12 = this.f19622d;
        double d10 = f11 / f12;
        float f13 = this.f19623e * f12;
        int i17 = this.f19619a;
        int i18 = this.f19620b;
        int i19 = 0;
        int i20 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i21 = this.f19628k;
            int i22 = this.f19626h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f19635r;
                    if (i24 > 0) {
                        int min = Math.min(i22, i24);
                        a(this.j, i23, min);
                        this.f19635r -= min;
                        i23 += min;
                        f10 = f13;
                        d8 = d10;
                    } else {
                        short[] sArr = this.j;
                        int i25 = i17 > 4000 ? i17 / 4000 : i20;
                        int i26 = this.f19625g;
                        int i27 = this.f19624f;
                        if (i18 == i20 && i25 == i20) {
                            i3 = d(sArr, i23, i27, i26);
                            f10 = f13;
                            d8 = d10;
                        } else {
                            b(sArr, i23, i25);
                            f10 = f13;
                            d8 = d10;
                            short[] sArr2 = this.f19627i;
                            int d11 = d(sArr2, i19, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = d11 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i18 == 1) {
                                    i3 = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    i3 = d(sArr2, i19, i27, i26);
                                }
                            } else {
                                i3 = d11;
                            }
                        }
                        int i32 = this.f19638u;
                        int i33 = this.f19639v;
                        if (i32 == 0 || (i10 = this.f19636s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f19637t * 3) {
                            i10 = i3;
                        }
                        this.f19637t = i32;
                        this.f19636s = i3;
                        if (d8 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (d8 >= 2.0d) {
                                double d12 = (i10 / (d8 - 1.0d)) + this.f19640w;
                                i12 = (int) Math.round(d12);
                                this.f19640w = d12 - i12;
                            } else {
                                double d13 = (((2.0d - d8) * i10) / (d8 - 1.0d)) + this.f19640w;
                                int round = (int) Math.round(d13);
                                this.f19635r = round;
                                this.f19640w = d13 - round;
                                i12 = i10;
                            }
                            short[] c10 = c(this.f19629l, this.f19630m, i12);
                            this.f19629l = c10;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.f19620b, c10, this.f19630m, sArr3, i35, sArr3, i34);
                            this.f19630m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.j;
                            if (d8 < 0.5d) {
                                double d14 = ((i10 * d8) / (1.0d - d8)) + this.f19640w;
                                int round2 = (int) Math.round(d14);
                                this.f19640w = d14 - round2;
                                i11 = round2;
                            } else {
                                double d15 = ((((d8 * 2.0d) - 1.0d) * i10) / (1.0d - d8)) + this.f19640w;
                                int round3 = (int) Math.round(d15);
                                this.f19635r = round3;
                                this.f19640w = d15 - round3;
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] c11 = c(this.f19629l, this.f19630m, i38);
                            this.f19629l = c11;
                            System.arraycopy(sArr4, i37 * i18, c11, this.f19630m * i18, i10 * i18);
                            e(i11, this.f19620b, this.f19629l, this.f19630m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f19630m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    i19 = 0;
                    i20 = 1;
                    f13 = f10;
                    d10 = d8;
                }
                int i39 = this.f19628k - i23;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i23 * i18, sArr5, 0, i39 * i18);
                this.f19628k = i39;
                if (f10 != 1.0f || this.f19630m == i16) {
                }
                long j10 = (long) (i17 / f10);
                long j11 = i17;
                while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
                    j10 /= 2;
                    j11 /= 2;
                }
                int i40 = this.f19630m - i16;
                short[] c12 = c(this.f19631n, this.f19632o, i40);
                this.f19631n = c12;
                System.arraycopy(this.f19629l, i16 * i18, c12, this.f19632o * i18, i40 * i18);
                this.f19630m = i16;
                this.f19632o += i40;
                int i41 = 0;
                while (true) {
                    i13 = this.f19632o;
                    i14 = i13 - 1;
                    if (i41 >= i14) {
                        break;
                    }
                    while (true) {
                        i15 = this.f19633p + 1;
                        j = i15;
                        long j12 = j * j10;
                        j3 = this.f19634q;
                        if (j12 <= j3 * j11) {
                            break;
                        }
                        this.f19629l = c(this.f19629l, this.f19630m, 1);
                        int i42 = 0;
                        while (i42 < i18) {
                            short[] sArr6 = this.f19629l;
                            int i43 = (this.f19630m * i18) + i42;
                            short[] sArr7 = this.f19631n;
                            int i44 = (i41 * i18) + i42;
                            short s10 = sArr7[i44];
                            short s11 = sArr7[i44 + i18];
                            long j13 = j10;
                            int i45 = i41;
                            long j14 = (r12 + 1) * j13;
                            long j15 = j14 - (this.f19634q * j11);
                            long j16 = j14 - (this.f19633p * j13);
                            sArr6[i43] = (short) ((((j16 - j15) * s11) + (s10 * j15)) / j16);
                            i42++;
                            i41 = i45;
                            j10 = j13;
                        }
                        this.f19634q++;
                        this.f19630m++;
                        i41 = i41;
                        j10 = j10;
                    }
                    long j17 = j10;
                    int i46 = i41;
                    this.f19633p = i15;
                    if (j == j11) {
                        this.f19633p = 0;
                        AbstractC1550k.g(j3 == j17);
                        this.f19634q = 0;
                    }
                    i41 = i46 + 1;
                    j10 = j17;
                }
                if (i14 == 0) {
                    return;
                }
                short[] sArr8 = this.f19631n;
                System.arraycopy(sArr8, i14 * i18, sArr8, 0, (i13 - i14) * i18);
                this.f19632o -= i14;
                return;
            }
        } else {
            a(this.j, 0, this.f19628k);
            this.f19628k = 0;
        }
        f10 = f13;
        if (f10 != 1.0f) {
        }
    }
}
