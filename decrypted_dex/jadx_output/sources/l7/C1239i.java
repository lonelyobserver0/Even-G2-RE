package l7;

import Qb.I;
import Tb.InterfaceC0327h;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l7.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1239i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f16760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f16761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239i(InterfaceC0327h interfaceC0327h, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f16760b = interfaceC0327h;
        this.f16761c = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1239i(this.f16760b, this.f16761c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1239i) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f16759a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C1234d c1234d = new C1234d(this.f16761c, 1);
            this.f16759a = 1;
            if (this.f16760b.p(c1234d, this) == coroutine_suspended) {
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
