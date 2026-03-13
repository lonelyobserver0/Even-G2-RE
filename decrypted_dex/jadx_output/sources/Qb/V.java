package Qb;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class V {
    public static final void a(C0203k c0203k, Continuation continuation, boolean z2) {
        Object f10;
        Object obj = C0203k.f5874g.get(c0203k);
        Throwable e10 = c0203k.e(obj);
        if (e10 != null) {
            Result.Companion companion = Result.INSTANCE;
            f10 = ResultKt.createFailure(e10);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            f10 = c0203k.f(obj);
        }
        Object m40constructorimpl = Result.m40constructorimpl(f10);
        if (!z2) {
            continuation.resumeWith(m40constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Vb.i iVar = (Vb.i) continuation;
        Continuation continuation2 = iVar.f7946e;
        CoroutineContext coroutineContext = continuation2.get$context();
        Object c10 = Vb.B.c(coroutineContext, iVar.f7948g);
        T0 c11 = c10 != Vb.B.f7923a ? AbstractC0231z.c(continuation2, coroutineContext, c10) : null;
        try {
            iVar.f7946e.resumeWith(m40constructorimpl);
            Unit unit = Unit.INSTANCE;
            if (c11 == null || c11.Z()) {
                Vb.B.a(coroutineContext, c10);
            }
        } catch (Throwable th) {
            if (c11 == null || c11.Z()) {
                Vb.B.a(coroutineContext, c10);
            }
            throw th;
        }
    }
}
