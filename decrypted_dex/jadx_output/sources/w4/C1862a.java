package w4;

import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1862a extends AbstractC0624h2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f22107c;

    public C1862a(BottomSheetBehavior bottomSheetBehavior) {
        this.f22107c = bottomSheetBehavior;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final boolean A(View view, int i3) {
        BottomSheetBehavior bottomSheetBehavior = this.f22107c;
        int i10 = bottomSheetBehavior.f11850u;
        if (i10 == 1 || bottomSheetBehavior.f11828H) {
            return false;
        }
        if (i10 == 3 && bottomSheetBehavior.f11826F == i3) {
            WeakReference weakReference = bottomSheetBehavior.f11823C;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = bottomSheetBehavior.f11822B;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int b(View view, int i3) {
        return view.getLeft();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int c(View view, int i3) {
        BottomSheetBehavior bottomSheetBehavior = this.f22107c;
        int y10 = bottomSheetBehavior.y();
        int i10 = bottomSheetBehavior.f11848s ? bottomSheetBehavior.f11821A : bottomSheetBehavior.f11846q;
        return i3 < y10 ? y10 : i3 > i10 ? i10 : i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final int m() {
        BottomSheetBehavior bottomSheetBehavior = this.f22107c;
        return bottomSheetBehavior.f11848s ? bottomSheetBehavior.f11821A : bottomSheetBehavior.f11846q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void s(int i3) {
        if (i3 == 1) {
            this.f22107c.B(1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void t(View view, int i3, int i10) {
        this.f22107c.w();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void u(View view, float f10, float f11) {
        int i3;
        int i10 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f22107c;
        if (f11 < 0.0f) {
            if (bottomSheetBehavior.f11832b) {
                i3 = bottomSheetBehavior.f11843n;
            } else {
                int top = view.getTop();
                int i11 = bottomSheetBehavior.f11844o;
                if (top > i11) {
                    i3 = i11;
                } else {
                    i3 = bottomSheetBehavior.f11842m;
                }
            }
            i10 = 3;
        } else if (bottomSheetBehavior.f11848s && bottomSheetBehavior.D(view, f11) && (view.getTop() > bottomSheetBehavior.f11846q || Math.abs(f10) < Math.abs(f11))) {
            i3 = bottomSheetBehavior.f11821A;
            i10 = 5;
        } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f11832b) {
                int i12 = bottomSheetBehavior.f11844o;
                if (top2 < i12) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.f11846q)) {
                        i3 = bottomSheetBehavior.f11842m;
                        i10 = 3;
                    } else {
                        i3 = bottomSheetBehavior.f11844o;
                    }
                } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.f11846q)) {
                    i3 = bottomSheetBehavior.f11844o;
                } else {
                    i3 = bottomSheetBehavior.f11846q;
                    i10 = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.f11843n) < Math.abs(top2 - bottomSheetBehavior.f11846q)) {
                i3 = bottomSheetBehavior.f11843n;
                i10 = 3;
            } else {
                i3 = bottomSheetBehavior.f11846q;
                i10 = 4;
            }
        } else {
            if (bottomSheetBehavior.f11832b) {
                i3 = bottomSheetBehavior.f11846q;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.f11844o) < Math.abs(top3 - bottomSheetBehavior.f11846q)) {
                    i3 = bottomSheetBehavior.f11844o;
                } else {
                    i3 = bottomSheetBehavior.f11846q;
                }
            }
            i10 = 4;
        }
        bottomSheetBehavior.E(view, i10, i3, true);
    }
}
