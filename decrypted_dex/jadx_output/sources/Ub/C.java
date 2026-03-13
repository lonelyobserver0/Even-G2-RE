package Ub;

import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7565a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        super(2, continuation);
        this.f7567c = interfaceC0328i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C c10 = new C(this.f7567c, continuation);
        c10.f7566b = obj;
        return c10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7565a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.f7566b;
            this.f7565a = 1;
            if (this.f7567c.a(obj2, this) == coroutine_suspended) {
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
