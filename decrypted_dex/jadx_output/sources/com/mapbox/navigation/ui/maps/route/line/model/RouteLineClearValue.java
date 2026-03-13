package com.mapbox.navigation.ui.maps.route.line.model;

import E1.a;
import androidx.annotation.Keep;
import com.mapbox.geojson.FeatureCollection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q9.C1529a;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineClearValue;", "", "Lcom/mapbox/geojson/FeatureCollection;", "primaryRouteSource", "", "alternativeRoutesSources", "waypointsSource", "Lq9/a;", "callouts", "<init>", "(Lcom/mapbox/geojson/FeatureCollection;Ljava/util/List;Lcom/mapbox/geojson/FeatureCollection;Lq9/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/mapbox/geojson/FeatureCollection;", "getPrimaryRouteSource$ui_maps_release", "()Lcom/mapbox/geojson/FeatureCollection;", "Ljava/util/List;", "getAlternativeRoutesSources$ui_maps_release", "()Ljava/util/List;", "getWaypointsSource$ui_maps_release", "Lq9/a;", "getCallouts$ui_maps_release", "()Lq9/a;", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineClearValue {
    private final List<FeatureCollection> alternativeRoutesSources;
    private final C1529a callouts;
    private final FeatureCollection primaryRouteSource;
    private final FeatureCollection waypointsSource;

    public RouteLineClearValue(FeatureCollection primaryRouteSource, List<FeatureCollection> alternativeRoutesSources, FeatureCollection waypointsSource, C1529a callouts) {
        Intrinsics.checkNotNullParameter(primaryRouteSource, "primaryRouteSource");
        Intrinsics.checkNotNullParameter(alternativeRoutesSources, "alternativeRoutesSources");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        Intrinsics.checkNotNullParameter(callouts, "callouts");
        this.primaryRouteSource = primaryRouteSource;
        this.alternativeRoutesSources = alternativeRoutesSources;
        this.waypointsSource = waypointsSource;
        this.callouts = callouts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RouteLineClearValue.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue");
        RouteLineClearValue routeLineClearValue = (RouteLineClearValue) other;
        return Intrinsics.areEqual(this.primaryRouteSource, routeLineClearValue.primaryRouteSource) && Intrinsics.areEqual(this.alternativeRoutesSources, routeLineClearValue.alternativeRoutesSources) && Intrinsics.areEqual(this.waypointsSource, routeLineClearValue.waypointsSource) && Intrinsics.areEqual(this.callouts, routeLineClearValue.callouts);
    }

    public final List<FeatureCollection> getAlternativeRoutesSources$ui_maps_release() {
        return this.alternativeRoutesSources;
    }

    /* renamed from: getCallouts$ui_maps_release, reason: from getter */
    public final C1529a getCallouts() {
        return this.callouts;
    }

    /* renamed from: getPrimaryRouteSource$ui_maps_release, reason: from getter */
    public final FeatureCollection getPrimaryRouteSource() {
        return this.primaryRouteSource;
    }

    /* renamed from: getWaypointsSource$ui_maps_release, reason: from getter */
    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public int hashCode() {
        return this.callouts.f20098a.hashCode() + ((this.waypointsSource.hashCode() + a.g(this.primaryRouteSource.hashCode() * 31, 31, this.alternativeRoutesSources)) * 31);
    }
}
