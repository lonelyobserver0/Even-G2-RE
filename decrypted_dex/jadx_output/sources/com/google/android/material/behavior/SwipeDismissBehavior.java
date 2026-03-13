package com.google.android.material.behavior;

import A.b;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u4.C1774a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f11815a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11816b;

    /* renamed from: c, reason: collision with root package name */
    public int f11817c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f11818d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f11819e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public final C1774a f11820f = new C1774a(this);

    @Override // A.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f11816b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11816b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11816b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f11815a == null) {
            this.f11815a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11820f);
        }
        return this.f11815a.p(motionEvent);
    }

    @Override // A.b
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar = this.f11815a;
        if (eVar == null) {
            return false;
        }
        eVar.j(motionEvent);
        return true;
    }

    public boolean t(View view) {
        return true;
    }
}
