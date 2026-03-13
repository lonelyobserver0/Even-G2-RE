package V8;

import Qb.I;
import com.mapbox.common.location.Location;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Location f7833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Location location, Continuation continuation) {
        super(2, continuation);
        this.f7832a = qVar;
        this.f7833b = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f7832a, this.f7833b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        q qVar = this.f7832a;
        Location location = this.f7833b;
        qVar.f7889u = location;
        Iterator it = qVar.f7878i.iterator();
        while (it.hasNext()) {
            ((b3.x) it.next()).b(location);
        }
        return Unit.INSTANCE;
    }
}
