package Y;

import android.os.Build;
import f5.u0;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R3.l f8654e;

    public d(R3.l lVar) {
        this.f8654e = lVar;
    }

    @Override // f5.u0
    public final void s(Throwable th) {
        ((h) this.f8654e.f6140a).d(th);
    }

    @Override // f5.u0
    public final void t(p2.h hVar) {
        R3.l lVar = this.f8654e;
        lVar.f6142c = hVar;
        p2.h hVar2 = (p2.h) lVar.f6142c;
        h hVar3 = (h) lVar.f6140a;
        lVar.f6141b = new Q2.g(hVar2, hVar3.f8665g, hVar3.f8667i, Build.VERSION.SDK_INT >= 34 ? l.a() : hc.b.A());
        h hVar4 = (h) lVar.f6140a;
        hVar4.getClass();
        ArrayList arrayList = new ArrayList();
        hVar4.f8659a.writeLock().lock();
        try {
            hVar4.f8661c = 1;
            arrayList.addAll(hVar4.f8660b);
            hVar4.f8660b.clear();
            hVar4.f8659a.writeLock().unlock();
            hVar4.f8662d.post(new K.a(arrayList, hVar4.f8661c, (Throwable) null));
        } catch (Throwable th) {
            hVar4.f8659a.writeLock().unlock();
            throw th;
        }
    }
}
