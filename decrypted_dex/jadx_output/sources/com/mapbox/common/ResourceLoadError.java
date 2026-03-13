package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResourceLoadError implements Serializable {
    private final String message;
    private final long transferredBytes;
    private final ResourceLoadErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadError(ResourceLoadErrorType resourceLoadErrorType, String str, long j) {
        this.type = resourceLoadErrorType;
        this.message = str;
        this.transferredBytes = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadError resourceLoadError = (ResourceLoadError) obj;
        return Objects.equals(this.type, resourceLoadError.type) && Objects.equals(this.message, resourceLoadError.message) && this.transferredBytes == resourceLoadError.transferredBytes;
    }

    public String getMessage() {
        return this.message;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public ResourceLoadErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, Long.valueOf(this.transferredBytes));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", message: ");
        h.z(sb2, this.message, ", transferredBytes: ");
        return h.i(this.transferredBytes, sb2, "]");
    }
}
