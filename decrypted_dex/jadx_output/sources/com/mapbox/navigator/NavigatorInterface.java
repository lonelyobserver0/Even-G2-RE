package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TileStore;
import com.mapbox.common.TilesetDescriptor;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface NavigatorInterface {
    void addObserver(NavigatorObserver navigatorObserver);

    void addRerouteObserver(RerouteObserver rerouteObserver);

    void addRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    void changeLeg(int i3, ChangeLegCallback changeLegCallback);

    ConfigHandleInterface config();

    PredictiveCacheControllerInterface createPredictiveCacheController(TileStore tileStore, PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    PredictiveCacheControllerInterface createPredictiveCacheController(TileStore tileStore, List<TilesetDescriptor> list, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    PredictiveCacheControllerInterface createPredictiveCacheController(PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Deprecated
    PredictiveCacheControllerInterface createPredictiveCacheController(PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    List<RouteAlternative> getAlternativeRoutes();

    Experimental getExperimental();

    LaneGraphAccessor getHDLaneGraphAccessor();

    Cancelable getHDRouteLaneGuidancesForBBox(BoundingBox boundingBox, String str, GetHDRouteLaneGuidancesCallback getHDRouteLaneGuidancesCallback);

    RouteObjectMatcher getHDRouteObjectMatcher();

    NavigationStatus getNavigationStatus();

    RouteInterface getPrimaryRoute();

    RerouteControllerInterface getRerouteController();

    RerouteDetectorInterface getRerouteDetector();

    RouteAlternativesControllerInterface getRouteAlternativesController();

    RouterInterface getRouter();

    Telemetry getTelemetry(EventsMetadataInterface eventsMetadataInterface);

    void onEvDataUpdated(EvStateData evStateData);

    void pause();

    @Deprecated
    void refreshRoute(DataRef dataRef, String str, int i3, RefreshRouteCallback refreshRouteCallback);

    @Deprecated
    void refreshRoute(String str, String str2, int i3, RefreshRouteCallback refreshRouteCallback);

    void removeObserver(NavigatorObserver navigatorObserver);

    void removeRerouteObserver(RerouteObserver rerouteObserver);

    void removeRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    void reset(ResetCallback resetCallback);

    void restoreNavigationSession(NavigationSessionState navigationSessionState);

    void resume();

    RoadObjectsStoreInterface roadObjectStore();

    void setAlternativeRoutes(List<RouteInterface> list, SetAlternativeRoutesCallback setAlternativeRoutesCallback);

    void setElectronicHorizonObserver(ElectronicHorizonObserver electronicHorizonObserver);

    void setElectronicHorizonOptions(ElectronicHorizonOptions electronicHorizonOptions);

    void setFallbackVersionsObserver(FallbackVersionsObserver fallbackVersionsObserver);

    @Deprecated
    void setRerouteController(RerouteControllerInterface rerouteControllerInterface);

    void setRoutes(SetRoutesParams setRoutesParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    void setRoutesData(SetRoutesDataParams setRoutesDataParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    void shutdown();

    void startNavigationSession();

    void startRoutesRefresh(long j, boolean z2);

    void stopNavigationSession();

    void stopRoutesRefresh();

    NavigationSessionState storeNavigationSession();

    void updateLocation(FixLocation fixLocation, UpdateLocationCallback updateLocationCallback);

    String version();
}
