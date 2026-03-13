package x9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z2, ArrayList arrayList, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f23040a = z2;
        this.f23041b = arrayList;
        this.f23042c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f23040a, this.f23041b, this.f23042c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = this.f23041b;
        if (this.f23040a) {
            r9.r.f20475p.invoke(CollectionsKt.first((List) arrayList));
        }
        if (this.f23042c) {
            Iterator it = CollectionsKt.drop(arrayList, 1).iterator();
            while (it.hasNext()) {
                r9.r.f20475p.invoke((com.mapbox.navigation.base.route.g) it.next());
            }
        }
        return Unit.INSTANCE;
    }
}
