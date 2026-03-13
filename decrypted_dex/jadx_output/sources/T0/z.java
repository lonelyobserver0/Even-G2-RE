package T0;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f7076a;

    /* renamed from: b, reason: collision with root package name */
    public int f7077b;

    /* renamed from: c, reason: collision with root package name */
    public int f7078c;

    /* renamed from: d, reason: collision with root package name */
    public int f7079d;

    /* renamed from: e, reason: collision with root package name */
    public int f7080e;

    /* renamed from: f, reason: collision with root package name */
    public int f7081f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7082g;

    public z(T5.b bVar, int i3, int i10, int i11) {
        this.f7082g = bVar;
        int i12 = bVar.f7184b;
        this.f7076a = i12;
        int i13 = bVar.f7183a;
        this.f7077b = i13;
        int i14 = i3 / 2;
        int i15 = i10 - i14;
        this.f7078c = i15;
        int i16 = i10 + i14;
        this.f7079d = i16;
        int i17 = i11 - i14;
        this.f7081f = i17;
        int i18 = i11 + i14;
        this.f7080e = i18;
        if (i17 < 0 || i15 < 0 || i18 >= i12 || i16 >= i13) {
            throw N5.i.a();
        }
    }

    public boolean a(int i3, int i10, int i11, boolean z2) {
        T5.b bVar = (T5.b) this.f7082g;
        if (z2) {
            while (i3 <= i10) {
                if (bVar.b(i3, i11)) {
                    return true;
                }
                i3++;
            }
            return false;
        }
        while (i3 <= i10) {
            if (bVar.b(i11, i3)) {
                return true;
            }
            i3++;
        }
        return false;
    }

    public N5.o[] b() {
        int i3;
        int i10;
        int i11 = this.f7078c;
        int i12 = this.f7079d;
        int i13 = this.f7081f;
        int i14 = this.f7080e;
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        do {
            i3 = this.f7077b;
            if (!z14) {
                break;
            }
            boolean z15 = false;
            boolean z16 = true;
            while (true) {
                if ((z16 || !z10) && i12 < i3) {
                    z16 = a(i13, i14, i12, false);
                    if (z16) {
                        i12++;
                        z10 = true;
                        z15 = true;
                    } else if (!z10) {
                        i12++;
                    }
                }
            }
            if (i12 >= i3) {
                break;
            }
            boolean z17 = true;
            while (true) {
                i10 = this.f7076a;
                if ((z17 || !z11) && i14 < i10) {
                    z17 = a(i11, i12, i14, true);
                    if (z17) {
                        i14++;
                        z11 = true;
                        z15 = true;
                    } else if (!z11) {
                        i14++;
                    }
                }
            }
            if (i14 >= i10) {
                break;
            }
            boolean z18 = true;
            while (true) {
                if ((z18 || !z12) && i11 >= 0) {
                    z18 = a(i13, i14, i11, false);
                    if (z18) {
                        i11--;
                        z12 = true;
                        z15 = true;
                    } else if (!z12) {
                        i11--;
                    }
                }
            }
            if (i11 < 0) {
                break;
            }
            z14 = z15;
            boolean z19 = true;
            while (true) {
                if ((z19 || !z13) && i13 >= 0) {
                    z19 = a(i11, i12, i13, true);
                    if (z19) {
                        i13--;
                        z14 = true;
                        z13 = true;
                    } else if (!z13) {
                        i13--;
                    }
                }
            }
        } while (i13 >= 0);
        z2 = true;
        if (z2) {
            throw N5.i.a();
        }
        int i15 = i12 - i11;
        N5.o oVar = null;
        N5.o oVar2 = null;
        for (int i16 = 1; oVar2 == null && i16 < i15; i16++) {
            oVar2 = c(i11, i14 - i16, i11 + i16, i14);
        }
        if (oVar2 == null) {
            throw N5.i.a();
        }
        N5.o oVar3 = null;
        for (int i17 = 1; oVar3 == null && i17 < i15; i17++) {
            oVar3 = c(i11, i13 + i17, i11 + i17, i13);
        }
        if (oVar3 == null) {
            throw N5.i.a();
        }
        N5.o oVar4 = null;
        for (int i18 = 1; oVar4 == null && i18 < i15; i18++) {
            oVar4 = c(i12, i13 + i18, i12 - i18, i13);
        }
        if (oVar4 == null) {
            throw N5.i.a();
        }
        for (int i19 = 1; oVar == null && i19 < i15; i19++) {
            oVar = c(i12, i14 - i19, i12 - i19, i14);
        }
        if (oVar == null) {
            throw N5.i.a();
        }
        float f10 = i3 / 2.0f;
        float f11 = oVar.f4926a;
        float f12 = oVar2.f4926a;
        float f13 = oVar4.f4926a;
        float f14 = oVar3.f4926a;
        float f15 = oVar.f4927b;
        float f16 = oVar2.f4927b;
        float f17 = oVar4.f4927b;
        float f18 = oVar3.f4927b;
        return f11 < f10 ? new N5.o[]{new N5.o(f14 - 1.0f, f18 + 1.0f), new N5.o(f12 + 1.0f, f16 + 1.0f), new N5.o(f13 - 1.0f, f17 - 1.0f), new N5.o(f11 + 1.0f, f15 - 1.0f)} : new N5.o[]{new N5.o(f14 + 1.0f, f18 + 1.0f), new N5.o(f12 + 1.0f, f16 - 1.0f), new N5.o(f13 - 1.0f, f17 + 1.0f), new N5.o(f11 - 1.0f, f15 - 1.0f)};
    }

    public N5.o c(float f10, float f11, float f12, float f13) {
        int w10 = AbstractC0624h2.w(AbstractC0624h2.f(f10, f11, f12, f13));
        float f14 = w10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i3 = 0; i3 < w10; i3++) {
            float f17 = i3;
            int w11 = AbstractC0624h2.w((f17 * f15) + f10);
            int w12 = AbstractC0624h2.w((f17 * f16) + f11);
            if (((T5.b) this.f7082g).b(w11, w12)) {
                return new N5.o(w11, w12);
            }
        }
        return null;
    }

    public boolean d(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i3 & (-2097152)) == -2097152) || (i10 = (i3 >>> 19) & 3) == 1 || (i11 = (i3 >>> 17) & 3) == 0 || (i12 = (i3 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i3 >>> 10) & 3) == 3) {
            return false;
        }
        this.f7076a = i10;
        this.f7082g = AbstractC0311b.f6973s[3 - i11];
        int i14 = AbstractC0311b.f6974t[i13];
        this.f7078c = i14;
        if (i10 == 2) {
            this.f7078c = i14 / 2;
        } else if (i10 == 0) {
            this.f7078c = i14 / 4;
        }
        int i15 = (i3 >>> 9) & 1;
        int i16 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException();
                }
                i16 = KyberEngine.KyberPolyBytes;
            }
        } else if (i10 != 3) {
            i16 = 576;
        }
        this.f7081f = i16;
        if (i11 == 3) {
            int i17 = i10 == 3 ? AbstractC0311b.f6975u[i12 - 1] : AbstractC0311b.f6976v[i12 - 1];
            this.f7080e = i17;
            this.f7077b = (((i17 * 12) / this.f7078c) + i15) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? AbstractC0311b.f6977w[i12 - 1] : AbstractC0311b.f6978x[i12 - 1];
                this.f7080e = i18;
                this.f7077b = ((i18 * 144) / this.f7078c) + i15;
            } else {
                int i19 = AbstractC0311b.f6979y[i12 - 1];
                this.f7080e = i19;
                this.f7077b = (((i11 == 1 ? 72 : 144) * i19) / this.f7078c) + i15;
            }
        }
        this.f7079d = ((i3 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public z(T5.b bVar) {
        this(bVar, 10, bVar.f7183a / 2, bVar.f7184b / 2);
    }
}
