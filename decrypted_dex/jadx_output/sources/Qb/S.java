package Qb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class S {
    public static final Object a(long j, Continuation continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        if (j < LongCompanionObject.MAX_VALUE) {
            b(c0203k.f5877e).k(j, c0203k);
        }
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
    }

    public static final Q b(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        Q q10 = element instanceof Q ? (Q) element : null;
        return q10 == null ? N.f5825a : q10;
    }
}
