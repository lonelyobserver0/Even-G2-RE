package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0454g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0455h f10166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0457j f10169e;

    public /* synthetic */ C0454g(C0457j c0457j, C0455h c0455h, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f10165a = i3;
        this.f10169e = c0457j;
        this.f10166b = c0455h;
        this.f10167c = viewPropertyAnimator;
        this.f10168d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10165a) {
            case 0:
                this.f10167c.setListener(null);
                View view = this.f10168d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0455h c0455h = this.f10166b;
                e0 e0Var = c0455h.f10172a;
                C0457j c0457j = this.f10169e;
                c0457j.c(e0Var);
                c0457j.f10197r.remove(c0455h.f10172a);
                c0457j.i();
                break;
            default:
                this.f10167c.setListener(null);
                View view2 = this.f10168d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0455h c0455h2 = this.f10166b;
                e0 e0Var2 = c0455h2.f10173b;
                C0457j c0457j2 = this.f10169e;
                c0457j2.c(e0Var2);
                c0457j2.f10197r.remove(c0455h2.f10173b);
                c0457j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10165a) {
            case 0:
                e0 e0Var = this.f10166b.f10172a;
                this.f10169e.getClass();
                break;
            default:
                e0 e0Var2 = this.f10166b.f10173b;
                this.f10169e.getClass();
                break;
        }
    }
}
