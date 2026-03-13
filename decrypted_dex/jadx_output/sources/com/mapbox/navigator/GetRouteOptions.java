package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GetRouteOptions implements Serializable {
    private final Long timeoutSeconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GetRouteOptions(Long l9) {
        this.timeoutSeconds = l9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.timeoutSeconds, ((GetRouteOptions) obj).timeoutSeconds);
    }

    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public int hashCode() {
        return Objects.hash(this.timeoutSeconds);
    }

    public String toString() {
        return "[timeoutSeconds: " + RecordUtils.fieldToString(this.timeoutSeconds) + "]";
    }
}
