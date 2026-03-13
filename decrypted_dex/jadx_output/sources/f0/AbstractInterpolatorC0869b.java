package f0;

import android.view.animation.Interpolator;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractInterpolatorC0869b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f13703a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13704b;

    public AbstractInterpolatorC0869b(float[] fArr) {
        this.f13703a = fArr;
        this.f13704b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f13703a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f13704b;
        float f12 = (f10 - (min * f11)) / f11;
        float f13 = fArr[min];
        return E1.a.c(fArr[min + 1], f13, f12, f13);
    }
}
