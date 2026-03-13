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
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7588a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f7590c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f7590c, continuation);
        hVar.f7589b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0328i) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7588a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC0328i interfaceC0328i = (InterfaceC0328i) this.f7589b;
            this.f7588a = 1;
            if (this.f7590c.d(interfaceC0328i, this) == coroutine_suspended) {
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
