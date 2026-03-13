package com.google.android.material.appbar;

import A.b;
import A.e;
import N.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r4.AbstractC1567a;
import t4.AbstractC1729a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1729a {

    /* renamed from: b, reason: collision with root package name */
    public final int f11811b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void u(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
    }

    @Override // A.b
    public final boolean d(View view, View view2) {
        int i3;
        b bVar = ((e) view2.getLayoutParams()).f8a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i10 = this.f11811b;
            if (i10 == 0 || (i3 = (int) (0.0f * i10)) < 0) {
                i10 = 0;
            } else if (i3 <= i10) {
                i10 = i3;
            }
            int i11 = bottom - i10;
            WeakHashMap weakHashMap = I.f4732a;
            view.offsetTopAndBottom(i11);
        }
        return false;
    }

    @Override // A.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view) {
        int i3 = view.getLayoutParams().height;
        if (i3 != -1 && i3 != -2) {
            return false;
        }
        u(coordinatorLayout.j(view));
        return false;
    }

    @Override // A.b
    public final void m(CoordinatorLayout coordinatorLayout, View view) {
        u(coordinatorLayout.j(view));
    }

    @Override // t4.AbstractC1729a
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i3) {
        u(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i3);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20336p);
        this.f11811b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
