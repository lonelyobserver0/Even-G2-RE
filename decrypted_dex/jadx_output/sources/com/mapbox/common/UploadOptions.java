package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UploadOptions implements Serializable {
    private final String filePath;
    private HashMap<String, String> headers;
    private final String mediaType;
    private final String metadata;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadOptions(String str, String str2, HashMap<String, String> hashMap, String str3, String str4, NetworkRestriction networkRestriction, SdkInformation sdkInformation, long j) {
        this.filePath = str;
        this.url = str2;
        this.headers = hashMap;
        this.metadata = str3;
        this.mediaType = str4;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.timeout = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return Objects.equals(this.filePath, uploadOptions.filePath) && Objects.equals(this.url, uploadOptions.url) && Objects.equals(this.headers, uploadOptions.headers) && Objects.equals(this.metadata, uploadOptions.metadata) && Objects.equals(this.mediaType, uploadOptions.mediaType) && Objects.equals(this.networkRestriction, uploadOptions.networkRestriction) && Objects.equals(this.sdkInformation, uploadOptions.sdkInformation) && this.timeout == uploadOptions.timeout;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMetadata() {
        return this.metadata;
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
        return Objects.hash(this.filePath, this.url, this.headers, this.metadata, this.mediaType, this.networkRestriction, this.sdkInformation, Long.valueOf(this.timeout));
    }

    public void setHeaders(HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[filePath: ");
        h.z(sb2, this.filePath, ", url: ");
        h.z(sb2, this.url, ", headers: ");
        sb2.append(RecordUtils.fieldToString(this.headers));
        sb2.append(", metadata: ");
        h.z(sb2, this.metadata, ", mediaType: ");
        h.z(sb2, this.mediaType, ", networkRestriction: ");
        sb2.append(RecordUtils.fieldToString(this.networkRestriction));
        sb2.append(", sdkInformation: ");
        sb2.append(RecordUtils.fieldToString(this.sdkInformation));
        sb2.append(", timeout: ");
        return h.i(this.timeout, sb2, "]");
    }

    public UploadOptions(String str, String str2, HashMap<String, String> hashMap, String str3, String str4, SdkInformation sdkInformation) {
        this.filePath = str;
        this.url = str2;
        this.headers = hashMap;
        this.metadata = str3;
        this.mediaType = str4;
        this.sdkInformation = sdkInformation;
        this.networkRestriction = NetworkRestriction.NONE;
        this.timeout = 0L;
    }
}
