package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HttpRequestError implements Serializable {
    private final String message;
    private final HttpRequestErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpRequestError(HttpRequestErrorType httpRequestErrorType, String str) {
        this.type = httpRequestErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequestError httpRequestError = (HttpRequestError) obj;
        return Objects.equals(this.type, httpRequestError.type) && Objects.equals(this.message, httpRequestError.message);
    }

    public String getMessage() {
        return this.message;
    }

    public HttpRequestErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", message: ");
        return h.t(sb2, this.message, "]");
    }
}
