package R8;

import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: R8.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0247e extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A3.s f6287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247e(A3.s sVar, List list, Continuation continuation) {
        super(1, continuation);
        this.f6287b = sVar;
        this.f6288c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0247e(this.f6287b, this.f6288c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0247e) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6286a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f6286a = 1;
            if (A3.s.a(this.f6287b, this.f6288c, true, this) == coroutine_suspended) {
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
