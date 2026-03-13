package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: T.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0302s extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6895a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f6896b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6897c;

    public /* synthetic */ C0302s(int i3, Continuation continuation) {
        super(i3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f6895a) {
            case 0:
                return new C0302s((Q) this.f6897c, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            default:
                ((Boolean) obj2).getClass();
                C0302s c0302s = new C0302s(3, (Continuation) obj3);
                c0302s.f6897c = (V.b) obj;
                return c0302s.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.f6895a) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f6896b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f6896b = 1;
                    if (Q.b((Q) this.f6897c, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f6896b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                V.b bVar = (V.b) this.f6897c;
                this.f6896b = 1;
                bVar.getClass();
                Object a3 = V.b.a(bVar, this);
                return a3 == coroutine_suspended2 ? coroutine_suspended2 : a3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0302s(Q q10, Continuation continuation) {
        super(3, continuation);
        this.f6897c = q10;
    }
}
