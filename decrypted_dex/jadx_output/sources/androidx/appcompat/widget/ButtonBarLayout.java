package androidx.appcompat.widget;

import N.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import h.AbstractC0997a;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9490a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9491b;

    /* renamed from: c, reason: collision with root package name */
    public int f9492c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9492c = -1;
        int[] iArr = AbstractC0997a.f14403k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        I.h(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f9490a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f9490a);
        }
    }

    private void setStacked(boolean z2) {
        if (this.f9491b != z2) {
            if (!z2 || this.f9490a) {
                this.f9491b = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View findViewById = findViewById(2131231071);
                if (findViewById != null) {
                    findViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean z2;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = 0;
        if (this.f9490a) {
            if (size > this.f9492c && this.f9491b) {
                setStacked(false);
            }
            this.f9492c = size;
        }
        if (this.f9491b || View.MeasureSpec.getMode(i3) != 1073741824) {
            i11 = i3;
            z2 = false;
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i11, i10);
        if (this.f9490a && !this.f9491b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i3, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 >= childCount) {
                i14 = -1;
                break;
            } else if (getChildAt(i14).getVisibility() == 0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f9491b) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                }
                i13 = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = I.f4732a;
        if (getMinimumHeight() != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i3, i10);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f9490a != z2) {
            this.f9490a = z2;
            if (!z2 && this.f9491b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
