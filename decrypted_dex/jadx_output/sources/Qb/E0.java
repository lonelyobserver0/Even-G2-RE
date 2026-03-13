package Qb;

import Vb.AbstractC0355a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class E0 extends K0 {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f5811d;

    public E0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f5811d = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // Qb.D0
    public final void R() {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(this.f5811d);
            Result.Companion companion = Result.INSTANCE;
            AbstractC0355a.f(Result.m40constructorimpl(Unit.INSTANCE), intercepted);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            resumeWith(Result.m40constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
