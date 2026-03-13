package l7;

import Qb.I;
import Tb.C;
import Tb.InterfaceC0327h;
import Tb.b0;
import com.stub.StubApp;
import i5.C1059c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l7.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1238h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f16756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f16757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f16758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238h(InterfaceC0327h interfaceC0327h, C1059c c1059c, Continuation continuation, r rVar) {
        super(2, continuation);
        this.f16756b = c1059c;
        this.f16757c = interfaceC0327h;
        this.f16758d = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1238h(this.f16757c, this.f16756b, continuation, this.f16758d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1238h) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f16755a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C1059c c1059c = this.f16756b;
            b0 b0Var = (b0) c1059c.f14845d;
            C1236f c1236f = new C1236f(null, c1059c, this.f16757c);
            int i10 = C.f7262a;
            Ub.o oVar = new Ub.o(c1236f, b0Var, EmptyCoroutineContext.INSTANCE, -2, 1);
            C1234d c1234d = new C1234d(this.f16758d, 0);
            this.f16755a = 1;
            if (oVar.p(c1234d, this) == coroutine_suspended) {
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
