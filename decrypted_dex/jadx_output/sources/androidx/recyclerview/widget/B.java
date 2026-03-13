package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B implements q0, G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9998a;

    public /* synthetic */ B(RecyclerView recyclerView) {
        this.f9998a = recyclerView;
    }

    public void a(C0448a c0448a) {
        int i3 = c0448a.f10100a;
        RecyclerView recyclerView = this.f9998a;
        if (i3 == 1) {
            recyclerView.mLayout.Q(c0448a.f10101b, c0448a.f10102c);
            return;
        }
        if (i3 == 2) {
            recyclerView.mLayout.T(c0448a.f10101b, c0448a.f10102c);
        } else if (i3 == 4) {
            recyclerView.mLayout.U(c0448a.f10101b, c0448a.f10102c);
        } else {
            if (i3 != 8) {
                return;
            }
            recyclerView.mLayout.S(c0448a.f10101b, c0448a.f10102c);
        }
    }

    public void b(int i3) {
        RecyclerView recyclerView = this.f9998a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}
