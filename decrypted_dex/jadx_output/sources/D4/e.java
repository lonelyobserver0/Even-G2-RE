package D4;

import N.I;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public int f1318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1319c;

    public int getItemSpacing() {
        return this.f1318b;
    }

    public int getLineSpacing() {
        return this.f1317a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (getChildCount() == 0) {
            return;
        }
        WeakHashMap weakHashMap = I.f4732a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = (i11 - i3) - paddingLeft;
        int i16 = paddingRight;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.getMarginStart();
                    i13 = marginLayoutParams.getMarginEnd();
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i14;
                if (!this.f1319c && measuredWidth > i15) {
                    i17 = this.f1317a + paddingTop;
                    i16 = paddingRight;
                }
                int i19 = i16 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z10) {
                    childAt.layout(i15 - measuredWidth2, i17, (i15 - i16) - i14, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth2, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i14 + i13 + this.f1318b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : IntCompanionObject.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i3, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = i12;
                if (childAt.getMeasuredWidth() + paddingLeft + i13 > paddingRight && !((ChipGroup) this).f1319c) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f1317a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i18 + this.f1318b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i18;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i3) {
        this.f1318b = i3;
    }

    public void setLineSpacing(int i3) {
        this.f1317a = i3;
    }

    public void setSingleLine(boolean z2) {
        this.f1319c = z2;
    }
}
