package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import i2.u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f11956a;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11956a = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f11956a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i11 - i3) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int c10 = u.c(paddingRight, measuredWidth, 2, paddingLeft);
                int baseline = (this.f11956a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f11956a + paddingTop) - childAt.getBaseline();
                childAt.layout(c10, baseline, measuredWidth + c10, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i3, i10);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i14 = Math.max(i14, baseline);
                    i15 = Math.max(i15, childAt.getMeasuredHeight() - baseline);
                }
                i12 = Math.max(i12, childAt.getMeasuredWidth());
                i11 = Math.max(i11, childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        if (i14 != -1) {
            i11 = Math.max(i11, Math.max(i15, getPaddingBottom()) + i14);
            this.f11956a = i14;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i12, getSuggestedMinimumWidth()), i3, i13), View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumHeight()), i10, i13 << 16));
    }
}
