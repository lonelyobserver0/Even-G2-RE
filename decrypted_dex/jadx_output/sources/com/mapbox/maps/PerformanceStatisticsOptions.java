package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PerformanceStatisticsOptions implements Serializable {
    private final List<PerformanceSamplerOptions> samplerOptions;
    private final double samplingDurationMillis;

    /* renamed from: com.mapbox.maps.PerformanceStatisticsOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private List<PerformanceSamplerOptions> samplerOptions;
        private double samplingDurationMillis = 1000.0d;

        public PerformanceStatisticsOptions build() {
            if (this.samplerOptions != null) {
                return new PerformanceStatisticsOptions(this.samplerOptions, this.samplingDurationMillis, null);
            }
            throw new NullPointerException(StubApp.getString2(14145));
        }

        public Builder samplerOptions(List<PerformanceSamplerOptions> list) {
            this.samplerOptions = list;
            return this;
        }

        public Builder samplingDurationMillis(double d8) {
            this.samplingDurationMillis = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ PerformanceStatisticsOptions(List list, double d8, AnonymousClass1 anonymousClass1) {
        this(list, d8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatisticsOptions.class != obj.getClass()) {
            return false;
        }
        PerformanceStatisticsOptions performanceStatisticsOptions = (PerformanceStatisticsOptions) obj;
        return Objects.equals(this.samplerOptions, performanceStatisticsOptions.samplerOptions) && PartialEq.compare(this.samplingDurationMillis, performanceStatisticsOptions.samplingDurationMillis);
    }

    public List<PerformanceSamplerOptions> getSamplerOptions() {
        return this.samplerOptions;
    }

    public double getSamplingDurationMillis() {
        return this.samplingDurationMillis;
    }

    public int hashCode() {
        return Objects.hash(this.samplerOptions, Double.valueOf(this.samplingDurationMillis));
    }

    public Builder toBuilder() {
        return new Builder().samplerOptions(this.samplerOptions).samplingDurationMillis(this.samplingDurationMillis);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[samplerOptions: ");
        com.mapbox.common.b.v(", samplingDurationMillis: ", sb2, this.samplerOptions);
        return com.mapbox.common.b.f(this.samplingDurationMillis, sb2, "]");
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list, double d8) {
        this.samplerOptions = list;
        this.samplingDurationMillis = d8;
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list) {
        this.samplerOptions = list;
        this.samplingDurationMillis = 1000.0d;
    }
}
