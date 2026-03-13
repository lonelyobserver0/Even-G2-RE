package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ResourceRequestError implements Serializable {
    private final String message;
    private final RequestErrorType reason;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResourceRequestError(RequestErrorType requestErrorType, String str) {
        this.reason = requestErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequestError.class != obj.getClass()) {
            return false;
        }
        ResourceRequestError resourceRequestError = (ResourceRequestError) obj;
        return Objects.equals(this.reason, resourceRequestError.reason) && Objects.equals(this.message, resourceRequestError.message);
    }

    public String getMessage() {
        return this.message;
    }

    public RequestErrorType getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Objects.hash(this.reason, this.message);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[reason: ");
        sb2.append(RecordUtils.fieldToString(this.reason));
        sb2.append(", message: ");
        return Xa.h.t(sb2, this.message, "]");
    }
}
