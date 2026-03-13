package androidx.appcompat.widget;

import N.I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import n.C1366u0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = I.f4732a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            r5 = 2
            if (r3 == r4) goto L3a
            r4 = 80
            if (r3 == r4) goto L31
            int r13 = r10.getPaddingTop()
            goto L43
        L31:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L43
        L3a:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / r5
            int r13 = r15 + r3
        L43:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r0 = 0
            if (r15 != 0) goto L4c
            r15 = r0
            goto L50
        L4c:
            int r15 = r15.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Laf
            android.view.View r3 = r10.getChildAt(r0)
            if (r3 == 0) goto Lac
            int r4 = r3.getVisibility()
            r6 = 8
            if (r4 == r6) goto Lac
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            n.u0 r7 = (n.C1366u0) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L73
            r8 = r2
        L73:
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L8d
            r9 = 5
            if (r8 == r9) goto L87
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L97
        L87:
            int r8 = r12 - r4
            int r9 = r7.rightMargin
        L8b:
            int r8 = r8 - r9
            goto L97
        L8d:
            int r8 = i2.u.c(r14, r4, r5, r11)
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L8b
        L97:
            boolean r9 = r10.i(r0)
            if (r9 == 0) goto L9e
            int r13 = r13 + r15
        L9e:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r4 = r4 + r8
            int r9 = r13 + r6
            r3.layout(r8, r13, r4, r9)
            int r3 = r7.bottomMargin
            int r6 = r6 + r3
            int r6 = r6 + r13
            r13 = r6
        Lac:
            int r0 = r0 + 1
            goto L50
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = alertDialogLayout.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == 2131231139) {
                    view = childAt;
                } else if (id == 2131230808) {
                    view2 = childAt;
                } else {
                    if ((id != 2131230830 && id != 2131230838) || view3 != null) {
                        super.onMeasure(i3, i10);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i3, 0);
            paddingBottom += view.getMeasuredHeight();
            i11 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i11 = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            i12 = j(view2);
            i13 = view2.getMeasuredHeight() - i12;
            paddingBottom += i12;
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i14 = view3.getMeasuredHeight();
            paddingBottom += i14;
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        } else {
            i14 = 0;
        }
        int i16 = size - paddingBottom;
        if (view2 != null) {
            int i17 = paddingBottom - i12;
            int min = Math.min(i16, i13);
            if (min > 0) {
                i16 -= min;
                i12 += min;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            paddingBottom = i17 + view2.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(i14 + i16, mode));
            paddingBottom = (paddingBottom - i14) + view3.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = alertDialogLayout.getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                i18 = Math.max(i18, childAt2.getMeasuredWidth());
            }
        }
        int i20 = i10;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i18, i3, i11), View.resolveSizeAndState(paddingBottom, i20, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i21 = 0;
            while (i21 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i21);
                if (childAt3.getVisibility() != 8) {
                    C1366u0 c1366u0 = (C1366u0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1366u0).width == -1) {
                        int i22 = ((LinearLayout.LayoutParams) c1366u0).height;
                        ((LinearLayout.LayoutParams) c1366u0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i20, 0);
                        ((LinearLayout.LayoutParams) c1366u0).height = i22;
                    }
                }
                i21++;
                alertDialogLayout = this;
                i20 = i10;
            }
        }
    }
}
