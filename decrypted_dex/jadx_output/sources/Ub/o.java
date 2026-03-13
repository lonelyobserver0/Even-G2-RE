package Ub;

import Qb.J;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class o extends i {

    /* renamed from: e, reason: collision with root package name */
    public final SuspendLambda f7609e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Function3 function3, InterfaceC0327h interfaceC0327h, CoroutineContext coroutineContext, int i3, int i10) {
        super(i3, i10, interfaceC0327h, coroutineContext);
        this.f7609e = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // Ub.g
    public final g b(CoroutineContext coroutineContext, int i3, int i10) {
        return new o(this.f7609e, this.f7591d, coroutineContext, i3, i10);
    }

    @Override // Ub.i
    public final Object d(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Object c10 = J.c(new n(this, interfaceC0328i, null), continuation);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Unit.INSTANCE;
    }
}
