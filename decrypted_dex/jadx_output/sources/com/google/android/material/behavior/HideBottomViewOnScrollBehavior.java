package com.google.android.material.behavior;

import A.b;
import K4.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f11812a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11813b = 2;

    /* renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f11814c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // A.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f11812a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // A.b
    public final void k(View view, int i3) {
        if (i3 > 0) {
            if (this.f11813b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f11814c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f11813b = 1;
            this.f11814c = view.animate().translationY(this.f11812a).setInterpolator(AbstractC1598a.f20748c).setDuration(175L).setListener(new m(this, 7));
            return;
        }
        if (i3 >= 0 || this.f11813b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f11814c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f11813b = 2;
        this.f11814c = view.animate().translationY(0).setInterpolator(AbstractC1598a.f20749d).setDuration(225L).setListener(new m(this, 7));
    }

    @Override // A.b
    public final boolean p(int i3) {
        return i3 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
