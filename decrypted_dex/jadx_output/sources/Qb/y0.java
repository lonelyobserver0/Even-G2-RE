package Qb;

import com.stub.StubApp;
import kotlin.coroutines.Continuation;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y0 extends C0203k {
    public final D0 j;

    public y0(D0 d02, Continuation continuation) {
        super(1, continuation);
        this.j = d02;
    }

    @Override // Qb.C0203k
    public final Throwable q(D0 d02) {
        Throwable d8;
        Object E10 = this.j.E();
        return (!(E10 instanceof A0) || (d8 = ((A0) E10).d()) == null) ? E10 instanceof C0220t ? ((C0220t) E10).f5894a : d02.z() : d8;
    }

    @Override // Qb.C0203k
    public final String z() {
        return StubApp.getString2(25536);
    }
}
