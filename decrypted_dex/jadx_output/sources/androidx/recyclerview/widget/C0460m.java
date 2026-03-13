package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0460m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0461n f10213a;

    public C0460m(C0461n c0461n) {
        this.f10213a = c0461n;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0461n c0461n = this.f10213a;
        c0461n.f10229c.setAlpha(floatValue);
        c0461n.f10230d.setAlpha(floatValue);
        c0461n.f10244s.invalidate();
    }
}
