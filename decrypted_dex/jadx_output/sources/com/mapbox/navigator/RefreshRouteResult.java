package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RefreshRouteResult implements Serializable {
    private final List<RouteAlternative> alternatives;
    private final RouteInterface route;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RefreshRouteResult(RouteInterface routeInterface, List<RouteAlternative> list) {
        this.route = routeInterface;
        this.alternatives = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefreshRouteResult refreshRouteResult = (RefreshRouteResult) obj;
        return Objects.equals(this.route, refreshRouteResult.route) && Objects.equals(this.alternatives, refreshRouteResult.alternatives);
    }

    public List<RouteAlternative> getAlternatives() {
        return this.alternatives;
    }

    public RouteInterface getRoute() {
        return this.route;
    }

    public int hashCode() {
        return Objects.hash(this.route, this.alternatives);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[route: ");
        sb2.append(RecordUtils.fieldToString(this.route));
        sb2.append(", alternatives: ");
        return b.i("]", sb2, this.alternatives);
    }
}
