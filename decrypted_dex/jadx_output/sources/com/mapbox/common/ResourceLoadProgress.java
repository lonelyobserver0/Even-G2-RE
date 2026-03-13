package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResourceLoadProgress implements Serializable {
    private final long bytes;
    private final Long totalBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadProgress(long j, Long l9) {
        this.bytes = j;
        this.totalBytes = l9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadProgress resourceLoadProgress = (ResourceLoadProgress) obj;
        return this.bytes == resourceLoadProgress.bytes && Objects.equals(this.totalBytes, resourceLoadProgress.totalBytes);
    }

    public long getBytes() {
        return this.bytes;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.bytes), this.totalBytes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[bytes: ");
        b.p(this.bytes, sb2, ", totalBytes: ");
        sb2.append(RecordUtils.fieldToString(this.totalBytes));
        sb2.append("]");
        return sb2.toString();
    }
}
