package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HttpResponse implements Serializable {
    private final HttpRequest request;
    private final long requestId;
    private final Expected<HttpRequestError, HttpResponseData> result;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponse(long j, HttpRequest httpRequest, Expected<HttpRequestError, HttpResponseData> expected) {
        this.requestId = j;
        this.request = httpRequest;
        this.result = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.requestId == httpResponse.requestId && Objects.equals(this.request, httpResponse.request) && Objects.equals(this.result, httpResponse.result);
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public Expected<HttpRequestError, HttpResponseData> getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requestId), this.request, this.result);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[requestId: ");
        b.p(this.requestId, sb2, ", request: ");
        sb2.append(RecordUtils.fieldToString(this.request));
        sb2.append(", result: ");
        sb2.append(RecordUtils.fieldToString(this.result));
        sb2.append("]");
        return sb2.toString();
    }
}
