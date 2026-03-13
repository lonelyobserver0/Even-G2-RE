package N2;

import Qb.I;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, Continuation continuation) {
        super(2, continuation);
        this.f4843a = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f4843a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            u5.d dVar = M2.a.f4512a;
            EventChannel.EventSink eventSink = (EventChannel.EventSink) M2.c.f4515g.get(n3.a.a(StubApp.getString2("3490")));
            if (eventSink != null) {
                eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2("660"), StubApp.getString2("3665")), TuplesKt.to(StubApp.getString2("3666"), this.f4843a)));
            }
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(3667), e10.getMessage(), StubApp.getString2(3505));
        }
        return Unit.INSTANCE;
    }
}
