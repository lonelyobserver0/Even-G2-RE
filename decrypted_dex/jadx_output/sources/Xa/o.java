package Xa;

import c2.C0558j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class o implements M.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8561b;

    public /* synthetic */ o(Object obj, int i3) {
        this.f8560a = i3;
        this.f8561b = obj;
    }

    @Override // M.a
    public final void accept(Object obj) {
        switch (this.f8560a) {
            case 0:
                ((r) this.f8561b).setWindowInfoListenerDisplayFeatures((C0558j) obj);
                break;
            default:
                ((Sb.j) ((Sb.v) this.f8561b)).j((C0558j) obj);
                break;
        }
    }
}
