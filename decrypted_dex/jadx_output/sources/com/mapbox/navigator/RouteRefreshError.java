package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteRefreshError implements Serializable {
    private final String message;
    private final Integer refreshTtl;
    private final RouteRefreshErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteRefreshError(String str, RouteRefreshErrorType routeRefreshErrorType, Integer num) {
        this.message = str;
        this.type = routeRefreshErrorType;
        this.refreshTtl = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteRefreshError routeRefreshError = (RouteRefreshError) obj;
        return Objects.equals(this.message, routeRefreshError.message) && Objects.equals(this.type, routeRefreshError.type) && Objects.equals(this.refreshTtl, routeRefreshError.refreshTtl);
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getRefreshTtl() {
        return this.refreshTtl;
    }

    public RouteRefreshErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.message, this.type, this.refreshTtl);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[message: ");
        h.z(sb2, this.message, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", refreshTtl: ");
        sb2.append(RecordUtils.fieldToString(this.refreshTtl));
        sb2.append("]");
        return sb2.toString();
    }
}
