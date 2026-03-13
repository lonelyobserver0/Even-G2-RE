package V8;

import Qb.I;
import com.mapbox.navigator.FallbackVersionsObserver;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, List list, Continuation continuation) {
        super(2, continuation);
        this.f7827a = qVar;
        this.f7828b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f7827a, this.f7828b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Iterator it = this.f7827a.f7883o.iterator();
        while (it.hasNext()) {
            ((FallbackVersionsObserver) it.next()).onFallbackVersionsFound(this.f7828b);
        }
        return Unit.INSTANCE;
    }
}
