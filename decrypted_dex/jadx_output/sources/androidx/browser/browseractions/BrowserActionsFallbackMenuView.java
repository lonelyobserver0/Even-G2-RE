package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f9609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9610b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9609a = getResources().getDimensionPixelOffset(2131099734);
        this.f9610b = getResources().getDimensionPixelOffset(2131099733);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f9609a * 2), this.f9610b), 1073741824), i10);
    }
}
