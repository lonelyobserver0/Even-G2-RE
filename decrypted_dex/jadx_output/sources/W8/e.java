package W8;

import com.mapbox.navigator.RoadObjectPassInfo;
import com.mapbox.navigator.RoadObjectType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoadObjectPassInfo f8182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RoadObjectPassInfo roadObjectPassInfo, Continuation continuation) {
        super(2, continuation);
        this.f8182b = roadObjectPassInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f8182b, continuation);
        eVar.f8181a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((e) create(null, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f8181a != null) {
            throw new ClassCastException();
        }
        RoadObjectPassInfo passInfo = this.f8182b;
        Intrinsics.checkNotNullParameter(passInfo, "passInfo");
        Intrinsics.checkNotNullParameter(passInfo, "<this>");
        String roadObjectId = passInfo.getRoadObjectId();
        Intrinsics.checkNotNullExpressionValue(roadObjectId, "roadObjectId");
        RoadObjectType type = passInfo.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        Oc.a.C(type);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        throw null;
    }
}
