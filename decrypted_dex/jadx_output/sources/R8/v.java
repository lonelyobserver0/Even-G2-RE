package R8;

import Qb.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m8.w f6334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f6336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m8.w wVar, long j, y yVar, Continuation continuation) {
        super(2, continuation);
        this.f6334b = wVar;
        this.f6335c = j;
        this.f6336d = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f6334b, this.f6335c, this.f6336d, continuation);
        vVar.f6333a = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Qb.I i3 = (Qb.I) this.f6333a;
        List list = this.f6334b.f17258d;
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L.c(i3, null, new u((Pair) it.next(), this.f6335c, this.f6336d, null), 3));
        }
        return arrayList;
    }
}
