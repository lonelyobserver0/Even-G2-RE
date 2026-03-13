package n;

import android.content.Context;
import android.view.View;
import android.view.Window;
import m.C1258a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Y0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1258a f17485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z0 f17486b;

    public Y0(Z0 z02) {
        this.f17486b = z02;
        Context context = z02.f17488a.getContext();
        CharSequence charSequence = z02.f17495h;
        C1258a c1258a = new C1258a();
        c1258a.f16865e = 4096;
        c1258a.f16867g = 4096;
        c1258a.f16871l = null;
        c1258a.f16872m = null;
        c1258a.f16873n = false;
        c1258a.f16874o = false;
        c1258a.f16875p = 16;
        c1258a.f16869i = context;
        c1258a.f16861a = charSequence;
        this.f17485a = c1258a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Z0 z02 = this.f17486b;
        Window.Callback callback = z02.f17497k;
        if (callback == null || !z02.f17498l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f17485a);
    }
}
