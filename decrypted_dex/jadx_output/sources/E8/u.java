package E8;

import Qb.I;
import Qb.L;
import android.os.SystemClock;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouteRefreshOptions;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterInterface;
import com.stub.StubApp;
import i5.C1059c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import z7.C2014b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f2037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouterInterface f2039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2014b f2041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RouteRefreshOptions f2042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.g f2043h;
    public final /* synthetic */ Expected j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O8.e f2044k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j, C1059c c1059c, Ref.ObjectRef objectRef, RouterInterface routerInterface, String str, C2014b c2014b, RouteRefreshOptions routeRefreshOptions, com.mapbox.navigation.base.route.g gVar, Expected expected, O8.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f2036a = j;
        this.f2037b = c1059c;
        this.f2038c = objectRef;
        this.f2039d = routerInterface;
        this.f2040e = str;
        this.f2041f = c2014b;
        this.f2042g = routeRefreshOptions;
        this.f2043h = gVar;
        this.j = expected;
        this.f2044k = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        O8.e eVar = this.f2044k;
        return new u(this.f2036a, this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.f2042g, this.f2043h, this.j, eVar, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        E7.a aVar = E7.a.f1927a;
        Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(this.f2036a));
        E7.a.b(StubApp.getString2(1934));
        Ref.ObjectRef objectRef = this.f2038c;
        final Long l9 = (Long) objectRef.element;
        Expected result = this.j;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        Long l10 = (Long) objectRef.element;
        O8.e eVar = this.f2044k;
        final C1059c c1059c = this.f2037b;
        final Q2.g gVar = new Q2.g(c1059c, l10, eVar);
        if (l9 == null || ((LinkedHashMap) c1059c.f14846e).get(l9) != null) {
            if (Intrinsics.areEqual(this.f2039d, c1059c.j())) {
                final long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
                final C2014b c2014b = this.f2041f;
                final String str = this.f2040e;
                final com.mapbox.navigation.base.route.g gVar2 = this.f2043h;
                Expected.Transformer transformer = new Expected.Transformer() { // from class: E8.h
                    @Override // com.mapbox.bindgen.Expected.Transformer
                    public final Object invoke(Object obj2) {
                        List errors = (List) obj2;
                        String requestUuid = str;
                        Intrinsics.checkNotNullParameter(requestUuid, "$requestUuid");
                        C2014b routeRefreshRequestData = c2014b;
                        Intrinsics.checkNotNullParameter(routeRefreshRequestData, "$routeRefreshRequestData");
                        Q2.g callback = gVar;
                        Intrinsics.checkNotNullParameter(callback, "$callback");
                        com.mapbox.navigation.base.route.g route = gVar2;
                        Intrinsics.checkNotNullParameter(route, "$route");
                        Intrinsics.checkNotNullParameter(errors, "errors");
                        RouterError routerError = (RouterError) CollectionsKt.first(errors);
                        StringBuilder l11 = com.mapbox.common.b.l(StubApp.getString2(1894), requestUuid, StubApp.getString2(1895));
                        l11.append(routerError.getMessage());
                        l11.append(StubApp.getString2(1896));
                        l11.append(routerError.getType());
                        l11.append(StubApp.getString2(1897));
                        l11.append(routerError.getRequestId());
                        l11.append(StubApp.getString2(1898));
                        l11.append(routerError.getRefreshTtl());
                        l11.append(StubApp.getString2(1899));
                        l11.append(routeRefreshRequestData);
                        l11.append(StubApp.getString2(1900));
                        String trimIndent = StringsKt.trimIndent(l11.toString());
                        D9.l.h(trimIndent, StubApp.getString2(1068));
                        if (routerError.getRefreshTtl() != null) {
                            Long valueOf = Long.valueOf(r1.intValue() + seconds);
                            Intrinsics.checkNotNullParameter(route, "<this>");
                            route.f12503f = valueOf;
                        }
                        callback.M(new d(StubApp.getString2(1901), new Exception(trimIndent), routerError.getRefreshTtl(), 4));
                        return Unit.INSTANCE;
                    }
                };
                final RouteRefreshOptions routeRefreshOptions = this.f2042g;
                result.fold(transformer, new Expected.Transformer() { // from class: E8.i
                    @Override // com.mapbox.bindgen.Expected.Transformer
                    public final Object invoke(Object obj2) {
                        DataRef it = (DataRef) obj2;
                        C1059c this$0 = C1059c.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        com.mapbox.navigation.base.route.g route = gVar2;
                        Intrinsics.checkNotNullParameter(route, "$route");
                        RouteRefreshOptions refreshOptions = routeRefreshOptions;
                        Intrinsics.checkNotNullParameter(refreshOptions, "$refreshOptions");
                        C2014b routeRefreshRequestData = c2014b;
                        Intrinsics.checkNotNullParameter(routeRefreshRequestData, "$routeRefreshRequestData");
                        Q2.g callback = gVar;
                        Intrinsics.checkNotNullParameter(callback, "$callback");
                        Intrinsics.checkNotNullParameter(it, "it");
                        return L.j(((D9.f) ((Lazy) this$0.f14847f).getValue()).f1513b, null, new p(l9, this$0, it, route, refreshOptions, routeRefreshRequestData, seconds, callback, null), 3);
                    }
                });
            } else {
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d(StubApp.getString2(1930), StubApp.getString2(1068));
                }
                gVar.M(new d(StubApp.getString2(1936), null, null, 14));
            }
        } else if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(1935) + l9 + StubApp.getString2(1924), null);
        }
        return Unit.INSTANCE;
    }
}
