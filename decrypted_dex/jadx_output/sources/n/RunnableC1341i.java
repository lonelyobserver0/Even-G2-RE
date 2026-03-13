package n;

import android.view.View;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1341i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1337g f17523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1345k f17524b;

    public RunnableC1341i(C1345k c1345k, C1337g c1337g) {
        this.f17524b = c1345k;
        this.f17523a = c1337g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.j jVar;
        C1345k c1345k = this.f17524b;
        m.l lVar = c1345k.f17534c;
        if (lVar != null && (jVar = lVar.f16926e) != null) {
            jVar.h(lVar);
        }
        View view = (View) c1345k.f17539h;
        if (view != null && view.getWindowToken() != null) {
            C1337g c1337g = this.f17523a;
            if (!c1337g.b()) {
                if (c1337g.f16992e != null) {
                    c1337g.d(0, 0, false, false);
                }
            }
            c1345k.f17549v = c1337g;
        }
        c1345k.f17551x = null;
    }
}
