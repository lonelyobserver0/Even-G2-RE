package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0453f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f10157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0457j f10162f;

    public C0453f(C0457j c0457j, e0 e0Var, int i3, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10162f = c0457j;
        this.f10157a = e0Var;
        this.f10158b = i3;
        this.f10159c = view;
        this.f10160d = i10;
        this.f10161e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f10158b;
        View view = this.f10159c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10160d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10161e.setListener(null);
        C0457j c0457j = this.f10162f;
        e0 e0Var = this.f10157a;
        c0457j.c(e0Var);
        c0457j.f10195p.remove(e0Var);
        c0457j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10162f.getClass();
    }
}
