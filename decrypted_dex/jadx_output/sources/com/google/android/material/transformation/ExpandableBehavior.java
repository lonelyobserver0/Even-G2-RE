package com.google.android.material.transformation;

import A.b;
import N.I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // A.b
    public abstract void b(View view);

    @Override // A.b
    public final boolean d(View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        WeakHashMap weakHashMap = I.f4732a;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
