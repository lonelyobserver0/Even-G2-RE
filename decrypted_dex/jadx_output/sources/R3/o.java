package R3;

import com.google.android.gms.common.api.Status;
import f4.C0877a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends AbstractBinderC0237f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6143f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6144g;

    public o(C0877a c0877a) {
        this.f6144g = c0877a;
    }

    @Override // R3.InterfaceC0238g
    public final void p(Status status) {
        switch (this.f6143f) {
            case 0:
                C0877a c0877a = (C0877a) this.f6144g;
                c0877a.getClass();
                a4.f.v(status, null, c0877a.f13740a);
                break;
            default:
                a4.f.v(status, null, (q4.k) this.f6144g);
                break;
        }
    }

    public o(q4.k kVar) {
        this.f6144g = kVar;
    }
}
