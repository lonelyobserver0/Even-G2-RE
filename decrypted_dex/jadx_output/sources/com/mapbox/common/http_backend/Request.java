package com.mapbox.common.http_backend;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ReadStream;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Request implements Serializable {
    private final ReadStream body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    /* renamed from: com.mapbox.common.http_backend.Request$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private ReadStream body;
        private HashMap<String, String> headers;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(ReadStream readStream) {
            this.body = readStream;
            return this;
        }

        public Request build() {
            if (this.method == null) {
                throw new NullPointerException(StubApp.getString2(13319));
            }
            if (this.url == null) {
                throw new NullPointerException(StubApp.getString2(13318));
            }
            if (this.headers == null) {
                throw new NullPointerException(StubApp.getString2(13317));
            }
            if (this.networkRestriction != null) {
                return new Request(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.body, this.flags, null);
            }
            throw new NullPointerException(StubApp.getString2(13316));
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

    public /* synthetic */ Request(HttpMethod httpMethod, String str, HashMap hashMap, long j, NetworkRestriction networkRestriction, ReadStream readStream, int i3, AnonymousClass1 anonymousClass1) {
        this(httpMethod, str, hashMap, j, networkRestriction, readStream, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Request request = (Request) obj;
        return Objects.equals(this.method, request.method) && Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && Objects.equals(this.body, request.body) && this.flags == request.flags;
    }

    public ReadStream getBody() {
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

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.body, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).body(this.body).flags(this.flags);
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
        sb2.append(", body: ");
        sb2.append(RecordUtils.fieldToString(this.body));
        sb2.append(", flags: ");
        return b.g(this.flags, "]", sb2);
    }

    private Request(HttpMethod httpMethod, String str, HashMap<String, String> hashMap, long j, NetworkRestriction networkRestriction, ReadStream readStream, int i3) {
        this.method = httpMethod;
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.body = readStream;
        this.flags = i3;
    }

    private Request(String str, HashMap<String, String> hashMap, ReadStream readStream) {
        this.url = str;
        this.headers = hashMap;
        this.body = readStream;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }
}
