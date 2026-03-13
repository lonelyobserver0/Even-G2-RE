package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoutesChangeInfo implements Serializable {
    private final List<RouteAlternative> alternativeRoutes;
    private final AlternativeRoutesChangeReason alternativeRoutesChangeReason;
    private final RouteInterface primaryRoute;
    private final PrimaryRouteChangeReason primaryRouteChangeReason;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoutesChangeInfo(PrimaryRouteChangeReason primaryRouteChangeReason, RouteInterface routeInterface, AlternativeRoutesChangeReason alternativeRoutesChangeReason, List<RouteAlternative> list) {
        this.primaryRouteChangeReason = primaryRouteChangeReason;
        this.primaryRoute = routeInterface;
        this.alternativeRoutesChangeReason = alternativeRoutesChangeReason;
        this.alternativeRoutes = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutesChangeInfo routesChangeInfo = (RoutesChangeInfo) obj;
        return Objects.equals(this.primaryRouteChangeReason, routesChangeInfo.primaryRouteChangeReason) && Objects.equals(this.primaryRoute, routesChangeInfo.primaryRoute) && Objects.equals(this.alternativeRoutesChangeReason, routesChangeInfo.alternativeRoutesChangeReason) && Objects.equals(this.alternativeRoutes, routesChangeInfo.alternativeRoutes);
    }

    public List<RouteAlternative> getAlternativeRoutes() {
        return this.alternativeRoutes;
    }

    public AlternativeRoutesChangeReason getAlternativeRoutesChangeReason() {
        return this.alternativeRoutesChangeReason;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    public PrimaryRouteChangeReason getPrimaryRouteChangeReason() {
        return this.primaryRouteChangeReason;
    }

    public int hashCode() {
        return Objects.hash(this.primaryRouteChangeReason, this.primaryRoute, this.alternativeRoutesChangeReason, this.alternativeRoutes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[primaryRouteChangeReason: ");
        sb2.append(RecordUtils.fieldToString(this.primaryRouteChangeReason));
        sb2.append(", primaryRoute: ");
        sb2.append(RecordUtils.fieldToString(this.primaryRoute));
        sb2.append(", alternativeRoutesChangeReason: ");
        sb2.append(RecordUtils.fieldToString(this.alternativeRoutesChangeReason));
        sb2.append(", alternativeRoutes: ");
        return b.i("]", sb2, this.alternativeRoutes);
    }
}
