package m8;

import h8.EnumC1011a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f17184b = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f17184b, continuation);
        lVar.f17183a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((EnumC1011a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (k.f17182a[((EnumC1011a) this.f17183a).ordinal()] == 1) {
            this.f17184b.f17229i.h();
        }
        return Unit.INSTANCE;
    }
}
