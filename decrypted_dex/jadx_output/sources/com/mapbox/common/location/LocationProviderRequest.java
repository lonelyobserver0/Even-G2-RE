package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LocationProviderRequest implements Serializable {
    private final AccuracyLevel accuracy;
    private final Float displacement;
    private final IntervalSettings interval;

    /* renamed from: com.mapbox.common.location.LocationProviderRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private AccuracyLevel accuracy;
        private Float displacement;
        private IntervalSettings interval;

        public Builder accuracy(AccuracyLevel accuracyLevel) {
            this.accuracy = accuracyLevel;
            return this;
        }

        public LocationProviderRequest build() {
            return new LocationProviderRequest(this.accuracy, this.displacement, this.interval, null);
        }

        public Builder displacement(Float f10) {
            this.displacement = f10;
            return this;
        }

        public Builder interval(IntervalSettings intervalSettings) {
            this.interval = intervalSettings;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ LocationProviderRequest(AccuracyLevel accuracyLevel, Float f10, IntervalSettings intervalSettings, AnonymousClass1 anonymousClass1) {
        this(accuracyLevel, f10, intervalSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationProviderRequest locationProviderRequest = (LocationProviderRequest) obj;
        return Objects.equals(this.accuracy, locationProviderRequest.accuracy) && Objects.equals(this.displacement, locationProviderRequest.displacement) && Objects.equals(this.interval, locationProviderRequest.interval);
    }

    public AccuracyLevel getAccuracy() {
        return this.accuracy;
    }

    public Float getDisplacement() {
        return this.displacement;
    }

    public IntervalSettings getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return Objects.hash(this.accuracy, this.displacement, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().accuracy(this.accuracy).displacement(this.displacement).interval(this.interval);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[accuracy: ");
        sb2.append(RecordUtils.fieldToString(this.accuracy));
        sb2.append(", displacement: ");
        com.mapbox.common.b.s(this.displacement, sb2, ", interval: ");
        sb2.append(RecordUtils.fieldToString(this.interval));
        sb2.append("]");
        return sb2.toString();
    }

    private LocationProviderRequest(AccuracyLevel accuracyLevel, Float f10, IntervalSettings intervalSettings) {
        this.accuracy = accuracyLevel;
        this.displacement = f10;
        this.interval = intervalSettings;
    }
}
