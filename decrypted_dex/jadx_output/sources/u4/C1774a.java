package u4;

import N.I;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1774a extends AbstractC0624h2 {

    /* renamed from: c, reason: collision with root package name */
    public int f21438c;

    /* renamed from: d, reason: collision with root package name */
    public int f21439d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f21440e;

    public C1774a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f21440e = swipeDismissBehavior;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final boolean A(View view, int i3) {
        int i10 = this.f21439d;
        return (i10 == -1 || i10 == i3) && this.f21440e.t(view);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int b(View view, int i3) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = I.f4732a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i10 = this.f21440e.f11817c;
        if (i10 == 0) {
            if (z2) {
                width = this.f21438c - view.getWidth();
                width2 = this.f21438c;
            } else {
                width = this.f21438c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f21438c - view.getWidth();
            width2 = view.getWidth() + this.f21438c;
        } else if (z2) {
            width = this.f21438c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f21438c - view.getWidth();
            width2 = this.f21438c;
        }
        return Math.min(Math.max(width, i3), width2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int c(View view, int i3) {
        return view.getTop();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int l(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void r(View view, int i3) {
        this.f21439d = i3;
        this.f21438c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void s(int i3) {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void t(View view, int i3, int i10) {
        float f10 = this.f21438c;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f21440e;
        float f11 = (width * swipeDismissBehavior.f11818d) + f10;
        float width2 = (view.getWidth() * swipeDismissBehavior.f11819e) + this.f21438c;
        float f12 = i3;
        if (f12 <= f11) {
            view.setAlpha(1.0f);
        } else if (f12 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f12 - f11) / (width2 - f11))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f21438c) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f21439d = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f21440e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = N.I.f4732a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f11817c
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L2a:
            if (r1 <= 0) goto L5e
            goto L52
        L2d:
            if (r6 != r3) goto L5e
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L5e
            goto L52
        L34:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L39:
            int r10 = r9.getLeft()
            int r0 = r8.f21438c
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L5e
        L52:
            int r10 = r9.getLeft()
            int r0 = r8.f21438c
            if (r10 >= r0) goto L5c
            int r0 = r0 - r11
            goto L61
        L5c:
            int r0 = r0 + r11
            goto L61
        L5e:
            int r0 = r8.f21438c
            r3 = r4
        L61:
            S.e r10 = r2.f11815a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L77
            l4.O0 r10 = new l4.O0
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = N.I.f4732a
            r9.postOnAnimation(r10)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1774a.u(android.view.View, float, float):void");
    }
}
