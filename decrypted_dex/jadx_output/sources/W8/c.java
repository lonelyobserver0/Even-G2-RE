package W8;

import com.mapbox.navigator.RoadObjectEnterExitInfo;
import com.mapbox.navigator.RoadObjectType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoadObjectEnterExitInfo f8178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RoadObjectEnterExitInfo roadObjectEnterExitInfo, Continuation continuation) {
        super(2, continuation);
        this.f8178b = roadObjectEnterExitInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f8178b, continuation);
        cVar.f8177a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((c) create(null, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f8177a != null) {
            throw new ClassCastException();
        }
        RoadObjectEnterExitInfo enterExitInfo = this.f8178b;
        Intrinsics.checkNotNullParameter(enterExitInfo, "enterExitInfo");
        Intrinsics.checkNotNullParameter(enterExitInfo, "<this>");
        String roadObjectId = enterExitInfo.getRoadObjectId();
        Intrinsics.checkNotNullExpressionValue(roadObjectId, "roadObjectId");
        enterExitInfo.getEnterFromStartOrExitFromEnd();
        RoadObjectType type = enterExitInfo.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        Oc.a.C(type);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        throw null;
    }
}
