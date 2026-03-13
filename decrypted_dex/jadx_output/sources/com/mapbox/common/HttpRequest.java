package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HttpRequest implements Serializable {
    private final byte[] body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    /* renamed from: com.mapbox.common.HttpRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private byte[] body;
        private HashMap<String, String> headers;
        private SdkInformation sdkInformation;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(byte[] bArr) {
            this.body = bArr;
            return this;
        }

        public HttpRequest build() {
            if (this.method == null) {
                throw new NullPointerException(StubApp.getString2(13319));
            }
            if (this.url == null) {
                throw new NullPointerException(StubApp.getString2(13318));
            }
            if (this.headers == null) {
                throw new NullPointerException(StubApp.getString2(13317));
            }
            if (this.networkRestriction == null) {
                throw new NullPointerException(StubApp.getString2(13316));
            }
            if (this.sdkInformation != null) {
                return new HttpRequest(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.sdkInformation, this.body, this.flags, null);
            }
            throw new NullPointerException(StubApp.getString2(13315));
        }

        public Builder flags(int i3) {
            this.flags = i3;
            return this;
        }

        public Builder headers(HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }

        public Builder method(HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder sdkInformation(SdkInformation sdkInformation) {
            this.sdkInformation = sdkInformation;
            return this;
        }

        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ HttpRequest(HttpMethod httpMethod, String str, HashMap hashMap, long j, NetworkRestriction networkRestriction, SdkInformation sdkInformation, byte[] bArr, int i3, AnonymousClass1 anonymousClass1) {
        this(httpMethod, str, hashMap, j, networkRestriction, sdkInformation, bArr, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Objects.equals(this.method, httpRequest.method) && Objects.equals(this.url, httpRequest.url) && Objects.equals(this.headers, httpRequest.headers) && this.timeout == httpRequest.timeout && Objects.equals(this.networkRestriction, httpRequest.networkRestriction) && Objects.equals(this.sdkInformation, httpRequest.sdkInformation) && Objects.equals(this.body, httpRequest.body) && this.flags == httpRequest.flags;
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.sdkInformation, this.body, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).sdkInformation(this.sdkInformation).body(this.body).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[method: ");
        sb2.append(RecordUtils.fieldToString(this.method));
        sb2.append(", url: ");
        h.z(sb2, this.url, ", headers: ");
        sb2.append(RecordUtils.fieldToString(this.headers));
        sb2.append(", timeout: ");
        b.p(this.timeout, sb2, ", networkRestriction: ");
        sb2.append(RecordUtils.fieldToString(this.networkRestriction));
        sb2.append(", sdkInformation: ");
        sb2.append(RecordUtils.fieldToString(this.sdkInformation));
        sb2.append(", body: ");
        sb2.append(RecordUtils.fieldToString(this.body));
        sb2.append(", flags: ");
        return b.g(this.flags, "]", sb2);
    }

    private HttpRequest(HttpMethod httpMethod, String str, HashMap<String, String> hashMap, long j, NetworkRestriction networkRestriction, SdkInformation sdkInformation, byte[] bArr, int i3) {
        this.method = httpMethod;
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.flags = i3;
    }

    private HttpRequest(String str, HashMap<String, String> hashMap, SdkInformation sdkInformation, byte[] bArr) {
        this.url = str;
        this.headers = hashMap;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }
}
