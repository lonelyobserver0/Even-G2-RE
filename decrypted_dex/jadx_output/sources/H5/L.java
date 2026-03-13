package H5;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, Continuation continuation) {
        super(2, continuation);
        this.f2778b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        L l9 = new L(this.f2778b, continuation);
        l9.f2777a = obj;
        return l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((X.b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        X.b bVar = (X.b) this.f2777a;
        X.g key = H.f2767a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        bVar.d(key, this.f2778b);
        return Unit.INSTANCE;
    }
}
