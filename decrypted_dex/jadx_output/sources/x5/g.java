package x5;

import q4.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final k f22885a;

    public g(k kVar) {
        this.f22885a = kVar;
    }

    @Override // x5.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // x5.i
    public final boolean b(y5.a aVar) {
        int i3 = aVar.f23514b;
        if (i3 != 3 && i3 != 4 && i3 != 5) {
            return false;
        }
        this.f22885a.d(aVar.f23513a);
        return true;
    }
}
