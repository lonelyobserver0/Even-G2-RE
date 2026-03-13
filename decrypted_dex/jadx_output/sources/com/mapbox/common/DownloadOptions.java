package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DownloadOptions implements Serializable {
    private final String localPath;
    private final int memoryThreshold;
    private HttpRequest request;
    private boolean resume;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadOptions(HttpRequest httpRequest, String str, boolean z2, int i3) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = z2;
        this.memoryThreshold = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return Objects.equals(this.request, downloadOptions.request) && Objects.equals(this.localPath, downloadOptions.localPath) && this.resume == downloadOptions.resume && this.memoryThreshold == downloadOptions.memoryThreshold;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public int getMemoryThreshold() {
        return this.memoryThreshold;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public boolean getResume() {
        return this.resume;
    }

    public int hashCode() {
        return Objects.hash(this.request, this.localPath, Boolean.valueOf(this.resume), Integer.valueOf(this.memoryThreshold));
    }

    public void setRequest(HttpRequest httpRequest) {
        this.request = httpRequest;
    }

    public void setResume(boolean z2) {
        this.resume = z2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[request: ");
        sb2.append(RecordUtils.fieldToString(this.request));
        sb2.append(", localPath: ");
        h.z(sb2, this.localPath, ", resume: ");
        h.A(this.resume, sb2, ", memoryThreshold: ");
        return b.g(this.memoryThreshold, "]", sb2);
    }

    public DownloadOptions(HttpRequest httpRequest, String str) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = false;
        this.memoryThreshold = 0;
    }
}
