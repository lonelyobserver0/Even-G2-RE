package X;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8223a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f8225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f8225c = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f8225c, continuation);
        cVar.f8224b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f8223a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = (b) this.f8224b;
            this.f8223a = 1;
            obj = this.f8225c.invoke(bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        b bVar2 = (b) obj;
        Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f8222b.f2238b).set(true);
        return bVar2;
    }
}
