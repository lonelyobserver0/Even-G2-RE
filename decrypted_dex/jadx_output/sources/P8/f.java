package P8;

import A9.m;
import D9.l;
import J7.o;
import Qb.I;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouteInterface;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, long j, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f5615a = list;
        this.f5616b = j;
        this.f5617c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f5615a, this.f5616b, this.f5617c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List sortedWith;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.f5616b;
        i iVar = this.f5617c;
        C9.e routeLookup = new C9.e(1, (q8.d) iVar.f5632e, AbstractC1526a.class, StubApp.getString2(5034), StubApp.getString2(5033), 1, 1);
        C9.e routeToDirections = new C9.e((o) iVar.f5631d);
        List routes = this.f5615a;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routeLookup, "routeLookup");
        Intrinsics.checkNotNullParameter(routeToDirections, "routeToDirections");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : routes) {
                String responseUuid = ((RouteInterface) obj2).getResponseUuid();
                Object obj3 = linkedHashMap.get(responseUuid);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(responseUuid, obj3);
                }
                ((List) obj3).add(obj2);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List<RouteInterface> list = (List) ((Map.Entry) it.next()).getValue();
                Lazy lazy = LazyKt.lazy(new m(2, routeToDirections, list));
                ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list));
                for (RouteInterface routeInterface : list) {
                    String routeId = routeInterface.getRouteId();
                    Intrinsics.checkNotNullExpressionValue(routeId, "it.routeId");
                    com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) routeLookup.invoke(routeId);
                    if (gVar == null) {
                        gVar = AbstractC1526a.L(routeInterface, j, (DirectionsResponse) lazy.getValue());
                    }
                    arrayList2.add(gVar);
                }
                arrayList.add(arrayList2);
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(CollectionsKt.flatten(arrayList), new J7.h(0, routes));
            Expected createValue = ExpectedFactory.createValue(sortedWith);
            Intrinsics.checkNotNullExpressionValue(createValue, "{\n        routes.groupBy…y.createValue(it) }\n    }");
            return createValue;
        } catch (Throwable th) {
            if (l.a(l.g(), LoggingLevel.ERROR)) {
                l.e(StubApp.getString2(5035) + th.getMessage(), null);
            }
            Expected createError = ExpectedFactory.createError(th);
            Intrinsics.checkNotNullExpressionValue(createError, "{\n        logE { \"Altern…ory.createError(ex)\n    }");
            return createError;
        }
    }
}
