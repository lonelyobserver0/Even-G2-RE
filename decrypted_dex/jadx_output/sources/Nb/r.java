package Nb;

import Qb.E;
import com.stub.StubApp;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r extends AbstractCoroutineContextElement implements E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5026a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(Nb.c r2) {
        /*
            r1 = this;
            Qb.D r0 = Qb.D.f5808a
            r1.f5026a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.r.<init>(Nb.c):void");
    }

    @Override // Qb.E
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        c cVar = this.f5026a;
        cVar.f4978f.b(StubApp.getString2(25419), th);
    }
}
