package com.google.android.material.snackbar;

import I4.e;
import J4.d;
import Z9.q;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: g, reason: collision with root package name */
    public final e f11972g;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(10);
        this.f11818d = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f11819e = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f11817c = 0;
        this.f11972g = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, A.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f11972g.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (q.f9141c == null) {
                    q.f9141c = new q(9);
                }
                synchronized (q.f9141c.f9143b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (q.f9141c == null) {
                q.f9141c = new q(9);
            }
            synchronized (q.f9141c.f9143b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        this.f11972g.getClass();
        return view instanceof d;
    }
}
