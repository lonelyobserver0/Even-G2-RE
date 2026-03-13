package Cb;

import Kb.a;
import com.stub.StubApp;
import java.util.Arrays;
import vb.EnumC1846c;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC1845b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mb.a f1157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1158b;

    public a(b bVar, Mb.a aVar) {
        this.f1158b = bVar;
        this.f1157a = aVar;
    }

    @Override // vb.InterfaceC1845b
    public final void i(Db.c cVar) {
        this.f1157a.i(this.f1158b, cVar);
    }

    @Override // vb.InterfaceC1845b
    public final void m(Hb.b bVar) {
        Kb.a aVar = (Kb.a) bVar;
        b.f1159b.c(aVar, StubApp.getString2(1223));
        boolean b2 = aVar.b();
        Mb.a aVar2 = this.f1157a;
        b bVar2 = this.f1158b;
        if (!b2) {
            aVar2.i(bVar2, new Db.b(EnumC1846c.a(aVar.f3016rc)));
            return;
        }
        for (a.C0000a c0000a : aVar.images) {
            if (Arrays.equals(c0000a.hash, bVar2.f1160a)) {
                if (c0000a.permanent || c0000a.confirmed) {
                    aVar2.h(bVar2);
                    return;
                } else {
                    aVar2.i(bVar2, new Db.c(StubApp.getString2(1224)));
                    return;
                }
            }
        }
        aVar2.h(bVar2);
    }
}
