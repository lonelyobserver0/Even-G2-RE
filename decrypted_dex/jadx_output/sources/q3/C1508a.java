package q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1508a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1510c f19931b;

    public /* synthetic */ C1508a(C1510c c1510c, int i3) {
        this.f19930a = i3;
        this.f19931b = c1510c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f19930a) {
            case 0:
                C1510c c1510c = this.f19931b;
                c1510c.f19935a.m();
                c1510c.f19939e = false;
                c1510c.a();
                break;
            default:
                C1510c c1510c2 = this.f19931b;
                c1510c2.f19935a.m();
                c1510c2.f19939e = false;
                c1510c2.a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19930a) {
            case 0:
                C1510c c1510c = this.f19931b;
                c1510c.f19935a.m();
                c1510c.f19939e = false;
                c1510c.a();
                break;
            default:
                C1510c c1510c2 = this.f19931b;
                c1510c2.f19935a.m();
                c1510c2.f19939e = false;
                c1510c2.a();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19930a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1510c c1510c = this.f19931b;
                C1514g c1514g = c1510c.f19935a;
                c1514g.n(floatValue, c1514g.getCurrentYOffset());
                c1510c.f19935a.l();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1510c c1510c2 = this.f19931b;
                C1514g c1514g2 = c1510c2.f19935a;
                c1514g2.n(c1514g2.getCurrentXOffset(), floatValue2);
                c1510c2.f19935a.l();
                break;
        }
    }
}
