package w9;

import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewExpectedInput;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteDrawDataValue;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f22178a;

    /* renamed from: b, reason: collision with root package name */
    public int f22179b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f22181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Expected f22183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f22184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str, Expected expected, RouteLineViewOptionsData routeLineViewOptionsData, Continuation continuation) {
        super(2, continuation);
        this.f22181d = nVar;
        this.f22182e = str;
        this.f22183f = expected;
        this.f22184g = routeLineViewOptionsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.f22181d, this.f22182e, this.f22183f, this.f22184g, continuation);
        mVar.f22180c = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineContext) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f22179b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = (CoroutineContext) this.f22180c;
            str = this.f22181d.f19796a;
            l lVar = new l(this.f22184g, coroutineContext, null);
            this.f22180c = str;
            String str3 = this.f22182e;
            this.f22178a = str3;
            this.f22179b = 1;
            Object J10 = Ec.d.J(this.f22183f, lVar, this);
            if (J10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str3;
            obj = J10;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            str2 = this.f22178a;
            str = (String) this.f22180c;
            ResultKt.throwOnFailure(obj);
        }
        return new RouteLineViewEvent(str, new RouteLineViewRenderRouteDrawDataValue(str2, (RouteLineViewExpectedInput) obj));
    }
}
