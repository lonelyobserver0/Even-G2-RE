package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import v4.ViewOnLayoutChangeListenerC1833a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC1833a(this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, A.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i10) {
        throw new ClassCastException();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC1833a(this);
        new Rect();
    }
}
