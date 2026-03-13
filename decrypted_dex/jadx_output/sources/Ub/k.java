package Ub;

import Qb.I;
import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0328i interfaceC0328i, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f7593b = oVar;
        this.f7594c = interfaceC0328i;
        this.f7595d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f7593b, this.f7594c, this.f7595d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7592a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r42 = this.f7593b.f7609e;
            this.f7592a = 1;
            if (r42.invoke(this.f7594c, this.f7595d, this) == coroutine_suspended) {
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
