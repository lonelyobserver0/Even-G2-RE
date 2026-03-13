package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouterError implements Serializable {
    private final boolean isRetryable;
    private final String message;
    private final Integer refreshTtl;
    private final long requestId;
    private final RouterOrigin routerOrigin;
    private final RouterErrorType type;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouterError(String str, RouterErrorType routerErrorType, long j, Integer num, RouterOrigin routerOrigin, String str2, boolean z2) {
        this.message = str;
        this.type = routerErrorType;
        this.requestId = j;
        this.refreshTtl = num;
        this.routerOrigin = routerOrigin;
        this.url = str2;
        this.isRetryable = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouterError routerError = (RouterError) obj;
        return Objects.equals(this.message, routerError.message) && Objects.equals(this.type, routerError.type) && this.requestId == routerError.requestId && Objects.equals(this.refreshTtl, routerError.refreshTtl) && Objects.equals(this.routerOrigin, routerError.routerOrigin) && Objects.equals(this.url, routerError.url) && this.isRetryable == routerError.isRetryable;
    }

    public boolean getIsRetryable() {
        return this.isRetryable;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getRefreshTtl() {
        return this.refreshTtl;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public RouterOrigin getRouterOrigin() {
        return this.routerOrigin;
    }

    public RouterErrorType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.message, this.type, Long.valueOf(this.requestId), this.refreshTtl, this.routerOrigin, this.url, Boolean.valueOf(this.isRetryable));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[message: ");
        h.z(sb2, this.message, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", requestId: ");
        b.p(this.requestId, sb2, ", refreshTtl: ");
        b.t(this.refreshTtl, sb2, ", routerOrigin: ");
        sb2.append(RecordUtils.fieldToString(this.routerOrigin));
        sb2.append(", url: ");
        h.z(sb2, this.url, ", isRetryable: ");
        return b.k(this.isRetryable, sb2, "]");
    }

    public RouterError(String str, RouterErrorType routerErrorType, long j, Integer num, RouterOrigin routerOrigin, String str2) {
        this.message = str;
        this.type = routerErrorType;
        this.requestId = j;
        this.refreshTtl = num;
        this.routerOrigin = routerOrigin;
        this.url = str2;
        this.isRetryable = false;
    }
}
