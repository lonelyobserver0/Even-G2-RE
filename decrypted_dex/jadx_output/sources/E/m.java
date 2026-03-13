package E;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f1719k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1722c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1723d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1724e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1725f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1726g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1727h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1728i;
    public final float j;

    static {
        float[] fArr = b.f1690c;
        float j = (float) ((b.j() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1688a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-j) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d8 = exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < 0.0d) {
            exp = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * j) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(j * 5.0d))) + (f20 * j);
        float j3 = b.j() / fArr[1];
        double d10 = j3;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f1719k = new m(j3, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f18, 1.0f, new float[]{(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f1725f = f10;
        this.f1720a = f11;
        this.f1721b = f12;
        this.f1722c = f13;
        this.f1723d = f14;
        this.f1724e = f15;
        this.f1726g = fArr;
        this.f1727h = f16;
        this.f1728i = f17;
        this.j = f18;
    }
}
