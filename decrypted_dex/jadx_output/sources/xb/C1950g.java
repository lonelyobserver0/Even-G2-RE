package xb;

import Qb.E;
import i5.C1059c;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: xb.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1950g extends AbstractCoroutineContextElement implements E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1059c f23161a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1950g(i5.C1059c r2) {
        /*
            r1 = this;
            Qb.D r0 = Qb.D.f5808a
            r1.f23161a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.C1950g.<init>(i5.c):void");
    }

    @Override // Qb.E
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        for (wb.e eVar : (wb.e[]) this.f23161a.f14847f) {
            if (eVar != null) {
                eVar.a(th);
            }
        }
    }
}
