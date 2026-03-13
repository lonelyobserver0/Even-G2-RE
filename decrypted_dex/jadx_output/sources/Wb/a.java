package Wb;

import Qb.AbstractC0183a;
import Vb.AbstractC0355a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {
    public static void a(Function2 function2, AbstractC0183a abstractC0183a, AbstractC0183a abstractC0183a2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, abstractC0183a, abstractC0183a2));
            Result.Companion companion = Result.INSTANCE;
            AbstractC0355a.f(Result.m40constructorimpl(Unit.INSTANCE), intercepted);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            abstractC0183a2.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
