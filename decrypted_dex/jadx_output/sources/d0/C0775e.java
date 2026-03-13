package d0;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0775e extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final C0776f f13297c;

    public C0775e(C0776f animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f13297c = animationInfo;
    }

    @Override // d0.Z
    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C0776f c0776f = this.f13297c;
        a0 a0Var = (a0) c0776f.f4728a;
        View view = a0Var.f13259c.f13354I;
        view.clearAnimation();
        container.endViewTransition(view);
        ((a0) c0776f.f4728a).c(this);
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16697) + a0Var + StubApp.getString2(16715));
        }
    }

    @Override // d0.Z
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C0776f c0776f = this.f13297c;
        boolean h2 = c0776f.h();
        a0 a0Var = (a0) c0776f.f4728a;
        if (h2) {
            a0Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = a0Var.f13259c.f13354I;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Y.m l9 = c0776f.l(context);
        String string2 = StubApp.getString2(2906);
        if (l9 == null) {
            throw new IllegalStateException(string2);
        }
        Animation animation = (Animation) l9.f8674b;
        if (animation == null) {
            throw new IllegalStateException(string2);
        }
        if (a0Var.f13257a != c0.f13287a) {
            view.startAnimation(animation);
            a0Var.c(this);
            return;
        }
        container.startViewTransition(view);
        RunnableC0792w runnableC0792w = new RunnableC0792w(animation, container, view);
        runnableC0792w.setAnimationListener(new AnimationAnimationListenerC0774d(a0Var, container, view, this));
        view.startAnimation(runnableC0792w);
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16697) + a0Var + StubApp.getString2(16716));
        }
    }
}
