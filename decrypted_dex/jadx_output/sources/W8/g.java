package W8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Continuation continuation) {
        super(2, continuation);
        this.f8192b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f8192b, continuation);
        gVar.f8191a = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((g) create(null, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        throw com.mapbox.common.b.d(this.f8191a);
    }
}
