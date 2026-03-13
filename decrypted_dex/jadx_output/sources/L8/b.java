package L8;

import Qb.I;
import com.mapbox.navigation.base.route.g;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouteParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, Continuation continuation) {
        super(2, continuation);
        this.f4298a = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f4298a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.f4298a;
        g gVar = (g) CollectionsKt.first(list);
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        RouteInterface routeInterface = gVar.f12501d;
        List<g> drop = CollectionsKt.drop(list, 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.f(drop));
        for (g gVar2 : drop) {
            Intrinsics.checkNotNullParameter(gVar2, "<this>");
            arrayList.add(gVar2.f12501d);
        }
        return RouteParser.createRoutesData(routeInterface, arrayList);
    }
}
