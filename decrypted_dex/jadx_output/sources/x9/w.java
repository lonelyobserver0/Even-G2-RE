package x9;

import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f23089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f23090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f23091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f23092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Style f23093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(K k3, I i3, RouteLineViewOptionsData routeLineViewOptionsData, Style style, String str, Continuation continuation) {
        super(1, continuation);
        this.f23090b = k3;
        this.f23091c = i3;
        this.f23092d = routeLineViewOptionsData;
        this.f23093e = style;
        this.f23094f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new w(this.f23090b, this.f23091c, this.f23092d, this.f23093e, this.f23094f, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f23089a;
        K k3 = this.f23090b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ec.d dVar = k3.f22966a;
            CoroutineContext coroutineContext = this.f23091c.f22960p.f7941a;
            this.f23089a = 1;
            obj = dVar.y(coroutineContext, this.f23092d, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return new v(k3, this.f23093e, this.f23094f, (StylePropertyValue) obj);
    }
}
