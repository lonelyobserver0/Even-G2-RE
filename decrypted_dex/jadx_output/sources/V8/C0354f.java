package V8;

import Qb.I;
import com.mapbox.navigator.FallbackVersionsObserver;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: V8.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0354f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354f(q qVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f7825a = qVar;
        this.f7826b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0354f(this.f7825a, this.f7826b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0354f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Iterator it = this.f7825a.f7883o.iterator();
        while (it.hasNext()) {
            ((FallbackVersionsObserver) it.next()).onCanReturnToLatest(this.f7826b);
        }
        return Unit.INSTANCE;
    }
}
