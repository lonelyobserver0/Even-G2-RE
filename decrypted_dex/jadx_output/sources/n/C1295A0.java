package n;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: n.A0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1295A0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1299C0 f17359a;

    public C1295A0(AbstractC1299C0 abstractC1299C0) {
        this.f17359a = abstractC1299C0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i10, int i11) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            AbstractC1299C0 abstractC1299C0 = this.f17359a;
            if (abstractC1299C0.f17372B.getInputMethodMode() == 2 || abstractC1299C0.f17372B.getContentView() == null) {
                return;
            }
            Handler handler = abstractC1299C0.f17392x;
            RunnableC1374y0 runnableC1374y0 = abstractC1299C0.f17388s;
            handler.removeCallbacks(runnableC1374y0);
            runnableC1374y0.run();
        }
    }
}
