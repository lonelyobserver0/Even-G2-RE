package com.mapbox.navigation.ui.maps.internal.route.line;

import E1.a;
import androidx.annotation.Keep;
import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewRenderRouteLineClearDataValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "primaryRouteSource", "Lcom/mapbox/geojson/FeatureCollection;", "alternativeRoutesSources", "", "waypointsSource", "(Lcom/mapbox/geojson/FeatureCollection;Ljava/util/List;Lcom/mapbox/geojson/FeatureCollection;)V", "getAlternativeRoutesSources", "()Ljava/util/List;", "getPrimaryRouteSource", "()Lcom/mapbox/geojson/FeatureCollection;", "getWaypointsSource", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineViewRenderRouteLineClearDataValue extends RouteLineViewExpectedInput {
    private final List<FeatureCollection> alternativeRoutesSources;
    private final FeatureCollection primaryRouteSource;
    private final FeatureCollection waypointsSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteLineClearDataValue(FeatureCollection primaryRouteSource, List<FeatureCollection> alternativeRoutesSources, FeatureCollection waypointsSource) {
        super(StubApp.getString2(14804));
        Intrinsics.checkNotNullParameter(primaryRouteSource, "primaryRouteSource");
        Intrinsics.checkNotNullParameter(alternativeRoutesSources, "alternativeRoutesSources");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        this.primaryRouteSource = primaryRouteSource;
        this.alternativeRoutesSources = alternativeRoutesSources;
        this.waypointsSource = waypointsSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteLineClearDataValue copy$default(RouteLineViewRenderRouteLineClearDataValue routeLineViewRenderRouteLineClearDataValue, FeatureCollection featureCollection, List list, FeatureCollection featureCollection2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            featureCollection = routeLineViewRenderRouteLineClearDataValue.primaryRouteSource;
        }
        if ((i3 & 2) != 0) {
            list = routeLineViewRenderRouteLineClearDataValue.alternativeRoutesSources;
        }
        if ((i3 & 4) != 0) {
            featureCollection2 = routeLineViewRenderRouteLineClearDataValue.waypointsSource;
        }
        return routeLineViewRenderRouteLineClearDataValue.copy(featureCollection, list, featureCollection2);
    }

    /* renamed from: component1, reason: from getter */
    public final FeatureCollection getPrimaryRouteSource() {
        return this.primaryRouteSource;
    }

    public final List<FeatureCollection> component2() {
        return this.alternativeRoutesSources;
    }

    /* renamed from: component3, reason: from getter */
    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public final RouteLineViewRenderRouteLineClearDataValue copy(FeatureCollection primaryRouteSource, List<FeatureCollection> alternativeRoutesSources, FeatureCollection waypointsSource) {
        Intrinsics.checkNotNullParameter(primaryRouteSource, "primaryRouteSource");
        Intrinsics.checkNotNullParameter(alternativeRoutesSources, "alternativeRoutesSources");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        return new RouteLineViewRenderRouteLineClearDataValue(primaryRouteSource, alternativeRoutesSources, waypointsSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineViewRenderRouteLineClearDataValue)) {
            return false;
        }
        RouteLineViewRenderRouteLineClearDataValue routeLineViewRenderRouteLineClearDataValue = (RouteLineViewRenderRouteLineClearDataValue) other;
        return Intrinsics.areEqual(this.primaryRouteSource, routeLineViewRenderRouteLineClearDataValue.primaryRouteSource) && Intrinsics.areEqual(this.alternativeRoutesSources, routeLineViewRenderRouteLineClearDataValue.alternativeRoutesSources) && Intrinsics.areEqual(this.waypointsSource, routeLineViewRenderRouteLineClearDataValue.waypointsSource);
    }

    public final List<FeatureCollection> getAlternativeRoutesSources() {
        return this.alternativeRoutesSources;
    }

    public final FeatureCollection getPrimaryRouteSource() {
        return this.primaryRouteSource;
    }

    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public int hashCode() {
        return this.waypointsSource.hashCode() + a.g(this.primaryRouteSource.hashCode() * 31, 31, this.alternativeRoutesSources);
    }

    public String toString() {
        return StubApp.getString2(14805) + this.primaryRouteSource + StubApp.getString2(14806) + this.alternativeRoutesSources + StubApp.getString2(14801) + this.waypointsSource + ')';
    }
}
