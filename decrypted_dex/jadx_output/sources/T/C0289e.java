package T;

import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: T.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0289e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6845a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289e(List list, Continuation continuation) {
        super(2, continuation);
        this.f6847c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0289e c0289e = new C0289e(this.f6847c, continuation);
        c0289e.f6846b = obj;
        return c0289e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0289e) create((T) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6845a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            T t3 = (T) this.f6846b;
            this.f6845a = 1;
            if (AbstractC0293i.a(this.f6847c, t3, this) == coroutine_suspended) {
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
