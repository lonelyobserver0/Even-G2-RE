package a2;

import H5.F;
import Qb.I;
import Tb.InterfaceC0327h;
import Xa.o;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0390a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f9256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f9257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390a(InterfaceC0327h interfaceC0327h, o oVar, Continuation continuation) {
        super(2, continuation);
        this.f9256b = interfaceC0327h;
        this.f9257c = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0390a(this.f9256b, this.f9257c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0390a) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f9255a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            F f10 = new F(this.f9257c, 3);
            this.f9255a = 1;
            if (this.f9256b.p(f10, this) == coroutine_suspended) {
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
