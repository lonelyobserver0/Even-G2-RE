package com.mapbox.navigation.ui.maps.internal.route.line;

import E1.a;
import androidx.annotation.Keep;
import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewRenderRouteDrawDataInputValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "primaryRouteLineData", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEventData;", "alternativeRouteLinesData", "", "waypointsSource", "Lcom/mapbox/geojson/FeatureCollection;", "routeLineMaskingLayerDynamicData", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "(Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEventData;Ljava/util/List;Lcom/mapbox/geojson/FeatureCollection;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;)V", "getAlternativeRouteLinesData", "()Ljava/util/List;", "getPrimaryRouteLineData", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEventData;", "getRouteLineMaskingLayerDynamicData", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "getWaypointsSource", "()Lcom/mapbox/geojson/FeatureCollection;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineViewRenderRouteDrawDataInputValue extends RouteLineViewExpectedInput {
    private final List<RouteLineEventData> alternativeRouteLinesData;
    private final RouteLineEventData primaryRouteLineData;
    private final RouteLineDynamicEventData routeLineMaskingLayerDynamicData;
    private final FeatureCollection waypointsSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteDrawDataInputValue(RouteLineEventData primaryRouteLineData, List<RouteLineEventData> alternativeRouteLinesData, FeatureCollection waypointsSource, RouteLineDynamicEventData routeLineDynamicEventData) {
        super(StubApp.getString2(14798));
        Intrinsics.checkNotNullParameter(primaryRouteLineData, "primaryRouteLineData");
        Intrinsics.checkNotNullParameter(alternativeRouteLinesData, "alternativeRouteLinesData");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        this.primaryRouteLineData = primaryRouteLineData;
        this.alternativeRouteLinesData = alternativeRouteLinesData;
        this.waypointsSource = waypointsSource;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicEventData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteDrawDataInputValue copy$default(RouteLineViewRenderRouteDrawDataInputValue routeLineViewRenderRouteDrawDataInputValue, RouteLineEventData routeLineEventData, List list, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            routeLineEventData = routeLineViewRenderRouteDrawDataInputValue.primaryRouteLineData;
        }
        if ((i3 & 2) != 0) {
            list = routeLineViewRenderRouteDrawDataInputValue.alternativeRouteLinesData;
        }
        if ((i3 & 4) != 0) {
            featureCollection = routeLineViewRenderRouteDrawDataInputValue.waypointsSource;
        }
        if ((i3 & 8) != 0) {
            routeLineDynamicEventData = routeLineViewRenderRouteDrawDataInputValue.routeLineMaskingLayerDynamicData;
        }
        return routeLineViewRenderRouteDrawDataInputValue.copy(routeLineEventData, list, featureCollection, routeLineDynamicEventData);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteLineEventData getPrimaryRouteLineData() {
        return this.primaryRouteLineData;
    }

    public final List<RouteLineEventData> component2() {
        return this.alternativeRouteLinesData;
    }

    /* renamed from: component3, reason: from getter */
    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    /* renamed from: component4, reason: from getter */
    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final RouteLineViewRenderRouteDrawDataInputValue copy(RouteLineEventData primaryRouteLineData, List<RouteLineEventData> alternativeRouteLinesData, FeatureCollection waypointsSource, RouteLineDynamicEventData routeLineMaskingLayerDynamicData) {
        Intrinsics.checkNotNullParameter(primaryRouteLineData, "primaryRouteLineData");
        Intrinsics.checkNotNullParameter(alternativeRouteLinesData, "alternativeRouteLinesData");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        return new RouteLineViewRenderRouteDrawDataInputValue(primaryRouteLineData, alternativeRouteLinesData, waypointsSource, routeLineMaskingLayerDynamicData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineViewRenderRouteDrawDataInputValue)) {
            return false;
        }
        RouteLineViewRenderRouteDrawDataInputValue routeLineViewRenderRouteDrawDataInputValue = (RouteLineViewRenderRouteDrawDataInputValue) other;
        return Intrinsics.areEqual(this.primaryRouteLineData, routeLineViewRenderRouteDrawDataInputValue.primaryRouteLineData) && Intrinsics.areEqual(this.alternativeRouteLinesData, routeLineViewRenderRouteDrawDataInputValue.alternativeRouteLinesData) && Intrinsics.areEqual(this.waypointsSource, routeLineViewRenderRouteDrawDataInputValue.waypointsSource) && Intrinsics.areEqual(this.routeLineMaskingLayerDynamicData, routeLineViewRenderRouteDrawDataInputValue.routeLineMaskingLayerDynamicData);
    }

    public final List<RouteLineEventData> getAlternativeRouteLinesData() {
        return this.alternativeRouteLinesData;
    }

    public final RouteLineEventData getPrimaryRouteLineData() {
        return this.primaryRouteLineData;
    }

    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public int hashCode() {
        int hashCode = (this.waypointsSource.hashCode() + a.g(this.primaryRouteLineData.hashCode() * 31, 31, this.alternativeRouteLinesData)) * 31;
        RouteLineDynamicEventData routeLineDynamicEventData = this.routeLineMaskingLayerDynamicData;
        return hashCode + (routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode());
    }

    public String toString() {
        return StubApp.getString2(14799) + this.primaryRouteLineData + StubApp.getString2(14800) + this.alternativeRouteLinesData + StubApp.getString2(14801) + this.waypointsSource + StubApp.getString2(14802) + this.routeLineMaskingLayerDynamicData + ')';
    }
}
