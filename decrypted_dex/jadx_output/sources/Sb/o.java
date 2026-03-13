package Sb;

import Qb.I;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6719a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f6721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f6721c = xVar;
        this.f6722d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.f6721c, this.f6722d, continuation);
        oVar.f6720b = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m40constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6719a;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                x xVar = this.f6721c;
                Object obj2 = this.f6722d;
                Result.Companion companion = Result.INSTANCE;
                this.f6719a = 1;
                if (xVar.k(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        return new m(Result.m47isSuccessimpl(m40constructorimpl) ? Unit.INSTANCE : new k(Result.m43exceptionOrNullimpl(m40constructorimpl)));
    }
}
