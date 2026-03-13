package E;

import android.graphics.Color;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1682a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1683b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1684c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1685d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1686e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1687f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f1682a = f10;
        this.f1683b = f11;
        this.f1684c = f12;
        this.f1685d = f13;
        this.f1686e = f14;
        this.f1687f = f15;
    }

    public static a a(int i3) {
        m mVar = m.f1719k;
        float d8 = b.d(Color.red(i3));
        float d10 = b.d(Color.green(i3));
        float d11 = b.d(Color.blue(i3));
        float[][] fArr = b.f1691d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * d11) + (fArr2[1] * d10) + (fArr2[0] * d8);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * d11) + (fArr3[1] * d10) + (fArr3[0] * d8);
        float[] fArr4 = fArr[2];
        float f12 = (d11 * fArr4[2]) + (d10 * fArr4[1]) + (d8 * fArr4[0]);
        float[][] fArr5 = b.f1688a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = mVar.f1726g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float abs = Math.abs(f16);
        float f19 = mVar.f1727h;
        float pow = (float) Math.pow((abs * f19) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d12 = signum3;
        float f20 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d12)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d12 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = atan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * mVar.f1721b;
        float f28 = mVar.f1720a;
        float f29 = mVar.f1723d;
        float pow4 = ((float) Math.pow(f27 / f28, mVar.j * f29)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f1725f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? f25 + 360.0f : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f1724e) * mVar.f1722c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f31 = mVar.f1728i * pow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d13 = f26;
        return new a(f25, pow5, pow4, f32, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    public static a b(float f10, float f11, float f12) {
        m mVar = m.f1719k;
        float f13 = mVar.f1723d;
        Math.sqrt(f10 / 100.0d);
        float f14 = mVar.f1720a + 4.0f;
        float f15 = mVar.f1728i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * mVar.f1723d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public final int c(m mVar) {
        float f10;
        float f11 = this.f1683b;
        double d8 = f11;
        float f12 = this.f1684c;
        if (d8 != 0.0d) {
            double d10 = f12;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, mVar.f1725f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f1682a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = mVar.f1720a * ((float) Math.pow(f12 / 100.0d, (1.0d / mVar.f1723d) / mVar.j));
                float f13 = cos * 3846.1538f * mVar.f1724e * mVar.f1722c;
                float f14 = pow2 / mVar.f1721b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f13 * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19)));
                float signum = Math.signum(f19);
                float f22 = 100.0f / mVar.f1727h;
                float pow3 = signum * f22 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum3 = Math.signum(f21) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float[] fArr = mVar.f1726g;
                float f23 = pow3 / fArr[0];
                float f24 = signum2 / fArr[1];
                float f25 = signum3 / fArr[2];
                float[][] fArr2 = b.f1689b;
                float[] fArr3 = fArr2[0];
                float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr2[2];
                return F.a.a(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, mVar.f1725f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f1682a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = mVar.f1720a * ((float) Math.pow(f12 / 100.0d, (1.0d / mVar.f1723d) / mVar.j));
        float f132 = cos3 * 3846.1538f * mVar.f1724e * mVar.f1722c;
        float f142 = pow22 / mVar.f1721b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f152 = (((0.305f + f142) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f132 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192)));
        float signum4 = Math.signum(f192);
        float f222 = 100.0f / mVar.f1727h;
        float pow32 = signum4 * f222 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum32 = Math.signum(f212) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float[] fArr6 = mVar.f1726g;
        float f232 = pow32 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float f252 = signum32 / fArr6[2];
        float[][] fArr22 = b.f1689b;
        float[] fArr32 = fArr22[0];
        float f262 = (fArr32[2] * f252) + (fArr32[1] * f242) + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = (fArr42[2] * f252) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr22[2];
        return F.a.a(f262, f272, (f252 * fArr52[2]) + (f242 * fArr52[1]) + (f232 * fArr52[0]));
    }
}
