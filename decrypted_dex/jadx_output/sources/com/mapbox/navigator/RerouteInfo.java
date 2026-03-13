package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RerouteInfo implements Serializable {
    private final RouterOrigin origin;
    private final String routeRequest;
    private final DataRef routeResponse;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RerouteInfo(DataRef dataRef, String str, RouterOrigin routerOrigin) {
        this.routeResponse = dataRef;
        this.routeRequest = str;
        this.origin = routerOrigin;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RerouteInfo rerouteInfo = (RerouteInfo) obj;
        return Objects.equals(this.routeResponse, rerouteInfo.routeResponse) && Objects.equals(this.routeRequest, rerouteInfo.routeRequest) && Objects.equals(this.origin, rerouteInfo.origin);
    }

    public RouterOrigin getOrigin() {
        return this.origin;
    }

    public String getRouteRequest() {
        return this.routeRequest;
    }

    public DataRef getRouteResponse() {
        return this.routeResponse;
    }

    public int hashCode() {
        return Objects.hash(this.routeResponse, this.routeRequest, this.origin);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routeResponse: ");
        sb2.append(RecordUtils.fieldToString(this.routeResponse));
        sb2.append(", routeRequest: ");
        h.z(sb2, this.routeRequest, ", origin: ");
        sb2.append(RecordUtils.fieldToString(this.origin));
        sb2.append("]");
        return sb2.toString();
    }
}
