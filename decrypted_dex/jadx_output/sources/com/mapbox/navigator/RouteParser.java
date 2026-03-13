package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteParser implements RouteParserInterface {
    protected long peer;

    public static class RouteParserPeerCleaner implements Runnable {
        private long peer;

        public RouteParserPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteParser.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteParser(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native RoutesData createRoutesData(RouteInterface routeInterface, List<RouteInterface> list);

    public static native Expected<String, List<RouteInterface>> parseDirectionsResponse(DataRef dataRef, String str, RouterOrigin routerOrigin);

    @Deprecated
    public static native Expected<String, List<RouteInterface>> parseDirectionsResponse(String str, String str2, RouterOrigin routerOrigin);

    public static native void parseDirectionsResponse(DataRef dataRef, String str, RouterOrigin routerOrigin, RouteParserCallback routeParserCallback);

    @Deprecated
    public static native void parseDirectionsResponse(String str, String str2, RouterOrigin routerOrigin, RouteParserCallback routeParserCallback);

    public static native Expected<String, List<RouteInterface>> parseDirectionsRoutes(String str, String str2, RouterOrigin routerOrigin);

    public static native void parseDirectionsRoutes(String str, String str2, RouterOrigin routerOrigin, RouteParserCallback routeParserCallback);

    public static native Expected<String, List<RouteInterface>> parseMapMatchingResponse(DataRef dataRef, String str, RouterOrigin routerOrigin);

    @Deprecated
    public static native Expected<String, List<RouteInterface>> parseMapMatchingResponse(String str, String str2, RouterOrigin routerOrigin);

    public static native void parseMapMatchingResponse(DataRef dataRef, String str, RouterOrigin routerOrigin, RouteParserCallback routeParserCallback);

    @Deprecated
    public static native void parseMapMatchingResponse(String str, String str2, RouterOrigin routerOrigin, RouteParserCallback routeParserCallback);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouteParserPeerCleaner(j));
    }
}
