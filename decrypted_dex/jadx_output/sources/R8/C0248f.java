package R8;

import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: R8.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0248f extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A3.s f6290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248f(A3.s sVar, List list, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.f6290b = sVar;
        this.f6291c = list;
        this.f6292d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0248f(this.f6290b, this.f6291c, this.f6292d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0248f) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6289a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            A3.s sVar = this.f6290b;
            ((i2.o) sVar.f195g).f14746a++;
            this.f6289a = 1;
            if (A3.s.a(sVar, this.f6291c, this.f6292d, this) == coroutine_suspended) {
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
