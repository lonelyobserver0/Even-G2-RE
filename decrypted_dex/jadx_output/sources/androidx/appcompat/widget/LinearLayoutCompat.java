package androidx.appcompat.widget;

import N.I;
import a5.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC0997a;
import i2.u;
import n.C1366u0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9501a;

    /* renamed from: b, reason: collision with root package name */
    public int f9502b;

    /* renamed from: c, reason: collision with root package name */
    public int f9503c;

    /* renamed from: d, reason: collision with root package name */
    public int f9504d;

    /* renamed from: e, reason: collision with root package name */
    public int f9505e;

    /* renamed from: f, reason: collision with root package name */
    public int f9506f;

    /* renamed from: g, reason: collision with root package name */
    public float f9507g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9508h;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f9509k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9510l;

    /* renamed from: m, reason: collision with root package name */
    public int f9511m;

    /* renamed from: n, reason: collision with root package name */
    public int f9512n;

    /* renamed from: p, reason: collision with root package name */
    public int f9513p;

    /* renamed from: q, reason: collision with root package name */
    public int f9514q;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1366u0;
    }

    public final void d(Canvas canvas, int i3) {
        this.f9510l.setBounds(getPaddingLeft() + this.f9514q, i3, (getWidth() - getPaddingRight()) - this.f9514q, this.f9512n + i3);
        this.f9510l.draw(canvas);
    }

    public final void e(Canvas canvas, int i3) {
        this.f9510l.setBounds(i3, getPaddingTop() + this.f9514q, this.f9511m + i3, (getHeight() - getPaddingBottom()) - this.f9514q);
        this.f9510l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1366u0 generateDefaultLayoutParams() {
        int i3 = this.f9504d;
        if (i3 == 0) {
            return new C1366u0(-2, -2);
        }
        if (i3 == 1) {
            return new C1366u0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1366u0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1366u0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f9502b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f9502b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f9502b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.f9503c;
        if (this.f9504d == 1 && (i3 = this.f9505e & 112) != 48) {
            if (i3 == 16) {
                i11 = u.c(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f9506f, 2, i11);
            } else if (i3 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9506f;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((C1366u0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9502b;
    }

    public Drawable getDividerDrawable() {
        return this.f9510l;
    }

    public int getDividerPadding() {
        return this.f9514q;
    }

    public int getDividerWidth() {
        return this.f9511m;
    }

    public int getGravity() {
        return this.f9505e;
    }

    public int getOrientation() {
        return this.f9504d;
    }

    public int getShowDividers() {
        return this.f9513p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9507g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1366u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1366u0 ? new C1366u0((C1366u0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1366u0((ViewGroup.MarginLayoutParams) layoutParams) : new C1366u0(layoutParams);
    }

    public final boolean i(int i3) {
        if (i3 == 0) {
            return (this.f9513p & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f9513p & 4) != 0;
        }
        if ((this.f9513p & 2) != 0) {
            for (int i10 = i3 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.f9510l == null) {
            return;
        }
        int i10 = 0;
        if (this.f9504d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1366u0) childAt.getLayoutParams())).topMargin) - this.f9512n);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f9512n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1366u0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                C1366u0 c1366u0 = (C1366u0) childAt3.getLayoutParams();
                e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1366u0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1366u0).leftMargin) - this.f9511m);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1366u0 c1366u02 = (C1366u0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1366u02).leftMargin;
                    i3 = this.f9511m;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1366u02).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f9511m;
                right = left - i3;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f9501a = z2;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f9502b = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f9510l) {
            return;
        }
        this.f9510l = drawable;
        if (drawable != null) {
            this.f9511m = drawable.getIntrinsicWidth();
            this.f9512n = drawable.getIntrinsicHeight();
        } else {
            this.f9511m = 0;
            this.f9512n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f9514q = i3;
    }

    public void setGravity(int i3) {
        if (this.f9505e != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f9505e = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i10 = i3 & 8388615;
        int i11 = this.f9505e;
        if ((8388615 & i11) != i10) {
            this.f9505e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f9508h = z2;
    }

    public void setOrientation(int i3) {
        if (this.f9504d != i3) {
            this.f9504d = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f9513p) {
            requestLayout();
        }
        this.f9513p = i3;
    }

    public void setVerticalGravity(int i3) {
        int i10 = i3 & 112;
        int i11 = this.f9505e;
        if ((i11 & 112) != i10) {
            this.f9505e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f9507g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, 0);
        this.f9501a = true;
        this.f9502b = -1;
        this.f9503c = 0;
        this.f9505e = 8388659;
        int[] iArr = AbstractC0997a.f14406n;
        c E10 = c.E(context, attributeSet, iArr, 0);
        I.h(this, context, iArr, attributeSet, (TypedArray) E10.f9283c, 0);
        TypedArray typedArray = (TypedArray) E10.f9283c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f9507g = typedArray.getFloat(4, -1.0f);
        this.f9502b = typedArray.getInt(3, -1);
        this.f9508h = typedArray.getBoolean(7, false);
        setDividerDrawable(E10.r(5));
        this.f9513p = typedArray.getInt(8, 0);
        this.f9514q = typedArray.getDimensionPixelSize(6, 0);
        E10.I();
    }
}
