package T1;

import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7090a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7091b;

    public e(ViewGroup viewGroup) {
        this.f7091b = viewGroup;
    }

    @Override // T1.o, T1.m
    public final void a() {
        W.a.y(this.f7091b, false);
    }

    @Override // T1.o, T1.m
    public final void b() {
        W.a.y(this.f7091b, false);
        this.f7090a = true;
    }

    @Override // T1.m
    public final void d(n nVar) {
        if (!this.f7090a) {
            W.a.y(this.f7091b, false);
        }
        nVar.v(this);
    }

    @Override // T1.o, T1.m
    public final void e() {
        W.a.y(this.f7091b, true);
    }
}
