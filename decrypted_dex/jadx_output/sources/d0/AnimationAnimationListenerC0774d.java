package d0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AnimationAnimationListenerC0774d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f13292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0775e f13295d;

    public AnimationAnimationListenerC0774d(a0 a0Var, ViewGroup viewGroup, View view, C0775e c0775e) {
        this.f13292a = a0Var;
        this.f13293b = viewGroup;
        this.f13294c = view;
        this.f13295d = c0775e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f13294c;
        C0775e c0775e = this.f13295d;
        ViewGroup viewGroup = this.f13293b;
        viewGroup.post(new Ab.c(viewGroup, view, c0775e, 10));
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16697) + this.f13292a + StubApp.getString2(16698));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16697) + this.f13292a + StubApp.getString2(16699));
        }
    }
}
