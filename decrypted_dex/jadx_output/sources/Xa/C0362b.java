package Xa;

import android.window.OnBackInvokedCallback;

/* renamed from: Xa.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0362b implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8524b;

    public /* synthetic */ C0362b(Object obj, int i3) {
        this.f8523a = i3;
        this.f8524b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8523a) {
            case 0:
                ((AbstractActivityC0364d) this.f8524b).onBackPressed();
                break;
            case 1:
                ((d.u) this.f8524b).invoke();
                break;
            case 2:
                ((i.v) this.f8524b).D();
                break;
            default:
                ((Runnable) this.f8524b).run();
                break;
        }
    }
}
