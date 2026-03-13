package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SetRoutesParams implements Serializable {
    private final List<RouteInterface> alternativeRoutes;
    private final int legIndex;
    private final RouteInterface primaryRoute;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SetRoutesParams(RouteInterface routeInterface, int i3, List<RouteInterface> list) {
        this.primaryRoute = routeInterface;
        this.legIndex = i3;
        this.alternativeRoutes = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRoutesParams setRoutesParams = (SetRoutesParams) obj;
        return Objects.equals(this.primaryRoute, setRoutesParams.primaryRoute) && this.legIndex == setRoutesParams.legIndex && Objects.equals(this.alternativeRoutes, setRoutesParams.alternativeRoutes);
    }

    public List<RouteInterface> getAlternativeRoutes() {
        return this.alternativeRoutes;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    public int hashCode() {
        return Objects.hash(this.primaryRoute, Integer.valueOf(this.legIndex), this.alternativeRoutes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[primaryRoute: ");
        sb2.append(RecordUtils.fieldToString(this.primaryRoute));
        sb2.append(", legIndex: ");
        b.o(this.legIndex, ", alternativeRoutes: ", sb2);
        return b.i("]", sb2, this.alternativeRoutes);
    }
}
