package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OfflineRegionError implements Serializable {
    private final boolean isFatal;
    private final String message;
    private final Date retryAfter;
    private final OfflineRegionErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionError(OfflineRegionErrorType offlineRegionErrorType, String str, boolean z2, Date date) {
        this.type = offlineRegionErrorType;
        this.message = str;
        this.isFatal = z2;
        this.retryAfter = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionError.class != obj.getClass()) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        return Objects.equals(this.type, offlineRegionError.type) && Objects.equals(this.message, offlineRegionError.message) && this.isFatal == offlineRegionError.isFatal && Objects.equals(this.retryAfter, offlineRegionError.retryAfter);
    }

    public boolean getIsFatal() {
        return this.isFatal;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getRetryAfter() {
        return this.retryAfter;
    }

    public OfflineRegionErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, Boolean.valueOf(this.isFatal), this.retryAfter);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", message: ");
        Xa.h.z(sb2, this.message, ", isFatal: ");
        Xa.h.A(this.isFatal, sb2, ", retryAfter: ");
        sb2.append(RecordUtils.fieldToString(this.retryAfter));
        sb2.append("]");
        return sb2.toString();
    }
}
