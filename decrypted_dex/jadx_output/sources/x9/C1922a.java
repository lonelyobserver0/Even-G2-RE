package x9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1922a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1923b f22968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f22969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1922a(C1923b c1923b, RouteLineViewOptionsData routeLineViewOptionsData, Continuation continuation) {
        super(2, continuation);
        this.f22968a = c1923b;
        this.f22969b = routeLineViewOptionsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1922a(this.f22968a, this.f22969b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1922a) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.f22968a.f22971e.invoke(this.f22969b);
    }
}
