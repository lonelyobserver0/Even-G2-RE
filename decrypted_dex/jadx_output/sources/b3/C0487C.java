package b3;

import Qb.S;
import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: b3.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0487C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X2.j f10507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f10508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487C(C0498N c0498n, List list, X2.j jVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f10505b = c0498n;
        this.f10506c = list;
        this.f10507d = jVar;
        this.f10508e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0487C(this.f10505b, this.f10506c, this.f10507d, this.f10508e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0487C) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10504a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f10504a = 1;
            if (S.a(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f10505b.z(this.f10506c, this.f10507d, this.f10508e);
        return Unit.INSTANCE;
    }
}
