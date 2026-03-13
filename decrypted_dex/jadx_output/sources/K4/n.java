package K4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3671b;

    public /* synthetic */ n(Object obj, int i3) {
        this.f3670a = i3;
        this.f3671b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3670a) {
            case 0:
                ((o) this.f3671b).f3684c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((TextInputLayout) this.f3671b).f11990G0.h(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                I4.g gVar = ((BottomSheetBehavior) this.f3671b).f11838h;
                if (gVar != null) {
                    I4.f fVar = gVar.f3151a;
                    if (fVar.f3143i != floatValue) {
                        fVar.f3143i = floatValue;
                        gVar.f3154d = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
