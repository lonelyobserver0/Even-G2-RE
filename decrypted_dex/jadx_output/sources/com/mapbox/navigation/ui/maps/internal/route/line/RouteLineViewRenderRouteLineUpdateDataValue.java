package com.mapbox.navigation.ui.maps.internal.route.line;

import E1.a;
import androidx.annotation.Keep;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewRenderRouteLineUpdateDataValue;", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewExpectedInput;", "primaryRouteLineDynamicData", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "alternativeRouteLinesDynamicData", "", "routeLineMaskingLayerDynamicData", "(Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;Ljava/util/List;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;)V", "getAlternativeRouteLinesDynamicData", "()Ljava/util/List;", "getPrimaryRouteLineDynamicData", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "getRouteLineMaskingLayerDynamicData", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineViewRenderRouteLineUpdateDataValue extends RouteLineViewExpectedInput {
    private final List<RouteLineDynamicEventData> alternativeRouteLinesDynamicData;
    private final RouteLineDynamicEventData primaryRouteLineDynamicData;
    private final RouteLineDynamicEventData routeLineMaskingLayerDynamicData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteLineUpdateDataValue(RouteLineDynamicEventData routeLineDynamicEventData, List<RouteLineDynamicEventData> alternativeRouteLinesDynamicData, RouteLineDynamicEventData routeLineDynamicEventData2) {
        super(StubApp.getString2(14808));
        Intrinsics.checkNotNullParameter(alternativeRouteLinesDynamicData, "alternativeRouteLinesDynamicData");
        this.primaryRouteLineDynamicData = routeLineDynamicEventData;
        this.alternativeRouteLinesDynamicData = alternativeRouteLinesDynamicData;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicEventData2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteLineUpdateDataValue copy$default(RouteLineViewRenderRouteLineUpdateDataValue routeLineViewRenderRouteLineUpdateDataValue, RouteLineDynamicEventData routeLineDynamicEventData, List list, RouteLineDynamicEventData routeLineDynamicEventData2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            routeLineDynamicEventData = routeLineViewRenderRouteLineUpdateDataValue.primaryRouteLineDynamicData;
        }
        if ((i3 & 2) != 0) {
            list = routeLineViewRenderRouteLineUpdateDataValue.alternativeRouteLinesDynamicData;
        }
        if ((i3 & 4) != 0) {
            routeLineDynamicEventData2 = routeLineViewRenderRouteLineUpdateDataValue.routeLineMaskingLayerDynamicData;
        }
        return routeLineViewRenderRouteLineUpdateDataValue.copy(routeLineDynamicEventData, list, routeLineDynamicEventData2);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteLineDynamicEventData getPrimaryRouteLineDynamicData() {
        return this.primaryRouteLineDynamicData;
    }

    public final List<RouteLineDynamicEventData> component2() {
        return this.alternativeRouteLinesDynamicData;
    }

    /* renamed from: component3, reason: from getter */
    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final RouteLineViewRenderRouteLineUpdateDataValue copy(RouteLineDynamicEventData primaryRouteLineDynamicData, List<RouteLineDynamicEventData> alternativeRouteLinesDynamicData, RouteLineDynamicEventData routeLineMaskingLayerDynamicData) {
        Intrinsics.checkNotNullParameter(alternativeRouteLinesDynamicData, "alternativeRouteLinesDynamicData");
        return new RouteLineViewRenderRouteLineUpdateDataValue(primaryRouteLineDynamicData, alternativeRouteLinesDynamicData, routeLineMaskingLayerDynamicData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineViewRenderRouteLineUpdateDataValue)) {
            return false;
        }
        RouteLineViewRenderRouteLineUpdateDataValue routeLineViewRenderRouteLineUpdateDataValue = (RouteLineViewRenderRouteLineUpdateDataValue) other;
        return Intrinsics.areEqual(this.primaryRouteLineDynamicData, routeLineViewRenderRouteLineUpdateDataValue.primaryRouteLineDynamicData) && Intrinsics.areEqual(this.alternativeRouteLinesDynamicData, routeLineViewRenderRouteLineUpdateDataValue.alternativeRouteLinesDynamicData) && Intrinsics.areEqual(this.routeLineMaskingLayerDynamicData, routeLineViewRenderRouteLineUpdateDataValue.routeLineMaskingLayerDynamicData);
    }

    public final List<RouteLineDynamicEventData> getAlternativeRouteLinesDynamicData() {
        return this.alternativeRouteLinesDynamicData;
    }

    public final RouteLineDynamicEventData getPrimaryRouteLineDynamicData() {
        return this.primaryRouteLineDynamicData;
    }

    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public int hashCode() {
        RouteLineDynamicEventData routeLineDynamicEventData = this.primaryRouteLineDynamicData;
        int g10 = a.g((routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode()) * 31, 31, this.alternativeRouteLinesDynamicData);
        RouteLineDynamicEventData routeLineDynamicEventData2 = this.routeLineMaskingLayerDynamicData;
        return g10 + (routeLineDynamicEventData2 != null ? routeLineDynamicEventData2.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14809) + this.primaryRouteLineDynamicData + StubApp.getString2(14810) + this.alternativeRouteLinesDynamicData + StubApp.getString2(14802) + this.routeLineMaskingLayerDynamicData + ')';
    }
}
