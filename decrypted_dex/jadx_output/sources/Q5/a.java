package Q5;

import N5.i;
import N5.o;
import T0.z;
import T5.b;
import T5.f;
import Z9.A;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.D1;
import org.bouncycastle.asn1.eac.CertificateBody;
import s2.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f5735g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final b f5736a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5737b;

    /* renamed from: c, reason: collision with root package name */
    public int f5738c;

    /* renamed from: d, reason: collision with root package name */
    public int f5739d;

    /* renamed from: e, reason: collision with root package name */
    public int f5740e;

    /* renamed from: f, reason: collision with root package name */
    public int f5741f;

    public a(b bVar) {
        this.f5736a = bVar;
    }

    public static o[] b(o[] oVarArr, int i3, int i10) {
        float f10 = i10 / (i3 * 2.0f);
        o oVar = oVarArr[0];
        float f11 = oVar.f4926a;
        o oVar2 = oVarArr[2];
        float f12 = oVar2.f4926a;
        float f13 = f11 - f12;
        float f14 = oVar.f4927b;
        float f15 = oVar2.f4927b;
        float f16 = f14 - f15;
        float f17 = (f11 + f12) / 2.0f;
        float f18 = (f14 + f15) / 2.0f;
        float f19 = f13 * f10;
        float f20 = f16 * f10;
        o oVar3 = new o(f17 + f19, f18 + f20);
        o oVar4 = new o(f17 - f19, f18 - f20);
        o oVar5 = oVarArr[1];
        float f21 = oVar5.f4926a;
        o oVar6 = oVarArr[3];
        float f22 = oVar6.f4926a;
        float f23 = f21 - f22;
        float f24 = oVar5.f4927b;
        float f25 = oVar6.f4927b;
        float f26 = f24 - f25;
        float f27 = (f21 + f22) / 2.0f;
        float f28 = (f24 + f25) / 2.0f;
        float f29 = f23 * f10;
        float f30 = f10 * f26;
        return new o[]{oVar3, new o(f27 + f29, f28 + f30), oVar4, new o(f27 - f29, f28 - f30)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final O5.a a(boolean z2) {
        o b2;
        o oVar;
        o oVar2;
        o oVar3;
        char c10;
        o b10;
        o b11;
        o oVar4;
        o oVar5;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j;
        int i17;
        A a3;
        A a9;
        boolean z10;
        A a10;
        b bVar = this.f5736a;
        int i18 = -1;
        int i19 = 2;
        int i20 = 1;
        try {
            o[] b12 = new z(bVar).b();
            oVar2 = b12[0];
            oVar3 = b12[1];
            oVar = b12[2];
            b2 = b12[3];
        } catch (i unused) {
            int i21 = bVar.f7183a / 2;
            int i22 = bVar.f7184b / 2;
            int i23 = i21 + 7;
            int i24 = i22 - 7;
            o b13 = e(new A(i23, i24, 1), false, 1, -1).b();
            int i25 = i22 + 7;
            o b14 = e(new A(i23, i25, 1), false, 1, 1).b();
            int i26 = i21 - 7;
            o b15 = e(new A(i26, i25, 1), false, -1, 1).b();
            b2 = e(new A(i26, i24, 1), false, -1, -1).b();
            oVar = b15;
            oVar2 = b13;
            oVar3 = b14;
        }
        int w10 = AbstractC0624h2.w((((oVar2.f4926a + b2.f4926a) + oVar3.f4926a) + oVar.f4926a) / 4.0f);
        int w11 = AbstractC0624h2.w((((oVar2.f4927b + b2.f4927b) + oVar3.f4927b) + oVar.f4927b) / 4.0f);
        char c11 = 15;
        try {
            o[] b16 = new z(bVar, 15, w10, w11).b();
            oVar5 = b16[0];
            oVar4 = b16[1];
            b10 = b16[2];
            b11 = b16[3];
            c10 = 3;
        } catch (i unused2) {
            int i27 = w10 + 7;
            int i28 = w11 - 7;
            o b17 = e(new A(i27, i28, 1), false, 1, -1).b();
            int i29 = w11 + 7;
            c10 = 3;
            o b18 = e(new A(i27, i29, 1), false, 1, 1).b();
            int i30 = w10 - 7;
            b10 = e(new A(i30, i29, 1), false, -1, 1).b();
            b11 = e(new A(i30, i28, 1), false, -1, -1).b();
            oVar4 = b18;
            oVar5 = b17;
        }
        A a11 = new A(AbstractC0624h2.w((((oVar5.f4926a + b11.f4926a) + oVar4.f4926a) + b10.f4926a) / 4.0f), AbstractC0624h2.w((((oVar5.f4927b + b11.f4927b) + oVar4.f4927b) + b10.f4927b) / 4.0f), 1);
        this.f5740e = 1;
        boolean z11 = true;
        A a12 = a11;
        A a13 = a12;
        A a14 = a13;
        while (true) {
            int i31 = this.f5740e;
            i3 = a14.f9069b;
            char c12 = c11;
            i10 = a14.f9070c;
            i11 = a11.f9069b;
            i12 = a11.f9070c;
            if (i31 >= 9) {
                i13 = i19;
                i14 = i20;
                break;
            }
            A e10 = e(a11, z11, i20, i18);
            A e11 = e(a12, z11, i20, i20);
            A e12 = e(a13, z11, i18, i20);
            A e13 = e(a14, z11, i18, i18);
            if (this.f5740e > i19) {
                int i32 = e13.f9069b;
                i14 = i20;
                int i33 = e13.f9070c;
                i13 = i19;
                int i34 = e10.f9069b;
                a9 = e13;
                int i35 = e10.f9070c;
                double g10 = (AbstractC0624h2.g(i32, i33, i34, i35) * this.f5740e) / ((this.f5740e + 2) * AbstractC0624h2.g(i3, i10, i11, i12));
                if (g10 < 0.75d || g10 > 1.25d) {
                    break;
                }
                A a15 = new A(Math.max(0, i34 - 3), Math.min(bVar.f7184b - 1, i35 + 3), 1);
                a3 = e10;
                A a16 = new A(Math.max(0, e11.f9069b - 3), Math.max(0, e11.f9070c - 3), 1);
                z10 = z11;
                A a17 = new A(Math.min(bVar.f7183a - 1, e12.f9069b + 3), Math.max(0, Math.min(bVar.f7184b - 1, e12.f9070c - 3)), 1);
                a10 = e11;
                A a18 = new A(Math.min(bVar.f7183a - 1, i32 + 3), Math.min(bVar.f7184b - 1, i33 + 3), 1);
                int c13 = c(a18, a15);
                if (c13 == 0 || c(a15, a16) != c13 || c(a16, a17) != c13 || c(a17, a18) != c13) {
                    break;
                }
            } else {
                i13 = i19;
                i14 = i20;
                a3 = e10;
                a9 = e13;
                z10 = z11;
                a10 = e11;
            }
            z11 = !z10;
            this.f5740e++;
            a13 = e12;
            c11 = c12;
            i20 = i14;
            i19 = i13;
            a14 = a9;
            a12 = a10;
            a11 = a3;
            i18 = -1;
        }
        int i36 = this.f5740e;
        if (i36 != 5 && i36 != 7) {
            throw i.a();
        }
        this.f5737b = i36 == 5 ? i14 : 0;
        int i37 = i36 * 2;
        o[] b19 = b(new o[]{new o(i11 + 0.5f, i12 - 0.5f), new o(a12.f9069b + 0.5f, a12.f9070c + 0.5f), new o(a13.f9069b - 0.5f, a13.f9070c + 0.5f), new o(i3 - 0.5f, i10 - 0.5f)}, i37 - 3, i37);
        if (z2) {
            o oVar6 = b19[0];
            b19[0] = b19[i13];
            b19[i13] = oVar6;
        }
        if (!g(b19[0]) || !g(b19[i14]) || !g(b19[i13]) || !g(b19[c10])) {
            throw i.a();
        }
        int i38 = this.f5740e * 2;
        int[] iArr = {h(b19[0], b19[i14], i38), h(b19[i14], b19[i13], i38), h(b19[i13], b19[c10], i38), h(b19[c10], b19[0], i38)};
        int i39 = 0;
        for (int i40 = 0; i40 < 4; i40++) {
            int i41 = iArr[i40];
            i39 = (i39 << 3) + ((i41 >> (i38 - 2)) << 1) + (i41 & 1);
        }
        int i42 = ((i39 & 1) << 11) + (i39 >> 1);
        for (int i43 = 0; i43 < 4; i43++) {
            int i44 = i13;
            if (Integer.bitCount(f5735g[i43] ^ i42) <= i44) {
                this.f5741f = i43;
                long j3 = 0;
                int i45 = 0;
                while (true) {
                    i15 = 10;
                    if (i45 >= 4) {
                        break;
                    }
                    int i46 = iArr[(this.f5741f + i45) % 4];
                    if (this.f5737b) {
                        j = j3 << 7;
                        i17 = (i46 >> 1) & CertificateBody.profileType;
                    } else {
                        j = j3 << 10;
                        i17 = ((i46 >> 2) & 992) + ((i46 >> 1) & 31);
                    }
                    j3 = j + i17;
                    i45++;
                }
                if (this.f5737b) {
                    i15 = 7;
                    i16 = 2;
                } else {
                    i16 = 4;
                }
                int i47 = i15 - i16;
                int[] iArr2 = new int[i15];
                for (int i48 = i15 - 1; i48 >= 0; i48--) {
                    iArr2[i48] = ((int) j3) & 15;
                    j3 >>= 4;
                }
                try {
                    int b20 = new d(V5.a.f7748k, 19).b(i47, iArr2);
                    int i49 = 0;
                    for (int i50 = 0; i50 < i16; i50++) {
                        i49 = (i49 << 4) + iArr2[i50];
                    }
                    if (this.f5737b) {
                        this.f5738c = (i49 >> 6) + 1;
                        this.f5739d = (i49 & 63) + 1;
                    } else {
                        this.f5738c = (i49 >> 11) + 1;
                        this.f5739d = (i49 & 2047) + 1;
                    }
                    int i51 = this.f5741f;
                    o oVar7 = b19[i51 % 4];
                    o oVar8 = b19[(i51 + 1) % 4];
                    o oVar9 = b19[(i51 + 2) % 4];
                    o oVar10 = b19[(i51 + 3) % 4];
                    int d8 = d();
                    float f10 = d8 / 2.0f;
                    float f11 = this.f5740e;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    return new O5.a(D1.s(bVar, d8, d8, f.a(f12, f12, f13, f12, f13, f13, f12, f13, oVar7.f4926a, oVar7.f4927b, oVar8.f4926a, oVar8.f4927b, oVar9.f4926a, oVar9.f4927b, oVar10.f4926a, oVar10.f4927b)), b(b19, this.f5740e * 2, d()), this.f5737b, this.f5739d, this.f5738c, b20);
                } catch (V5.b unused3) {
                    throw i.a();
                }
            }
            i13 = i44;
        }
        throw i.a();
    }

    public final int c(A a3, A a9) {
        int i3 = a3.f9069b;
        int i10 = a3.f9070c;
        float g10 = AbstractC0624h2.g(i3, i10, a9.f9069b, a9.f9070c);
        if (g10 != 0.0f) {
            float f10 = (r1 - i3) / g10;
            float f11 = (r13 - i10) / g10;
            float f12 = i3;
            float f13 = i10;
            b bVar = this.f5736a;
            boolean b2 = bVar.b(i3, i10);
            int floor = (int) Math.floor(g10);
            int i11 = 0;
            for (int i12 = 0; i12 < floor; i12++) {
                if (bVar.b(AbstractC0624h2.w(f12), AbstractC0624h2.w(f13)) != b2) {
                    i11++;
                }
                f12 += f10;
                f13 += f11;
            }
            float f14 = i11 / g10;
            if (f14 <= 0.1f || f14 >= 0.9f) {
                return (f14 <= 0.1f) == b2 ? 1 : -1;
            }
        }
        return 0;
    }

    public final int d() {
        if (this.f5737b) {
            return (this.f5738c * 4) + 11;
        }
        int i3 = this.f5738c;
        return ((((i3 * 2) + 6) / 15) * 2) + (i3 * 4) + 15;
    }

    public final A e(A a3, boolean z2, int i3, int i10) {
        b bVar;
        int i11 = a3.f9069b + i3;
        int i12 = a3.f9070c;
        while (true) {
            i12 += i10;
            boolean f10 = f(i11, i12);
            bVar = this.f5736a;
            if (!f10 || bVar.b(i11, i12) != z2) {
                break;
            }
            i11 += i3;
        }
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        while (f(i13, i14) && bVar.b(i13, i14) == z2) {
            i13 += i3;
        }
        int i15 = i13 - i3;
        while (f(i15, i14) && bVar.b(i15, i14) == z2) {
            i14 += i10;
        }
        return new A(i15, i14 - i10, 1);
    }

    public final boolean f(int i3, int i10) {
        if (i3 < 0) {
            return false;
        }
        b bVar = this.f5736a;
        return i3 < bVar.f7183a && i10 >= 0 && i10 < bVar.f7184b;
    }

    public final boolean g(o oVar) {
        return f(AbstractC0624h2.w(oVar.f4926a), AbstractC0624h2.w(oVar.f4927b));
    }

    public final int h(o oVar, o oVar2, int i3) {
        float f10 = oVar.f4926a;
        float f11 = oVar2.f4926a;
        float f12 = oVar.f4927b;
        float f13 = oVar2.f4927b;
        float f14 = AbstractC0624h2.f(f10, f12, f11, f13);
        float f15 = f14 / i3;
        float f16 = oVar2.f4926a;
        float f17 = oVar.f4926a;
        float f18 = ((f16 - f17) * f15) / f14;
        float f19 = ((f13 - f12) * f15) / f14;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            float f20 = i11;
            if (this.f5736a.b(AbstractC0624h2.w((f20 * f18) + f17), AbstractC0624h2.w((f20 * f19) + f12))) {
                i10 |= 1 << ((i3 - i11) - 1);
            }
        }
        return i10;
    }
}
