package n;

import androidx.appcompat.widget.Toolbar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f17462b;

    public /* synthetic */ S0(Toolbar toolbar, int i3) {
        this.f17461a = i3;
        this.f17462b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17461a) {
            case 0:
                U0 u02 = this.f17462b.h0;
                m.n nVar = u02 == null ? null : u02.f17467b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f17462b.m();
                break;
        }
    }
}
