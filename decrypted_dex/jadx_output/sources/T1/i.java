package T1;

import N.I;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.C0461n;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7107a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7108b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7109c;

    public i(View view) {
        this.f7109c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7107a) {
            case 1:
                this.f7108b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7107a) {
            case 0:
                u uVar = t.f7149a;
                View view = (View) this.f7109c;
                uVar.y(view, 1.0f);
                if (this.f7108b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
            default:
                if (!this.f7108b) {
                    C0461n c0461n = (C0461n) this.f7109c;
                    if (((Float) c0461n.f10251z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0461n.f10225A = 2;
                        c0461n.f10244s.invalidate();
                        break;
                    } else {
                        c0461n.f10225A = 0;
                        c0461n.f(0);
                        break;
                    }
                } else {
                    this.f7108b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7107a) {
            case 0:
                WeakHashMap weakHashMap = I.f4732a;
                View view = (View) this.f7109c;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f7108b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(C0461n c0461n) {
        this.f7109c = c0461n;
    }
}
