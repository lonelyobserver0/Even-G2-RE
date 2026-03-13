package w9;

import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewExpectedInput;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteLineClearValue;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f22166a;

    /* renamed from: b, reason: collision with root package name */
    public String f22167b;

    /* renamed from: c, reason: collision with root package name */
    public int f22168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f22169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Expected f22171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, String str, Expected expected, Continuation continuation) {
        super(2, continuation);
        this.f22169d = nVar;
        this.f22170e = str;
        this.f22171f = expected;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f22169d, this.f22170e, this.f22171f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineContext) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f22168c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            str = this.f22169d.f19796a;
            i iVar = new i(2, null);
            this.f22166a = str;
            String str3 = this.f22170e;
            this.f22167b = str3;
            this.f22168c = 1;
            obj = Ec.d.J(this.f22171f, iVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            str2 = this.f22167b;
            str = this.f22166a;
            ResultKt.throwOnFailure(obj);
        }
        return new RouteLineViewEvent(str, new RouteLineViewRenderRouteLineClearValue(str2, (RouteLineViewExpectedInput) obj));
    }
}
