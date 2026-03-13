package K4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3652b;

    public /* synthetic */ d(f fVar, int i3) {
        this.f3651a = i3;
        this.f3652b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3651a) {
            case 1:
                this.f3652b.f3682a.setEndIconVisible(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3651a) {
            case 0:
                this.f3652b.f3682a.setEndIconVisible(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
