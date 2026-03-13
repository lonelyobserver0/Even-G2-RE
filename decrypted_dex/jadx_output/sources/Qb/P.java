package Qb;

import com.stub.StubApp;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class P extends AbstractC0183a implements O {
    @Override // Qb.O
    public final Object e() {
        Object E10 = E();
        if (E10 instanceof InterfaceC0212o0) {
            throw new IllegalStateException(StubApp.getString2(25487));
        }
        if (E10 instanceof C0220t) {
            throw ((C0220t) E10).f5894a;
        }
        return L.m(E10);
    }

    @Override // Qb.O
    public final Object p(ContinuationImpl continuationImpl) {
        Object q10 = q(continuationImpl);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return q10;
    }
}
