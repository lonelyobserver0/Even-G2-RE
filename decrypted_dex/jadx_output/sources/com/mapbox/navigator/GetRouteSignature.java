package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GetRouteSignature implements Serializable {
    private final String comment;
    private final GetRouteOrigin origin;
    private final GetRouteReason reason;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GetRouteSignature(GetRouteReason getRouteReason, GetRouteOrigin getRouteOrigin, String str) {
        this.reason = getRouteReason;
        this.origin = getRouteOrigin;
        this.comment = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetRouteSignature getRouteSignature = (GetRouteSignature) obj;
        return Objects.equals(this.reason, getRouteSignature.reason) && Objects.equals(this.origin, getRouteSignature.origin) && Objects.equals(this.comment, getRouteSignature.comment);
    }

    public String getComment() {
        return this.comment;
    }

    public GetRouteOrigin getOrigin() {
        return this.origin;
    }

    public GetRouteReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Objects.hash(this.reason, this.origin, this.comment);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[reason: ");
        sb2.append(RecordUtils.fieldToString(this.reason));
        sb2.append(", origin: ");
        sb2.append(RecordUtils.fieldToString(this.origin));
        sb2.append(", comment: ");
        return h.t(sb2, this.comment, "]");
    }
}
