package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ResourceRequest implements Serializable {
    private final boolean cancelled;
    private final RequestInfo request;
    private final ResponseInfo response;
    private final RequestDataSourceType source;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResourceRequest(RequestDataSourceType requestDataSourceType, RequestInfo requestInfo, ResponseInfo responseInfo, boolean z2, EventTimeInterval eventTimeInterval) {
        this.source = requestDataSourceType;
        this.request = requestInfo;
        this.response = responseInfo;
        this.cancelled = z2;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequest.class != obj.getClass()) {
            return false;
        }
        ResourceRequest resourceRequest = (ResourceRequest) obj;
        return Objects.equals(this.source, resourceRequest.source) && Objects.equals(this.request, resourceRequest.request) && Objects.equals(this.response, resourceRequest.response) && this.cancelled == resourceRequest.cancelled && Objects.equals(this.timeInterval, resourceRequest.timeInterval);
    }

    public boolean getCancelled() {
        return this.cancelled;
    }

    public RequestInfo getRequest() {
        return this.request;
    }

    public ResponseInfo getResponse() {
        return this.response;
    }

    public RequestDataSourceType getSource() {
        return this.source;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.source, this.request, this.response, Boolean.valueOf(this.cancelled), this.timeInterval);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[source: ");
        sb2.append(RecordUtils.fieldToString(this.source));
        sb2.append(", request: ");
        sb2.append(RecordUtils.fieldToString(this.request));
        sb2.append(", response: ");
        sb2.append(RecordUtils.fieldToString(this.response));
        sb2.append(", cancelled: ");
        Xa.h.A(this.cancelled, sb2, ", timeInterval: ");
        sb2.append(RecordUtils.fieldToString(this.timeInterval));
        sb2.append("]");
        return sb2.toString();
    }
}
