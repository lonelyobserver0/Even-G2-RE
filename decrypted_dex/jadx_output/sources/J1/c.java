package J1;

import Qb.C0203k;
import Qb.I;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f3306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0203k f3307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Callable callable, C0203k c0203k, Continuation continuation) {
        super(2, continuation);
        this.f3306a = callable;
        this.f3307b = c0203k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f3306a, this.f3307b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0203k c0203k = this.f3307b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            c0203k.resumeWith(Result.m40constructorimpl(this.f3306a.call()));
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(th)));
        }
        return Unit.INSTANCE;
    }
}
