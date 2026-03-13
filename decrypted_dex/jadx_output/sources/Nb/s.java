package Nb;

import Qb.I;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.h f5029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c cVar, p2.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f5028b = cVar;
        this.f5029c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f5028b, this.f5029c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f5027a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f5027a = 1;
            Object a3 = this.f5028b.j.a(this);
            if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a3 = Unit.INSTANCE;
            }
            if (a3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f5029c.f19671a = null;
        return Unit.INSTANCE;
    }
}
