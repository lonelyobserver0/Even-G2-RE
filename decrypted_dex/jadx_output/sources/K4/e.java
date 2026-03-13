package K4;

import android.animation.ValueAnimator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3654b;

    public /* synthetic */ e(f fVar, int i3) {
        this.f3653a = i3;
        this.f3654b = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3653a) {
            case 0:
                this.f3654b.f3684c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f fVar = this.f3654b;
                fVar.f3684c.setScaleX(floatValue);
                fVar.f3684c.setScaleY(floatValue);
                break;
        }
    }
}
