package xb;

import Qb.I;
import com.stub.StubApp;
import i5.C1059c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1944a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f23139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944a(C1059c c1059c, Continuation continuation) {
        super(2, continuation);
        this.f23139b = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1944a(this.f23139b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1944a) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f23138a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f23138a = 1;
            if (C1059c.a(this.f23139b, this) == coroutine_suspended) {
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
