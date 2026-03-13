package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ResponseInfo implements Serializable {
    private final ResourceRequestError error;
    private final String etag;
    private final Date expires;
    private final Date modified;
    private final boolean mustRevalidate;
    private final boolean noContent;
    private final boolean notModified;
    private final long size;
    private final ResponseSourceType source;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResponseInfo(boolean z2, boolean z10, boolean z11, ResponseSourceType responseSourceType, long j, Date date, Date date2, String str, ResourceRequestError resourceRequestError) {
        this.noContent = z2;
        this.notModified = z10;
        this.mustRevalidate = z11;
        this.source = responseSourceType;
        this.size = j;
        this.modified = date;
        this.expires = date2;
        this.etag = str;
        this.error = resourceRequestError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResponseInfo.class != obj.getClass()) {
            return false;
        }
        ResponseInfo responseInfo = (ResponseInfo) obj;
        return this.noContent == responseInfo.noContent && this.notModified == responseInfo.notModified && this.mustRevalidate == responseInfo.mustRevalidate && Objects.equals(this.source, responseInfo.source) && this.size == responseInfo.size && Objects.equals(this.modified, responseInfo.modified) && Objects.equals(this.expires, responseInfo.expires) && Objects.equals(this.etag, responseInfo.etag) && Objects.equals(this.error, responseInfo.error);
    }

    public ResourceRequestError getError() {
        return this.error;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Date getModified() {
        return this.modified;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean getNoContent() {
        return this.noContent;
    }

    public boolean getNotModified() {
        return this.notModified;
    }

    public long getSize() {
        return this.size;
    }

    public ResponseSourceType getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.noContent), Boolean.valueOf(this.notModified), Boolean.valueOf(this.mustRevalidate), this.source, Long.valueOf(this.size), this.modified, this.expires, this.etag, this.error);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[noContent: ");
        Xa.h.A(this.noContent, sb2, ", notModified: ");
        Xa.h.A(this.notModified, sb2, ", mustRevalidate: ");
        Xa.h.A(this.mustRevalidate, sb2, ", source: ");
        sb2.append(RecordUtils.fieldToString(this.source));
        sb2.append(", size: ");
        com.mapbox.common.b.p(this.size, sb2, ", modified: ");
        sb2.append(RecordUtils.fieldToString(this.modified));
        sb2.append(", expires: ");
        sb2.append(RecordUtils.fieldToString(this.expires));
        sb2.append(", etag: ");
        Xa.h.z(sb2, this.etag, ", error: ");
        sb2.append(RecordUtils.fieldToString(this.error));
        sb2.append("]");
        return sb2.toString();
    }
}
