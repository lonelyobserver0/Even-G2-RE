package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class L implements M, InterfaceC0327h, Ub.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f7291a;

    public L(P p8) {
        this.f7291a = p8;
    }

    @Override // Tb.InterfaceC0327h
    public final Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        return P.i(this.f7291a, interfaceC0328i, continuation);
    }

    @Override // Ub.r
    public final InterfaceC0327h s(CoroutineContext coroutineContext, int i3, int i10) {
        return Q.l(this, coroutineContext, i3, i10);
    }
}
