package R8;

import Qb.InterfaceC0221t0;
import i5.C1059c;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f6337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, long j, Continuation continuation) {
        super(2, continuation);
        this.f6337a = yVar;
        this.f6338b = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f6337a, this.f6338b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C1059c c1059c = this.f6337a.f6346d.f20089a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1059c.f14846e;
        long j = this.f6338b;
        E8.e eVar = (E8.e) linkedHashMap.get(Long.valueOf(j));
        if (eVar != null) {
            eVar.f1942b.invoke();
            linkedHashMap.remove(Long.valueOf(j));
            InterfaceC0221t0 interfaceC0221t0 = eVar.f1941a;
            if (interfaceC0221t0 != null) {
                interfaceC0221t0.d(null);
            }
        }
        c1059c.j().cancelRouteRefreshRequest(j);
        return Unit.INSTANCE;
    }
}
