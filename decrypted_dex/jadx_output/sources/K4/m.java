package K4;

import N.M;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3669b;

    public /* synthetic */ m(Object obj, int i3) {
        this.f3668a = i3;
        this.f3669b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3668a) {
            case 1:
                ((M) this.f3669b).a();
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3669b;
                actionBarOverlayLayout.f9473z = null;
                actionBarOverlayLayout.f9460k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f3668a) {
            case 0:
                o oVar = (o) this.f3669b;
                oVar.f3684c.setChecked(oVar.f3676h);
                oVar.f3681n.start();
                break;
            case 1:
                ((M) this.f3669b).c();
                break;
            case 2:
                ((T1.n) this.f3669b).m();
                animation.removeListener(this);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                Y6.j jVar = (Y6.j) this.f3669b;
                Y6.s sVar = jVar.f8766c;
                if ((sVar != null ? sVar.f8825b : null) == animation) {
                    jVar.f8766c = null;
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((m7.f) ((l7.v) this.f3669b).f16805e.f19671a).f17141g = false;
                animation.removeListener(this);
                break;
            case 5:
            default:
                super.onAnimationEnd(animation);
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3669b;
                actionBarOverlayLayout.f9473z = null;
                actionBarOverlayLayout.f9460k = false;
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f3669b).f11814c = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        switch (this.f3668a) {
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationRepeat(animation);
                Double valueOf = Double.valueOf(0.0d);
                m7.h hVar = (m7.h) this.f3669b;
                hVar.setObjectValues(valueOf, Double.valueOf(hVar.f17145g));
                break;
            default:
                super.onAnimationRepeat(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3668a) {
            case 1:
                ((M) this.f3669b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public m(M m4, View view) {
        this.f3668a = 1;
        this.f3669b = m4;
    }
}
