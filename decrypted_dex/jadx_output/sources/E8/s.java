package E8;

import Qb.I;
import Qb.L;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i5.C1059c;
import java.net.URL;
import java.util.LinkedHashMap;
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
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f2025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f2027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ URL f2029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RouterInterface f2030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Expected f2031h;
    public final /* synthetic */ RouterOrigin j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.j f2032k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j, C1059c c1059c, Ref.ObjectRef objectRef, RouteOptions routeOptions, String str, URL url, RouterInterface routerInterface, Expected expected, RouterOrigin routerOrigin, com.mapbox.navigation.base.route.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f2024a = j;
        this.f2025b = c1059c;
        this.f2026c = objectRef;
        this.f2027d = routeOptions;
        this.f2028e = str;
        this.f2029f = url;
        this.f2030g = routerInterface;
        this.f2031h = expected;
        this.j = routerOrigin;
        this.f2032k = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f2024a, this.f2025b, this.f2026c, this.f2027d, this.f2028e, this.f2029f, this.f2030g, this.f2031h, this.j, this.f2032k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        E7.a aVar = E7.a.f1927a;
        Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(this.f2024a));
        E7.a.b(StubApp.getString2(1928));
        Ref.ObjectRef objectRef = this.f2026c;
        final Long l9 = (Long) objectRef.element;
        Expected result = this.f2031h;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        final RouterOrigin origin = this.j;
        Intrinsics.checkNotNullExpressionValue(origin, "origin");
        Long l10 = (Long) objectRef.element;
        com.mapbox.navigation.base.route.j jVar = this.f2032k;
        final C1059c c1059c = this.f2025b;
        final Q2.g gVar = new Q2.g(c1059c, l10, jVar);
        String string2 = StubApp.getString2(1068);
        if (l9 == null || ((LinkedHashMap) c1059c.f14845d).get(l9) != null) {
            boolean areEqual = Intrinsics.areEqual(this.f2030g, c1059c.j());
            final URL url = this.f2029f;
            final RouteOptions routeOptions = this.f2027d;
            if (areEqual) {
                k kVar = new k(routeOptions, origin, gVar, url);
                final String str = this.f2028e;
                result.fold(kVar, new Expected.Transformer() { // from class: E8.l
                    @Override // com.mapbox.bindgen.Expected.Transformer
                    public final Object invoke(Object obj2) {
                        DataRef responseBody = (DataRef) obj2;
                        C1059c this$0 = C1059c.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        URL urlWithoutToken = url;
                        Intrinsics.checkNotNullParameter(urlWithoutToken, "$urlWithoutToken");
                        String routeUrl = str;
                        Intrinsics.checkNotNullParameter(routeUrl, "$routeUrl");
                        RouterOrigin origin2 = origin;
                        Intrinsics.checkNotNullParameter(origin2, "$origin");
                        Q2.g requestEnder = gVar;
                        Intrinsics.checkNotNullParameter(requestEnder, "$requestEnder");
                        RouteOptions routeOptions2 = routeOptions;
                        Intrinsics.checkNotNullParameter(routeOptions2, "$routeOptions");
                        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
                        return L.j(((D9.f) ((Lazy) this$0.f14847f).getValue()).f1513b, null, new r(urlWithoutToken, l9, this$0, responseBody, routeUrl, origin2, requestEnder, routeOptions2, null), 3);
                    }
                });
            } else {
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d(StubApp.getString2(1930), string2);
                }
                String routerOrigin = Y3.a.p(origin);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
                String message = StubApp.getString2(1931);
                Intrinsics.checkNotNullParameter(message, "message");
                String type = StubApp.getString2(1932);
                Intrinsics.checkNotNullParameter(type, "type");
                gVar.q(CollectionsKt.listOf(new com.mapbox.navigation.base.route.o(url, routerOrigin, message, type, null, false)), routeOptions);
            }
        } else if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(1929) + l9 + StubApp.getString2(1924), string2);
        }
        return Unit.INSTANCE;
    }
}
