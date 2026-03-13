package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SetRouteHistoryRecord implements Serializable {
    private final int legIndex;
    private final MapboxAPI mapboxApi;
    private final RouterOrigin origin;
    private final SetRoutesReason reason;
    private final String routeId;
    private final int routeIndex;
    private final String routeRequest;
    private final String routeResponse;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SetRouteHistoryRecord(String str, int i3, int i10, String str2, RouterOrigin routerOrigin, MapboxAPI mapboxAPI, SetRoutesReason setRoutesReason, String str3) {
        this.routeResponse = str;
        this.routeIndex = i3;
        this.legIndex = i10;
        this.routeRequest = str2;
        this.origin = routerOrigin;
        this.mapboxApi = mapboxAPI;
        this.reason = setRoutesReason;
        this.routeId = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRouteHistoryRecord setRouteHistoryRecord = (SetRouteHistoryRecord) obj;
        return Objects.equals(this.routeResponse, setRouteHistoryRecord.routeResponse) && this.routeIndex == setRouteHistoryRecord.routeIndex && this.legIndex == setRouteHistoryRecord.legIndex && Objects.equals(this.routeRequest, setRouteHistoryRecord.routeRequest) && Objects.equals(this.origin, setRouteHistoryRecord.origin) && Objects.equals(this.mapboxApi, setRouteHistoryRecord.mapboxApi) && Objects.equals(this.reason, setRouteHistoryRecord.reason) && Objects.equals(this.routeId, setRouteHistoryRecord.routeId);
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public MapboxAPI getMapboxApi() {
        return this.mapboxApi;
    }

    public RouterOrigin getOrigin() {
        return this.origin;
    }

    public SetRoutesReason getReason() {
        return this.reason;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public String getRouteRequest() {
        return this.routeRequest;
    }

    public String getRouteResponse() {
        return this.routeResponse;
    }

    public int hashCode() {
        return Objects.hash(this.routeResponse, Integer.valueOf(this.routeIndex), Integer.valueOf(this.legIndex), this.routeRequest, this.origin, this.mapboxApi, this.reason, this.routeId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routeResponse: ");
        h.z(sb2, this.routeResponse, ", routeIndex: ");
        b.o(this.routeIndex, ", legIndex: ", sb2);
        b.o(this.legIndex, ", routeRequest: ", sb2);
        h.z(sb2, this.routeRequest, ", origin: ");
        sb2.append(RecordUtils.fieldToString(this.origin));
        sb2.append(", mapboxApi: ");
        sb2.append(RecordUtils.fieldToString(this.mapboxApi));
        sb2.append(", reason: ");
        sb2.append(RecordUtils.fieldToString(this.reason));
        sb2.append(", routeId: ");
        return h.t(sb2, this.routeId, "]");
    }
}
