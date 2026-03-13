package X;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8231a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f8233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f8233c = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f8233c, continuation);
        iVar.f8232b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f8231a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            b bVar = (b) this.f8232b;
            ResultKt.throwOnFailure(obj);
            return bVar;
        }
        ResultKt.throwOnFailure(obj);
        b bVar2 = new b(MapsKt.toMutableMap(((b) this.f8232b).a()), false);
        this.f8232b = bVar2;
        this.f8231a = 1;
        return this.f8233c.invoke(bVar2, this) == coroutine_suspended ? coroutine_suspended : bVar2;
    }
}
