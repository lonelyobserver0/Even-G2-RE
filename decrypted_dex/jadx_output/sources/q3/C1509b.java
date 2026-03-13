package q3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1509b implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f19932a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1510c f19934c;

    public C1509b(C1510c c1510c, float f10, float f11) {
        this.f19934c = c1510c;
        this.f19932a = f10;
        this.f19933b = f11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C1510c c1510c = this.f19934c;
        c1510c.f19935a.m();
        c1510c.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1510c c1510c = this.f19934c;
        c1510c.f19935a.m();
        c1510c.f19935a.o();
        c1510c.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f19934c.f19935a.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f19932a, this.f19933b));
    }
}
