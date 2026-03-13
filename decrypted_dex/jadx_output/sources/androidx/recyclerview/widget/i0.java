package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i0 extends C0470x {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0471y f10185q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(C0471y c0471y, Context context) {
        super(context);
        this.f10185q = c0471y;
    }

    @Override // androidx.recyclerview.widget.C0470x
    public final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C0470x
    public final void f(View view, Z z2) {
        C0471y c0471y = this.f10185q;
        RecyclerView recyclerView = c0471y.f10335a;
        if (recyclerView == null) {
            return;
        }
        int[] a3 = c0471y.a(recyclerView.getLayoutManager(), view);
        int i3 = a3[0];
        int i10 = a3[1];
        int ceil = (int) Math.ceil(c(Math.max(Math.abs(i3), Math.abs(i10))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            z2.f10093a = i3;
            z2.f10094b = i10;
            z2.f10095c = ceil;
            z2.f10097e = decelerateInterpolator;
            z2.f10098f = true;
        }
    }
}
