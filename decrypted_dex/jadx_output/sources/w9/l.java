package w9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewDataError;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewExpectedInput;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import y9.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22174a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f22176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f22177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RouteLineViewOptionsData routeLineViewOptionsData, CoroutineContext coroutineContext, Continuation continuation) {
        super(2, continuation);
        this.f22176c = routeLineViewOptionsData;
        this.f22177d = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f22176c, this.f22177d, continuation);
        lVar.f22175b = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((t) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f22174a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            t tVar = (t) this.f22175b;
            RouteLineViewOptionsData routeLineViewOptionsData = this.f22176c;
            if (routeLineViewOptionsData == null) {
                return new RouteLineViewDataError(StubApp.getString2(23864));
            }
            this.f22174a = 1;
            obj = Ec.d.I(tVar, this.f22177d, routeLineViewOptionsData, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return (RouteLineViewExpectedInput) obj;
    }
}
