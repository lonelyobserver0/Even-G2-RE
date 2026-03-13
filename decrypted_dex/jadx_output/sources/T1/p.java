package T1;

import java.util.ArrayList;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1692e f7139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f7140b;

    public p(q qVar, C1692e c1692e) {
        this.f7140b = qVar;
        this.f7139a = c1692e;
    }

    @Override // T1.m
    public final void d(n nVar) {
        ((ArrayList) this.f7139a.get(this.f7140b.f7142b)).remove(nVar);
        nVar.v(this);
    }
}
