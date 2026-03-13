package S;

import android.view.animation.Interpolator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6423a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f6423a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}
