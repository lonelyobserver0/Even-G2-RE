package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEventData;", "", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "dynamicData", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "(Lcom/mapbox/geojson/FeatureCollection;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;)V", "getDynamicData", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "getFeatureCollection", "()Lcom/mapbox/geojson/FeatureCollection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineEventData {
    private final RouteLineDynamicEventData dynamicData;
    private final FeatureCollection featureCollection;

    public RouteLineEventData(FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData) {
        Intrinsics.checkNotNullParameter(featureCollection, "featureCollection");
        this.featureCollection = featureCollection;
        this.dynamicData = routeLineDynamicEventData;
    }

    public static /* synthetic */ RouteLineEventData copy$default(RouteLineEventData routeLineEventData, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            featureCollection = routeLineEventData.featureCollection;
        }
        if ((i3 & 2) != 0) {
            routeLineDynamicEventData = routeLineEventData.dynamicData;
        }
        return routeLineEventData.copy(featureCollection, routeLineDynamicEventData);
    }

    /* renamed from: component1, reason: from getter */
    public final FeatureCollection getFeatureCollection() {
        return this.featureCollection;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteLineDynamicEventData getDynamicData() {
        return this.dynamicData;
    }

    public final RouteLineEventData copy(FeatureCollection featureCollection, RouteLineDynamicEventData dynamicData) {
        Intrinsics.checkNotNullParameter(featureCollection, "featureCollection");
        return new RouteLineEventData(featureCollection, dynamicData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineEventData)) {
            return false;
        }
        RouteLineEventData routeLineEventData = (RouteLineEventData) other;
        return Intrinsics.areEqual(this.featureCollection, routeLineEventData.featureCollection) && Intrinsics.areEqual(this.dynamicData, routeLineEventData.dynamicData);
    }

    public final RouteLineDynamicEventData getDynamicData() {
        return this.dynamicData;
    }

    public final FeatureCollection getFeatureCollection() {
        return this.featureCollection;
    }

    public int hashCode() {
        int hashCode = this.featureCollection.hashCode() * 31;
        RouteLineDynamicEventData routeLineDynamicEventData = this.dynamicData;
        return hashCode + (routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode());
    }

    public String toString() {
        return StubApp.getString2(14755) + this.featureCollection + StubApp.getString2(14756) + this.dynamicData + ')';
    }
}
