package com.mapbox.common.experimental.wss_backend;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Request implements Serializable {
    private final int flags;
    private HashMap<String, String> headers;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    /* renamed from: com.mapbox.common.experimental.wss_backend.Request$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private HashMap<String, String> headers;
        private String url;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Request build() {
            if (this.url == null) {
                throw new NullPointerException(StubApp.getString2(13318));
            }
            if (this.headers == null) {
                throw new NullPointerException(StubApp.getString2(13317));
            }
            if (this.networkRestriction != null) {
                return new Request(this.url, this.headers, this.timeout, this.networkRestriction, this.flags, null);
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

    public /* synthetic */ Request(String str, HashMap hashMap, long j, NetworkRestriction networkRestriction, int i3, AnonymousClass1 anonymousClass1) {
        this(str, hashMap, j, networkRestriction, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Request request = (Request) obj;
        return Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && this.flags == request.flags;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
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
        return Objects.hash(this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public Builder toBuilder() {
        return new Builder().url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[url: ");
        h.z(sb2, this.url, ", headers: ");
        sb2.append(RecordUtils.fieldToString(this.headers));
        sb2.append(", timeout: ");
        b.p(this.timeout, sb2, ", networkRestriction: ");
        sb2.append(RecordUtils.fieldToString(this.networkRestriction));
        sb2.append(", flags: ");
        return b.g(this.flags, "]", sb2);
    }

    private Request(String str, HashMap<String, String> hashMap, long j, NetworkRestriction networkRestriction, int i3) {
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.flags = i3;
    }

    private Request(String str, HashMap<String, String> hashMap) {
        this.url = str;
        this.headers = hashMap;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }
}
