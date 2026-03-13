package E8;

import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterErrorType;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class k implements Expected.Transformer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1974a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2.g f1975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ URL f1976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouterOrigin f1977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f1978e;

    public /* synthetic */ k(Q2.g gVar, URL url, RouterOrigin routerOrigin, RouteOptions routeOptions) {
        this.f1975b = gVar;
        this.f1976c = url;
        this.f1977d = routerOrigin;
        this.f1978e = routeOptions;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        switch (this.f1974a) {
            case 0:
                List<RouterError> errors = (List) obj;
                RouteOptions routeOptions = this.f1978e;
                Intrinsics.checkNotNullParameter(routeOptions, "$routeOptions");
                RouterOrigin origin = this.f1977d;
                Intrinsics.checkNotNullParameter(origin, "$origin");
                Q2.g requestEnder = this.f1975b;
                Intrinsics.checkNotNullParameter(requestEnder, "$requestEnder");
                URL url = this.f1976c;
                Intrinsics.checkNotNullParameter(url, "$urlWithoutToken");
                Intrinsics.checkNotNullParameter(errors, "errors");
                String string2 = StubApp.getString2(1068);
                if (errors == null || !errors.isEmpty()) {
                    Iterator it = errors.iterator();
                    while (it.hasNext()) {
                        if (((RouterError) it.next()).getType() == RouterErrorType.REQUEST_CANCELLED) {
                            D9.l.f(StubApp.getString2(1906) + routeOptions + StubApp.getString2(81) + origin, string2);
                            requestEnder.g(routeOptions, Y3.a.p(origin));
                            break;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.f(errors));
                for (RouterError routerError : errors) {
                    String routerOrigin = Y3.a.p(origin);
                    String message = routerError.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "it.message");
                    RouterErrorType type = routerError.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "it.type");
                    String type2 = Y3.a.q(type);
                    Intrinsics.checkNotNullParameter(routerError, "<this>");
                    boolean z2 = routerError.getType() == RouterErrorType.NETWORK_ERROR;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(type2, "type");
                    arrayList.add(new com.mapbox.navigation.base.route.o(url, routerOrigin, message, type2, null, z2));
                }
                D9.l.h(StubApp.getString2(1907) + arrayList, string2);
                requestEnder.q(arrayList, routeOptions);
                break;
            default:
                Throwable th = (Throwable) obj;
                String routerOrigin2 = Y3.a.p(this.f1977d);
                String string22 = StubApp.getString2(1904);
                URL url2 = this.f1976c;
                Intrinsics.checkNotNullParameter(url2, string22);
                Intrinsics.checkNotNullParameter(routerOrigin2, "routerOrigin");
                Intrinsics.checkNotNullParameter("Failed to parse response", StubApp.getString2(1905));
                Intrinsics.checkNotNullParameter("RESPONSE_PARSING_ERROR", StubApp.getString2(660));
                this.f1975b.q(CollectionsKt.listOf(new com.mapbox.navigation.base.route.o(url2, routerOrigin2, "Failed to parse response", "RESPONSE_PARSING_ERROR", th, false)), this.f1978e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(RouteOptions routeOptions, RouterOrigin routerOrigin, Q2.g gVar, URL url) {
        this.f1978e = routeOptions;
        this.f1977d = routerOrigin;
        this.f1975b = gVar;
        this.f1976c = url;
    }
}
