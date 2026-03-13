package Cb;

import Nb.r;
import Nb.u;
import Qb.C0208m0;
import Qb.K0;
import Qb.L;
import Z9.C;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends e {

    /* renamed from: a, reason: collision with root package name */
    public final C f1176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1177b;

    /* renamed from: c, reason: collision with root package name */
    public Nb.e f1178c;

    public l(C c10, int i3) {
        this.f1176a = c10;
        this.f1177b = i3;
    }

    @Override // Cb.e
    public final void a() {
        this.f1178c.cancel();
    }

    @Override // Cb.e
    public final int b() {
        return 2;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f280b;
    }

    @Override // Cb.e
    public final void d() {
        this.f1178c.pause();
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        Nb.d dVar;
        ExecutorService executorService;
        Nb.e eVar = this.f1178c;
        if (eVar != null) {
            eVar.resume();
            return;
        }
        E0 callback = new E0(this, aVar, 5);
        Ab.g gVar = (Ab.g) aVar.f4726e;
        Gb.c cVar = new Gb.c((wb.f) gVar.f278e);
        int i3 = gVar.f276c;
        if (i3 > 1) {
            Nb.c cVar2 = new Nb.c(cVar, (byte[]) this.f1176a.f9078c, this.f1177b, i3, gVar.f277d);
            Intrinsics.checkNotNullParameter(callback, "callback");
            C0208m0 scope = C0208m0.f5881a;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(scope, "scope");
            K0 j = L.j(scope, new r(cVar2), new u(cVar2, callback, null), 2);
            j.I(new A8.a(callback, 5));
            p2.h hVar = new p2.h();
            hVar.f19672b = scope;
            hVar.f19673c = cVar2;
            hVar.f19674d = j;
            this.f1178c = hVar;
            return;
        }
        byte[] bArr = (byte[]) this.f1176a.f9078c;
        int i10 = this.f1177b;
        D5.u uVar = new D5.u();
        uVar.f1461e = cVar;
        uVar.f1459c = bArr;
        uVar.f1457a = 0;
        uVar.f1460d = callback;
        uVar.f1458b = i10;
        synchronized (cVar) {
            dVar = new Nb.d(uVar);
            synchronized (cVar) {
                try {
                    if (cVar.f4991e == null) {
                        cVar.f4991e = Executors.newSingleThreadExecutor();
                    }
                    executorService = cVar.f4991e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1178c = dVar;
        }
        executorService.execute(new Nb.f(cVar, dVar));
        this.f1178c = dVar;
    }
}
