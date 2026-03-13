package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PredictiveCacheControllerOptions implements Serializable {
    private final int concurrency;
    private final CacheDataDomain dataDomain;
    private final String dataset;
    private final long maxAverageDownloadBytesPerSecond;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PredictiveCacheControllerOptions(String str, String str2, CacheDataDomain cacheDataDomain, int i3, long j) {
        this.version = str;
        this.dataset = str2;
        this.dataDomain = cacheDataDomain;
        this.concurrency = i3;
        this.maxAverageDownloadBytesPerSecond = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredictiveCacheControllerOptions predictiveCacheControllerOptions = (PredictiveCacheControllerOptions) obj;
        return Objects.equals(this.version, predictiveCacheControllerOptions.version) && Objects.equals(this.dataset, predictiveCacheControllerOptions.dataset) && Objects.equals(this.dataDomain, predictiveCacheControllerOptions.dataDomain) && this.concurrency == predictiveCacheControllerOptions.concurrency && this.maxAverageDownloadBytesPerSecond == predictiveCacheControllerOptions.maxAverageDownloadBytesPerSecond;
    }

    public int getConcurrency() {
        return this.concurrency;
    }

    public CacheDataDomain getDataDomain() {
        return this.dataDomain;
    }

    public String getDataset() {
        return this.dataset;
    }

    public long getMaxAverageDownloadBytesPerSecond() {
        return this.maxAverageDownloadBytesPerSecond;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.version, this.dataset, this.dataDomain, Integer.valueOf(this.concurrency), Long.valueOf(this.maxAverageDownloadBytesPerSecond));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[version: ");
        h.z(sb2, this.version, ", dataset: ");
        h.z(sb2, this.dataset, ", dataDomain: ");
        sb2.append(RecordUtils.fieldToString(this.dataDomain));
        sb2.append(", concurrency: ");
        b.o(this.concurrency, ", maxAverageDownloadBytesPerSecond: ", sb2);
        return h.i(this.maxAverageDownloadBytesPerSecond, sb2, "]");
    }
}
