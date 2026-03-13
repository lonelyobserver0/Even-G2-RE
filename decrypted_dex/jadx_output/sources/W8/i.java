package W8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Continuation continuation) {
        super(2, continuation);
        this.f8196b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f8196b, continuation);
        iVar.f8195a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((i) create(null, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        throw com.mapbox.common.b.d(this.f8195a);
    }
}
