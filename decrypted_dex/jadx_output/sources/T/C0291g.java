package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: T.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0291g extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6854a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0291g(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0291g) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6854a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f6854a = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
