package x9;

import Qb.L;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f23109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f23110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Style f23111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f23112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(I i3, Pair pair, Style style, RouteLineViewOptionsData routeLineViewOptionsData, Continuation continuation) {
        super(2, continuation);
        this.f23109b = i3;
        this.f23110c = pair;
        this.f23111d = style;
        this.f23112e = routeLineViewOptionsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        z zVar = new z(this.f23109b, this.f23110c, this.f23111d, this.f23112e, continuation);
        zVar.f23108a = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return L.c((Qb.I) this.f23108a, null, new y(this.f23109b, this.f23110c, this.f23111d, this.f23112e, null), 3);
    }
}
