package Ub;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7582a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f7584c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f7584c, continuation);
        fVar.f7583b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((Sb.v) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7582a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Sb.v vVar = (Sb.v) this.f7583b;
            this.f7582a = 1;
            if (this.f7584c.a(vVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
