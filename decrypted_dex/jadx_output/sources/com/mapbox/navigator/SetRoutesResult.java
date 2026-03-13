package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SetRoutesResult implements Serializable {
    private final List<RouteAlternative> alternatives;
    private final RouteInterface primaryRoute;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SetRoutesResult(RouteInterface routeInterface, List<RouteAlternative> list) {
        this.primaryRoute = routeInterface;
        this.alternatives = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRoutesResult setRoutesResult = (SetRoutesResult) obj;
        return Objects.equals(this.primaryRoute, setRoutesResult.primaryRoute) && Objects.equals(this.alternatives, setRoutesResult.alternatives);
    }

    public List<RouteAlternative> getAlternatives() {
        return this.alternatives;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    public int hashCode() {
        return Objects.hash(this.primaryRoute, this.alternatives);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[primaryRoute: ");
        sb2.append(RecordUtils.fieldToString(this.primaryRoute));
        sb2.append(", alternatives: ");
        return b.i("]", sb2, this.alternatives);
    }
}
