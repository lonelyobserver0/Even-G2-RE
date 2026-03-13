package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RunnableC0458k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10206b;

    public /* synthetic */ RunnableC0458k(Object obj, int i3) {
        this.f10205a = i3;
        this.f10206b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f10206b;
        switch (this.f10205a) {
            case 0:
                C0461n c0461n = (C0461n) obj;
                int i3 = c0461n.f10225A;
                ValueAnimator valueAnimator = c0461n.f10251z;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                c0461n.f10225A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).u0();
                break;
        }
    }
}
