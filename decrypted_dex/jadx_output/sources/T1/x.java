package T1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f7159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7160b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f7161c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7164f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7162d = true;

    public x(View view, int i3) {
        this.f7159a = view;
        this.f7160b = i3;
        this.f7161c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // T1.m
    public final void a() {
        f(false);
    }

    @Override // T1.m
    public final void b() {
    }

    @Override // T1.m
    public final void c(n nVar) {
    }

    @Override // T1.m
    public final void d(n nVar) {
        if (!this.f7164f) {
            t.f7149a.z(this.f7159a, this.f7160b);
            ViewGroup viewGroup = this.f7161c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        nVar.v(this);
    }

    @Override // T1.m
    public final void e() {
        f(true);
    }

    public final void f(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f7162d || this.f7163e == z2 || (viewGroup = this.f7161c) == null) {
            return;
        }
        this.f7163e = z2;
        W.a.y(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7164f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f7164f) {
            t.f7149a.z(this.f7159a, this.f7160b);
            ViewGroup viewGroup = this.f7161c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f7164f) {
            return;
        }
        t.f7149a.z(this.f7159a, this.f7160b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f7164f) {
            return;
        }
        t.f7149a.z(this.f7159a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
