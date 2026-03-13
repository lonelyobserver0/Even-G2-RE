package K4;

import android.widget.AutoCompleteTextView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3667a;

    public l(o oVar) {
        this.f3667a = oVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        o oVar = this.f3667a;
        oVar.f3675g = true;
        oVar.f3677i = System.currentTimeMillis();
        oVar.f(false);
    }
}
