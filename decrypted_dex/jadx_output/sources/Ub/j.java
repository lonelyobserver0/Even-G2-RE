package Ub;

import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends i {
    @Override // Ub.g
    public final g b(CoroutineContext coroutineContext, int i3, int i10) {
        return new j(i3, i10, this.f7591d, coroutineContext);
    }

    @Override // Ub.g
    public final InterfaceC0327h c() {
        return this.f7591d;
    }

    @Override // Ub.i
    public final Object d(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Object p8 = this.f7591d.p(interfaceC0328i, continuation);
        return p8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p8 : Unit.INSTANCE;
    }
}
