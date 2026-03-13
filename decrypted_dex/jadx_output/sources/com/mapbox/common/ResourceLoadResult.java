package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResourceLoadResult implements Serializable {
    private final boolean belongsToGroup;
    private final String contentType;
    private final ResourceData data;
    private final String etag;
    private final Date expires;
    private final boolean immutable;
    private final boolean mustRevalidate;
    private final ResourceLoadStatus status;
    private final long totalBytes;
    private final long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadResult(ResourceData resourceData, ResourceLoadStatus resourceLoadStatus, boolean z2, boolean z10, Date date, long j, long j3, String str, String str2, boolean z11) {
        this.data = resourceData;
        this.status = resourceLoadStatus;
        this.immutable = z2;
        this.mustRevalidate = z10;
        this.expires = date;
        this.totalBytes = j;
        this.transferredBytes = j3;
        this.contentType = str;
        this.etag = str2;
        this.belongsToGroup = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadResult resourceLoadResult = (ResourceLoadResult) obj;
        return Objects.equals(this.data, resourceLoadResult.data) && Objects.equals(this.status, resourceLoadResult.status) && this.immutable == resourceLoadResult.immutable && this.mustRevalidate == resourceLoadResult.mustRevalidate && Objects.equals(this.expires, resourceLoadResult.expires) && this.totalBytes == resourceLoadResult.totalBytes && this.transferredBytes == resourceLoadResult.transferredBytes && Objects.equals(this.contentType, resourceLoadResult.contentType) && Objects.equals(this.etag, resourceLoadResult.etag) && this.belongsToGroup == resourceLoadResult.belongsToGroup;
    }

    public boolean getBelongsToGroup() {
        return this.belongsToGroup;
    }

    public String getContentType() {
        return this.contentType;
    }

    public ResourceData getData() {
        return this.data;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public boolean getImmutable() {
        return this.immutable;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public ResourceLoadStatus getStatus() {
        return this.status;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.status, Boolean.valueOf(this.immutable), Boolean.valueOf(this.mustRevalidate), this.expires, Long.valueOf(this.totalBytes), Long.valueOf(this.transferredBytes), this.contentType, this.etag, Boolean.valueOf(this.belongsToGroup));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[data: ");
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append(", status: ");
        sb2.append(RecordUtils.fieldToString(this.status));
        sb2.append(", immutable: ");
        h.A(this.immutable, sb2, ", mustRevalidate: ");
        h.A(this.mustRevalidate, sb2, ", expires: ");
        sb2.append(RecordUtils.fieldToString(this.expires));
        sb2.append(", totalBytes: ");
        b.p(this.totalBytes, sb2, ", transferredBytes: ");
        b.p(this.transferredBytes, sb2, ", contentType: ");
        h.z(sb2, this.contentType, ", etag: ");
        h.z(sb2, this.etag, ", belongsToGroup: ");
        return b.k(this.belongsToGroup, sb2, "]");
    }
}
