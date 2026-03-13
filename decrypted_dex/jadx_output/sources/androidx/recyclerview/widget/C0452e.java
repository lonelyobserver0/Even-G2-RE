package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0452e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10134a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f10135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0457j f10138e;

    public C0452e(C0457j c0457j, e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10138e = c0457j;
        this.f10135b = e0Var;
        this.f10137d = viewPropertyAnimator;
        this.f10136c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10134a) {
            case 1:
                this.f10136c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10134a) {
            case 0:
                this.f10137d.setListener(null);
                this.f10136c.setAlpha(1.0f);
                C0457j c0457j = this.f10138e;
                e0 e0Var = this.f10135b;
                c0457j.c(e0Var);
                c0457j.f10196q.remove(e0Var);
                c0457j.i();
                break;
            default:
                this.f10137d.setListener(null);
                C0457j c0457j2 = this.f10138e;
                e0 e0Var2 = this.f10135b;
                c0457j2.c(e0Var2);
                c0457j2.f10194o.remove(e0Var2);
                c0457j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10134a) {
            case 0:
                this.f10138e.getClass();
                break;
            default:
                this.f10138e.getClass();
                break;
        }
    }

    public C0452e(C0457j c0457j, e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10138e = c0457j;
        this.f10135b = e0Var;
        this.f10136c = view;
        this.f10137d = viewPropertyAnimator;
    }
}
