package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteObjectMatcherError implements Serializable {
    private final String description;
    private final String routeObjectId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteObjectMatcherError(String str, String str2) {
        this.description = str;
        this.routeObjectId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteObjectMatcherError routeObjectMatcherError = (RouteObjectMatcherError) obj;
        return Objects.equals(this.description, routeObjectMatcherError.description) && Objects.equals(this.routeObjectId, routeObjectMatcherError.routeObjectId);
    }

    public String getDescription() {
        return this.description;
    }

    public String getRouteObjectId() {
        return this.routeObjectId;
    }

    public int hashCode() {
        return Objects.hash(this.description, this.routeObjectId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[description: ");
        h.z(sb2, this.description, ", routeObjectId: ");
        return h.t(sb2, this.routeObjectId, "]");
    }
}
