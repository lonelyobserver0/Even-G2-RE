package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.BaseInterpolator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f10093a;

    /* renamed from: b, reason: collision with root package name */
    public int f10094b;

    /* renamed from: c, reason: collision with root package name */
    public int f10095c;

    /* renamed from: d, reason: collision with root package name */
    public int f10096d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f10097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10098f;

    /* renamed from: g, reason: collision with root package name */
    public int f10099g;

    public final void a(RecyclerView recyclerView) {
        int i3 = this.f10096d;
        if (i3 >= 0) {
            this.f10096d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i3);
            this.f10098f = false;
            return;
        }
        if (!this.f10098f) {
            this.f10099g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f10097e;
        if (baseInterpolator != null && this.f10095c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f10095c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.mViewFlinger.b(this.f10093a, this.f10094b, baseInterpolator, i10);
        int i11 = this.f10099g + 1;
        this.f10099g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f10098f = false;
    }
}
