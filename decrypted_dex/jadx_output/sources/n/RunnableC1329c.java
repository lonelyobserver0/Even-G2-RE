package n;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1329c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f17508b;

    public /* synthetic */ RunnableC1329c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f17507a = i3;
        this.f17508b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17507a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17508b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f9473z = actionBarOverlayLayout.f9455d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f9447A);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17508b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f9473z = actionBarOverlayLayout2.f9455d.animate().translationY(-actionBarOverlayLayout2.f9455d.getHeight()).setListener(actionBarOverlayLayout2.f9447A);
                break;
        }
    }
}
