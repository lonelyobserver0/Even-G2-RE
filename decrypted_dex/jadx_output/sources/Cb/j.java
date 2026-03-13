package Cb;

import Kb.a;
import com.stub.StubApp;
import java.util.Arrays;
import vb.EnumC1846c;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements InterfaceC1845b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mb.a f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f1173b;

    public j(k kVar, Mb.a aVar) {
        this.f1173b = kVar;
        this.f1172a = aVar;
    }

    @Override // vb.InterfaceC1845b
    public final void i(Db.c cVar) {
        this.f1172a.i(this.f1173b, cVar);
    }

    @Override // vb.InterfaceC1845b
    public final void m(Hb.b bVar) {
        Kb.a aVar = (Kb.a) bVar;
        k.f1174b.c(aVar, StubApp.getString2(1229));
        boolean b2 = aVar.b();
        Mb.a aVar2 = this.f1172a;
        k kVar = this.f1173b;
        if (!b2) {
            aVar2.i(kVar, new Db.b(EnumC1846c.a(aVar.f3016rc)));
            return;
        }
        for (a.C0000a c0000a : aVar.images) {
            if (Arrays.equals(c0000a.hash, kVar.f1175a)) {
                if (c0000a.pending) {
                    aVar2.h(kVar);
                    return;
                } else {
                    aVar2.i(kVar, new Db.c(StubApp.getString2(1230)));
                    return;
                }
            }
        }
        aVar2.i(kVar, new Db.c(StubApp.getString2(1231)));
    }
}
