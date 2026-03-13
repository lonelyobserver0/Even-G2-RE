package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HttpResponseData implements Serializable {
    private final int code;
    private final byte[] data;
    private final HashMap<String, String> headers;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponseData(HashMap<String, String> hashMap, int i3, byte[] bArr) {
        this.headers = hashMap;
        this.code = i3;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponseData httpResponseData = (HttpResponseData) obj;
        return Objects.equals(this.headers, httpResponseData.headers) && this.code == httpResponseData.code && Objects.equals(this.data, httpResponseData.data);
    }

    public int getCode() {
        return this.code;
    }

    public byte[] getData() {
        return this.data;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return Objects.hash(this.headers, Integer.valueOf(this.code), this.data);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[headers: ");
        sb2.append(RecordUtils.fieldToString(this.headers));
        sb2.append(", code: ");
        b.o(this.code, ", data: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append("]");
        return sb2.toString();
    }
}
