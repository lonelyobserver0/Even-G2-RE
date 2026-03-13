package com.google.android.material.floatingactionbutton;

import A.b;
import A.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FloatingActionButton$BaseBehavior<T> extends b {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // A.b
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void c(e eVar) {
        if (eVar.f15h == 0) {
            eVar.f15h = 80;
        }
    }

    @Override // A.b
    public final boolean d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20326e);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
