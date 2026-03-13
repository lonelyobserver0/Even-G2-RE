package com.mapbox.navigation.base.route;

import androidx.annotation.Keep;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b(\u0010)J\u008c\u0001\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010!R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b@\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010)¨\u0006E"}, d2 = {"com/mapbox/navigation/base/route/NavigationRoute$SerialisationState", "", "Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "directionRoute", "Lcom/mapbox/api/directions/v5/models/RouteOptions;", "routeOptions", "", "Lcom/mapbox/api/directions/v5/models/DirectionsWaypoint;", "waypoints", "", "routeIndex", "Lcom/mapbox/navigator/RouterOrigin;", "routerOrigin", "Lcom/mapbox/api/directions/v5/models/Closure;", "unavoidableClosures", "", "responseOriginAPI", "responseUUID", "", "expirationTimeElapsedSeconds", "Lcom/mapbox/navigation/base/route/m;", "routeRefreshMetadata", "<init>", "(Lcom/mapbox/api/directions/v5/models/DirectionsRoute;Lcom/mapbox/api/directions/v5/models/RouteOptions;Ljava/util/List;ILcom/mapbox/navigator/RouterOrigin;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/mapbox/navigation/base/route/m;)V", "component1", "()Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "component2", "()Lcom/mapbox/api/directions/v5/models/RouteOptions;", "component3", "()Ljava/util/List;", "component4", "()I", "component5", "()Lcom/mapbox/navigator/RouterOrigin;", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "()Ljava/lang/Long;", "component10", "()Lcom/mapbox/navigation/base/route/m;", "Lcom/mapbox/navigation/base/route/NavigationRoute$SerialisationState;", "copy", "(Lcom/mapbox/api/directions/v5/models/DirectionsRoute;Lcom/mapbox/api/directions/v5/models/RouteOptions;Ljava/util/List;ILcom/mapbox/navigator/RouterOrigin;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/mapbox/navigation/base/route/m;)Lcom/mapbox/navigation/base/route/NavigationRoute$SerialisationState;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "getDirectionRoute", "Lcom/mapbox/api/directions/v5/models/RouteOptions;", "getRouteOptions", "Ljava/util/List;", "getWaypoints", "I", "getRouteIndex", "Lcom/mapbox/navigator/RouterOrigin;", "getRouterOrigin", "getUnavoidableClosures", "Ljava/lang/String;", "getResponseOriginAPI", "getResponseUUID", "Ljava/lang/Long;", "getExpirationTimeElapsedSeconds", "Lcom/mapbox/navigation/base/route/m;", "getRouteRefreshMetadata", "base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final /* data */ class NavigationRoute$SerialisationState {
    private final DirectionsRoute directionRoute;
    private final Long expirationTimeElapsedSeconds;
    private final String responseOriginAPI;
    private final String responseUUID;
    private final int routeIndex;
    private final RouteOptions routeOptions;
    private final m routeRefreshMetadata;
    private final RouterOrigin routerOrigin;
    private final List<List<Closure>> unavoidableClosures;
    private final List<DirectionsWaypoint> waypoints;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRoute$SerialisationState(DirectionsRoute directionRoute, RouteOptions routeOptions, List<? extends DirectionsWaypoint> list, int i3, RouterOrigin routerOrigin, List<? extends List<? extends Closure>> unavoidableClosures, String responseOriginAPI, String responseUUID, Long l9, m mVar) {
        Intrinsics.checkNotNullParameter(directionRoute, "directionRoute");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        Intrinsics.checkNotNullParameter(unavoidableClosures, "unavoidableClosures");
        Intrinsics.checkNotNullParameter(responseOriginAPI, "responseOriginAPI");
        Intrinsics.checkNotNullParameter(responseUUID, "responseUUID");
        this.directionRoute = directionRoute;
        this.routeOptions = routeOptions;
        this.waypoints = list;
        this.routeIndex = i3;
        this.routerOrigin = routerOrigin;
        this.unavoidableClosures = unavoidableClosures;
        this.responseOriginAPI = responseOriginAPI;
        this.responseUUID = responseUUID;
        this.expirationTimeElapsedSeconds = l9;
        this.routeRefreshMetadata = mVar;
    }

    public static /* synthetic */ NavigationRoute$SerialisationState copy$default(NavigationRoute$SerialisationState navigationRoute$SerialisationState, DirectionsRoute directionsRoute, RouteOptions routeOptions, List list, int i3, RouterOrigin routerOrigin, List list2, String str, String str2, Long l9, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            directionsRoute = navigationRoute$SerialisationState.directionRoute;
        }
        if ((i10 & 2) != 0) {
            routeOptions = navigationRoute$SerialisationState.routeOptions;
        }
        if ((i10 & 4) != 0) {
            list = navigationRoute$SerialisationState.waypoints;
        }
        if ((i10 & 8) != 0) {
            i3 = navigationRoute$SerialisationState.routeIndex;
        }
        if ((i10 & 16) != 0) {
            routerOrigin = navigationRoute$SerialisationState.routerOrigin;
        }
        if ((i10 & 32) != 0) {
            list2 = navigationRoute$SerialisationState.unavoidableClosures;
        }
        if ((i10 & 64) != 0) {
            str = navigationRoute$SerialisationState.responseOriginAPI;
        }
        if ((i10 & 128) != 0) {
            str2 = navigationRoute$SerialisationState.responseUUID;
        }
        if ((i10 & 256) != 0) {
            l9 = navigationRoute$SerialisationState.expirationTimeElapsedSeconds;
        }
        if ((i10 & 512) != 0) {
            mVar = navigationRoute$SerialisationState.routeRefreshMetadata;
        }
        Long l10 = l9;
        m mVar2 = mVar;
        String str3 = str;
        String str4 = str2;
        RouterOrigin routerOrigin2 = routerOrigin;
        List list3 = list2;
        return navigationRoute$SerialisationState.copy(directionsRoute, routeOptions, list, i3, routerOrigin2, list3, str3, str4, l10, mVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final DirectionsRoute getDirectionRoute() {
        return this.directionRoute;
    }

    /* renamed from: component10, reason: from getter */
    public final m getRouteRefreshMetadata() {
        return this.routeRefreshMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteOptions getRouteOptions() {
        return this.routeOptions;
    }

    public final List<DirectionsWaypoint> component3() {
        return this.waypoints;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRouteIndex() {
        return this.routeIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final RouterOrigin getRouterOrigin() {
        return this.routerOrigin;
    }

    public final List<List<Closure>> component6() {
        return this.unavoidableClosures;
    }

    /* renamed from: component7, reason: from getter */
    public final String getResponseOriginAPI() {
        return this.responseOriginAPI;
    }

    /* renamed from: component8, reason: from getter */
    public final String getResponseUUID() {
        return this.responseUUID;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getExpirationTimeElapsedSeconds() {
        return this.expirationTimeElapsedSeconds;
    }

    public final NavigationRoute$SerialisationState copy(DirectionsRoute directionRoute, RouteOptions routeOptions, List<? extends DirectionsWaypoint> waypoints, int routeIndex, RouterOrigin routerOrigin, List<? extends List<? extends Closure>> unavoidableClosures, String responseOriginAPI, String responseUUID, Long expirationTimeElapsedSeconds, m routeRefreshMetadata) {
        Intrinsics.checkNotNullParameter(directionRoute, "directionRoute");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, StubApp.getString2(14613));
        Intrinsics.checkNotNullParameter(unavoidableClosures, StubApp.getString2(14614));
        Intrinsics.checkNotNullParameter(responseOriginAPI, StubApp.getString2(14615));
        Intrinsics.checkNotNullParameter(responseUUID, StubApp.getString2(14616));
        return new NavigationRoute$SerialisationState(directionRoute, routeOptions, waypoints, routeIndex, routerOrigin, unavoidableClosures, responseOriginAPI, responseUUID, expirationTimeElapsedSeconds, routeRefreshMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationRoute$SerialisationState)) {
            return false;
        }
        NavigationRoute$SerialisationState navigationRoute$SerialisationState = (NavigationRoute$SerialisationState) other;
        return Intrinsics.areEqual(this.directionRoute, navigationRoute$SerialisationState.directionRoute) && Intrinsics.areEqual(this.routeOptions, navigationRoute$SerialisationState.routeOptions) && Intrinsics.areEqual(this.waypoints, navigationRoute$SerialisationState.waypoints) && this.routeIndex == navigationRoute$SerialisationState.routeIndex && this.routerOrigin == navigationRoute$SerialisationState.routerOrigin && Intrinsics.areEqual(this.unavoidableClosures, navigationRoute$SerialisationState.unavoidableClosures) && Intrinsics.areEqual(this.responseOriginAPI, navigationRoute$SerialisationState.responseOriginAPI) && Intrinsics.areEqual(this.responseUUID, navigationRoute$SerialisationState.responseUUID) && Intrinsics.areEqual(this.expirationTimeElapsedSeconds, navigationRoute$SerialisationState.expirationTimeElapsedSeconds) && Intrinsics.areEqual(this.routeRefreshMetadata, navigationRoute$SerialisationState.routeRefreshMetadata);
    }

    public final DirectionsRoute getDirectionRoute() {
        return this.directionRoute;
    }

    public final Long getExpirationTimeElapsedSeconds() {
        return this.expirationTimeElapsedSeconds;
    }

    public final String getResponseOriginAPI() {
        return this.responseOriginAPI;
    }

    public final String getResponseUUID() {
        return this.responseUUID;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public final RouteOptions getRouteOptions() {
        return this.routeOptions;
    }

    public final m getRouteRefreshMetadata() {
        return this.routeRefreshMetadata;
    }

    public final RouterOrigin getRouterOrigin() {
        return this.routerOrigin;
    }

    public final List<List<Closure>> getUnavoidableClosures() {
        return this.unavoidableClosures;
    }

    public final List<DirectionsWaypoint> getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        int hashCode = (this.routeOptions.hashCode() + (this.directionRoute.hashCode() * 31)) * 31;
        List<DirectionsWaypoint> list = this.waypoints;
        int d8 = u.d(u.d(E1.a.g((this.routerOrigin.hashCode() + E1.a.e(this.routeIndex, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31, 31, this.unavoidableClosures), 31, this.responseOriginAPI), 31, this.responseUUID);
        Long l9 = this.expirationTimeElapsedSeconds;
        int hashCode2 = (d8 + (l9 == null ? 0 : l9.hashCode())) * 31;
        m mVar = this.routeRefreshMetadata;
        return hashCode2 + (mVar != null ? Boolean.hashCode(mVar.f12512a) : 0);
    }

    public String toString() {
        return StubApp.getString2(14617) + this.directionRoute + StubApp.getString2(12743) + this.routeOptions + StubApp.getString2(12734) + this.waypoints + StubApp.getString2(12739) + this.routeIndex + StubApp.getString2(14618) + this.routerOrigin + StubApp.getString2(14619) + this.unavoidableClosures + StubApp.getString2(14620) + this.responseOriginAPI + StubApp.getString2(14621) + this.responseUUID + StubApp.getString2(14622) + this.expirationTimeElapsedSeconds + StubApp.getString2(14623) + this.routeRefreshMetadata + ')';
    }
}
