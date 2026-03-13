package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import t4.AbstractC1729a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1729a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11806b;

    /* renamed from: d, reason: collision with root package name */
    public int f11808d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f11810f;

    /* renamed from: c, reason: collision with root package name */
    public int f11807c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f11809e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // A.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f11809e
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f11809e = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f11806b
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L8a
        L2f:
            int r6 = r4.f11807c
            if (r6 != r5) goto L34
            goto L8a
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L8a
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f11808d
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f11809e
            if (r6 <= r0) goto L8a
            r4.f11806b = r2
            r4.f11808d = r5
            goto L8a
        L51:
            r4.f11806b = r3
            r4.f11807c = r5
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 == 0) goto L8a
            r5.recycle()
            r5 = 0
            r4.f11810f = r5
            goto L8a
        L60:
            r4.f11806b = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.u(r6)
            if (r2 == 0) goto L8a
            boolean r5 = r5.o(r6, r0, r1)
            if (r5 == 0) goto L8a
            r4.f11808d = r1
            int r5 = r7.getPointerId(r3)
            r4.f11807c = r5
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 != 0) goto L8a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f11810f = r5
        L8a:
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 == 0) goto L91
            r5.addMovement(r7)
        L91:
            boolean r5 = r4.f11806b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // t4.AbstractC1729a, A.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void j(View view, View view2, int i3, int[] iArr, int i10) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void n(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final Parcelable o(View view) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i10) {
        throw new ClassCastException();
    }

    @Override // A.b
    public final void r(View view, View view2, int i3) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != 3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    @Override // A.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f11809e
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f11809e = r0
        L12:
            int r0 = r7.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L82
            r5 = -1
            if (r0 == r1) goto L55
            r3 = 2
            if (r0 == r3) goto L25
            r6 = 3
            if (r0 == r6) goto L59
            goto Laa
        L25:
            int r0 = r4.f11807c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r5) goto L2f
            goto Lb2
        L2f:
            float r5 = r7.getY(r0)
            int r5 = (int) r5
            int r0 = r4.f11808d
            int r0 = r0 - r5
            boolean r2 = r4.f11806b
            if (r2 != 0) goto L45
            int r0 = java.lang.Math.abs(r0)
            int r2 = r4.f11809e
            if (r0 <= r2) goto L45
            r4.f11806b = r1
        L45:
            boolean r0 = r4.f11806b
            if (r0 != 0) goto L4a
            goto Laa
        L4a:
            r4.f11808d = r5
            r6.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L55:
            android.view.VelocityTracker r0 = r4.f11810f
            if (r0 != 0) goto L68
        L59:
            r4.f11806b = r2
            r4.f11807c = r5
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 == 0) goto Laa
            r5.recycle()
            r5 = 0
            r4.f11810f = r5
            goto Laa
        L68:
            r0.addMovement(r7)
            android.view.VelocityTracker r5 = r4.f11810f
            r7 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r7)
            android.view.VelocityTracker r5 = r4.f11810f
            int r7 = r4.f11807c
            r5.getYVelocity(r7)
            r6.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L82:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r3 = r7.getY()
            int r3 = (int) r3
            boolean r5 = r5.o(r6, r0, r3)
            if (r5 == 0) goto Lb2
            boolean r5 = r4.u(r6)
            if (r5 == 0) goto Lb2
            r4.f11808d = r3
            int r5 = r7.getPointerId(r2)
            r4.f11807c = r5
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 != 0) goto Laa
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f11810f = r5
        Laa:
            android.view.VelocityTracker r5 = r4.f11810f
            if (r5 == 0) goto Lb1
            r5.addMovement(r7)
        Lb1:
            return r1
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.s(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean u(View view) {
        if (view == null) {
            return true;
        }
        throw new ClassCastException();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
