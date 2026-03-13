package T1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1692e f7112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f7113b;

    public k(n nVar, C1692e c1692e) {
        this.f7113b = nVar;
        this.f7112a = c1692e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7112a.remove(animator);
        this.f7113b.f7132m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7113b.f7132m.add(animator);
    }
}
