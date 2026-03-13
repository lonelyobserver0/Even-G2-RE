package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class SingleViewFakeWindowViewGroup extends ViewGroup {
    private final Rect childRect;
    private final Rect viewBounds;

    public SingleViewFakeWindowViewGroup(Context context) {
        super(context);
        this.viewBounds = new Rect();
        this.childRect = new Rect();
    }

    private static int atMost(int i3) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.viewBounds.set(i3, i10, i11, i12);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.viewBounds, layoutParams.x, layoutParams.y, this.childRect);
            Rect rect = this.childRect;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).measure(atMost(i3), atMost(i10));
        }
        super.onMeasure(i3, i10);
    }
}
