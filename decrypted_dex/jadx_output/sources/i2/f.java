package i2;

import Qb.I;
import androidx.work.CoroutineWorker;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f14734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f14734b = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f14734b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f14733a;
        CoroutineWorker coroutineWorker = this.f14734b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14733a = 1;
                obj = coroutineWorker.h(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            coroutineWorker.f10353g.j((n) obj);
        } catch (Throwable th) {
            coroutineWorker.f10353g.k(th);
        }
        return Unit.INSTANCE;
    }
}
