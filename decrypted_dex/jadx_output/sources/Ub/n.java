package Ub;

import Qb.I;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7605a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0328i interfaceC0328i, Continuation continuation) {
        super(2, continuation);
        this.f7607c = oVar;
        this.f7608d = interfaceC0328i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f7607c, this.f7608d, continuation);
        nVar.f7606b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7605a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I i10 = (I) this.f7606b;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            o oVar = this.f7607c;
            InterfaceC0327h interfaceC0327h = oVar.f7591d;
            m mVar = new m(objectRef, i10, oVar, this.f7608d);
            this.f7605a = 1;
            if (interfaceC0327h.p(mVar, this) == coroutine_suspended) {
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
