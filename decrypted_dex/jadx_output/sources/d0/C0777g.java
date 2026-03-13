package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0777g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f13309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0778h f13310e;

    public C0777g(ViewGroup viewGroup, View view, boolean z2, a0 a0Var, C0778h c0778h) {
        this.f13306a = viewGroup;
        this.f13307b = view;
        this.f13308c = z2;
        this.f13309d = a0Var;
        this.f13310e = c0778h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f13306a;
        View viewToAnimate = this.f13307b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z2 = this.f13308c;
        a0 a0Var = this.f13309d;
        if (z2) {
            c0 c0Var = a0Var.f13257a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            c0Var.a(viewToAnimate, viewGroup);
        }
        C0778h c0778h = this.f13310e;
        ((a0) c0778h.f13311c.f4728a).c(c0778h);
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16718) + a0Var + StubApp.getString2(16698));
        }
    }
}
