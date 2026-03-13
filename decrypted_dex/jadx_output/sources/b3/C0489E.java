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
import kotlin.reflect.KProperty;

/* renamed from: b3.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0489E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f10515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489E(C0498N c0498n, List list, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f10513b = c0498n;
        this.f10514c = list;
        this.f10515d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0489E(this.f10513b, this.f10514c, this.f10515d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0489E) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10512a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f10512a = 1;
            if (S.a(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        KProperty[] kPropertyArr = C0498N.f10532Q0;
        this.f10513b.F(this.f10514c, this.f10515d, true);
        return Unit.INSTANCE;
    }
}
