package z7;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouteParser;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2013a {
    public final Expected a(DataRef response, String request, String routerOrigin) {
        RouterOrigin routerOrigin2;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        Intrinsics.checkNotNullParameter(routerOrigin, "<this>");
        int hashCode = routerOrigin.hashCode();
        if (hashCode == -1958892973) {
            if (routerOrigin.equals(StubApp.getString2(7517))) {
                routerOrigin2 = RouterOrigin.ONLINE;
                Expected<String, List<RouteInterface>> parseDirectionsResponse = RouteParser.parseDirectionsResponse(response, request, routerOrigin2);
                Intrinsics.checkNotNullExpressionValue(parseDirectionsResponse, "parseDirectionsResponse(…eRouteOrigin(),\n        )");
                return parseDirectionsResponse;
            }
            throw new IllegalStateException(routerOrigin.concat(StubApp.getString2(24928)).toString());
        }
        if (hashCode == -1845177127) {
            if (routerOrigin.equals(StubApp.getString2(4423))) {
                routerOrigin2 = RouterOrigin.CUSTOM_EXTERNAL;
                Expected<String, List<RouteInterface>> parseDirectionsResponse2 = RouteParser.parseDirectionsResponse(response, request, routerOrigin2);
                Intrinsics.checkNotNullExpressionValue(parseDirectionsResponse2, "parseDirectionsResponse(…eRouteOrigin(),\n        )");
                return parseDirectionsResponse2;
            }
            throw new IllegalStateException(routerOrigin.concat(StubApp.getString2(24928)).toString());
        }
        if (hashCode == -830629437 && routerOrigin.equals(StubApp.getString2(1933))) {
            routerOrigin2 = RouterOrigin.ONBOARD;
            Expected<String, List<RouteInterface>> parseDirectionsResponse22 = RouteParser.parseDirectionsResponse(response, request, routerOrigin2);
            Intrinsics.checkNotNullExpressionValue(parseDirectionsResponse22, "parseDirectionsResponse(…eRouteOrigin(),\n        )");
            return parseDirectionsResponse22;
        }
        throw new IllegalStateException(routerOrigin.concat(StubApp.getString2(24928)).toString());
    }
}
