package Xa;

import android.view.ViewTreeObserver;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f8533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f8534b;

    public f(g gVar, r rVar) {
        this.f8534b = gVar;
        this.f8533a = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        g gVar = this.f8534b;
        if (gVar.f8541g && gVar.f8539e != null) {
            this.f8533a.getViewTreeObserver().removeOnPreDrawListener(this);
            gVar.f8539e = null;
        }
        return gVar.f8541g;
    }
}
