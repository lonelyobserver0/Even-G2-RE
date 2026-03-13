package i;

import N.AbstractC0179z;
import N.I;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f14519d;

    public /* synthetic */ F(H h2, int i3) {
        this.f14518c = i3;
        this.f14519d = h2;
    }

    @Override // N.M
    public final void c() {
        View view;
        H h2 = this.f14519d;
        switch (this.f14518c) {
            case 0:
                if (h2.f14540p && (view = h2.f14533h) != null) {
                    view.setTranslationY(0.0f);
                    h2.f14530e.setTranslationY(0.0f);
                }
                h2.f14530e.setVisibility(8);
                h2.f14530e.setTransitioning(false);
                h2.f14544t = null;
                Y.m mVar = h2.f14536l;
                if (mVar != null) {
                    mVar.u(h2.f14535k);
                    h2.f14535k = null;
                    h2.f14536l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = h2.f14529d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = I.f4732a;
                    AbstractC0179z.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                h2.f14544t = null;
                h2.f14530e.requestLayout();
                break;
        }
    }
}
