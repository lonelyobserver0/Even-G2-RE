package K4;

import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3666a;

    public k(o oVar) {
        this.f3666a = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        o oVar = this.f3666a;
        oVar.f3682a.setEndIconActivated(z2);
        if (z2) {
            return;
        }
        oVar.f(false);
        oVar.f3675g = false;
    }
}
