package com.mapbox.common;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DeferredDeliveryRequestOptions implements Serializable {
    private final long ttl;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryRequestOptions(long j) {
        this.ttl = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ttl == ((DeferredDeliveryRequestOptions) obj).ttl;
    }

    public long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.ttl));
    }

    public String toString() {
        return h.i(this.ttl, new StringBuilder("[ttl: "), "]");
    }

    public DeferredDeliveryRequestOptions() {
        this.ttl = 0L;
    }
}
