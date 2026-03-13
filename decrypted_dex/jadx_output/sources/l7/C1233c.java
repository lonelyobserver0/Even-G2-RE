package l7;

import H5.K;
import Qb.I;
import T.C0304u;
import Tb.InterfaceC0327h;
import com.stub.StubApp;
import i5.C1059c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l7.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1233c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f16741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f16742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1059c f16743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233c(InterfaceC0327h interfaceC0327h, C1059c c1059c, Continuation continuation, r rVar) {
        super(2, continuation);
        this.f16741b = interfaceC0327h;
        this.f16742c = rVar;
        this.f16743d = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = this.f16742c;
        return new C1233c(this.f16741b, this.f16743d, continuation, rVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1233c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f16740a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            K k3 = new K(4, this.f16742c, this.f16743d);
            this.f16740a = 1;
            Object p8 = this.f16741b.p(new C0304u(k3, 1), this);
            if (p8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                p8 = Unit.INSTANCE;
            }
            if (p8 == coroutine_suspended) {
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
