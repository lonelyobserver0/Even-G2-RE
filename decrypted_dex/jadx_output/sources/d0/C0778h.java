package d0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import d.C0759a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0778h extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final C0776f f13311c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f13312d;

    public C0778h(C0776f animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f13311c = animatorInfo;
    }

    @Override // d0.Z
    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f13312d;
        a0 a0Var = (a0) this.f13311c.f4728a;
        if (animatorSet == null) {
            a0Var.c(this);
            return;
        }
        if (a0Var.f13263g) {
            C0780j.f13314a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (M.J(2)) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(16718));
            sb2.append(a0Var);
            sb2.append(StubApp.getString2(16719));
            sb2.append(a0Var.f13263g ? StubApp.getString2(16720) : StubApp.getString2(1));
            sb2.append(' ');
            Log.v(StubApp.getString2(49), sb2.toString());
        }
    }

    @Override // d0.Z
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        a0 a0Var = (a0) this.f13311c.f4728a;
        AnimatorSet animatorSet = this.f13312d;
        if (animatorSet == null) {
            a0Var.c(this);
            return;
        }
        animatorSet.start();
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16718) + a0Var + StubApp.getString2(16716));
        }
    }

    @Override // d0.Z
    public final void c(C0759a backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        C0776f c0776f = this.f13311c;
        AnimatorSet animatorSet = this.f13312d;
        a0 a0Var = (a0) c0776f.f4728a;
        if (animatorSet == null) {
            a0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !a0Var.f13259c.f13378n) {
            return;
        }
        boolean J10 = M.J(2);
        String string2 = StubApp.getString2(49);
        if (J10) {
            Log.v(string2, StubApp.getString2(16721) + a0Var);
        }
        long a3 = C0779i.f13313a.a(animatorSet);
        long j = (long) (backEvent.f13048c * a3);
        if (j == 0) {
            j = 1;
        }
        if (j == a3) {
            j = a3 - 1;
        }
        if (M.J(2)) {
            Log.v(string2, StubApp.getString2(16722) + j + StubApp.getString2(16723) + animatorSet + StubApp.getString2(16724) + a0Var);
        }
        C0780j.f13314a.b(animatorSet, j);
    }

    @Override // d0.Z
    public final void d(ViewGroup container) {
        C0778h c0778h;
        Intrinsics.checkNotNullParameter(container, "container");
        C0776f c0776f = this.f13311c;
        if (c0776f.h()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Y.m l9 = c0776f.l(context);
        this.f13312d = l9 != null ? (AnimatorSet) l9.f8675c : null;
        a0 a0Var = (a0) c0776f.f4728a;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = a0Var.f13259c;
        boolean z2 = a0Var.f13257a == c0.f13289c;
        View view = abstractComponentCallbacksC0789t.f13354I;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f13312d;
        if (animatorSet != null) {
            c0778h = this;
            animatorSet.addListener(new C0777g(container, view, z2, a0Var, c0778h));
        } else {
            c0778h = this;
        }
        AnimatorSet animatorSet2 = c0778h.f13312d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
